# 混淆类 → 身份映射

模块类身份通过静态字符串池解密确认（每个类的池内含模块显示名/描述）。
`dev.hixo.M.s.*` 为模块包。Y/T 出现 KillAura 字样疑似引用（ChestStealer 引用了 KillAura 模块名做联动）。

| 混淆类 | 身份 | 证据（池内字符串） |
|---|---|---|
| dev.hixo.M.s.S.t | **KillAura** | KillAura / 自动攻击周围目标 / Ray Check / Ping Comp |
| dev.hixo.M.s.K.A | **ESP** | ESP / 透视显示实体轮廓 / Animals / Players |
| dev.hixo.M.s.K.U | **ChestESP** | ChestESP / 高亮显示箱子 |
| dev.hixo.M.s.S.j | **AntiKB** | AntiKB / Jump Reset / 反击退 |
| dev.hixo.M.s.S.k | **AntiKnockback** | AntiKnockback / 防击退 / Grim |
| dev.hixo.M.s.S.K | **Criticals** | Criticals / 1.8.9 包暴击 / OpenZen |
| dev.hixo.M.s.S.a | **Backtrack** | Backtrack / 回溯敌人位置 |
| dev.hixo.M.s.S.z | **AutoThrow** | AutoThrow / 自动投掷鸡蛋雪球 |
| dev.hixo.M.s.Y.J | **AutoTool** | AutoTool / 自动切换最佳工具 |
| dev.hixo.M.s.Y.T | **ChestStealer** | ChestStealer / Smart Stealing（池内引用 KillAura） |
| dev.hixo.M.s.Y.g | **AutoClicker** | AutoClicker / 自动连点 |
| dev.hixo.M.s.Y.e | **NoSwing** | NoSwing / 防砍动画 |
| dev.hixo.M.s.K.e | **NightVision** | 夜视，提升画面亮度 |
| dev.hixo.M.s.D.F | **Clutch** | Clutch / 掉落时自动放方块自救 |
| dev.hixo.M.s.D.O | **Item Spoof** | Item Spoof / Swing / Telly |
| dev.hixo.M.s.D.U | **BlockFly**（放置类） | Block Slot Mode / Eagle / 自动搭路 |
| dev.hixo.M.s.H.S | **RotationFix** | RotationFix / ACA / Grim Duplicate Rot |
| dev.hixo.M.s.K.J | **DynamicIsland (HUD)** | 灵动岛：品牌/服务器/延迟 |
| dev.hixo.M.s.K.M | **ArrayList (HUD)** | ArrayList / Hue / Saturation |
| dev.hixo.M.s.K.i | **TargetHUD** | TargetHUD / Health Bar |
| dev.hixo.M.s.K.p | **Animation (1.8打击动画)** | Animation / 1.8.9 打击动画 |
| dev.hixo.M.s.A.l | **ClickGui 设置** | ClickGui / Hidden Categories / Flat Panels |
| dev.hixo.f.K.F | **床战助手（BedWars）** | 选择一个队伍 / 再来一局 / 离开游戏 |

框架/基础设施类：

| 混淆类 | 身份 |
|---|---|
| dev.hixo.M.d | invokedynamic 混淆调度器（反射解析器 + 字符串池） |
| dev.hixo.M.n | 模块管理器 |
| dev.hixo.M.G | 模块基类 |
| dev.hixo.T.V | 事件总线 |
| dev.hixo.c.C | ClickGUI 主界面（"Hixo"） |
| dev.hixo.c.u.p | GUI 组件/面板 |
| dev.hixo.P.T | 命令管理器 |
| dev.hixo.P.s | 按键绑定管理器 |
| dev.hixo.D.a | HUD 渲染器 |
| dev.hixo.patch.* | patchify 运行时补丁（对 MC 类做 retransform） |
| asm.patchify.* | 自研字节码补丁框架（mixin 替代品） |
