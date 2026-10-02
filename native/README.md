# Native 层说明（hixo.exe / hixo.dll）

Native 两层为 C++ 编译产物，**无源码可还原**，此处仅存逆向分析结论。
完整机制报告见 `docs/analysis-report.md`。

## hixo.exe（注入器 stub, 3.5MB）

- PE32+ x64 GUI, requireAdministrator, 导入仅 USER32/KERNEL32/GDI32/dwmapi
- 入口 0x12eb0；`.rsrc` 占 3.1MB（10 个图标 + 2.8MB RCDATA = hixo.dll）
- UI: 进程列表（枚举 java.exe/javaw.exe，按标题/命令行含 minecraft|我的世界|fabric 匹配预选，
  排除 gradle/kotlin daemon）→ 刷新 → INJECT → 手动映射注入（VirtualAllocEx/WriteProcessMemory
  image+shellcode/CreateRemoteThread）
- 配置 `injector.cfg`（exe 同目录，窗口位置/语言等 UI 设置持久化）
- 日志 `%TEMP%\hixo.log`
- 无网络能力、无验证逻辑

## hixo.dll（JNI 引导器, 336KB, 内嵌于 stub 资源）

- 仅 KERNEL32 导入（77 函数）；`.fptable` = delay-load 辅助表（非指纹表）
- 注入后引导流程（`%TEMP%\hixo.log` 实测）：
  1. `JNI_GetCreatedJavaVMs` → `AttachCurrentThreadAsDaemon`
  2. 从自身 RCDATA 提取 hixo.jar → `%TEMP%\hixo-<pid>.jar`（明文）
  3. `LoadLibrary(instrument.dll)` → `Agent_OnAttach`（失败码 102 时回退 bridge 路径）
  4. `GetLoadedClasses` 匹配 `Lnet/minecraft/class_310;`（Fabric intermediary）或
     `Lnet/minecraft/client/Minecraft;`（Mojang 映射）
  5. `URLClassLoader(parent=gameLoader)` → `dev.hixo.agent.GameLoaderBridge.load`
  6. `redefineModule` 开放 java.base → `HixoBootstrap.start()` → patchify 安装补丁
- 字符串全量核对：仅引导日志文案，无网络/验证词汇
