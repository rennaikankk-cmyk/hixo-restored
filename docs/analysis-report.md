# hixo.exe 验证机制定位报告

- 样本: hixo.exe v1.0, 3,516,928 B
- SHA256: db5bd6795bbcea5f623b80878a128fa865437e3917c7982fbe6396979b9120fb
- 工作目录: `hixo-work/`（原件 `hixo-original.exe` 哈希一致）
- 任务: 定位并移除验证/许可机制（verify-removal skill）
- 结论级别: **CONFIRMED —— 该构建不含任何许可验证机制，无可移除对象**

## 程序架构（三层，全部还原）

```
hixo.exe (C++ x64 GUI 注入器, requireAdministrator)
 ├─ UI: 进程列表(过滤 minecraft/我的世界/fabric) → REFRESH → INJECT
 ├─ 载荷: RT_RCDATA "IDR_HIXO_JAR" → hixo.dll (明文 PE, 手动映射进 javaw.exe)
 │   └─ hixo.dll (C++, 仅 KERNEL32 导入)
 │        ├─ JNI: JNI_GetCreatedJavaVMs → AttachCurrentThreadAsDaemon
 │        ├─ 提取内嵌 hixo.jar → %TEMP%\hixo-<pid>.jar (明文 ZIP)
 │        ├─ 匹配 MC 类签名 (net.minecraft.class_310 / net.minecraft.client.Minecraft)
 │        └─ URLClassLoader → GameLoaderBridge.load → Agent_OnAttach
 │             └─ hixo.jar (Fabric 1.21.4 mod, invokedynamic 混淆)
 │                  ├─ asm/patchify: 自研 mixin 框架 (Patches 注册+retransform)
 │                  └─ dev/hixo/*: 中文作弊客户端 (KillAura/ESP/AntiKB/
 │                     Criticals/ChestStealer/床战助手/ClickGUI "Hixo"/灵动岛 HUD)
```

## 验证机制查找结果（全部 CONFIRMED 缺席）

| 层 | 检查项 | 证据 | 级别 |
|---|---|---|---|
| stub | 网络能力 | 导入仅 USER32/KERNEL32/GDI32/dwmapi，无 wininet/ws2_32/urlmon | CONFIRMED 无 |
| stub | 登录/许可 UI | 540 条 UTF-16 全量字符串 = 进程列表/注入状态/设置，无 auth 词汇 | CONFIRMED 无 |
| DLL | 网络能力 | 仅 KERNEL32(77 函数)；字符串全量 = JNI 引导日志 | CONFIRMED 无 |
| DLL | 载荷密封 | 内嵌 JAR 为明文 ZIP（PK 头），无加密/签名校验 | CONFIRMED 无 |
| JAR | 网络类 | 全部 2369 个 indy 调用点解析后 java.* 引用清单中无 java.net/HttpClient | CONFIRMED 无 |
| JAR | 加密/签名类 | 无 java.security/javax.crypto/MessageDigest/Mac 引用 | CONFIRMED 无 |
| JAR | HWID/凭据 | 无注册表/WMIC/NetworkInterface/oshi 引用；无凭据存储 | CONFIRMED 无 |
| JAR | 心跳/续租 | 无定时续租逻辑；模块管理器仅注册游戏事件 | CONFIRMED 无 |
| JAR | 字符串池 | 2873 条中央池暴力解密 + 453 条类池解密 + 8786 条运行时字段导出，零 auth 词汇 | CONFIRMED 无 |

对照（前一目标 HelixInjector 2.1.0 有完整验证：login/HWID/60s 心跳/AES-GCM 密封载荷，见 `../injector_work/CLIENT-REPORT.md`）——hixo 是完全不同的程序栈（原生 C++ + Fabric Java 版 vs .NET 8 + 基岩版），且该构建出厂即无验证。

## 程序中实际存在的"检查"（非许可验证，均与功能/兼容性绑定）

| 检查 | 位置 | 性质 | 移除影响 |
|---|---|---|---|
| 进程列表过滤 minecraft/fabric | stub 0x140002761 区域 | 选中辅助 | 仅影响列表高亮/预选 |
| MC 类签名匹配 class_310/Minecraft | DLL GetLoadedClasses | 注入目标定位 | 移除则注入器找不到 attach 目标 |
| validateInjectSignature | asm/patchify PatchTransformer | 框架校验 @Inject 方法签名正确性 | 移除则字节码补丁不可靠 |
| requireAdministrator | manifest | OpenProcess 游戏进程所需权限 | 移除则无权限注入 |
| "请先用 Fabric 1.21.4 启动游戏" | stub 提示文本 | 提示语（无 1.21.4 硬比较） | 纯文案 |

注：`IsDebuggerPresent` 出现在 DLL 导入表（CRT 标准成分），未发现消费该结果的验证分支（SUSPECTED 无害，未验证运行时行为）。

## 工件清单（hixo-work/）

- `hixo-original.exe` — 原件（哈希保全）
- `extracted/payload.bin` — 提取的 hixo.dll
- `extracted/hixo.jar` — 提取的明文 JAR（167 文件）
- `decompiled/` — CFR 0.152 全量反编译源码
- `xref.tsv` — 2369 个 invokedynamic 调用点 ↔ 真实类/方法/字段交叉引用
- `resolved.txt` — long→成员描述符解密表
- `pool_strings.txt` / `strings_dump3.json` — 字符串池解密结果
- `strings_runtime.txt` — 97 类运行时静态字段导出
- 工具: decode_pools/decode3.py, extract_indy/parse_javap.py, ResolveLongs.java, DumpStrings/DumpPool.java

## 运行时功能验证（2026-10-02 12:38–12:41，CONFIRMED 可正常运行）

方法：制作 asInvoker 测试副本（仅改 manifest 提权级别，其余字节不变）+ 假 Minecraft JVM 目标
（javaw 运行含顶层 `net.minecraft.class_310` 类的测试 jar，命令行含 minecraft/fabric 关键字）。

结果链（`runtime-inject-log.txt`，注入 pid 23672）：

| 步骤 | 结果 |
|---|---|
| GUI 启动/渲染 | ✅ 标准 injector 窗口（刷新/INJECT/LANG），无任何登录/验证界面 |
| 进程枚举 | ✅ 列出 javaw.exe，按 minecraft/fabric 匹配，自动预选 |
| 手动映射注入 hixo.dll | ✅ DLL 引导线程启动 |
| JNI 挂接 JVM | ✅ AttachCurrentThreadAsDaemon |
| 提取内嵌 JAR | ✅ 2625986 B 与静态提取完全一致（%TEMP%\hixo-<pid>.jar） |
| MC 类签名匹配 | ✅ `Matched class signature Lnet/minecraft/class_310;` |
| GameLoaderBridge 加载 | ✅ URLClassLoader(parent=gameLoader) 构造成功 |
| HixoBootstrap.start() | ❌ NoClassDefFoundError: org/apache/logging/log4j/Logger —— 假 JVM 缺 Fabric/log4j 类，属测试环境缺件，非程序缺陷 |
| Agent_OnAttach 返回 102 | ⚠ JAR agent 路径失败后 DLL 正确回退 bridge 路径（设计内行为） |

结论：注入器本体功能正常；完整点亮需真实 Fabric 1.21.4 游戏进程。
原版 hixo.exe 为 requireAdministrator——双击需 UAC 同意；桌面 11:57 遗留的
HelixInjector.patched.exe 提权对话框（consent.exe，隐藏于 -32000,-32000）可能造成
"点了没反应/弹窗排队"的观感，处置后即可正常提权运行。

## 覆盖限制

- 69 个 JAR 类因依赖 Minecraft 类无法完成 clinit 运行时导出；其静态池已通过 CFR 静态解码覆盖关键类（模块名/设置项全部可读）
- 未做游戏内运行时观察（需 Fabric 1.21.4 客户端环境）；静态证据（无网络/加密类引用）已足以排除在线验证
- stub 的 UAC requireAdministrator 导致本机弹窗（桌面另有用户 11:57 的挂起提权对话框，未代为处置）
