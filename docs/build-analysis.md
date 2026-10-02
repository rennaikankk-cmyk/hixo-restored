# hixo.exe 出身与构建分析

## 原始样本

- 文件: hixo.exe, 3,516,928 B
- SHA256: `db5bd6795bbcea5f623b80878a128fa865437e3917c7982fbe6396979b9120fb`
- 结论：**从源码一次性构建的原版成品**（非重打包/破解二改）

## 三层结构

```
hixo.exe (C++ x64 注入器 GUI, requireAdministrator)
 ├─ RT_RCDATA "hixo.dll" (明文 PE, 手动映射注入 javaw.exe)
 │   └─ RT_RCDATA "IDR_HIXO_JAR" = hixo.jar (明文 ZIP)
 │        └─ Fabric mod (dev.hixo.*, asm.patchify.*)
```

## 构建流水线指纹（全部北京时间 2026-10-01）

| 产物 | 时间 | 工具链 |
|---|---|---|
| hixo.jar | 17:10:44–46 | Gradle 8.12 + Fabric Loom 1.9.2, Java 21, MC 1.21.4 intermediary |
| hixo.dll | 17:10:49 | C++, linker 14.51 (VS2022 世代), 无 Rich header (clang-cl 类), release 去 PDB |
| hixo.exe | 17:10:50 | 同上, 版本资源 "hixo injector 1.0" |

三件套 6 秒内连续产出（JAR→DLL→EXE）= 脚本化一键构建；重打包必然出现外层比内层新的时间戳断层，此处没有。

## 原版性证据

1. 无壳、无字节补丁、资源明文完整
2. 混淆（indy 调度器 + 字符串池）为构建时施加，破解者不会重新混淆
3. `fabric.mod.json`: id=hixo, version=1.0.0, authors=["Hixo"], license=MIT
4. `LICENSE_hixo`: MIT License, Copyright (c) 2026 Hixo
5. 源码演化痕迹：`hixo.mixins.json` 声明的 `dev.hixo.mixin.*` 7 个类在 JAR 中不存在——
   作者已从 Fabric mixin 迁移到自研 patchify 运行时补丁框架，配置残留未清理
6. 公网无 "Hixo" 产品记录（私有分发）

## 混淆方案还原

- 所有反射调用经 invokedynamic 引导到 `dev.hixo.M.d`，调用点携带 64 位 long 常量
- long 位域：`>>>46` 池索引；`>>>42 &0x3F` 密钥选择；低 42 位 7-bit 分段派生 6 个子密钥
- 成员描述符（类名/方法名/字段名）以 `\b` 分隔的 base-36 串加密存于池 `a`，首次访问解密缓存到池 `b`
- 另有中央字符串池（2873 条）用 首字节查表种子 + 双滚动 XOR 解密
- 本仓库 `src/` 中 99% 的 `d.a(...)` 调用已标注 `/* => owner.member */` 真实目标
  （完整映射见 docs/xref.tsv, 解密过程见 docs/analysis-report.md）
