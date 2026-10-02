# hixo-restored

Minecraft Java 版作弊客户端 **Hixo v1.0.0**（Fabric 1.21.4）的**去混淆源码重建**，
由 hixo.exe（SHA256 `db5bd679…9120fb`，2026-10-01 构建）逆向还原。

> 这不是原始源码仓库：原始作者的注释/格式/构建脚本已不可恢复。
> 本仓库 = CFR 反编译 + 全部混淆调用的机器还原，可作为等价可读参考实现。

## 还原内容

| 目录 | 内容 |
|---|---|
| `src/` | 135 个 Java 文件的去混淆重建（99% 的 indy 调用已标注真实目标） |
| `docs/` | 机制分析报告、构建指纹、混淆类↔模块身份映射、indy 完整交叉表、解密字符串池 |
| `native/` | hixo.exe / hixo.dll 两层 native 的逆向结论（C++ 层无源码可还原） |

## 阅读方法

每个文件头部有还原标头：类身份（如 `identified as: KillAura`）、上下文字符串、
解密后的字符串池全文。正文中的混淆调用形如：

```java
d.a("\u00f9", (Object)this, (long)71498313283647962L) /* => dev.hixo.Hixo.INSTANCE setter */
```

`/* => … */` 即该调用真实的反射目标（来自 2369 个 invokedynamic 调用点的完整解密，
见 `docs/xref.tsv`）。类名/方法名仍保留混淆形态，身份对照见 `docs/classmap.md`。

## 技术要点

- **混淆**：invokedynamic 调度器 `dev.hixo.M.d`，调用点 long 常量位域编码池索引+密钥；
  成员描述符 base-36 加密；中央字符串池 2873 条滚动 XOR；类池按类 7 字节循环 XOR
- **补丁框架**：自研 `asm.patchify`（Fabric mixin 的替代品，agent retransform 方式打补丁），
  `hixo.mixins.json` 为迁移残留
- **注入链**：stub 手动映射 hixo.dll → JNI attach → 提取内嵌 JAR → 匹配 class_310 →
  GameLoaderBridge → HixoBootstrap.start()
- **验证机制**：无（登录/HWID/心跳/在线授权均不存在，载荷明文内嵌）

## 模块清单（解密确认）

KillAura, ESP, ChestESP, AntiKB, AntiKnockback, Criticals, Backtrack, AutoThrow,
AutoTool, ChestStealer, AutoClicker, NoSwing, NightVision, Clutch, Item Spoof,
BlockFly, RotationFix, 床战助手, DynamicIsland/ArrayList/TargetHUD/Animation (HUD),
ClickGui（游戏内右 Shift 呼出）

## 许可

原始 JAR 附带作者的 MIT 许可（`Copyright (c) 2026 Hixo`，全文见 `LICENSE`）。
MIT 允许反编译研究与再分发（须保留原许可声明），本仓库依此发布。

## 免责

仅供学习与研究 Java 混淆还原、字节码补丁框架与注入链原理。使用者自行承担
在游戏中使用导致的任何账号风险。
