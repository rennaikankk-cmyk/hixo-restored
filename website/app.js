/* ============================================================
   HIXO — landing page runtime
   ============================================================ */

/* ------------------------- i18n ------------------------- */
const I18N = {
  zh: {
    'nav.features': '功能',
    'nav.modules': '模块',
    'nav.tech': '技术',
    'nav.download': '下载',
    'nav.faq': '常见问题',
    'nav.changelog': '更新日志',
    'nav.cta': '下载客户端',

    'hero.badge': 'Minecraft 1.21.4 · Fabric · 注入式',
    'hero.h1a': '把战斗',
    'hero.h1b': '做到极致',
    'hero.lead': '为 Minecraft 1.21.4 (Fabric) 打造的注入式客户端。预测级移动修正、自适应轮询、原生级渲染 —— 全部收在一个单文件注入器里。',
    'hero.cta1': '立即下载',
    'hero.cta2': '查看 23 个模块',

    'stat.modules': '个模块',
    'stat.cats': '个分类',
    'stat.mc': '游戏版本',
    'stat.frame': '帧开销',

    'mock.cats': '分类',
    'mock.hint': '左键开关 · 右键设置 · 中键绑定',

    'feat.eyebrow': 'CORE FEATURES',
    'feat.title': '不是功能堆砌，是工程细节',
    'feat.sub': '每一个模块都按服务端最终的判定逻辑反推实现，而不是靠试参数。',
    'feat.1.t': '预测级移动修正',
    'feat.1.d': '按帧预测轨迹后再修正朝向，静默转头不改变镜头与移动方向，服务端看到的旋转与物理一致。',
    'feat.2.t': '自适应轮询',
    'feat.2.d': '根据服务端 tick 与你当前延迟动态决定出手时机，而不是固定 CPS 的机械节奏。',
    'feat.3.t': '速度处置重构',
    'feat.3.d': 'VL2 支持 Buffer / Jump Reset 等多档模式，减速则用预补偿注入，而不是事后改输入。',
    'feat.4.t': '原生级渲染',
    'feat.4.d': 'ESP / TargetHUD / 灵动岛全部走原生绘制管线，纹理运行时注册，不依赖任何资源包。',
    'feat.5.t': '灵动岛 HUD',
    'feat.5.d': '状态变化实时上岛：击退处置、搭路、目标锁定，一眼看清现在在发生什么。',
    'feat.6.t': '单文件注入',
    'feat.6.d': '不写 mods、不改版本目录、不动客户端的任何文件，注入器一个 exe 全部搞定。',

    'mod.eyebrow': 'MODULE MATRIX',
    'mod.title': '23 个模块，7 个分类',
    'mod.sub': '全部模块都可在游戏内热开关与调参，配置自动保存。',

    'tech.eyebrow': 'UNDER THE HOOD',
    'tech.title': '为什么它跑得比别人稳',
    'tech.1.t': '网络线程只判断，主线程才落地',
    'tech.1.d': '入站包在 HEAD 阶段只做判定与取消，真正的状态处理交回主线程，和原版同步机制完全一致。',
    'tech.2.t': '出站包在序列化前改写',
    'tech.2.d': '移动、旋转、交互包统一在一个出站钩子里处理，顺序可控，不会出现包序错乱。',
    'tech.3.t': '零额外包',
    'tech.3.d': '可选功能默认复用客户端本就要发出的包，不额外制造流量特征。',

    'dl.eyebrow': 'DOWNLOAD',
    'dl.title': '现在就能用',
    'dl.sub': '下载注入器，双击运行，选择游戏进程即可。首次运行会生成独立配置目录，不污染原版。',
    'dl.cta': '下载 HIXO 注入器',
    'dl.cta2': '使用问题',
    'dl.note': 'Windows 10 / 11 · 64 位 · 需要 Java 21 运行环境',
    'dl.ver': '版本',
    'dl.build': '构建',
    'dl.size': '体积',
    'dl.target': '目标',
    'dl.anti': '反检测',
    'dl.hash': '校验值',
    'dl.starting': '开始下载…',
    'dl.opening': '正在打开…',
    'dl.pass': '提取码',
    'dl.closed': '暂未开放',
    'dl.closedNote': '内测中 · 暂不开放下载，开放后会在更新日志里通知',
    'dl.closedToast': '下载暂未开放，请留意更新日志',

    'show.eyebrow': 'IN-GAME',
    'show.title': '实机画面',
    'show.sub': 'HUD 全部走游戏内原生渲染管线，不开任何悬浮覆盖层。',
    'show.tag': '1.21.4 · Fabric',
    'show.n1.t': '灵动岛',
    'show.n1.d': '顶部中央，显示客户端 / 用户名 / 延迟 / 帧率',
    'show.n2.t': '模块列表',
    'show.n2.d': '按分类着色，开关状态实时同步',
    'show.n3.t': '效果 HUD',
    'show.n3.d': '药水计时、目标信息等，可自由拖动',

    'cl.eyebrow': 'CHANGELOG',
    'cl.title': '更新日志',
    'cl.sub': '每一次改动都记录在案，历史版本随时可回滚。',
    'cl.latest': '最新',
    'cl.beta': '内测版',
    'cl.stable': '稳定版',
    'cl.download': '下载此版本',
    'cl.copy': '复制校验值',
    'cl.copied': '已复制',
    'cl.tag.new': '新增',
    'cl.tag.imp': '优化',
    'cl.tag.fix': '修复',
    'cl.tag.rm': '移除',

    'faq.eyebrow': 'FAQ',
    'faq.title': '常见问题',

    'foot.tag': 'Minecraft 1.21.4 Fabric 客户端',
    'foot.note': '本页仅用于产品展示与技术交流。请在获得许可的环境中使用。'
  },

  en: {
    'nav.features': 'Features',
    'nav.modules': 'Modules',
    'nav.tech': 'Engineering',
    'nav.download': 'Download',
    'nav.faq': 'FAQ',
    'nav.changelog': 'Changelog',
    'nav.cta': 'Get client',

    'hero.badge': 'Minecraft 1.21.4 · Fabric · Injected',
    'hero.h1a': 'Combat,',
    'hero.h1b': 'perfected.',
    'hero.lead': 'An injected client for Minecraft 1.21.4 (Fabric). Prediction-grade movement correction, adaptive polling, native rendering — all inside a single-file injector.',
    'hero.cta1': 'Download now',
    'hero.cta2': 'Explore 23 modules',

    'stat.modules': 'modules',
    'stat.cats': 'categories',
    'stat.mc': 'game version',
    'stat.frame': 'frame cost',

    'mock.cats': 'Categories',
    'mock.hint': 'LMB toggle · RMB settings · MMB bind',

    'feat.eyebrow': 'CORE FEATURES',
    'feat.title': 'Engineering, not a feature dump',
    'feat.sub': 'Every module is built backwards from the server\u2019s final verdict, not from trial-and-error tuning.',
    'feat.1.t': 'Prediction-grade movement',
    'feat.1.d': 'Trajectory is predicted per tick before rotation is corrected. Silent aiming never alters your camera or movement direction.',
    'feat.2.t': 'Adaptive polling',
    'feat.2.d': 'Attack timing is derived from server ticks and your live latency instead of a mechanical fixed CPS.',
    'feat.3.t': 'Velocity, rebuilt',
    'feat.3.d': 'VL2 ships Buffer / Jump Reset profiles, and NoSlow is solved by pre-compensating input rather than patching it afterwards.',
    'feat.4.t': 'Native rendering',
    'feat.4.d': 'ESP, TargetHUD and the Dynamic Island all render through the vanilla pipeline. Textures are registered at runtime, no resource pack required.',
    'feat.5.t': 'Dynamic Island HUD',
    'feat.5.d': 'State changes surface instantly — velocity handling, scaffolding, target lock. See what is happening at a glance.',
    'feat.6.t': 'Single-file injection',
    'feat.6.d': 'No mods folder, no version edits, no files touched. One executable does everything.',

    'mod.eyebrow': 'MODULE MATRIX',
    'mod.title': '23 modules, 7 categories',
    'mod.sub': 'Everything is hot-toggleable and tunable in-game. Config saves itself.',

    'tech.eyebrow': 'UNDER THE HOOD',
    'tech.title': 'Why it stays stable',
    'tech.1.t': 'Netty thread decides, main thread applies',
    'tech.1.d': 'Inbound packets are only judged and cancelled at HEAD; real state work is handed back to the main thread, matching vanilla\u2019s own sync model.',
    'tech.2.t': 'Outbound packets rewritten pre-serialization',
    'tech.2.d': 'Movement, rotation and interaction packets run through one outbound hook, so ordering is always under control.',
    'tech.3.t': 'Zero packet overhead',
    'tech.3.d': 'Optional features reuse packets the client was already sending, adding no extra traffic signature.',

    'dl.eyebrow': 'DOWNLOAD',
    'dl.title': 'Ready when you are',
    'dl.sub': 'Grab the injector, run it, pick the game process. First launch creates its own config directory and leaves vanilla untouched.',
    'dl.cta': 'Download injector',
    'dl.cta2': 'Read the FAQ',
    'dl.note': 'Windows 10 / 11 · 64-bit · Java 21 runtime required',
    'dl.ver': 'Version',
    'dl.build': 'Build',
    'dl.size': 'Size',
    'dl.target': 'Target',
    'dl.anti': 'AC profile',
    'dl.hash': 'Checksum',
    'dl.starting': 'Starting\u2026',
    'dl.opening': 'Opening\u2026',
    'dl.pass': 'Password',
    'dl.closed': 'Coming soon',
    'dl.closedNote': 'Closed beta \u2014 downloads are not open yet. We will announce it in the changelog.',
    'dl.closedToast': 'Downloads are not open yet \u2014 check the changelog',

    'show.eyebrow': 'IN-GAME',
    'show.title': 'Straight from the game',
    'show.sub': 'Every HUD element renders through the vanilla pipeline — no overlay window, no external layer.',
    'show.tag': '1.21.4 · Fabric',
    'show.n1.t': 'Dynamic Island',
    'show.n1.d': 'Top center: client, username, latency, frame rate',
    'show.n2.t': 'Module list',
    'show.n2.d': 'Colored per category, state synced instantly',
    'show.n3.t': 'Effect HUD',
    'show.n3.d': 'Potion timers, target info — free to drag anywhere',

    'cl.eyebrow': 'CHANGELOG',
    'cl.title': 'Changelog',
    'cl.sub': 'Every change is on the record, and any previous build is one click away.',
    'cl.latest': 'Latest',
    'cl.beta': 'Beta',
    'cl.stable': 'Stable',
    'cl.download': 'Download build',
    'cl.copy': 'Copy checksum',
    'cl.copied': 'Copied',
    'cl.tag.new': 'New',
    'cl.tag.imp': 'Improved',
    'cl.tag.fix': 'Fixed',
    'cl.tag.rm': 'Removed',

    'faq.eyebrow': 'FAQ',
    'faq.title': 'Frequently asked',

    'foot.tag': 'Minecraft 1.21.4 Fabric client',
    'foot.note': 'This page is for product presentation and technical discussion. Use only in environments where you are permitted to.'
  }
};

/* ------------------------- modules ------------------------- */
const CATS = [
  { id: 'all',      zh: '全部',   en: 'All' },
  { id: 'combat',   zh: '战斗',   en: 'Combat' },
  { id: 'movement', zh: '移动',   en: 'Movement' },
  { id: 'player',   zh: '玩家',   en: 'Player' },
  { id: 'world',    zh: '世界',   en: 'World' },
  { id: 'render',   zh: '渲染',   en: 'Render' },
  { id: 'misc',     zh: '杂项',   en: 'Misc' },
  { id: 'client',   zh: '客户端', en: 'Client' }
];

const MODULES = [
  { c:'combat', n:'KillAura',       zh:'自适应轮询的近战核心，1.8.9 / 1.9+ 双战斗模式', en:'Adaptive melee core with 1.8.9 and 1.9+ combat profiles' },
  { c:'combat', n:'Criticals',      zh:'包级暴击：出手瞬间停疾跑并伪造下落，稳定触发暴击', en:'Packet criticals: cancels sprint and spoofs falling state on hit' },
  { c:'combat', n:'VL2',            zh:'速度处置核心，Buffer / Jump Reset / Grim 多档模式', en:'Velocity handling core with Buffer, Jump Reset and Grim profiles' },
  { c:'combat', n:'AutoThrow',      zh:'自动投掷，按距离与血量条件决定时机', en:'Automatic projectile throwing gated by range and health' },
  { c:'combat', n:'Backtrack',      zh:'延迟补偿：把目标回退到受击窗口内再攻击', en:'Lag compensation: rewinds targets into the attack window' },

  { c:'movement', n:'NoSlow',       zh:'减速预补偿，GrimTick / Vanilla / GrimJump 多模式', en:'Slowdown pre-compensation with GrimTick, Vanilla and GrimJump modes' },

  { c:'player', n:'AutoClicker',    zh:'可调 CPS 与随机化分布的自动点击', en:'Auto clicker with tunable CPS and randomized distribution' },
  { c:'player', n:'AutoTool',       zh:'根据目标方块自动切换到最优工具', en:'Switches to the optimal tool for the block you are mining' },
  { c:'player', n:'ChestStealer',   zh:'容器快速取出，带延迟与节奏控制', en:'Fast container looting with delay and pacing control' },
  { c:'player', n:'InventoryManager', zh:'背包整理与自动补货', en:'Inventory sorting and automatic restocking' },
  { c:'player', n:'NoSwing',        zh:'屏蔽挥手动画，可选连包一起取消', en:'Suppresses swing animation, optionally cancelling the packet too' },

  { c:'world', n:'Scaffold',        zh:'搭路：放置方向修正与旋转重同步', en:'Scaffolding with facing correction and rotation resync' },
  { c:'world', n:'Clutch',          zh:'坠落救援，自动放置方块或水', en:'Fall rescue that places blocks or water automatically' },

  { c:'render', n:'ESP',            zh:'实体描边与透视，可自定义颜色与层级', en:'Entity outlines and chams with custom colors and layering' },
  { c:'render', n:'ChestESP',       zh:'容器透视，过滤空箱与已搜索目标', en:'Container ESP with empty and searched filtering' },
  { c:'render', n:'TargetHUD',      zh:'目标信息面板：血量、护甲、距离', en:'Target panel showing health, armor and distance' },
  { c:'render', n:'PotionHud',      zh:'药水效果计时与层数显示', en:'Potion effect timer and amplifier display' },
  { c:'render', n:'DynamicIsland',  zh:'灵动岛：状态变化实时上岛', en:'Dynamic Island surfacing live state changes' },
  { c:'render', n:'NightVision',    zh:'夜视，可调亮度与色调', en:'Night vision with adjustable brightness and tint' },
  { c:'render', n:'OldHitting',     zh:'1.7 风格攻击动画与命中反馈', en:'1.7-style attack animation and hit feedback' },
  { c:'render', n:'ModuleListHud',  zh:'模块列表，可排序、可分组', en:'Module list HUD, sortable and groupable' },

  { c:'misc', n:'RotationFix',      zh:'旋转特征修正：AimStep / PerfectRotation / 重复角', en:'Rotation signature fixes: AimStep, PerfectRotation, duplicate angles' },

  { c:'client', n:'ClickGui',       zh:'内置 GUI 的风格、贴纸与分类设置', en:'Built-in GUI style, sticker and category settings' }
];

/* ------------------------- download ------------------------- */
/* 下载配置（改这里就行）：
   · 站内文件：exe 放进 web/downloads/，文件名写进 files
   · 外部直链（网盘 / OSS / GitHub Releases）：填进 external，填了优先用外链
   · pass 是网盘提取码，点下载会自动复制到剪贴板
   · 加新版本：三个表里都加一条 key，且要和 CHANGELOG 里的版本号一致 */
const DOWNLOAD = {
  /** ★ 下载总开关：false = 全站暂时关闭下载（按钮变灰、显示"暂未开放"） */
  enabled: false,
  dir: 'downloads/',
  files: {
    'v1.0.0': 'hixo-1.0.0.exe',
    'v0.9.0': ''
  },
  external: {
    'v1.0.0': 'https://wwauh.lanzouu.com/iy3JT4ak6tvg',
    'v0.9.0': ''
  },
  pass: {
    'v1.0.0': 'g10a',
    'v0.9.0': ''
  }
};

function downloadUrl(v) {
  if (DOWNLOAD.external[v]) return DOWNLOAD.external[v];
  const f = DOWNLOAD.files[v];
  return f ? DOWNLOAD.dir + f : '';
}

/** 下载是否开放（enabled 没写或为 true 就是开放） */
function downloadOpen() {
  return DOWNLOAD.enabled !== false;
}

function passFor(v) {
  return DOWNLOAD.pass ? (DOWNLOAD.pass[v] || '') : '';
}

/* 右下角浮动提示 */
let toastTimer = null;
function toast(msg) {
  let el = document.getElementById('toast');
  if (!el) {
    el = document.createElement('div');
    el.id = 'toast';
    document.body.appendChild(el);
  }
  el.textContent = msg;
  el.classList.add('on');
  clearTimeout(toastTimer);
  toastTimer = setTimeout(() => el.classList.remove('on'), 3400);
}

function startDownload(v, btn) {
  // 下载关闭时：完全静默 —— 不弹提示、不跳转、不开新窗口，点击等于没反应
  if (!downloadOpen()) return;
  const url = downloadUrl(v);
  if (!url) {
    alert(lang === 'zh'
      ? `${v} 还没配下载地址 —— 在 app.js 顶部的 DOWNLOAD 里补上。`
      : `No download configured for ${v} — add it to DOWNLOAD in app.js.`);
    return;
  }

  const pass = passFor(v);

  if (DOWNLOAD.external[v]) {
    // 外链（网盘）：新窗口打开 + 自动把提取码写进剪贴板
    if (pass && navigator.clipboard) navigator.clipboard.writeText(pass).catch(() => {});
    window.open(url, '_blank', 'noopener');
    toast(pass
      ? (lang === 'zh' ? `已打开下载页 · 提取码 ${pass} 已复制到剪贴板` : `Download page opened — password ${pass} copied`)
      : (lang === 'zh' ? '已打开下载页' : 'Download page opened'));
  } else {
    // 站内文件：直接下载
    const a = document.createElement('a');
    a.href = url;
    a.rel = 'noopener';
    const name = url.split('/').pop().split('?')[0];
    if (name) a.download = name;
    document.body.appendChild(a);
    a.click();
    a.remove();
    toast(lang === 'zh' ? '开始下载…' : 'Starting download…');
  }

  if (btn) {
    const old = btn.textContent;
    btn.textContent = t('dl.opening');
    setTimeout(() => { btn.textContent = old; }, 1800);
  }
}

/* ------------------------- changelog ------------------------- */
/* 维护提示：新版本往数组最前面加一条，给最新的那条加 latest:true，旧的去掉即可。
   notes 里每一项是 [类型, 说明]，类型可选 new / imp / fix / rm。 */
const CHANGELOG = [
  {
    v: 'v1.0.0', date: '2026-10-01', latest: true, kind: 'stable',
    size: '3.4 MB', hash: 'db5bd6795bbc',
    zh: [
      ['new', 'ClickGui 重做为 Naven 单窗口：右键模块调参、分类过滤、右下角贴纸'],
      ['new', 'Combat 全套：KillAura 自适应轮询 / Criticals 包级暴击 / VL2 速度处置 / AutoThrow / Backtrack'],
      ['new', 'Render 全套：灵动岛、TargetHUD、ChestESP、PotionHud、OldHitting、NightVision'],
      ['new', '注入器支持中英双语与独立设置窗口（语言 · 置顶 · 注入后关闭）'],
      ['imp', 'NoSlow 重构为预补偿注入，不再在 tick 末尾回填输入'],
      ['imp', '入站击退包改为「网络线程判定 + 主线程落地」，与原版同步机制一致'],
      ['fix', 'Criticals 修正出手时机，1.21 下稳定触发暴击'],
      ['imp', '配置统一保存到 hixo/modules.txt，纯文本可直接编辑']
    ],
    en: [
      ['new', 'ClickGui rebuilt as a single Naven window: RMB settings, category filter, corner sticker'],
      ['new', 'Full Combat suite: adaptive KillAura, packet Criticals, VL2 velocity handling, AutoThrow, Backtrack'],
      ['new', 'Full Render suite: Dynamic Island, TargetHUD, ChestESP, PotionHud, OldHitting, NightVision'],
      ['new', 'Bilingual injector with a standalone settings window (language \u00b7 always-on-top \u00b7 close-after-inject)'],
      ['imp', 'NoSlow rewritten as pre-compensation instead of post-tick input restoration'],
      ['imp', 'Inbound velocity now uses "decide on netty, apply on main thread", matching vanilla\u2019s sync model'],
      ['fix', 'Criticals timing corrected \u2014 reliably triggers on 1.21'],
      ['imp', 'Config consolidated into hixo/modules.txt, plain text and editable']
    ]
  },
  {
    v: 'v0.9.0', date: '2026-09-27', kind: 'beta',
    size: '3.1 MB', hash: '',
    zh: [
      ['new', '首个可注入版本，跑通 Fabric 1.21.4 完整注入链路'],
      ['new', 'KillAura / NoSlow / Scaffold 基础实现'],
      ['new', '灵动岛 HUD 初版'],
      ['fix', '修复注入后旋转不同步导致的移动方向偏移']
    ],
    en: [
      ['new', 'First injectable build \u2014 full Fabric 1.21.4 injection path working end to end'],
      ['new', 'Initial KillAura / NoSlow / Scaffold implementations'],
      ['new', 'First iteration of the Dynamic Island HUD'],
      ['fix', 'Fixed movement direction drift caused by unsynced rotation after injection']
    ]
  }
];

function renderChangelog() {
  const box = $('#clList');
  if (!box) return;

  box.innerHTML = CHANGELOG.map((c, i) => {
    const notes = c[lang] || c.zh;
    const open = i === 0;
    return `
    <div class="tl-item${c.latest ? ' latest' : ''}${open ? ' open' : ''}">
      <span class="tl-dot"></span>
      <div class="tl-card">
        <div class="tl-head">
          <div class="tl-ver"><b>${c.v}</b>${c.latest ? `<span class="tl-badge">${t('cl.latest')}</span>` : ''}</div>
          <div class="tl-meta">
            <span>${c.date}</span>
            ${c.hash ? `<i>·</i><span>${c.hash}</span>` : ''}
            <i>·</i><span>${c.size}</span>
            <i>·</i><span>${c.kind === 'beta' ? t('cl.beta') : t('cl.stable')}</span>
          </div>
          <span class="tl-chev"></span>
        </div>
        <div class="tl-body">
          <ul class="tl-notes">
            ${notes.map(n => `<li><em class="tag ${n[0]}">${t('cl.tag.' + n[0])}</em><span>${n[1]}</span></li>`).join('')}
          </ul>
          <div class="tl-actions">
            <a class="btn btn-sm ${downloadOpen() && c.latest ? 'btn-primary' : 'btn-ghost'}${downloadOpen() ? '' : ' is-off'}" href="#" data-dl="${c.v}">${t(downloadOpen() ? 'cl.download' : 'dl.closed')}</a>
            ${downloadOpen() && passFor(c.v) ? `<span class="tl-pass">${t('dl.pass')} <b>${passFor(c.v)}</b></span>` : ''}
            ${c.hash ? `<button class="btn btn-sm btn-ghost" type="button" data-hash="${c.hash}">${t('cl.copy')}</button>` : ''}
          </div>
        </div>
      </div>
    </div>`;
  }).join('');

  $$('.tl-item', box).forEach(item => {
    const head = $('.tl-head', item);
    const body = $('.tl-body', item);
    const sync = () => { body.style.maxHeight = item.classList.contains('open') ? body.scrollHeight + 'px' : '0px'; };
    sync();
    head.addEventListener('click', () => { item.classList.toggle('open'); sync(); });
  });

  $$('[data-dl]', box).forEach(a => a.addEventListener('click', e => {
    e.preventDefault();
    startDownload(a.dataset.dl, a);
  }));

  $$('[data-hash]', box).forEach(b => b.addEventListener('click', () => {
    const v = b.dataset.hash;
    if (navigator.clipboard) navigator.clipboard.writeText(v).catch(() => {});
    const old = b.textContent;
    b.textContent = t('cl.copied');
    setTimeout(() => { b.textContent = old; }, 1400);
  }));
}

/* ------------------------- faq ------------------------- */
const FAQ = [
  { zh:{ q:'支持哪些游戏版本？', a:'目前只针对 Minecraft 1.21.4 的 Fabric 版本做了完整适配。其他版本需要重新核对映射与注入点，不保证可用。' },
    en:{ q:'Which versions are supported?', a:'Only Minecraft 1.21.4 with Fabric is fully supported right now. Other versions require re-verifying mappings and injection points, and are not guaranteed.' } },
  { zh:{ q:'会封号吗？', a:'任何第三方客户端都存在被检测的可能，我们无法给出"绝对安全"的承诺。所有模块都尽量让服务端看到的状态与物理一致，但风险最终由使用者自行承担。' },
    en:{ q:'Will it get me banned?', a:'Any third-party client can be detected; there is no honest way to promise otherwise. Modules are built to keep server-visible state physically consistent, but the risk remains yours to take.' } },
  { zh:{ q:'需要装 Java 吗？', a:'需要一个能跑 Minecraft 1.21.4 的 Java 21 运行环境。客户端本身不修改游戏文件，所以不需要重新安装游戏。' },
    en:{ q:'Do I need Java installed?', a:'You need a Java 21 runtime able to run Minecraft 1.21.4. The client never modifies game files, so no reinstall is required.' } },
  { zh:{ q:'配置保存在哪？', a:{ html:'保存在游戏版本目录下的 <b>hixo/modules.txt</b>，纯文本，可以直接编辑或备份。删除它就会回到默认配置。' } },
    en:{ q:'Where is my config stored?', a:{ html:'In <b>hixo/modules.txt</b> inside the game version folder — plain text, safe to edit or back up. Delete it to reset to defaults.' } } },
  { zh:{ q:'怎么更新？', a:'直接下载新的注入器覆盖即可，配置会自动沿用。旧版本不需要卸载，因为它从未写进游戏目录。' },
    en:{ q:'How do I update?', a:'Download the new injector and overwrite — your config carries over. There is nothing to uninstall, since nothing was written into the game directory.' } }
];

/* ------------------------- state ------------------------- */
let lang = localStorage.getItem('hixo-lang');
if (lang !== 'zh' && lang !== 'en') {
  lang = (navigator.language || '').toLowerCase().startsWith('zh') ? 'zh' : 'en';
}
let modCat = 'all';

const $  = (s, r = document) => r.querySelector(s);
const $$ = (s, r = document) => Array.from(r.querySelectorAll(s));
const t  = k => (I18N[lang][k] ?? I18N.zh[k] ?? k);

/* ------------------------- apply language ------------------------- */
function applyLang() {
  document.documentElement.lang = lang === 'zh' ? 'zh-CN' : 'en';
  document.title = lang === 'zh'
    ? 'HIXO — Minecraft 1.21.4 Fabric 客户端'
    : 'HIXO — Minecraft 1.21.4 Fabric client';

  // 下载开关：状态先写进 data-i18n / class，再交给下面的循环统一套文案
  const open = downloadOpen();
  const dlBtn = $('#dlBtn');
  if (dlBtn) {
    const lbl = dlBtn.querySelector('[data-i18n]');
    if (lbl) lbl.dataset.i18n = open ? 'dl.cta' : 'dl.closed';
    dlBtn.classList.toggle('is-off', !open);
  }
  const dlNote = $('#dlNote');
  if (dlNote) dlNote.dataset.i18n = open ? 'dl.note' : 'dl.closedNote';
  const passRow = $('#dlPassRow');
  if (passRow) passRow.hidden = !open || !passFor('v1.0.0');

  $$('[data-i18n]').forEach(el => { el.textContent = t(el.dataset.i18n); });
  $('#langLabel').textContent = lang === 'zh' ? 'EN' : '中文';
  localStorage.setItem('hixo-lang', lang);
  renderTabs();
  renderModules();
  renderChangelog();
}

/* ------------------------- modules ------------------------- */
function renderTabs() {
  const box = $('#modTabs');
  const counts = { all: MODULES.length };
  MODULES.forEach(m => counts[m.c] = (counts[m.c] || 0) + 1);

  box.innerHTML = CATS.map(c => {
    const n = counts[c.id] || 0;
    return `<button class="tab${c.id === modCat ? ' on' : ''}" data-cat="${c.id}" type="button">
      ${c[lang]}<em>${n}</em></button>`;
  }).join('');

  $$('.tab', box).forEach(b => b.addEventListener('click', () => {
    modCat = b.dataset.cat;
    renderTabs();
    renderModules();
  }));
}

function renderModules() {
  const list = MODULES.filter(m => modCat === 'all' || m.c === modCat);
  $('#modGrid').innerHTML = list.map((m, i) => `
    <div class="mcard">
      <span class="num">${String(i + 1).padStart(2, '0')}</span>
      <div><b>${m.n}</b><span>${m[lang]}</span></div>
    </div>`).join('');
}

/* ------------------------- faq ------------------------- */
function renderFaq() {
  $('#faqList').innerHTML = FAQ.map((f, i) => {
    const cur = f[lang];
    const ans = typeof cur.a === 'string' ? cur.a : cur.a.html;
    return `<div class="qa" data-i="${i}">
      <button type="button">${cur.q}<span class="plus"></span></button>
      <div class="ans"><p>${ans}</p></div>
    </div>`;
  }).join('');

  $$('.qa').forEach(qa => {
    const btn = $('button', qa);
    const ans = $('.ans', qa);
    btn.addEventListener('click', () => {
      const open = qa.classList.contains('open');
      $$('.qa').forEach(o => { o.classList.remove('open'); $('.ans', o).style.maxHeight = null; });
      if (!open) {
        qa.classList.add('open');
        ans.style.maxHeight = ans.scrollHeight + 'px';
      }
    });
  });
}

/* ------------------------- reveal + counters ------------------------- */
function initReveal() {
  const io = new IntersectionObserver(entries => {
    entries.forEach(e => {
      if (e.isIntersecting) {
        e.target.classList.add('in');
        io.unobserve(e.target);
      }
    });
  }, { threshold: .14, rootMargin: '0px 0px -60px' });
  $$('.reveal').forEach((el, i) => {
    el.style.transitionDelay = (i % 3) * 70 + 'ms';
    io.observe(el);
  });
}

function initCounters() {
  const io = new IntersectionObserver(entries => {
    entries.forEach(e => {
      if (!e.isIntersecting) return;
      const el = e.target;
      io.unobserve(el);
      const end = parseInt(el.dataset.count, 10);
      const dur = 900;
      const t0 = performance.now();
      const step = now => {
        const p = Math.min(1, (now - t0) / dur);
        el.textContent = Math.round(end * (1 - Math.pow(1 - p, 3)));
        if (p < 1) requestAnimationFrame(step);
      };
      requestAnimationFrame(step);
    });
  }, { threshold: .6 });
  $$('[data-count]').forEach(el => io.observe(el));
}

/* ------------------------- chrome ------------------------- */
function initChrome() {
  const nav = $('#nav');
  const bar = $('#scrollBar');
  const onScroll = () => {
    const y = window.scrollY;
    nav.classList.toggle('stuck', y > 12);
    const h = document.documentElement.scrollHeight - window.innerHeight;
    bar.style.width = (h > 0 ? (y / h) * 100 : 0) + '%';
  };
  onScroll();
  window.addEventListener('scroll', onScroll, { passive: true });

  // 卡片跟随光标的高光
  $$('.card').forEach(card => {
    card.addEventListener('pointermove', e => {
      const r = card.getBoundingClientRect();
      card.style.setProperty('--mx', (e.clientX - r.left) + 'px');
      card.style.setProperty('--my', (e.clientY - r.top) + 'px');
    });
  });

  $('#langBtn').addEventListener('click', () => {
    lang = lang === 'zh' ? 'en' : 'zh';
    applyLang();
  });

  // 构建时间戳
  const d = new Date();
  $('#buildStamp').textContent =
    `${d.getFullYear()}-${String(d.getMonth() + 1).padStart(2, '0')}-${String(d.getDate()).padStart(2, '0')}`;

  // 提取码：配了外链 + 提取码才显示，点一下复制
  const pass = passFor('v1.0.0');
  const passRow = $('#dlPassRow');
  if (pass && passRow) {
    passRow.hidden = false;
    const passVal = $('#dlPassVal');
    passVal.textContent = pass;
    passRow.style.cursor = 'pointer';
    passRow.title = lang === 'zh' ? '点击复制提取码' : 'Click to copy';
    passRow.addEventListener('click', () => {
      if (navigator.clipboard) navigator.clipboard.writeText(pass).catch(() => {});
      toast(lang === 'zh' ? `提取码 ${pass} 已复制` : `Password ${pass} copied`);
    });
  }

  // 下载按钮
  $('#dlBtn').addEventListener('click', e => {
    e.preventDefault();
    startDownload('v1.0.0', e.currentTarget);
  });
}

/* ------------------------- hero shot ------------------------- */
/* assets/shot.png 存在就自动换成真实游戏截图，不存在则保留 CSS 复刻的 GUI */
function initHeroShot() {
  const img = $('#heroShot');
  const win = $('#mockWindow');
  if (!img || !win) return;
  const probe = new Image();
  probe.onload = () => {
    img.src = probe.src;
    img.hidden = false;
    win.classList.add('has-shot');
  };
  probe.src = 'assets/shot.png';
}

/* ------------------------- boot ------------------------- */
renderFaq();
initChrome();
initHeroShot();
initReveal();
initCounters();
applyLang();
