package com.deepseekharness.app.util;
import java.util.*;
/** 由 tools/prepare-ui-languages.py 生成，请修改文案目录。 */
final class UiMessages {
static final Map<String,String> EN = build();
private static Map<String,String> build() { Map<String,String> values=new HashMap<>();
part0(values);
part1(values);
part2(values);
part3(values);
part4(values);
part5(values);
part6(values);
part7(values);
part8(values);
part9(values);
part10(values);
part11(values);
part12(values);
part13(values);
part14(values);
part15(values);
part16(values);
part17(values);
part18(values);
part19(values);
part20(values);
part21(values);
part22(values);
part23(values);
part24(values);
part25(values);
part26(values);
part27(values);
part28(values);
part29(values);
part30(values);
part31(values);
part32(values);
part33(values);
part34(values);
part35(values);
part36(values);
part37(values);
part38(values);
part39(values);
part40(values);
part41(values);
part42(values);
part43(values);
part44(values);
part45(values);
part46(values);
return Collections.unmodifiableMap(values);
}
private static void part0(Map<String,String> values) {
values.put("下一步","Next");
values.put("下载更新","Download update");
values.put("保存配置","Save settings");
values.put("取消检查","Cancel check");
values.put("名称排序","Sort by name");
values.put("启动","Start");
values.put("备份并重建环境","Back up and rebuild");
values.put("安全启动","Safe start");
values.put("安装与修复","Install & repair");
values.put("导出插件包","Export plugins");
values.put("开始配对","Start pairing");
values.put("恢复选项","Recovery options");
values.put("手动地址与端口","Manual address & port");
values.put("打开插件管理","Manage plugins");
values.put("按需修复","Repair failed items");
values.put("授权 Shizuku","Authorize Shizuku");
values.put("插件","Plugins");
values.put("未检查","Not checked");
values.put("检查更新","Check for updates");
values.put("环境维护","Environment maintenance");
values.put("白天","Light");
values.put("终端","Terminal");
values.put("设备能力授权","Device permissions");
values.put("设置","Settings");
values.put("输入命令，回车执行","Enter a command and press Enter");
values.put("还没有日志。","No logs yet.");
values.put("配对与端口说明","Pairing and ports");
values.put("重启","Restart");
values.put("3080（1—65535，避开 3081 / 3090）","3080 (1–65535; avoid 3081 / 3090)");
values.put("6 位配对码","6-digit pairing code");
values.put("ADB 已关闭。不用无线调试就保持关闭。","ADB is off. Leave it off if you do not use wireless debugging.");
values.put("ADB 无线配对","Wireless ADB pairing");
values.put("API key、安装、工作区、备份","API key, installation, workspace, backups");
values.put("DNS · 会话 · Android 用户组","DNS · Sessions · Android groups");
values.put("DSH 未运行","DSH is not running");
values.put("DeepSeek Harness 一键启动器\\n\\n内置 Linux 环境，无需 Termux，\\n自动安装并启动，开箱即用。","DeepSeek Harness launcher\\n\\nIncludes a Linux environment. No Termux required.\\nInstalls and starts automatically.");
values.put("GitHub 仓库 · QQ 交流群 · 开源协议","GitHub · QQ community · License");
values.put("JavaScript 运行环境","JavaScript runtime");
values.put("Linux 环境","Linux environment");
values.put("Shizuku 未授权","Shizuku is not authorized");
values.put("deepseek-harness：默认最新 RC","deepseek-harness: latest RC by default");
values.put("dsh / npm 损坏时用；配置与对话记录会保留","Repair dsh / npm; settings and conversations are preserved");
values.put("dsh 入口与版本","dsh entry point and version");
values.put("▸ 高级：端口","▸ Advanced: port");
values.put("三步上手","Get started in three steps");
values.put("下一页会自动解压内置 Linux 环境，不用自己装","The next page extracts the bundled Linux environment automatically.");
values.put("下载日志","Download logs");
values.put("下载错误日志","Download error logs");
values.put("下载错误日志 · 环境检查 · 故障修复","Error logs · Environment checks · Repairs");
values.put("两个用途：① 自动读取系统「无线调试」的配对码，省掉手抄（配对码两分钟就失效）；② 让 AI 助手能读屏、点按、输入、按键、截屏（截屏需 Android 11+），从而在没有 ADB 和 Shizuku 的情况下也能操作手机。\n\nDSHA 不做任何后台屏幕记录：读屏只发生在助手明确请求的那一刻，结果直接回到对话里，不落盘也不上传；配对码只在你点过「自动读配对码」后的两分钟内读取。","Two purposes: (1) Read the pairing code from Android's Wireless debugging dialog, so you do not have to copy a code that expires after two minutes. (2) Let the AI assistant read the screen, tap, type, press keys and take screenshots (Android 11+), enabling device control without ADB or Shizuku.\n\nDSHA does not record your screen in the background. Screen contents are read only when the assistant explicitly requests them, returned directly to the conversation, and are not saved or uploaded separately. Pairing codes are read only during the two minutes after you tap Auto-read pairing code.");
values.put("中止","Stop");
values.put("仅控制应用中填写的 DeepSeek API Key，开关即时保存。关闭后，恢复时需重新填写；插件配置仍可能含其他凭据。","Applies only to the DeepSeek API key entered in this app. Changes are saved immediately. If disabled, enter the key again after restoring. Plugin settings may still contain other credentials.");
values.put("从文件恢复","Restore from file");
values.put("传感器与手电","Sensors & flashlight");
values.put("使用 proroot 运行时","Use proroot runtime");
values.put("使用兼容浏览内核","Use compatibility browser");
values.put("使用提示","Tips");
values.put("使用桌面版网页布局","Use desktop web layout");
values.put("保存位置：Download/DSHA","Save to: Download/DSHA");
values.put("保持系统配对弹窗开启，用分屏返回 DSHA，输入当前的 6 位数字。","Keep the system pairing dialog open. Return to DSHA in split screen and enter the current 6-digit code.");
values.put("修复工具","Repair tools");
values.put("停止","Stop");
values.put("允许 Root Shell","Allow root shell");
values.put("允许局域网访问","Allow LAN access");
values.put("允许当前 DSHA 环境中的助手和插件查询本 Android 用户的短信，包括号码、正文和可能存在的验证码。预授权后无需逐条确认，关闭可撤销。仅允许查询；Android 仍可能拒绝访问。  使用已授权的 root 或 ADB 通道。Shizuku 不执行短信查询。","Allow the assistant and plugins in this DSHA environment to query SMS messages for the current Android user, including numbers, message bodies and verification codes. Preauthorization skips individual confirmations and can be revoked here. Queries only; Android may still deny access. Uses an authorized root or ADB connection. Shizuku does not run SMS queries.");
values.put("允许查询设备目录；根目录、相册及 Android/data 等目录只读。禁止改分区、系统设置和不认识的命令；结束应用前刷新完整清单，保护系统应用与关键进程。普通下载文件操作和结束普通用户应用可直接执行。","Allow device directory queries. Root directories, photo folders and Android/data remain read-only. Partition changes, system setting changes and unrecognized commands are blocked. Refresh the complete app list before stopping apps to protect system apps and essential processes. Ordinary download file operations and stopping ordinary user apps can run directly.");
values.put("允许读取位置","Allow location access");
values.put("关于","About");
values.put("关于 DSHA","About DSHA");
values.put("关于 DSHA · 加入交流","About DSHA · Community");
values.put("其他文件选择器","Other file picker");
values.put("内置环境会自动解压，填 key 就能用；没有 key 也能先装","The bundled environment extracts automatically. Add a key to start using it, or install first without a key.");
values.put("切换页面后任务继续，返回可查看结果。修复只处理失败项；停止请求会等待当前操作安全收尾。","Tasks continue when you leave this page. Return to see results. Repairs affect only failed items; stopping waits for the current operation to finish safely.");
values.put("创建备份","Create backup");
values.put("到「启动」页启动即可使用","Start the service on the Start page");
values.put("到「设置 → 配置」填入；也可跳过，之后在 WebUI 里配置第三方 API","Enter it in Settings → Configuration, or skip and configure a third-party API in the Web UI later.");
values.put("包管理器","Package manager");
values.put("反馈问题","Report a problem");
values.put("取消当前任务","Cancel task");
values.put("取消当前操作","Cancel operation");
}
private static void part1(Map<String,String> values) {
values.put("另存为","Save as");
values.put("只看自己装的","Only my plugins");
values.put("可留空，也可在对话页设置官方或第三方接口与模型。","Optional. You can also configure official or third-party APIs and models in the conversation page.");
values.put("同步本机安装状态","Sync installed plugins");
values.put("后台断连时，可允许 DSHA 后台运行并减少电池限制。厂商仍可能暂停后台；恢复前先确认无线调试已开启，再点「验证已有连接」。","If the connection drops in the background, allow DSHA to run in the background and reduce battery restrictions. Your device may still suspend it. Before reconnecting, turn on Wireless debugging, then tap Verify connection.");
values.put("后台运行","Background operation");
values.put("启动 Web UI","Start Web UI");
values.put("启动 Web UI，点「进入」在软件里打开","Start the Web UI, then tap Open to use it in the app.");
values.put("启动、终端、市场、设置，底栏一切换","Switch between Start, Terminal, Plugins and Settings using the bottom bar.");
values.put("启动时检查更新","Check for updates on startup");
values.put("启用 ADB 设备通道（默认关闭）","Enable ADB device access (off by default)");
values.put("四个页面","Four pages");
values.put("在 DSHA「设备能力授权」中启用 ADB，并保持手机连接 Wi-Fi。","Enable ADB in DSHA's Device permissions and keep your phone connected to Wi-Fi.");
values.put("在本机 Web 运行时，通过 3081 端口供同一 Wi-Fi 的设备访问对话。需要局域网权限，请仅在可信网络开启。","While the local Web service is running, devices on the same Wi-Fi can access conversations through port 3081. LAN permission is required. Enable only on trusted networks.");
values.put("在浏览器查看发布页","View releases in browser");
values.put("在系统浏览器中打开","Open in browser");
values.put("基础工具","Basic tools");
values.put("填入 API key（可跳过）","Enter an API key (optional)");
values.put("备份","Backup");
values.put("备份与恢复","Backup & restore");
values.put("备份包含 API Key","Include API key in backups");
values.put("备份可能包含密钥、配置和插件凭据，请妥善保存。","Backups may contain keys, settings and plugin credentials. Store them securely.");
values.put("复制","Copy");
values.put("复制反馈","Copy report");
values.put("安全模式：恢复此前启用的第三方插件","Safe mode: restore previously enabled third-party plugins");
values.put("安装或修改插件后，重启 Web 生效。支持 GitHub、npm 和 ZIP / TAR / TAR.GZ / TGZ 的已构建插件包；导出包可在其他 DSHA 中导入。","Restart the Web service after installing or changing plugins. Supports GitHub, npm and prebuilt ZIP / TAR / TAR.GZ / TGZ plugin packages. Exported packages can be imported into another DSHA installation.");
values.put("安装插件","Install plugin");
values.put("安装更新","Install update");
values.put("导入插件包","Import plugins");
values.put("导出报告","Export report");
values.put("少提醒我","Fewer confirmations");
values.put("尝试使用 proroot 加快容器运行；部分设备或命令不兼容时可关闭，使用 proot。保存并重启 Web 后生效。","Use proroot to speed up the container. If your device or a command is incompatible, turn this off to use proot. Save and restart the Web service to apply.");
values.put("工作区","Workspace");
values.put("市场","Marketplace");
values.put("常用设置","Common settings");
values.put("应用更新","App updates");
values.put("应用路径","Apply path");
values.put("开启设备通道","Enable device access");
values.put("强制使用内置 Gecko，适合系统网页白屏或不兼容时；关闭后由 App 自动选择可用内核。保存后重新进入对话生效。","Force the bundled Gecko browser if the system browser shows a blank page or is incompatible. Otherwise, the app selects a compatible engine automatically. Save and reopen the conversation to apply.");
values.put("当前版本","Current version");
values.put("当前版本没有插件翻译设置；不影响插件安装及使用。","This version has no separate plugin translation setting. Plugin installation and use are unaffected.");
values.put("悬浮显示 AI 输出","Show AI output in an overlay");
values.put("悬浮条设置 ›","Overlay settings ›");
values.put("所有文件访问权限 ›","All files access ›");
values.put("手机已 root 时可直接使用 su，无需 ADB 配对。首次执行请在 root 管理器中授权 DSHA；设备保护规则始终生效。","On a rooted phone, use su directly without ADB pairing. Authorize DSHA in your root manager on first use. Device protection rules always apply.");
values.put("打开 Shizuku 管理器","Open Shizuku manager");
values.put("打开数据与备份","Open backup & data");
values.put("打开无线调试","Open Wireless debugging");
values.put("打开无线调试设置","Wireless debugging settings");
values.put("把 AI 回复和工具执行状态显示在其他 App 上方；保存后需允许悬浮窗权限。旁人也可能看到输出。","Display AI responses and tool status over other apps. After saving, allow display-over-other-apps permission. People nearby may see the output.");
values.put("按需备份全部数据、对话、设置或插件。","Back up all data, conversations, settings or plugins as needed.");
values.put("按需要连接设备通道并授予权限。设备命令优先使用已启用的 root，其次 Shizuku，再使用 ADB。","Enable the device connections and permissions you need. Commands use enabled root access first, then Shizuku, then ADB.");
values.put("授权后自动连接，无需启用 ADB。服务重启后会恢复绑定。","Connects automatically after authorization; ADB is not required. Rebinds after the service restarts.");
values.put("插件市场","Plugin marketplace");
values.put("插件操作状态，点按查看完整信息","Plugin operation status. Tap for details.");
values.put("插件管理","Plugin manager");
values.put("插件翻译（尚未提供）","Plugin translation (not available)");
values.put("插件链接或 npm 包名","Plugin URL or npm package name");
values.put("搜索插件名称或描述","Search plugin names or descriptions");
values.put("收集启动失败、崩溃和最近运行输出。下载后可在 Download/DSHA 中找到。","Collect startup failures, crashes and recent output. Downloaded logs are saved to Download/DSHA.");
values.put("敏感能力","Sensitive permissions");
values.put("文件共享","File sharing");
values.put("新建终端","New terminal");
values.put("显示与运行","Display & runtime");
values.put("普通对话、插件和 App 自身的通知等功能不需要 ADB。\\n\\nADB 用于助手执行受支持的 Android 设备命令，例如查看应用与系统状态、读取有限日志、操作允许目录内的文件。所有命令仍需通过 DSHA 策略检查；开启 ADB 不会放开静默装卸应用、修改系统设置或刷机。\\n\\n短信查询需在「设置 → 设备能力授权」中预授权，或逐次确认。屏幕点击与输入使用下方的屏幕操作权限。\\n\\n使用无线配对需要 Android 11+ 的「无线调试」功能；部分厂商可能限制。更低版本可在可用时使用 Shizuku，或继续使用无需 ADB 的功能。","Regular conversations, plugins and DSHA notifications do not require ADB.\\n\\nADB lets the assistant run supported Android device commands, such as inspecting app and system status, reading limited logs and working with files in allowed directories. Every command must still pass DSHA's policy checks. Enabling ADB does not allow silent app installation or removal, system setting changes or firmware flashing.\\n\\nSMS queries require preauthorization in Settings → Device permissions or confirmation for each query. Screen taps and typing use the screen-control permission below.\\n\\nWireless pairing requires Android 11+ Wireless debugging and may be restricted by your device manufacturer. On older versions, use Shizuku where available or continue using features that do not require ADB.");
values.put("暂无终端\\n点击「新建」打开一个终端","No terminals\\nTap New to open a terminal");
values.put("更多","More");
values.put("更新 App 与运行脚本","Update app & runtime scripts");
values.put("更新通道","Update channel");
values.put("本次配对码","Current pairing code");
values.put("本页开关即时保存。先准备离线依赖，再获取新配对码，避免等待时配对码失效。","Changes on this page are saved immediately. Prepare offline dependencies before getting a fresh pairing code so it does not expire while you wait.");
values.put("来自系统配对弹窗，失效后需重新获取","From the system pairing dialog; get a new code if it expires.");
values.put("查看崩溃日志","View crash logs");
values.put("检查全部六项组件，查看每项结果；缺失时再按需修复。","Check all six components and view each result. Repair missing components only as needed.");
values.put("检查日志","Check logs");
values.put("检查环境","Check environment");
values.put("检查结果","Check results");
values.put("检查运行环境、证书和插件状态。","Check the runtime environment, certificates and plugin status.");
values.put("检测已安装插件","Detect installed plugins");
values.put("检测插件","Detect plugins");
}
private static void part2(Map<String,String> values) {
values.put("正在准备运行环境","Preparing the runtime environment");
values.put("浏览、安装、开关插件","Browse, install and enable plugins");
values.put("浏览目录","Browse directory");
values.put("涉及精确位置，默认关闭。","Uses precise location. Off by default.");
values.put("清理","Clear");
values.put("清理损坏会话","Clean up damaged sessions");
values.put("清除环境","Delete environment");
values.put("点击下方验证按钮。重启手机或重新开启无线调试后，可再次验证。","Tap Verify connection below. Verify again after restarting your phone or turning Wireless debugging off and on.");
values.put("版本说明","Release notes");
values.put("环境检查","Environment checks");
values.put("申请授权并验证 root","Authorize and verify root");
values.put("短信读取","Read SMS");
values.put("稳定 / 预览更新通道","Stable / Preview update channels");
values.put("稳定版","Stable");
values.put("稳定版仅接收正式发布；预览版也包含测试版本。自动匹配当前设备。","Stable receives official releases only. Preview also includes test releases. The app selects the build for your device.");
values.put("端口","Port");
values.put("等环境解压完","Wait for extraction");
values.put("简易","Simple");
values.put("简易终端","Simple terminal");
values.put("粘贴链接","Paste URL");
values.put("维护与信息","Maintenance & information");
values.put("自动读取本次配对码","Auto-read pairing code");
values.put("补充复现步骤，不要填写密钥或私人对话","Add steps to reproduce. Do not include keys or private conversations.");
values.put("解压时请保持屏幕常亮，不要杀后台。","Keep the screen on during extraction and do not stop the app.");
values.put("解析插件","Inspect plugin");
values.put("解析链接","Inspect URL");
values.put("让对话页按电脑浏览器显示，适合大屏；手机通常保持关闭。保存后重新进入对话生效。","Use the desktop conversation layout for larger screens. Usually leave this off on phones. Save and reopen the conversation to apply.");
values.put("设备 Shell · Shizuku","Device shell · Shizuku");
values.put("设备命令保护始终开启","Device command protection is always on");
values.put("设备权限与 ADB","Device permissions & ADB");
values.put("设置屏幕操作权限","Screen-control permissions");
values.put("设置电池优化","Battery settings");
values.put("诊断与日志","Diagnostics & logs");
values.put("诊断报告","Diagnostic report");
values.put("调整悬浮条底色、透明度、行数、字号和停留时间；也可选择是否显示思考过程和命令原文。","Adjust the overlay background, opacity, line count, font size and display duration. Choose whether to show reasoning and command text.");
values.put("输入本次配对码","Enter the current pairing code");
values.put("运行日志","Runtime logs");
values.put("运行环境中的工作目录名","Working directory name inside the runtime");
values.put("运行脚本随 APK 更新；这里打开真实版本检查与下载页面。","Runtime scripts update with the APK. Open this page to check and download app releases.");
values.put("运行补丁","Runtime patches");
values.put("返回","Back");
values.put("返回上一页","Go back");
values.put("返回启动页处理插件 / 安全启动","Back to Start: plugins / safe start");
values.put("进 Linux 环境敲命令","Run commands in Linux");
values.put("进入 App 后在后台检查所选稳定 / 预览通道；发现新版本时提示，由你决定是否下载。","Check the selected Stable or Preview channel in the background when the app opens. You decide whether to download an available update.");
values.put("进入开发者选项 → 无线调试，开启后选择「使用配对码配对设备」。","Go to Developer options → Wireless debugging, turn it on, then choose Pair device with pairing code.");
values.put("连接这台手机的 Android 系统，需要 Android 11+ 无线调试功能。","Connect to this phone's Android system using Android 11+ Wireless debugging.");
values.put("配对后验证连接","Verify after pairing");
values.put("重新解压内置环境","Re-extract bundled environment");
values.put("重新诊断","Run checks again");
values.put("重置与清除操作会再次询问，请先做好备份。","Reset and deletion require confirmation. Back up your data first.");
values.put("重置配置，保留对话","Reset settings, keep conversations");
values.put("重试","Retry");
values.put("错误日志","Error logs");
values.put("预览最近备份","Preview latest backup");
values.put("预览版","Preview");
values.put("首次启动需要解压内置环境，请稍候…","Extracting the bundled environment for first use. Please wait…");
values.put("验证已有连接","Verify connection");
values.put("＋ 新建","＋ New");
values.put("\n\n保存到 Download/DSHA，每次使用独立文件名。","\n\nSaved to Download/DSHA with a unique filename each time.");
values.put("\n\n有未完成的环境维护，请恢复原环境后再继续。","\n\nEnvironment maintenance is incomplete. Restore the original environment before continuing.");
values.put("\n\n本机 Web 地址（可长按复制）：\n","\n\nLocal Web address (press and hold to copy):\n");
values.put("\n\n版本：","\n\nVersion: ");
values.put("\n上次未完成：","\nPreviously incomplete: ");
values.put("\n上次检查版本：","\nLast checked version: ");
values.put("\n位置：","\nLocation: ");
values.put("\n兼容内核 Gecko 143","\nCompatibility browser: Gecko 143");
values.put("\n原生 API Key：","\nApp API key: ");
values.put("\n只恢复插件文件，当前启用状态和对话数据保留；重启 Web 生效。","\nRestore plugin files only. Current enabled states and conversations are preserved. Restart the Web service to apply.");
values.put("\n可回退：","\nRollback available: ");
values.put("\n可安全启动进入基础界面；插件文件和原配置保留。下载日志可保留完整错误上下文。","\nUse Safe start to open the basic interface. Plugin files and original settings are preserved. Download logs to retain the full error context.");
values.put("\n可更新：","\nUpdate available: ");
values.put("\n对话、其他插件及外部源码目录会保留。需要留存时可先导出。","\nConversations, other plugins and external source directories are preserved. Export first if you need a copy.");
values.put("\n快照期间若数据变化，备份会失败，可在任务完成后重试。","\nIf data changes during the snapshot, the backup fails. Retry after the task finishes.");
values.put("\n来源：","\nSource: ");
values.put("\n正在取消检查…","\nCanceling check…");
values.put("\n用户补充复现步骤：\n","\nAdditional steps to reproduce:\n");
values.put("\n等待当前修复到达安全点，随后停止","\nWaiting for the repair to reach a safe stopping point");
values.put("\n返回启动页可查看插件详情，或安全启动进入基础界面。","\nReturn to Start for plugin details, or use Safe start to open the basic interface.");
values.put("\n配置文件和插件自身保存的凭据会随原文件一起备份。","\nConfiguration files and credentials stored by plugins are backed up with their original files.");
}
private static void part3(Map<String,String> values) {
values.put(" · 关闭中…"," · Closing…");
values.put(" · 兼容版"," · Compatibility edition");
values.put(" · 已兼容切换 proot"," · Switched to proot for compatibility");
values.put(" · 当前阶段 "," · Current stage ");
values.put(" · 总耗时 "," · Total time ");
values.put(" · 本阶段 "," · Stage time ");
values.put(" · 标准版"," · Standard edition");
values.put(" · 版本码 "," · Build ");
values.put(" 个插件"," plugins");
values.put(" 是 Web 运行所需的核心，禁用后页面可能无法启动。"," is required by the Web service. Disabling it may prevent the page from starting.");
values.put(" 的安装和启用状态"," installation and enabled state");
values.put(" 的安装文件和启用记录。"," installation files and enabled-state records.");
values.put(" 秒"," s");
values.put(" 秒\n"," s\n");
values.put(" 秒 · 总计 "," s · Total ");
values.put(" 行"," lines");
values.put(" 行 · 停止输出后保留 "," lines · Keep visible after output ends for ");
values.put(" 项异常，查看插件与恢复选项"," issues; check plugins and recovery options");
values.put("ADB 已关闭。开启后才会保持连接。","ADB is off. Enable it to keep the connection active.");
values.put("ADB 操作已取消","ADB operation canceled");
values.put("ADB 操作未完成：","ADB operation incomplete: ");
values.put("ADB 状态读取失败：","Could not read ADB status: ");
values.put("ADB 配对完整任务","Complete ADB pairing task");
values.put("ADB 验证完整任务","Complete ADB verification task");
values.put("DSH 停止中…","DSH is stopping…");
values.put("DSH 启动中…","DSH is starting…");
values.put("DSH 已停止","DSH stopped");
values.put("DSH 已就绪，可进入","DSH is ready to open");
values.put("DSH 未就绪","DSH is not ready");
values.put("DSHA 内置插件","DSHA bundled plugins");
values.put("DSHA 安装日志","DSHA installation logs");
values.put("DSHA 诊断","DSHA diagnostics");
values.put("DeepSeek Harness 安卓启动器\n","DeepSeek Harness launcher for Android\n");
values.put("LAN 开关生效失败: ","Could not apply LAN setting: ");
values.put("PTY 启动失败：","PTY startup failed: ");
values.put("QQ 群","QQ group");
values.put("Root · Shizuku · ADB · 权限","Root · Shizuku · ADB · Permissions");
values.put("Ubuntu 24.04 · 回车执行 · 中止会重启 shell · 交互输入请用 PTY\n","Ubuntu 24.04 · Enter runs a command · Stop restarts the shell · Use PTY for interactive input\n");
values.put("Web 尚未就绪，请返回启动页查看服务状态","The Web service is not ready. Return to Start to check its status.");
values.put("Web 状态已变化，请等待就绪后重新进入","The Web service changed. Wait until it is ready, then open it again.");
values.put("Web 鉴权失败，请点「进入」重试（","Web authentication failed. Tap Open to retry (");
values.put("launch 已调用","launch called");
values.put("launch 异常: ","launch exception: ");
values.put("…（输出过长已截断）\n","…(long output truncated)\n");
values.put("⚠️ 状态未知：点上方到系统设置确认「DSHA 配对助手」已开启","⚠️ Status unknown: open system settings above and check that DSHA Pairing Assistant is enabled.");
values.put("✅ 已开启：AI 可读屏 / 点按 / 输入 / 截屏（截屏需 Android 11+）","✅ Enabled: the AI can read the screen, tap, type and take screenshots (Android 11+).");
values.put("❌ 未开启：点上方去系统设置开启「DSHA 配对助手」","❌ Disabled: open system settings above and enable DSHA Pairing Assistant.");
values.put("。\n更新 Android System WebView / Chrome 后重试，或在浏览器中打开。",".\nUpdate Android System WebView / Chrome and retry, or open in a browser.");
values.put("。请返回启动页重新进入对话，或稍后重试。",". Return to Start and reopen the conversation, or try again later.");
values.put("一次最多上传 20 个文件","Upload up to 20 files at a time");
values.put("上传失败：","Upload failed: ");
values.put("上次环境维护尚未完成，请先恢复原环境","Previous environment maintenance is incomplete. Restore the original environment first.");
values.put("上次环境维护未完成，请到安装与修复页恢复维护，再打开终端","Previous environment maintenance is incomplete. Resume recovery in Install & repair before opening a terminal.");
values.put("上次维护未完成，请先恢复原环境","Previous maintenance is incomplete. Restore the original environment first.");
values.put("下方实时显示启动输出；等待不会自动终止。","Live startup output appears below. Waiting does not stop startup automatically.");
values.put("下载响应没有文件内容","The download response contains no file data");
values.put("下载失败：HTTP ","Download failed: HTTP ");
values.put("下载完成，选择保存位置","Download complete. Choose a save location.");
values.put("下载并解析插件包后，会显示真实作者、版本和兼容范围。确认安装前不会启用插件。\n\n","After downloading and inspecting the package, its actual author, version and compatibility range are shown. The plugin stays disabled until you confirm installation.\n\n");
values.put("下载未启动","Download did not start");
values.put("下载缓存已丢失，请重新导出","Download cache is missing. Export again.");
values.put("下载被系统中断，请重新导出","The system interrupted the download. Export again.");
values.put("下载跳转到了其他服务","The download redirected to a different service");
values.put("下载跳转地址缺失","The download redirect has no destination");
values.put("不支持的文件来源，请通过系统文件应用选择","Unsupported file source. Select a file using the system Files app.");
values.put("不透明度","Opacity");
values.put("中止中…","Stopping…");
values.put("中止并重启","Stop & restart");
values.put("中止并重启中，新命令将排队","Stopping and restarting; new commands will be queued");
values.put("临时插件 · 已运行","Temporary plugin · Running");
values.put("临时插件 · 未运行","Temporary plugin · Not running");
values.put("主页面连接端口（留空重新发现）","Connection port on main page (blank to rediscover)");
values.put("也可以使用系统浏览器进入对话。","You can also open the conversation in a system browser.");
values.put("仅检查","Check only");
values.put("任务未完成。请按上方原因处理后重试；本页不会自动覆盖环境。","The task is incomplete. Address the reason above and retry. This page does not overwrite the environment automatically.");
values.put("会停止 Web 和终端任务，再更新 dsh 和内置插件，个人目录、会话和配置保持原位。验证失败回切原运行时。","Stop the Web service and terminals, then update dsh and bundled plugins. Personal directories, conversations and settings stay in place. If validation fails, restore the original runtime.");
values.put("会停止 Web 并中断正在执行的任务，创建并校验安全备份后重建环境。备份失败不切换环境，后续失败回切旧环境。","Stop the Web service and interrupt running tasks. Create and verify a safety backup before rebuilding the environment. If backup fails, keep the environment; if a later step fails, restore the old environment.");
values.put("会停止 Web 并中断正在执行的任务，完整备份并校验配置、会话和本地插件，再重建环境并恢复数据。\n\n","Stop the Web service and interrupt running tasks. Back up and verify settings, conversations and local plugins, then rebuild the environment and restore data.\n\n");
values.put("会话启动中，输入命令可排队","Starting session; commands can be queued");
values.put("会话失败，待发命令保留；点重试重启","Session failed; queued commands are retained. Tap Retry restart.");
}
private static void part4(Map<String,String> values) {
values.put("会话已结束","Session ended");
values.put("会话已结束（退出码 ","Session ended (exit code ");
values.put("会话已结束，请点击「新建」","Session ended. Tap New to open another.");
values.put("会话已退出，输入命令自动启动","Session exited; entering a command starts it automatically");
values.put("保存","Save");
values.put("保存后无法读取校验","Could not read back the saved file for verification");
values.put("保存备份设置","Save backup preferences");
values.put("保存校验失败，请更换位置重试","Saved file verification failed. Choose another location and retry.");
values.put("保存网页文件","Save web file");
values.put("停止 Web 后回切原环境；安全备份及失败的新环境都会保留。","Stop the Web service and restore the original environment. Keep both the safety backup and the failed new environment.");
values.put("停止中…","Stopping…");
values.put("停止当前启动，只加载官方基础界面。原插件开关、会话、模型和配置保留；普通重启后回到原配置。安全界面不加载移动插件等扩展。","Stop the current startup and load only the official basic interface. Preserve plugin switches, conversations, models and settings. A normal restart restores your usual configuration. Safe mode does not load extensions such as the mobile plugin.");
values.put("停用所选插件并重启","Disable selected plugins & restart");
values.put("停留时间","Display duration");
values.put("允许短信读取","Allow SMS queries");
values.put("先停止 Web 并等待退出（会中断正在执行的任务），完整备份并校验配置、会话与本地插件，再解压并恢复。\n\n","Stop the Web service and wait for it to exit (interrupting running tasks). Back up and verify settings, conversations and local plugins, then extract and restore.\n\n");
values.put("先停止 Web（会中断正在执行的任务）并创建校验安全备份，再重置 settings.yaml 和 .env；保留对话。","Stop the Web service (interrupting running tasks) and create a verified safety backup. Reset settings.yaml and .env while keeping conversations.");
values.put("先停止 Web（会中断正在执行的任务），完整备份并校验配置、会话和本地插件，再重建环境并恢复数据。\n\n","Stop the Web service (interrupting running tasks), back up and verify settings, conversations and local plugins, then rebuild the environment and restore data.\n\n");
values.put("先停止 Web，再回切原环境；安全备份和失败的新环境均保留。","Stop the Web service, then restore the original environment. Keep the safety backup and the failed new environment.");
values.put("先停止 Web，再回切旧环境，保留所有安全副本。","Stop the Web service, then restore the old environment and keep all safety copies.");
values.put("先停止 Web，再回切旧环境；安全备份和失败的新环境均保留。","Stop the Web service, then restore the old environment. Keep the safety backup and the failed new environment.");
values.put("先点「启动」，等鉴权链接就绪后再进入","Tap Start and wait for the authentication link before opening the conversation.");
values.put("共 ","Total ");
values.put("关闭","Close");
values.put("关闭其他应用后重试。","Close other apps and try again.");
values.put("关闭失败，会话仍保留：","Close failed; session retained: ");
values.put("关闭终端 ","Close terminal ");
values.put("关闭，不保存","Close without saving");
values.put("兼容内核无法启动","Compatibility browser could not start");
values.put("切换到终端 ","Switch to terminal ");
values.put("初始化 DSHA","Initialize DSHA");
values.put("删除","Delete");
values.put("删除插件","Delete plugin");
values.put("删除插件？","Delete plugin?");
values.put("剪贴板不可用","Clipboard unavailable");
values.put("剪贴板没有链接","The clipboard contains no URL");
values.put("即将备份：","Backup scope: ");
values.put("原生授权即时生效；","Device permissions take effect immediately; ");
values.put("原生配置和 API Key 保持原位；额外安装的系统软件留在旧环境中。","App settings and the API key stay in place. Extra system software remains in the old environment.");
values.put("去开启","Enable");
values.put("发现新版本 ","New version available: ");
values.put("取消","Cancel");
values.put("受限模式：环境需要恢复 · 点击处理","Limited mode: environment recovery required · Tap to continue");
values.put("可以在设置中修改配置、查看数据维护记录和下载日志。环境恢复完成后，再使用插件和终端。个人数据与原环境继续保留。\n","Use Settings to edit configuration, review maintenance records and download logs. Plugins and terminals become available after recovery. Personal data and the original environment are preserved.\n");
values.put("可尝试在系统浏览器打开。错误：","Try opening in a system browser. Error: ");
values.put("启动中…（","Starting… (");
values.put("启动恢复","Startup recovery");
values.put("启动简易终端","Start simple terminal");
values.put("启用 ","Enable ");
values.put("命令执行中，新命令将排队","Command running; new commands will be queued");
values.put("命令未发送：请检查长度（最多 16K 字符）及空字符，输入已保留","Command not sent. Check the length (up to 16K characters) and remove null characters. Your input is retained.");
values.put("回退","Roll back");
values.put("回退插件？","Roll back plugin?");
values.put("回退至 ","Roll back to ");
values.put("在 MT 管理器中添加本地存储，选择 DocumentsProvider → DSHA。\n\n","In MT Manager, add local storage and choose DocumentsProvider → DSHA.\n\n");
values.put("在悬浮条上确认命令","Confirm commands in the overlay");
values.put("基础界面已就绪 · 安全模式","Basic interface ready · Safe mode");
values.put("备份保存在 Download/DSHA/","Backups are saved to Download/DSHA/");
values.put("备份失败不会切换环境；解压或恢复失败会回切。旧环境和安全备份留在私有目录，需要额外空间。\n","If backup fails, the environment is unchanged. If extraction or restoration fails, the old environment is restored. The old environment and safety backup remain in private storage and require additional space.\n");
values.put("备份失败不切换环境，后续失败回切旧环境；安全备份和旧环境会保留并占用额外空间。额外安装的系统软件留在旧环境中。","If backup fails, the environment is unchanged. If a later step fails, the old environment is restored. The safety backup and old environment use additional space. Extra system software remains in the old environment.");
values.put("备份并重建","Back up & rebuild");
values.put("备份并重建内置环境","Back up & rebuild environment");
values.put("备份并重建环境？","Back up and rebuild environment?");
values.put("备份并重置","Back up & reset");
values.put("备份恢复 · 文件共享","Backup & restore · File sharing");
values.put("备份设置保存失败，请重试","Could not save backup preferences. Try again.");
values.put("复制失败，可尝试导出报告","Copy failed. Try exporting the report.");
values.put("复制失败，请稍后重试","Copy failed. Try again later.");
values.put("复制失败：","Copy failed: ");
values.put("复制插件名称","Copy plugin name");
values.put("复制来源链接","Copy source URL");
values.put("失败","Failed");
values.put("失败 ","Failed ");
values.put("存储权限已授予，容器可访问手机存储","Storage permission granted. The container can access phone storage.");
values.put("存储空间不足","Insufficient storage");
values.put("安全停止后续修复","Stop further repairs safely");
values.put("安全启动 Web？","Start Web in safe mode?");
values.put("安装","Install");
values.put("安装与修复运行环境","Install and repair the runtime");
values.put("安装完成","Installation complete");
}
private static void part5(Map<String,String> values) {
values.put("官方核心","Official core");
values.put("实体缺失，请重新导入","Files missing. Import again.");
values.put("容器目录：files/linux/ubuntu/root\n","Container directory: files/linux/ubuntu/root\n");
values.put("对话地址无效","Invalid conversation address");
values.put("对话认证已失效","Conversation authentication has expired");
values.put("对话页面加载失败","Conversation page failed to load");
values.put("导出失败：","Export failed: ");
values.put("将删除 ","Delete ");
values.put("尚未安装 Shizuku，请安装后启动服务","Shizuku is not installed. Install it and start its service.");
values.put("尚未确认终端退出","Terminal exit has not been confirmed");
values.put("尚未配对：点下方「ADB 无线配对」，配对后还会验证连接。","Not paired. Tap Wireless ADB pairing below; the connection will also be verified after pairing.");
values.put("局域网代理正在等待本轮认证","LAN proxy is waiting for authentication");
values.put("局域网地址","LAN address");
values.put("局域网地址（同 WiFi 的其它设备访问）：\n","LAN address (for other devices on the same Wi-Fi):\n");
values.put("局域网已开启，但还没拿到 WiFi 地址（连上 WiFi 再看）","LAN access is on, but no Wi-Fi address is available. Connect to Wi-Fi and check again.");
values.put("局域网权限已允许，请输入本次配对码后开始配对","LAN permission granted. Enter the current code and start pairing.");
values.put("局域网权限未允许，请先在 DSHA 权限设置中允许","LAN permission denied. Allow it in DSHA's system app permissions first.");
values.put("工具调用显示命令原文","Show command text for tool calls");
values.put("已保存：","Saved: ");
values.put("已保存；网页显示选项重新进入对话生效，端口与运行时需重启 Web","Saved. Reopen the conversation to apply web display options. Port and runtime changes require restarting the Web service.");
values.put("已切到简易终端（PTY 会话仍在后台）","Switched to the simple terminal. PTY sessions continue in the background.");
values.put("已取消","Canceled");
values.put("已取消下载或保存","Download or save canceled");
values.put("已取消保存","Save canceled");
values.put("已启用","Enabled");
values.put("已启用优先","Enabled first");
values.put("已复制","Copied");
values.put("已复制脱敏报告","Redacted report copied");
values.put("已复制脱敏日志","Redacted logs copied");
values.put("已复制：","Copied: ");
values.put("已开启：容器可读写手机存储任意文件（含 DSHA 目录外）","Enabled: the container can read and write all phone storage, including outside DSHA directories.");
values.put("已开始监听，两分钟内有效。请打开系统的「使用配对码配对设备」弹窗。","Listening for two minutes. Open the system Pair device with pairing code dialog.");
values.put("已撤销，后续查询需逐次确认","Revoked. Future queries require individual confirmation.");
values.put("已有任务或未完成维护，请到数据与备份页查看。","A task or incomplete maintenance is pending. Check Backup & data.");
values.put("已有数据任务进行中，可到数据与备份页查看。","A data task is running. Check Backup & data for progress.");
values.put("已有数据任务进行中，请等待或处理恢复预览。","A data task is running. Wait or review the restore preview.");
values.put("已有环境任务启动，请稍后再打开终端","An environment task has started. Open the terminal later.");
values.put("已有环境任务或未完成维护，请稍后重试","An environment task or incomplete maintenance is pending. Try again later.");
values.put("已有环境任务进行中，请等待完成","An environment task is running. Wait for it to finish.");
values.put("已检测，可开启以加入 Web","Detected. Enable to include in the Web service.");
values.put("已禁用","Disabled");
values.put("已识别：","Recognized: ");
values.put("已预授权 · 关闭可撤销","Preauthorized · Turn off to revoke");
values.put("底色","Background color");
values.put("开启后请返回这里，再点自动读取。仅在你发起后的两分钟内读取系统配对弹窗；配对码不保存、不上传。","After enabling, return here and tap Auto-read. The system pairing dialog is read only during the two minutes after your request. Pairing codes are not saved or uploaded.");
values.put("开始","Start");
values.put("开始备份","Start backup");
values.put("当前 DSHA 环境内的助手和插件将能通过已授权的 root 或 ADB 查询短信，包括正文、号码和可能存在的验证码。\n\n后续短信查询不再逐条询问。关闭后立即阻止新查询。","Assistants and plugins in this DSHA environment can query SMS through authorized root or ADB, including message text, phone numbers and verification codes.\n\nQueries will not prompt individually. Turning this off blocks new queries immediately.");
values.put("当前内核缺少：","The current browser engine is missing: ");
values.put("当前白天模式，点击切换黑夜","Light mode. Tap to switch to dark.");
values.put("当前系统无需存储权限","This Android version does not require storage permission.");
values.put("当前系统没有配对码接口","This Android version has no pairing-code interface.");
values.put("当前阶段：","Current stage: ");
values.put("当前黑夜模式，点击切换白天","Dark mode. Tap to switch to light.");
values.put("恢复","Restore");
values.put("恢复中断维护","Resume interrupted maintenance");
values.put("恢复中断维护？","Resume interrupted maintenance?");
values.put("恢复原环境","Restore original environment");
values.put("恢复原环境？","Restore original environment?");
values.put("恢复备份","Restore backup");
values.put("恢复安全启动前已启用的插件；之后手动禁用的插件保持禁用。恢复后重启 Web 生效。","Restore plugins enabled before Safe start. Plugins you disabled afterward stay disabled. Restart the Web service to apply.");
values.put("恢复此备份","Restore this backup");
values.put("恢复第三方插件？","Restore third-party plugins?");
values.put("恢复预览","Restore preview");
values.put("悬浮条外观与行为","Overlay appearance & behavior");
values.put("悬浮条设置已保存","Overlay settings saved");
values.put("成功","Succeeded");
values.put("手动设置已保存。配对端口只用于下一次尝试，之后重新发现；可留空恢复自动发现。","Manual settings saved. The pairing port applies only to the next attempt; it is rediscovered afterward. Leave blank for automatic discovery.");
values.put("打不开 QQ，请手动搜索群号：","Could not open QQ. Search for group number: ");
values.put("打不开无障碍设置：","Could not open accessibility settings: ");
values.put("打不开解压页：","Could not open the extraction page: ");
values.put("打不开，请手动访问：","Could not open. Visit manually: ");
values.put("打开设置失败：","Could not open settings: ");
values.put("打开选择器失败：","Could not open the picker: ");
values.put("执行后将在此逐行显示脱敏输出。","Redacted output will appear here line by line.");
values.put("找不到 DSHA 时，先打开本 App 后重试。","If DSHA is missing, open this app first and try again.");
values.put("找不到开发者选项时，到关于手机连续点按系统版本号。系统或厂商未提供无线调试时，填写端口无法启用它。\n\n","If Developer options is missing, tap the build number repeatedly in About phone. Entering a port cannot enable Wireless debugging if your Android version or manufacturer does not provide it.\n\n");
values.put("报告保留在本机，复制或导出后可用于反馈","The report stays on this device. Copy or export it to report a problem.");
values.put("拉起保活服务失败: ","Could not start the keep-alive service: ");
values.put("持续保持运行，适合长时间任务。","Keep running continuously for long tasks.");
}
private static void part6(Map<String,String> values) {
values.put("持续允许读取短信？","Preauthorize SMS queries?");
values.put("持续失败时返回启动页查看日志。\n错误代码：","If this keeps failing, return to Start and check the logs.\nError code: ");
values.put("按当前设置不包含","Excluded by current settings");
values.put("按当前设置包含","Included by current settings");
values.put("授权保存失败，请重试","Could not save authorization. Try again.");
values.put("接口、显示与运行","API, display & runtime");
values.put("插件操作结果","Plugin operation result");
values.put("支持仓库、分支/子目录、Release 下载和压缩包直链","Supports repositories, branches/subdirectories, release downloads and direct archive URLs");
values.put("数据与备份","Backup & data");
values.put("数据任务进行中，完成后再修改备份设置","A data task is running. Wait before changing backup preferences.");
values.put("文件处理失败：","File processing failed: ");
values.put("文件尚未保存","File has not been saved");
values.put("文件已整理完成，可以继续下一步。","Files are ready. Continue to the next step.");
values.put("文件管理器返回的地址无法读取，请改用系统文件选择器。","The file manager returned an unreadable address. Use the system file picker.");
values.put("文字大小","Font size");
values.put("无法中止终端进程组","Could not stop the terminal process group");
values.put("无法写入所选位置","Could not write to the selected location");
values.put("无法创建上传缓存","Could not create the upload cache");
values.put("无法创建下载缓存","Could not create the download cache");
values.put("无法安装：","Cannot install: ");
values.put("无法开始 Web 鉴权，请重试","Could not start Web authentication. Try again.");
values.put("无法开始安装任务，请稍后重试或先完成正在进行的环境任务","Could not start installation. Try later or complete the current environment task first.");
values.put("无法打开 Shizuku：","Could not open Shizuku: ");
values.put("无法打开 Web 页面，请重试（","Could not open the Web page. Try again (");
values.put("无法打开保存位置选择器","Could not open the save-location picker");
values.put("无法打开保存位置选择器，请启用系统文件应用后重试","Could not open the save-location picker. Enable the system Files app and retry.");
values.put("无法打开保存位置，请使用复制报告或检查系统文件管理器","Could not open the save location. Copy the report or check the system file manager.");
values.put("无法打开文件管理器，请尝试下载到默认目录","Could not open the file manager. Try downloading to the default directory.");
values.put("无法打开文件选择器，请使用备用入口：","Could not open the file picker. Use the alternative option: ");
values.put("无法打开文件选择器，请启用系统文件应用","Could not open the file picker. Enable the system Files app.");
values.put("无法打开无障碍设置，请手动进入系统设置开启","Could not open accessibility settings. Enable the service manually in system settings.");
values.put("无法打开日志，可在文件管理器的 Download/DSHA 中查看，或重新下载","Could not open the log. Find it in Download/DSHA using a file manager, or download it again.");
values.put("无法打开浏览器","Could not open a browser");
values.put("无法打开浏览器，请在浏览器中访问 https://dsha.cc/","Could not open a browser. Visit https://dsha.cc/ in your browser.");
values.put("无法打开电池优化设置","Could not open battery optimization settings");
values.put("无法打开维护页，可到数据与备份页查看任务：","Could not open maintenance. Check the task in Backup & data: ");
values.put("无法打开网页文件","Could not open the web file");
values.put("无法读取文件，请检查授权后重新选择","Could not read the file. Check permission and select it again.");
values.put("无法验证 Web 访问权限，请稍后重试","Could not verify Web access. Try again later.");
values.put("无线 ADB 需要局域网权限，以发现配对端口并连接设备","Wireless ADB needs LAN permission to discover pairing ports and connect to devices.");
values.put("无线调试已关闭，请先开启","Wireless debugging is off. Turn it on first.");
values.put("无线调试配对码需要 Android 11+。Android 6—10 可使用 Shizuku、已授权的 root，或由电脑开启 ADB TCP 通道。","Wireless debugging pairing codes require Android 11+. Android 6–10 can use Shizuku, authorized root, or ADB TCP enabled from a computer.");
values.put("旧环境和安全备份留在 App 私有目录，占用额外空间；任何失败均停止并尝试回切。额外安装的系统软件留在旧环境中。","The old environment and safety backup remain in app-private storage and require additional space. Any failure stops the task and attempts a rollback. Extra system software remains in the old environment.");
values.put("旧终端启动器尚未退出","The previous terminal launcher has not exited");
values.put("显示思考过程","Show reasoning");
values.put("显示行数","Visible lines");
values.put("暂无终端","No terminals");
values.put("暂无终端\n点击「新建」打开一个终端","No terminals\nTap New to open a terminal");
values.put("暂时无法进入对话","Cannot open the conversation yet");
values.put("暂时无法连接对话服务","Cannot connect to the conversation service yet");
values.put("更多操作：","More actions: ");
values.put("更换位置重试","Choose another location");
values.put("更新至 ","Update to ");
values.put("更新运行时","Update runtime");
values.put("更新运行时？","Update runtime?");
values.put("最近成功：","Last success: ");
values.put("服务可能仍在启动或已退出。请稍后重试，","The service may still be starting or may have exited. Try again later, ");
values.put("服务可能已退出，点击重试或返回启动页。","The service may have exited. Retry or return to Start.");
values.put("服务在鉴权期间重新启动，请稍后重试","The service restarted during authentication. Try again later.");
values.put("服务返回 HTTP ","Service returned HTTP ");
values.put("未允许安装更新，可稍后重试","Update installation was not allowed. Try again later.");
values.put("未允许局域网访问，请在系统 DSHA 权限设置中允许后重试","LAN access is not allowed. Enable it in DSHA's system app permissions and retry.");
values.put("未允许局域网访问；本机对话仍可使用，LAN / 无线 ADB 需在系统权限设置中开启","LAN access is not allowed. Local conversations still work; enable system permission for LAN / wireless ADB.");
values.put("未取得悬浮窗权限，请到系统设置 → 应用 → DSHA → 悬浮窗中允许","Overlay permission is missing. Allow it in Settings → Apps → DSHA → Display over other apps.");
values.put("未完成","Incomplete");
values.put("未开启：仅能访问 App 私有目录；去系统设置开启后可访问全部文件","Disabled: only app-private storage is accessible. Enable all files access in system settings for other files.");
values.put("未找到 su；请确认手机已 root，且 root 管理器允许 DSHA 使用","su was not found. Check that the phone is rooted and your root manager allows DSHA.");
values.put("未找到可用的文件选择器，请启用系统「文件」应用后重试。","No file picker is available. Enable the system Files app and try again.");
values.put("未找到可用的系统浏览器","No system browser is available");
values.put("未知网页文件消息","Unknown web file message");
values.put("未能确认简易终端已关闭；请勿移动或清除环境目录","Could not confirm that the simple terminal is closed. Do not move or delete the environment directory.");
values.put("未获得文件读取权限，请改用系统文件选择器导入。","File read permission was denied. Import using the system file picker.");
values.put("未选择文件或文件管理器未返回文件。可点「其他文件选择器」重试，选择 ZIP / TAR.GZ 插件包。","No file selected, or the file manager returned no file. Tap Other file picker and select a ZIP / TAR.GZ plugin package.");
values.put("未预授权 · 每次查询需确认","Not preauthorized · Confirm each query");
values.put("本机 IP（可留空自动选择）","Local IP (blank for automatic)");
values.put("本次上传超过 256 MiB","This upload exceeds 256 MiB");
values.put("查看并下载诊断日志","View and download diagnostic logs");
values.put("查看更新","View update");
values.put("查看环境维护与恢复选项","View maintenance and recovery options");
values.put("查看维护进度与恢复选项","View maintenance progress and recovery options");
}
private static void part7(Map<String,String> values) {
values.put("查看详情","View details");
values.put("标准版预览内核: ","Standard browser engine: ");
values.put("校验完成，返回此页面后继续安装","Verification complete. Return to this page to continue installation.");
values.put("检查与按需修复","Check & repair failed items");
values.put("检查插件更新","Check plugin updates");
values.put("检查环境，或按需修复缺项","Check the environment or repair missing components");
values.put("检测到 ","Detected ");
values.put("检测到插件或配置异常，可查看恢复选项。","A plugin or configuration issue was detected. See recovery options.");
values.put("正在","Running ");
values.put("正在下载 ","Downloading ");
values.put("正在保存并校验文件","Saving and verifying file");
values.put("正在关闭此终端…","Closing this terminal…");
values.put("正在准备已有连接验证…","Preparing connection verification…");
values.put("正在准备配对环境…","Preparing the pairing environment…");
values.put("正在处理，请等待结果…","Working. Please wait for the result…");
values.put("正在完成一次配对握手并验证连接，最多约 2 分钟；随后检查自动恢复授权…","Pairing and verifying the connection (up to about 2 minutes), then checking automatic reconnection authorization…");
values.put("正在思考：先检查文件内容。\n","Reasoning: check the file contents first.\n");
values.put("正在执行命令\n","Running command\n");
values.put("正在执行命令：ls -la\n","Running command: ls -la\n");
values.put("正在执行环境任务","An environment task is running");
values.put("正在检查环境…","Checking environment…");
values.put("正在维护环境，请完成后再启动终端","Environment maintenance is running. Wait before starting a terminal.");
values.put("正在读取插件…","Reading plugins…");
values.put("正在重新发现本机配对端口（最多 6 秒）…","Rediscovering this device's pairing port (up to 6 seconds)…");
values.put("正在重新校验安装包…","Verifying the APK again…");
values.put("正在重连无线调试…","Reconnecting to Wireless debugging…");
values.put("正在鉴权并打开 Web…","Authenticating and opening the Web UI…");
values.put("正在验证 Web 访问权限…","Verifying Web access…");
values.put("正在验证已配对的设备连接，最多约 1 分钟…","Verifying the paired device connection (up to about 1 minute)…");
values.put("正在验证设备通道…","Verifying device connection…");
values.put("此下载不是当前本机服务提供的文件","This download is not provided by the current local service");
values.put("没有可导出的插件","No plugins are available to export");
values.put("没有可用的文件选择器","No file picker is available");
values.put("没有可用的系统浏览器","No system browser is available");
values.put("没有文件读取权限，请重新选择","File read permission is missing. Select the file again.");
values.put("没有符合条件的插件","No matching plugins");
values.put("点击「新建」打开终端","Tap New to open a terminal");
values.put("点击重试可重新打开对话。","Tap Retry to reopen the conversation.");
values.put("熄屏空闲 1 分钟后减少保活；有任务时继续运行。","Reduce keep-alive activity after 1 minute idle with the screen off. Continue running while tasks are active.");
values.put("环境任务已结束；当前显示缓存列表，可点「刷新」同步插件状态","The environment task has finished. Showing the cached list; tap Refresh to sync plugin status.");
values.put("环境任务进行中","Environment task running");
values.put("环境任务进行中，ADB 暂停检查，完成后自动重试。","An environment task is running. ADB checks are paused and will retry automatically afterward.");
values.put("环境任务进行中：","Environment task running: ");
values.put("环境未就绪 —— 先到「安装」页装完再回来","Environment not ready. Complete installation on the Install page first.");
values.put("环境未就绪，请先到「安装」页完成安装","Environment not ready. Complete installation on the Install page first.");
values.put("环境未就绪，请先完成环境安装","Environment not ready. Finish installing it first.");
values.put("环境维护尚未完成，请先恢复维护，再打开终端","Environment maintenance is incomplete. Resume recovery before opening a terminal.");
values.put("环境维护进行中 · 点击查看进度","Environment maintenance running · Tap for progress");
values.put("环境需要恢复","Environment recovery required");
values.put("相同基础环境只更新 dsh 与内置插件，个人数据保持原位；基础环境变更时先保护数据再重建。验证失败可恢复原环境。","When the base environment is unchanged, update only dsh and bundled plugins while keeping personal data in place. If the base changes, protect data before rebuilding. The original environment can be restored if validation fails.");
values.put("省电模式","Power saving");
values.put("知道了","Got it");
values.put("短信查询已预授权","SMS queries preauthorized");
values.put("确定","OK");
values.put("确认备份","Confirm backup");
values.put("确认安装","Confirm installation");
values.put("确认安装插件","Confirm plugin installation");
values.put("禁用","Disable");
values.put("禁用 ","Disable ");
values.put("禁用官方核心？","Disable an official core component?");
values.put("稳定版与预览版更新","Stable and Preview updates");
values.put("第三方插件","Third-party plugins");
values.put("等待停止…","Waiting to stop…");
values.put("算了","Cancel");
values.put("管理插件","Manage plugins");
values.put("系统 WebView 初始化失败: ","System WebView initialization failed: ");
values.put("系统 WebView 发生异常，点击重试可重新打开；持续出现时请更新内核。","System WebView encountered an error. Tap Retry to reopen it. Update the browser engine if this continues.");
values.put("系统 WebView 无法启动","System WebView could not start");
values.put("系统 WebView 版本未知","System WebView version unknown");
values.put("系统 WebView 需要更新","System WebView needs an update");
values.put("系统可能因内存不足回收了网页，点击重试可重新打开。","Android may have closed the page due to low memory. Tap Retry to reopen it.");
values.put("终端 ","Terminal ");
values.put("终端启动失败：","Terminal startup failed: ");
values.put("终端命令发送","Send terminal command");
values.put("终端命令发送失败","Could not send the terminal command");
values.put("终端尚未停止，保留会话与环境保护：","Terminal has not stopped; session and environment protection retained: ");
values.put("终端进程组无效","Invalid terminal process group");
values.put("继续","Continue");
values.put("继续下载","Continue download");
values.put("网页已关闭","Web page closed");
}
private static void part8(Map<String,String> values) {
values.put("网页已离开","Navigated away from the page");
values.put("网页提示","Web message");
values.put("网页插件加载失败","Web plugins failed to load");
values.put("网页文件不完整","Incomplete web file");
values.put("网页文件传输失败","Web file transfer failed");
values.put("网页文件传输超时","Web file transfer timed out");
values.put("网页文件未传完","Web file transfer is incomplete");
values.put("网页文件消息无效","Invalid web file message");
values.put("网页文件读取失败","Could not read the web file");
values.put("网页文件顺序错误","Web file chunks are out of order");
values.put("网页渲染进程已退出","The web rendering process exited");
values.put("网页确认","Web confirmation");
values.put("网页进程异常退出","The web process exited unexpectedly");
values.put("网页进程被系统回收","Android closed the web process");
values.put("自动读码已到期；请重新点自动读取，或手动输入本次配对码。","Auto-read expired. Tap Auto-read again, or enter the current pairing code manually.");
values.put("自动重启已暂停","Auto-restart paused");
values.put("解析链接 / 重试","Inspect URL / retry");
values.put("设备通道验证","Device connection check");
values.put("设置保存失败，请重试","Could not save settings. Try again.");
values.put("诊断报告已导出","Diagnostic report exported");
values.put("请先启用「允许 Root Shell」","Enable Allow root shell first");
values.put("请先完成 DSHA 首次初始化，完成后会返回插件安装确认页","Complete DSHA's first-time setup first. You will then return to plugin installation confirmation.");
values.put("请先完成或取消当前文件下载","Finish or cancel the current file download first");
values.put("请先将文件夹压缩为文件再上传","Compress the folder into a file before uploading");
values.put("请先恢复中断维护，再检查或修复环境","Resume interrupted maintenance before checking or repairing the environment");
values.put("请先点「恢复中断维护」，原环境尚未确认。","Tap Resume interrupted maintenance first. The original environment has not been confirmed.");
values.put("请在插件管理中查看 ","Check in Plugin manager: ");
values.put("请在维护任务线程等待终端退出","Wait for terminal exit on the maintenance task thread");
values.put("请在维护线程等待终端退出","Wait for terminal exit on the maintenance thread");
values.put("请填写本机无线调试页面的 IP","Enter the IP shown on this device's Wireless debugging page");
values.put("请手动进入开发者选项 → 无线调试 → 使用配对码配对设备","Open Developer options → Wireless debugging → Pair device with pairing code manually.");
values.put("请更新或启用 Android System WebView / Chrome，","Update or enable Android System WebView / Chrome, ");
values.put("请确认服务仍在运行，点击重试。错误代码：","Check that the service is still running, then tap Retry. Error code: ");
values.put("请等待当前插件操作完成","Wait for the current plugin operation to finish");
values.put("请等待当前插件操作完成后再导入","Wait for the current plugin operation before importing");
values.put("请输入本次配对码","Enter the current pairing code");
values.put("请返回启动页重新进入。","Return to Start and open it again.");
values.put("请返回启动页，重新进入对话。","Return to Start and reopen the conversation.");
values.put("请退出终端页再进来","Leave the Terminal page and open it again");
values.put("请选择插件压缩包；文件选择器无法返回时，可使用「其他文件选择器」。","Choose a plugin archive. If the file picker does not return a file, use Other file picker.");
values.put("输入配对码后开始；端口会重新发现。","Enter the pairing code to start. The port will be rediscovered.");
values.put("运行环境维护","Runtime maintenance");
values.put("运行环境需要恢复","Runtime recovery required");
values.put("返回后可重新进入 Web","Reopen the Web UI after returning");
values.put("还没有成功备份","No successful backup yet");
values.put("进入","Open");
values.put("进入中…","Opening…");
values.put("进入主界面","Open app");
values.put("进入受限主界面 · 查看日志与配置","Open limited mode · Logs & settings");
values.put("进行中","In progress");
values.put("连接已验证 · 端口 ","Connection verified · Port ");
values.put("连接已验证，ADB 设备命令可用。\n\n","Connection verified. ADB device commands are available.\n\n");
values.put("连接验证未通过。\n\n","Connection verification failed.\n\n");
values.put("连续失败，已暂停自动重启","Repeated failures. Automatic restart paused.");
values.put("选择 .tar.gz 备份文件。预检会显示范围和版本，不停止 Web；确认恢复时才停止 Web，并中断正在执行的任务。","Choose a .tar.gz backup. Preflight shows its scope and version without stopping the Web service. The service and running tasks are stopped only when you confirm restoration.");
values.put("选择保存位置","Choose save location");
values.put("选择停用插件","Select plugins to disable");
values.put("选择备份范围","Choose backup scope");
values.put("选择文件","Choose file");
values.put("选择文件按钮点击，准备 launch","File picker button tapped; preparing launch");
values.put("选择要导出的插件","Select plugins to export");
values.put("通常让地址与端口留空即可自动发现。配对端口来自 6 位码弹窗，连接端口来自无线调试主页面，两者不能互换。\n\n","Usually, leave address and port blank for automatic discovery. The pairing port comes from the 6-digit-code dialog; the connection port comes from the main Wireless debugging page. They are not interchangeable.\n\n");
values.put("配对任务被系统中断，结果尚不确定。请先验证已有连接；若仍未配对，再获取新配对码。","Android interrupted pairing; the result is uncertain. Verify the existing connection first. If it is still unpaired, get a fresh code.");
values.put("配对密钥已保存，连接尚未验证。","Pairing key saved. Connection not yet verified.");
values.put("配对已失效，请重新配对。","Pairing has expired. Pair again.");
values.put("配对已完成，连接尚未验证。请检查连接端口后点「验证已有连接」，无需再次配对。\n\n","Pairing is complete, but the connection is not yet verified. Check the connection port and tap Verify connection. There is no need to pair again.\n\n");
values.put("配对弹窗端口（留空重新发现）","Pairing dialog port (blank to rediscover)");
values.put("配对未完成，请按以下原因处理。\n\n","Pairing is incomplete. Address the reason below.\n\n");
values.put("配对码必须恰好为 6 位数字","The pairing code must contain exactly 6 digits");
values.put("配置","Configuration");
values.put("配置/加载异常（尚未确定插件）","Configuration/loading error (plugin not yet identified)");
values.put("配置保存未完成：","Settings were not fully saved: ");
values.put("配置目录：容器中的 .dsh\n\n","Configuration directory: .dsh inside the container\n\n");
values.put("重建环境","Rebuild environment");
values.put("重新检查","Check again");
values.put("重置配置？","Reset settings?");
values.put("重试重启","Retry restart");
values.put("鉴权成功，正在打开 Web…","Authenticated. Opening the Web UI…");
values.put("需要先开启无障碍服务","Enable the accessibility service first");
values.put("页面未完成加载","The page has not finished loading");
}
private static void part9(Map<String,String> values) {
values.put("页面返回适配未加载，可重试打开对话","Page-back integration did not load. Try reopening the conversation.");
values.put("预览","Preview");
values.put("预览 · 最多 ","Preview · Up to ");
values.put("首次准备依赖可能较久；配对码失效时请重新获取。自动读码需要屏幕操作权限，手动输入无需此权限。","Initial dependency preparation may take time. Get a fresh code if yours expires. Auto-read requires screen-control permission; manual entry does not.");
values.put("验证 Shizuku 连接","Verify Shizuku connection");
values.put("黑夜","Dark");
values.put("，完成后再保存配置","; save settings after it finishes");
values.put("，已选中",", selected");
values.put("，查看恢复选项","; see recovery options");
values.put("，点击查看详情","; tap for details");
values.put("，请稍后再打开终端或发送命令","; wait before opening a terminal or sending commands");
values.put("，选择底色",", choose background color");
values.put("；可重试","; retry available");
values.put("🐧 QQ 交流群：","🐧 QQ community: ");
values.put("\n\n=== 进程输出 ===\n","\n\n=== Process output ===\n");
values.put("\n\n恢复会先停止 Web。当前数据会保留为 .pre-restore-*，恢复失败自动回滚；完成后可手动启动 Web。","\n\nRestoration stops the Web service first. Current data is retained as .pre-restore-* and restored automatically if the operation fails. Start the Web service manually after restoration.");
values.put("\n\n是否允许？","\n\nAllow this?");
values.put("\n\n本次允许只用于这条查询。需要自动化时，可在设置 → 设备能力授权中预先允许短信读取。","\n\nThis permission applies only to this query. For automation, preauthorize SMS queries in Settings → Device permissions.");
values.put("\n\n确认后安装并登记；完成后重启 Web 生效。同名更新会保留上一版供回退。","\n\nConfirm to install and register. Restart the Web service afterward to apply. Updating an existing plugin retains its previous version for rollback.");
values.put("\n=== 上次失败（后续成功启动仍保留）===\n","\n=== Previous failure (retained after successful startup) ===\n");
values.put("\n=== 应用操作、崩溃与页面错误 ===\n","\n=== App operations, crashes and page errors ===\n");
values.put("\n=== 最近运行输出（最多 256 KiB）===\n","\n=== Recent runtime output (up to 256 KiB) ===\n");
values.put("\n=== 本轮启动时间线 ===\n","\n=== Current startup timeline ===\n");
values.put("\nWHEELS_ARCHIVE_PRESERVED: 现有归档与 APK 不同（可能修改或损坏），原样保留；本次补缺从 APK 临时副本读取","\nWHEELS_ARCHIVE_PRESERVED: The existing archive differs from the APK (possibly modified or damaged) and is preserved. Missing files are read from a temporary copy of the APK archive.");
values.put("\n[OUTPUT_TRUNCATED] 输出超过 256 KiB，已截断","\n[OUTPUT_TRUNCATED] Output exceeded 256 KiB and was truncated");
values.put("\n仅保存于所选本机位置，没有自动上传；未读取配置全文、对话文件或终端历史。\n","\nSaved only to the selected local location; not uploaded automatically. Full configuration, conversation files and terminal history were not read.\n");
values.put("\n作者：","\nAuthor: ");
values.put("\n候选来源：","\nCandidate source: ");
values.put("\n其余缺失项见备份清单。","\nSee the backup manifest for other missing items.");
values.put("\n分支/目录：","\nBranch/directory: ");
values.put("\n列表未能同步：","\nCould not sync the list: ");
values.put("\n原数据已保留，重新启动 Web 后可查看恢复内容。","\nOriginal data is preserved. Restart the Web service to view the restored content.");
values.put("\n可点「另存为」选择位置后重试。","\nTap Save as to choose another location and retry.");
values.put("\n命令执行超时(","\nCommand timed out (");
values.put("\n安全备份：","\nSafety backup: ");
values.put("\n已保留 ","\nPreserved ");
values.put("\n建议操作\n证书或 npm 异常：点击「修复证书与 npm」。\n文件选择无返回：到插件页使用「其他文件选择器」。\n第三方插件导致启动失败：使用启动页的安全启动，再逐个恢复插件。\n存储不足：清理下载目录后重试，避免重新解压整个环境。\n","\nSuggested actions\nCertificate or npm errors: tap Repair certificates & npm.\nFile picker returns nothing: use Other file picker on the Plugins page.\nThird-party plugin prevents startup: use Safe start, then restore plugins one at a time.\nLow storage: clean the download directory and retry; avoid re-extracting the entire environment.\n");
values.put("\n归档与逐文件 SHA-256 校验通过。","\nArchive and per-file SHA-256 verification passed.");
values.put("\n文件数：","\nFiles: ");
values.put("\n旧格式：已验证归档完整性，但包内没有逐文件摘要。","\nLegacy format: archive integrity verified; no per-file checksums are included.");
values.put("\n旧运行环境已进入清理流程，升级前的对话与配置安全备份：\n","\nThe old runtime is being cleaned up. Safety backup of conversations and settings before the upgrade:\n");
values.put("\n最近操作与失败步骤\n","\nRecent operations and failed steps\n");
values.put("\n来自版本：","\nSource version: ");
values.put("\n正在验证 Node / npm / Python 实际运行，最多 20 秒…\n","\nTesting Node / npm / Python execution (up to 20 seconds)…\n");
values.put("\n注意：","\nNote: ");
values.put("\n点按此处查看日志","\nTap here to view logs");
values.put("\n环境检查\n","\nEnvironment checks\n");
values.put("\n解压内容：","\nExtracted content: ");
values.put("\n部分旧文件暂未释放，下次启动会重试清理：","\nSome old files could not be removed. Cleanup will retry on the next start: ");
values.put("\n部分旧运行时待下次清理：","\nSome old runtime files remain for later cleanup: ");
values.put("\n重置前安全备份：","\nSafety backup before reset: ");
values.put("\n隐私范围：未读取 API 配置、对话、终端命令或系统完整日志；没有自动上传此报告。可在下面补充复现步骤后复制或导出。\n","\nPrivacy scope: API configuration, conversations, terminal commands and complete system logs were not read. This report is not uploaded automatically. Add steps to reproduce below, then copy or export it.\n");
values.put("      → 优先按文字点：控件位置随滚动/动画变，文字不变。没有文字才用 ?x=&y=\n","      → Prefer tapping by text: positions change with scrolling and animation. Use ?x=&y= only when no text is available.\n");
values.put("      → 填到当前焦点框；没有焦点先 tap 一下输入框\n","      → Types into the focused field. Tap an input field first if none is focused.\n");
values.put("      → 每行「[序号] \"文字\" 可点击 中心=(x,y) 区域=l,t,r,b」\n","      → Each line: [index] \"text\" clickable center=(x,y) bounds=l,t,r,b\n");
values.put("  # 允许后 10 分钟内的屏幕操作不再询问","  # After approval, screen actions skip confirmation for 10 minutes");
values.put("  # 这类应用涉及支付或隐私，每次都需要你确认","  # Payment or privacy-sensitive apps require confirmation every time");
values.put("  if old not in s or 'await link(tmp, finalPath);' not in s: raise RuntimeError('会话模块结构已变化，保留原文件：'+p)\n","  if old not in s or 'await link(tmp, finalPath);' not in s: raise RuntimeError('Session module structure changed; original file preserved: '+p)\n");
values.put("  write(p,s); print('已修复会话写入：'+p,flush=True)\n","  write(p,s); print('Session writing repaired: '+p,flush=True)\n");
values.put(" \"$f\"; then echo \"会话写入补丁缺失：$f\"; exit 1; fi; done; [ \"$found\" = 1 ] || { echo '会话模块缺失'; exit 1; }"," \"$f\"; then echo \"Session write patch missing: $f\"; exit 1; fi; done; [ \"$found\" = 1 ] || { echo 'Session module missing'; exit 1; }");
values.put(" / 兼容版\n"," / Compatibility edition\n");
values.put(" / 标准版\n"," / Standard edition\n");
values.put(" [保护]"," [Protected]");
values.put(" gravity / rotation 姿态四元数 / steps 开机后步数）\n"," gravity / rotation quaternion / steps since boot)\n");
values.put(" if old in s: write(p,s.replace(old,'const persistence = \"host\"; // DSHA patch: LAN')); print('已修复局域网设置',flush=True)\n"," if old in s: write(p,s.replace(old,'const persistence = \"host\"; // DSHA patch: LAN')); print('LAN settings repaired',flush=True)\n");
values.put(" || { echo '设置模块缺失'; exit 1; }; if grep -Fq "," || { echo 'Settings module missing'; exit 1; }; if grep -Fq ");
values.put(" · 默认分支"," · Default branch");
values.put(" 不可用"," unavailable");
values.put(" 个"," items");
values.put(" 个 Android 组到 /etc/group"," Android groups to /etc/group");
values.put(" 个 wheel，源缓存全部保留"," wheels; all source caches preserved");
values.put(" 个可见应用。系统可能限制可见范围；结束应用前会另行核对完整清单。"," visible apps. Android may restrict visibility; a complete list is checked separately before stopping apps.");
values.put(" 个字符"," characters");
values.put(" 个插件导出到所选位置，可在另一台 DSHA 中导入"," plugins to the selected location. Import them into another DSHA installation.");
values.put(" 个运行时文件（"," runtime files (");
values.put(" 个，保留修改版 "," items; modified versions preserved: ");
values.put(" 个，保留额外 wheel "," items; extra wheels preserved: ");
values.put(" 个，原版已在位 "," items; originals already present: ");
values.put(" 个；Android 返回 "," items; Android returned ");
values.put(" 中心=("," center=(");
}
private static void part10(Map<String,String> values) {
values.put(" 分"," min");
values.put(" 分 "," min ");
values.put(" 区域="," bounds=");
values.put(" 及已有下载文件，但无法确认查询来源；请联网重新检查，确认当前通道后才能下载/安装"," and existing downloads, but their query source cannot be verified. Check online again and confirm the current channel before downloading or installing.");
values.put(" 可点击"," clickable");
values.put(" 可输入"," editable");
values.put(" 字节，只读到 "," bytes; read only ");
values.put(" 字）"," characters)");
values.put(" 已选中"," selected");
values.put(" 时 "," h ");
values.put(" 条尚未发送的命令]\n"," queued commands not yet sent]\n");
values.put(" 次）"," times)");
values.put(" 步检查失败："," check steps failed: ");
values.put(" 步，并通过复验"," steps and passed revalidation");
values.put(" 步："," steps: ");
values.put(" 的文件冲突：",": ");
values.put(" 秒），当前步骤未完成，请重新检查"," seconds). This step is incomplete. Check again.");
values.put(" 秒），本次进程已停止"," seconds). This process has been stopped.");
values.put(" 等）"," etc.)");
values.put(" 被占用；释放端口后设备桥会重试，也可重启 Web："," is in use. The device bridge will retry after the port is released; you can also restart the Web service: ");
values.put(" 进程退出，退出码 "," process exited with code ");
values.put(" 项，"," items, ");
values.put("'||process.arch!=='arm64'||!process.versions.node.startsWith('24.'))throw Error('运行时版本不符');","'||process.arch!=='arm64'||!process.versions.node.startsWith('24.'))throw Error('Runtime version mismatch');");
values.put(")，已终止本次进程\n[EXIT=timeout]","), this process was terminated\n[EXIT=timeout]");
values.put("--su 仅在明确需要 root 时使用，须先在设备能力授权页允许；同一设备保护策略始终生效。\n","Use --su only when root is explicitly required and enabled in Device permissions. The same device protection policy always applies.\n");
values.put("/app/apps                       全部已装应用，分用户应用与系统应用；可加 q/limit/user=1 筛选显示\n","/app/apps                       Installed apps, separated into user and system apps; filter with q/limit/user=1\n");
values.put("/app/ask?options=继续|取消 + q=…  弹窗阻塞等回答（最多三个选项）\n","/app/ask?options=Continue|Cancel + q=…  Ask in a blocking dialog (up to three options)\n");
values.put("/app/clip                       读剪贴板（需 App 在前台，系统限制）\n","/app/clip                       Read clipboard (app must be in foreground; Android restriction)\n");
values.put("/app/clip + text=…              写剪贴板\n","/app/clip + text=…              Write clipboard\n");
values.put("/app/device                     机型/系统/电量/网络/屏幕/存储/内存\n","/app/device                     Model / Android / battery / network / display / storage / memory\n");
values.put("/app/export?path=/root/report.md  把产物交给用户 → 落 Download/DSHA\n","/app/export?path=/root/report.md  Deliver a file to the user → Download/DSHA\n");
values.put("/app/help                             本清单\n","/app/help                             This endpoint list\n");
values.put("/app/launch?pkg=com.tencent.mm  启动应用\n","/app/launch?pkg=com.tencent.mm  Launch app\n");
values.put("/app/location（加 fresh=1 强制重新定位，可能等数秒）\n","/app/location (fresh=1 forces a new fix; may take a few seconds)\n");
values.put("/app/notify?title=… + text=…      通知栏\n","/app/notify?title=… + text=…      Notification\n");
values.put("/app/open?url=https://…           打开链接\n","/app/open?url=https://…           Open URL\n");
values.put("/app/plugins                          读回上次上报的加载状态\n","/app/plugins                          Read last reported loading status\n");
values.put("/app/plugins?loaded=a,b&failed=c      上报（插件侧用）\n","/app/plugins?loaded=a,b&failed=c      Report status (for plugins)\n");
values.put("/app/readfile?path=/…          读取任意绝对路径的目录或文本，仍受 Android 权限限制\n","/app/readfile?path=/…          Read an absolute directory or text-file path, subject to Android permissions\n");
values.put("/app/sensors 列表 · /app/sensor?name=light 读值\n","/app/sensors lists sensors · /app/sensor?name=light reads a value\n");
values.put("/app/share（text= 或 path=）      分享到其它应用\n","/app/share (text= or path=)      Share to another app\n");
values.put("/app/toast + text=…               App 内提示\n","/app/toast + text=…               In-app toast\n");
values.put("/app/torch?on=1 手电\n","/app/torch?on=1 Flashlight\n");
values.put("/app/version                          桥协议版本 + App 版本（特性检测用）\n","/app/version                          Bridge protocol + app version (feature detection)\n");
values.put("/app/vibrate?ms=300               震动（长任务跑完叫醒用户）\n","/app/vibrate?ms=300               Vibrate (notify the user after a long task)\n");
values.put("/root/dsh-bin/adb-shell \"命令\"        用 id 核验实际身份\n","/root/dsh-bin/adb-shell \"command\"        Use id to verify the actual identity\n");
values.put("3081 和 3090 已用于 App 桥接，请换一个端口","3081 and 3090 are reserved for app bridges. Choose another port.");
values.put("3090 桥启动失败: ","3090 bridge startup failed: ");
values.put("3090 桥绑定失败：","3090 bridge bind failed: ");
values.put("3090 的 IPv6 附加监听不可用：","Additional IPv6 listener on 3090 unavailable: ");
values.put("; then echo '局域网设置补丁缺失'; exit 1; fi","; then echo 'LAN settings patch missing'; exit 1; fi");
values.put("== 与用户交互 ==\n","== User interaction ==\n");
values.put("== 传感器与位置（默认关闭，需用户在配置页勾选）==\n","== Sensors & location (off by default; enable in Configuration) ==\n");
values.put("== 元信息 ==\n","== Metadata ==\n");
values.put("== 屏幕操作（无障碍服务，不需要 ADB/Shizuku）==\n","== Screen control (accessibility service; no ADB/Shizuku required) ==\n");
values.put("== 插件状态 ==\n","== Plugin status ==\n");
values.put("== 设备 shell（自动选择 root / Shizuku / ADB）==\n","== Device shell (selects root / Shizuku / ADB automatically) ==\n");
values.put("== 设备与应用 ==\n","== Device & apps ==\n");
values.put("ABSENT 这台设备没有该传感器","ABSENT This device has no such sensor");
values.put("ABSENT 这台设备没有闪光灯","ABSENT This device has no flashlight");
values.put("ADB 保活启动失败: ","ADB keep-alive startup failed: ");
values.put("ADB 保活启动失败：请在设备能力授权页重试","ADB keep-alive startup failed. Retry in Device permissions.");
values.put("ADB 保活已停止","ADB keep-alive stopped");
values.put("ADB 保活待恢复：请回到 DSHA","ADB keep-alive needs recovery. Return to DSHA.");
values.put("ADB 保活未获系统允许，请回到 DSHA 重试","Android did not allow ADB keep-alive. Return to DSHA and retry.");
values.put("ADB 准备失败：","ADB preparation failed: ");
values.put("ADB 后台准备与探活","Background ADB preparation and health check");
values.put("ADB 后台探活","Background ADB health check");
values.put("ADB 命令缺少环境任务凭据","ADB command has no environment task lease");
values.put("ADB 等待局域网授权：请到设备能力授权页开启并授权","ADB is waiting for LAN permission. Enable and authorize it in Device permissions.");
values.put("ADB 设备通道","ADB device connection");
values.put("ADB 进程仍在回收，继续保留环境任务凭据","ADB process cleanup is still running; environment task lease retained");
values.put("ADB 连接已断开","ADB connection lost");
values.put("ADB 通道保活中","Keeping ADB connected");
values.put("ADB 配对与连接验证","ADB pairing and connection verification");
values.put("ADB_CANCELLED: 操作已取消，未启动命令","ADB_CANCELLED: Operation canceled; no command started");
values.put("ADB_CANCELLED: 环境准备已取消","ADB_CANCELLED: Environment preparation canceled");
values.put("API Key 加密失败，未写入恢复配置","API key encryption failed; restore settings were not written");
values.put("APK 内的 libproot.so 缺失（安装包可能损坏，建议重装）","APK is missing libproot.so (the package may be damaged; reinstall it)");
values.put("APK 没有内置运行时","APK has no bundled runtime");
}
private static void part11(Map<String,String> values) {
values.put("APK 缺少内置环境包，原环境保持原位","APK is missing the environment archive; original environment preserved");
values.put("APK 缺少有效环境版本，无法确认安装完成","APK has no valid environment version; installation cannot be confirmed");
values.put("APK 缺少独立 dsh 运行时，安装未完成","APK is missing the separate dsh runtime; installation is incomplete");
values.put("Agent 通知","Agent notifications");
values.put("Agent 预设适配未应用，原文件保留：","Agent preset patch was not applied; original file preserved: ");
values.put("Agent 预设适配的模块路径不安全或缺失","Agent preset module path is unsafe or missing");
values.put("Alarm 唤醒","Alarm wake-up");
values.put("Android 用户组","Android groups");
values.put("Android 用户组已核对，开始复验","Android groups checked. Starting revalidation.");
values.put("BAD_KEY 支持的名字：light accel gyro magnet pressure proximity humidity ","BAD_KEY Supported names: light accel gyro magnet pressure proximity humidity ");
values.put("CA 证书","CA certificates");
values.put("CONNECT_WARN: 验证没有返回结果","CONNECT_WARN: Verification returned no result");
values.put("CRC/长度校验失败：","CRC/length verification failed: ");
values.put("DISABLED 传感器能力未开启（设备能力授权页可开）","DISABLED Sensors are off (enable in Device permissions)");
values.put("DISABLED 位置能力未开启：请到 DSHA「设备能力授权」页勾选「允许 agent 读取位置」","DISABLED Location is off. Enable Allow location access in DSHA's Device permissions.");
values.put("DISABLED 设备能力未开启（设备能力授权页可开）","DISABLED Device access is off (enable in Device permissions)");
values.put("DNS 配置","DNS configuration");
values.put("DSHA 3090 桥端点清单（BRIDGE_PROTOCOL=","DSHA 3090 bridge endpoints (BRIDGE_PROTOCOL=");
values.put("DSHA · 任务完成","DSHA · Task complete");
values.put("DSHA 后台服务","DSHA background service");
values.put("DSHA 安全确认","DSHA confirmation");
values.put("DSHA 应用更新","DSHA app updates");
values.put("DSHA 更新已就绪","DSHA update ready");
values.put("DSHA 诊断报告\n","DSHA diagnostic report\n");
values.put("DSHA 通知","DSHA notifications");
values.put("DSHA 错误日志\n","DSHA error logs\n");
values.put("DSHA后台服务","DSHA background service");
values.put("DSHA运行中","DSHA running");
values.put("EMPTY 没有可用传感器","EMPTY No sensors available");
values.put("ERROR: Ubuntu Python 环境未就绪","ERROR: Ubuntu Python environment is not ready");
values.put("ERROR: 剪贴板操作失败：","ERROR: Clipboard operation failed: ");
values.put("ERROR: 剪贴板桥需由请求工作线程调用","ERROR: Clipboard bridge must be called from the request worker thread");
values.put("ERROR: 命令执行超时（","ERROR: Command timed out (");
values.put("ERROR: 命令等待被中断","ERROR: Command wait interrupted");
values.put("ERROR: 导出失败（存储权限或空间不足）","ERROR: Export failed (storage permission or space unavailable)");
values.put("FORBIDDEN: 只支持 http/https/geo/tel/mailto/market 链接","FORBIDDEN: Only http/https/geo/tel/mailto/market URLs are supported");
values.put("FORBIDDEN: 只能分享 /sdcard 下的文件","FORBIDDEN: Only files under /sdcard can be shared");
values.put("FORBIDDEN: 读取需要绝对路径","FORBIDDEN: Reading requires an absolute path");
values.put("FORBIDDEN: 路径无法解析（","FORBIDDEN: Could not resolve path (");
values.put("GLIBC_PY_INSTALL_FAIL: 无法安装 Ubuntu Python3，请先修复基础环境\n","GLIBC_PY_INSTALL_FAIL: Could not install Ubuntu Python3. Repair the base environment first.\n");
values.put("Gecko 143 可用（旧系统自动切换）","Gecko 143 available (selected automatically on older systems)");
values.put("HINT=端点清单见 /app/help；判版本请用 >= 而不是 ==\n","HINT=See /app/help for endpoints; compare versions using >= rather than ==\n");
values.put("INVALID_CODE: 配对码必须恰好为 6 位数字","INVALID_CODE: Pairing code must contain exactly 6 digits");
values.put("KEEPALIVE_OK: 已允许自动恢复无线调试","KEEPALIVE_OK: Automatic Wireless debugging recovery is authorized");
values.put("KEEPALIVE_WARN: 自动恢复授权未完成；重启后可能需手动打开无线调试","KEEPALIVE_WARN: Automatic recovery is not authorized; you may need to enable Wireless debugging manually after restart");
values.put("KEEPALIVE_WARN: 连接已验证，但自动恢复授权未完成；重启后可能需手动打开无线调试\n","KEEPALIVE_WARN: Connection verified, but automatic recovery is not authorized. You may need to enable Wireless debugging manually after restart.\n");
values.put("LAN 代理已停止","LAN proxy stopped");
values.put("LAN 代理已启动：0.0.0.0:","LAN proxy started: 0.0.0.0:");
values.put("LAN 代理绑定失败：","LAN proxy bind failed: ");
values.put("NOT_FOUND_OR_NO_PERMISSION: 路径不存在或 Android 未授予读取权限：","NOT_FOUND_OR_NO_PERMISSION: Path does not exist or Android denied read access: ");
values.put("NO_PERMISSION 未授予定位权限：到 DSHA「设备能力授权」页点一下开关会引导授权","NO_PERMISSION Location permission missing. Tap the location switch in DSHA's Device permissions to authorize.");
values.put("NO_PERMISSION: Android 未授予读取此目录的权限","NO_PERMISSION: Android denied access to this directory");
values.put("OK 已","OK ");
values.put("OK 已发送 ","OK Sent ");
values.put("OK 已点击「","OK Tapped “");
values.put("OK 已输入 ","OK Entered ");
values.put("OK 截屏已保存：","OK Screenshot saved: ");
values.put("OK: 已写入剪贴板（","OK: Clipboard updated (");
values.put("OK: 已启动 ","OK: Launched ");
values.put("OK: 已弹出分享面板","OK: Share sheet opened");
values.put("OK: 已打开 ","OK: Opened ");
values.put("OK: 震动 ","OK: Vibrating ");
values.put("PAIR_BUSY: 已有配对正在进行，请等待结果","PAIR_BUSY: Pairing is already in progress. Wait for the result.");
values.put("PAIR_ERROR: 配对进程没有返回结果","PAIR_ERROR: Pairing process returned no result");
values.put("PDF 兼容适配未应用，原文件保留：","PDF compatibility patch was not applied; original file preserved: ");
values.put("PDF 兼容适配的模块路径不安全或文件缺失","PDF compatibility module path is unsafe or missing");
values.put("PID 对应共享或未知 UID，请使用明确包名","PID belongs to a shared or unknown UID. Specify an explicit package name.");
values.put("Python 与标准库","Python & standard library");
values.put("Python 动态库不完整","Python shared libraries are incomplete");
values.put("SCRIPTS_FAILED: ADB 脚本更新未完成\n","SCRIPTS_FAILED: ADB script update is incomplete\n");
values.put("SCRIPTS_MISSING: 随包缺少 ","SCRIPTS_MISSING: Bundle is missing ");
values.put("SETTINGS_APPLIED: ADB 授权设置已同步","SETTINGS_APPLIED: ADB authorization settings synced");
values.put("SETTINGS_FAILED: ADB 授权设置同步失败：","SETTINGS_FAILED: Could not sync ADB authorization settings: ");
values.put("SETTINGS_PENDING: 环境未就绪，下次准备 ADB 时同步授权设置","SETTINGS_PENDING: Environment not ready; authorization settings will sync when ADB is prepared next");
values.put("SETUP_FAILED: 安装后验证未通过，请检查以下输出\n","SETUP_FAILED: Post-installation verification failed. Check the output below.\n");
values.put("SHA-256 校验失败，已清理损坏文件，请重新下载","SHA-256 verification failed. The damaged file was removed; download again.");
values.put("Shizuku 服务已停止","Shizuku service stopped");
values.put("Shizuku 绑定失败: ","Shizuku bind failed: ");
values.put("TIMEOUT 传感器没有在 2 秒内上报（部分传感器只在数值变化时上报）","TIMEOUT No sensor reading within 2 seconds (some sensors report only when values change)");
values.put("TIMEOUT 暂时定不到位（可能在室内且定位服务关闭）","TIMEOUT No location fix yet (you may be indoors with location services off)");
}
private static void part12(Map<String,String> values) {
values.put("TOO_LARGE: 内容超过 256 KiB","TOO_LARGE: Content exceeds 256 KiB");
values.put("UNSUPPORTED 需要 Android 6.0+","UNSUPPORTED Requires Android 6.0+");
values.put("Ubuntu Python 安装失败: ","Ubuntu Python installation failed: ");
values.put("Ubuntu Python 运行环境不完整","Ubuntu Python runtime is incomplete");
values.put("WHEELS_CACHE_READY: 补齐 ","WHEELS_CACHE_READY: Added ");
values.put("WHEELS_JAVA_EXTRACTED: 已校验并安装 ","WHEELS_JAVA_EXTRACTED: Verified and installed ");
values.put("WRITE_SECURE_SETTINGS 授权失败: ","WRITE_SECURE_SETTINGS authorization failed: ");
values.put("WRITE_SECURE_SETTINGS 授权结果: ","WRITE_SECURE_SETTINGS authorization result: ");
values.put("Web PID 文件异常，未终止任何进程","Invalid Web PID file; no process terminated");
values.put("Web PID 无效，未终止任何进程","Invalid Web PID; no process terminated");
values.put("Web UI 正在后台保持运行","Web UI is running in the background");
values.put("Web 启动脚本仍在退出，已保留容器启动器","Web startup script is still exiting; container launcher preserved");
values.put("Web 尚未停止，现有数据未覆盖，请稍后重试","Web has not stopped. Existing data was not overwritten. Try later.");
values.put("Web 已停止","Web stopped");
values.put("Web 已停止，但终端或后台任务仍在运行。请结束这些任务后重试；原环境未移动，数据未覆盖。","Web stopped, but terminals or background tasks are still running. Stop them and retry. The original environment has not moved and data has not been overwritten.");
values.put("Web 服务仍未就绪，请稍后重试或查看启动日志","Web service is not ready. Try later or check startup logs.");
values.put("Web 服务响应超时，请稍后重试或查看启动日志","Web service response timed out. Try later or check startup logs.");
values.put("Web 服务尚未就绪（HTTP ","Web service is not ready (HTTP ");
values.put("Web 未接受登录凭据（HTTP ","Web service rejected login credentials (HTTP ");
values.put("Web 未返回有效的登录凭据，请重试或查看启动日志","Web service returned no valid login credentials. Retry or check startup logs.");
values.put("Web 状态已变化，请等待本轮启动完成后重试","Web state changed. Wait for this startup to finish and retry.");
values.put("Web 身份记录异常","Web process identity record error");
values.put("Web 身份记录异常，原环境保留","Web process identity record error; original environment preserved");
values.put("Web 身份记录无效","Invalid Web process identity record");
values.put("Web 身份记录未写入，将使用完整进程核验","Web identity record was not written; full process verification will be used");
values.put("Web 进程身份已变化，未终止其他进程，请重试","Web process identity changed. Other processes were not terminated. Retry.");
values.put("Web 鉴权响应异常（HTTP ","Unexpected Web authentication response (HTTP ");
values.put("Web 鉴权尚未就绪，请稍后重试","Web authentication is not ready. Try later.");
values.put("Web 鉴权链接已失效（HTTP ","Web authentication link expired (HTTP ");
values.put("Web 页面尚不可用（HTTP ","Web page is not available yet (HTTP ");
values.put("WebView：不可用（","WebView: unavailable (");
values.put("[ADB_REQUIRED] 请使用 adb-shell 执行此命令\n[EXIT=124]","[ADB_REQUIRED] Use adb-shell to run this command\n[EXIT=124]");
values.put("[APP_BACKGROUND] App 不在前台，弹不出提问 —— 可先 /app/notify 提醒用户打开 DSHA","[APP_BACKGROUND] DSHA must be in the foreground to show a question. Use /app/notify to ask the user to open it first.");
values.put("[APP_BACKGROUND] 系统限制：只有 App 在前台时才能读剪贴板，可先用 /app/notify 提醒用户打开 DSHA","[APP_BACKGROUND] Android permits clipboard reads only in the foreground. Use /app/notify to ask the user to open DSHA first.");
values.put("[APP_BACKGROUND] 页面已离开或重建，请回到 DSHA 后重新提问","[APP_BACKGROUND] The page was left or recreated. Return to DSHA and ask again.");
values.put("[APP_LIST_UNAVAILABLE] Android 未提供完整应用清单；设备停止操作会通过 ADB/Shizuku 重新读取。","[APP_LIST_UNAVAILABLE] Android did not provide a complete app list. Device stop operations will fetch it again through ADB/Shizuku.");
values.put("[BUSY] 已有一个提问在等用户回答","[BUSY] A question is already waiting for the user's answer");
values.put("[DEVICE_CHANNEL_UNAVAILABLE] 请在设置 → 设备能力授权中连接 root、Shizuku 或 ADB 通道\n[EXIT=124]","[DEVICE_CHANNEL_UNAVAILABLE] Connect root, Shizuku or ADB in Settings → Device permissions\n[EXIT=124]");
values.put("[DISMISSED] 用户关掉了提问框","[DISMISSED] The user dismissed the question");
values.put("[ERR] 不认识的按键「","[ERR] Unknown key “");
values.put("[ERR] 你拒绝了这次屏幕读取","[ERR] You declined this screen read");
values.put("[ERR] 你拒绝了这次截屏","[ERR] You declined this screenshot");
values.put("[ERR] 你拒绝了这次按键","[ERR] You declined this key press");
values.put("[ERR] 你拒绝了这次滑动","[ERR] You declined this swipe");
values.put("[ERR] 你拒绝了这次点击","[ERR] You declined this tap");
values.put("[ERR] 你拒绝了这次输入","[ERR] You declined this input");
values.put("[ERR] 保存截屏失败：","[ERR] Could not save screenshot: ");
values.put("[ERR] 写截屏文件失败：","[ERR] Could not write screenshot file: ");
values.put("[ERR] 取不到当前窗口","[ERR] Current window unavailable");
values.put("[ERR] 取不到当前窗口（可能停在锁屏或系统弹窗上）","[ERR] Current window unavailable (the lock screen or a system dialog may be active)");
values.put("[ERR] 屏幕上找不到可点击的「","[ERR] No clickable text found on screen: “");
values.put("[ERR] 屏幕上没有输入框（先点一下要输入的位置）","[ERR] No input field found (tap the input area first)");
values.put("[ERR] 建不了目录 ","[ERR] Could not create directory ");
values.put("[ERR] 截屏失败：","[ERR] Screenshot failed: ");
values.put("[ERR] 截屏数据无法解析","[ERR] Could not decode screenshot data");
values.put("[ERR] 截屏无结果","[ERR] Screenshot returned no result");
values.put("[ERR] 截屏被系统拒绝（错误码 ","[ERR] Android denied the screenshot (error code ");
values.put("[ERR] 截屏超时","[ERR] Screenshot timed out");
values.put("[ERR] 截屏需要 Android 11 及以上（当前 API ","[ERR] Screenshots require Android 11+ (current API ");
values.put("[ERR] 手势失败：","[ERR] Gesture failed: ");
values.put("[ERR] 手势未被接受（","[ERR] Gesture not accepted (");
values.put("[ERR] 手势被取消（","[ERR] Gesture canceled (");
values.put("[ERR] 手势超时（","[ERR] Gesture timed out (");
values.put("[ERR] 按键失败：","[ERR] Key press failed: ");
values.put("[ERR] 文本不能为空","[ERR] Text must not be empty");
values.put("[ERR] 无障碍服务未开启。请让用户在 DSHA「配置」页点「屏幕操作权限」，","[ERR] Accessibility service is off. Ask the user to tap Screen-control permissions in DSHA's Configuration page, ");
values.put("[ERR] 未知端点（可用：dump/tap/input/key/swipe）","[ERR] Unknown endpoint (available: dump/tap/input/key/swipe)");
values.put("[ERR] 点击失败：","[ERR] Tap failed: ");
values.put("[ERR] 点击被系统拒绝（控件可能不可用）","[ERR] Android denied the tap (the control may be unavailable)");
values.put("[ERR] 系统拒绝了 ","[ERR] Android denied ");
values.put("[ERR] 要点的文字不能为空","[ERR] Tap target text must not be empty");
values.put("[ERR] 读屏失败：","[ERR] Screen read failed: ");
values.put("[ERR] 输入失败：","[ERR] Input failed: ");
values.put("[ERR] 输入被系统拒绝","[ERR] Android denied the input");
values.put("[ERR] 锁屏需要 Android 9+","[ERR] Locking the screen requires Android 9+");
values.put("[ERR] 需要 ?text=","[ERR] Requires ?text=");
values.put("[ERR] 需要 ?text=要点的文字 或 ?x=&y=坐标","[ERR] Requires ?text=target_text or ?x=&y=coordinates");
values.put("[ERR] 需要 ?x1=&y1=&x2=&y2=（可选 &ms=时长）","[ERR] Requires ?x1=&y1=&x2=&y2= (optional &ms=duration)");
values.put("[EXECUTION_UNKNOWN] root 请求已中断，不会自动重试\n[EXIT=125]","[EXECUTION_UNKNOWN] Root request interrupted; no automatic retry\n[EXIT=125]");
values.put("[EXECUTION_UNKNOWN] 结果编码失败\n[EXIT=125]","[EXECUTION_UNKNOWN] Result encoding failed\n[EXIT=125]");
}
private static void part13(Map<String,String> values) {
values.put("[EXECUTION_UNKNOWN] 表示命令可能已执行，先核对实际状态，不能切换通道或自动重放。\n","[EXECUTION_UNKNOWN] means the command may have executed. Verify the actual state before proceeding; do not switch connections or replay automatically.\n");
values.put("[EXECUTION_UNKNOWN] 设备命令结果未确认，不会自动重试：","[EXECUTION_UNKNOWN] Device command result is unconfirmed; no automatic retry: ");
values.put("[POLICY_BLOCKED] 不是受支持的短信查询\n[EXIT=126]","[POLICY_BLOCKED] Unsupported SMS query\n[EXIT=126]");
values.put("[POLICY_BLOCKED] 未允许 root shell","[POLICY_BLOCKED] Root shell is not allowed");
values.put("[POLICY_BLOCKED] 未允许 root shell\n[EXIT=126]","[POLICY_BLOCKED] Root shell is not allowed\n[EXIT=126]");
values.put("[POLICY_BLOCKED] 短信读取尚未经过原生授权\n[EXIT=126]","[POLICY_BLOCKED] SMS queries have not been authorized in the app\n[EXIT=126]");
values.put("[POLICY_BLOCKED] 短信读取未获授权，可在设置中管理设备能力授权","[POLICY_BLOCKED] SMS queries are not authorized. Manage Device permissions in Settings.");
values.put("[POLICY_BLOCKED] 短信读取请使用 ADB 通道，并在 DSHA 授权\n[EXIT=126]","[POLICY_BLOCKED] Use ADB for SMS queries and authorize them in DSHA\n[EXIT=126]");
values.put("[RESULT_UNKNOWN] 剪贴板操作已开始，但等待已结束，结果未知；请确认后再重试","[RESULT_UNKNOWN] Clipboard operation started, but the wait ended before a result. Verify its state before retrying.");
values.put("[ROOT_UNAVAILABLE] 未找到 su\n[EXIT=124]","[ROOT_UNAVAILABLE] su not found\n[EXIT=124]");
values.put("[SHIZUKU_SERVICE_NOT_READY] 设备 Shell 正在退出\n[EXIT=124]","[SHIZUKU_SERVICE_NOT_READY] Device shell is exiting\n[EXIT=124]");
values.put("[STOPPED] 设备桥已停止，请稍后重试","[STOPPED] Device bridge stopped. Try again later.");
values.put("[TIMEOUT] 用户在提问期限内没有回答","[TIMEOUT] The user did not answer before the question expired");
values.put("[UNAVAILABLE] 提问窗口已关闭或无法显示，请重新提问","[UNAVAILABLE] The question window closed or could not be displayed. Ask again.");
values.put("[中止失败，未创建新会话：","[Stop failed; no new session created: ");
values.put("[会话已就绪；中止会重启 shell，cd/export 状态随重启清除]\n","[Session ready. Stopping restarts the shell and clears cd/export state.]\n");
values.put("[会话已退出；已发送的命令不会自动重放]\n","[Session exited. Previously sent commands will not be replayed automatically.]\n");
values.put("[保活] WebUI 连续失联，已提交自动重启","[Keep-alive] Repeated Web UI disconnections; automatic restart requested");
values.put("[保活] 取锁失败（不致命）: ","[Keep-alive] Could not acquire lock (nonfatal): ");
values.put("[关闭会话：取消 ","[Closing session: canceling ");
values.put("[发送结果不确定，未自动重发：","[Send result uncertain; not resent automatically: ");
values.put("[已略过超长输出]","[Long output omitted]");
values.put("[无法取得进程句柄，禁止重启会话或移动环境；请结束应用进程后再恢复]\n","[No process handle available. Session restart and environment moves are blocked. End the app process before recovery.]\n");
values.put("[旧会话已结束]\n","[Previous session ended]\n");
values.put("[未确认启动进程已回收，继续保留环境占用，不创建新会话]\n","[Startup process cleanup is unconfirmed. Environment remains in use; no new session created.]\n");
values.put("[正在中止本会话进程组并重启；尚未发送的命令保留]\n","[Stopping this session's process group and restarting. Unsent commands are retained.]\n");
values.put("[正在关闭简易终端]\n","[Closing simple terminal]\n");
values.put("[正在启动简易终端；命令按顺序等待发送]\n","[Starting simple terminal; commands are queued in order.]\n");
values.put("[用户应用]\n","[User apps]\n");
values.put("[私钥已隐藏]","[Private key hidden]");
values.put("[系统应用]\n","[System apps]\n");
values.put("[终端初始化超时，未发送任何用户命令]\n","[Terminal initialization timed out. No user command was sent.]\n");
values.put("[终端启动失败：","[Terminal startup failed: ");
values.put("[终端启动清理失败，保留环境占用：","[Terminal startup cleanup failed; environment remains in use: ");
values.put("[终端读取失败：","[Terminal read failed: ");
values.put("[较早输出已省略，仅保留最近 48 KiB]\n","[Earlier output omitted; showing the latest 48 KiB.]\n");
values.put("[输出行过长，已隐藏]","[Overlong output line hidden]");
values.put("assets 里也没有离线包","No offline archive in assets");
values.put("chmod 失败: ","chmod failed: ");
values.put("const persistence = \"host\"; // DSHA patch: LAN 代理场景强制 host 持久化","const persistence = \"host\"; // DSHA patch: force host persistence for LAN proxy");
values.put("date 只允许读取时间","date may only read the time");
values.put("dsh web 进程已创建 → 127.0.0.1:","dsh web process created → 127.0.0.1:");
values.put("dsh 与内置插件更新完成；Ubuntu、个人目录、会话、配置和第三方插件保持原位。","dsh and bundled plugins updated. Ubuntu, personal directories, conversations, settings and third-party plugins stay in place.");
values.put("dsh 进程已退出","dsh process exited");
values.put("find 只允许读取条件，禁止 exec/delete 等动作","find permits read-only conditions; exec/delete and similar actions are blocked");
values.put("find 需要明确的读取目录","find requires an explicit directory to read");
values.put("grep -Eq '^[[:space:]]*nameserver[[:space:]]+[^[:space:]#]+' /etc/resolv.conf || { echo '缺少 nameserver 配置'; exit 1; }","grep -Eq '^[[:space:]]*nameserver[[:space:]]+[^[:space:]#]+' /etc/resolv.conf || { echo 'Missing nameserver configuration'; exit 1; }");
values.put("if not re.search(r'^\\s*nameserver\\s+[^\\s#]+',s,re.M): write(p,s+'\\nnameserver 8.8.8.8\\nnameserver 223.5.5.5\\n'); print('已补齐 DNS',flush=True)\n","if not re.search(r'^\\s*nameserver\\s+[^\\s#]+',s,re.M): write(p,s+'\\nnameserver 8.8.8.8\\nnameserver 223.5.5.5\\n'); print('DNS entries added',flush=True)\n");
values.put("if(!loader||typeof loader.import!=='function')throw Error('Node 插件加载器首次初始化失败');","if(!loader||typeof loader.import!=='function')throw Error('Initial Node plugin loader setup failed');");
values.put("l2s 摊平失败（不影响启动）: ","l2s flattening failed (startup unaffected): ");
values.put("l2s 摊平完成: ","l2s flattening complete: ");
values.put("link 失败: ","link failed: ");
values.put("logcat 只允许读取，禁止清日志、写文件和修改缓冲区","logcat is read-only; clearing logs, writing files and changing buffers are blocked");
values.put("npm 入口","npm entry point");
values.put("npm 插件包 · ","npm plugin package · ");
values.put("onStartCommand startForeground 失败: ","onStartCommand startForeground failed: ");
values.put("patch /etc/bash.bashrc 失败: ","Could not patch /etc/bash.bashrc: ");
values.put("pm 只允许查询；安装、卸载、清数据和授权不开放给设备命令","pm permits queries only. Device commands cannot install, uninstall, clear app data or grant permissions.");
values.put("proot 路径: ","proot path: ");
values.put("proot（内置，稳定）","proot (bundled, stable)");
values.put("proroot 不可用，本次降回 proot: ","proroot unavailable; using proot for this run: ");
values.put("proroot 已退出，正在自动使用 proot 兼容重试；本轮只重试一次。","proroot exited. Retrying with proot for compatibility, once for this startup.");
values.put("proroot 运行时缺 ","proroot runtime is missing ");
values.put("proroot 退出后的兼容重试","Compatibility retry after proroot exit");
values.put("proroot（实验，零 ptrace 开销）","proroot (experimental, no ptrace overhead)");
values.put("resolv.conf 写入失败: ","Could not write resolv.conf: ");
values.put("root 授权或执行失败：","Root authorization or execution failed: ");
values.put("root 授权或执行超时，请在 root 管理器查看 DSHA 授权","Root authorization or execution timed out. Check DSHA's permission in your root manager.");
values.put("root 通道失败：","Root connection failed: ");
values.put("root 通道已响应 · 设备命令仍受策略保护","Root connection responded · Device command policy still applies");
values.put("settings persistence patch 失败（不影响启动）: ","Settings persistence patch failed (startup unaffected): ");
values.put("su 未授予 root 身份","su did not grant root identity");
values.put("symlink 失败: ","symlink failed: ");
values.put("tar 数据意外结束","Unexpected end of tar data");
values.put("tar 数据意外结束（需要 ","Unexpected end of tar data (required ");
values.put("token 取自 /root/.dsh/.bridge_token，下面记为 $T。\n","Read the token from /root/.dsh/.bridge_token; below it is represented as $T.\n");
values.put("token 文件写入失败，3090 桥将无法鉴权: ","Could not write token file; the 3090 bridge cannot authenticate: ");
values.put("token 文件读取/清理失败: ","Could not read/clean token file: ");
values.put("wheel 大于 128 MiB","wheel exceeds 128 MiB");
values.put("wheel 操作已取消","wheel operation canceled");
}
private static void part14(Map<String,String> values) {
values.put("wheel 条目过多","Too many wheel entries");
values.put("wheel 目录不存在或不是目录","wheel directory is missing or is not a directory");
values.put("wheel 目录为空","wheel directory is empty");
values.put("wheel 解包大小超过上限","Extracted wheel size exceeds the limit");
values.put("wheel 路径包含控制字符","wheel path contains control characters");
values.put("wheel 路径越界","wheel path is outside the allowed directory");
values.put("…（已截断）","…(truncated)");
values.put("⚠ 请求执行：","⚠ Requested command: ");
values.put("⚠️ DSHA 安全确认","⚠️ DSHA confirmation");
values.put("。原环境保持原位，请释放空间后重试。",". The original environment stays in place. Free space and retry.");
values.put("。未取得完整结果，不会自动重试\n[EXIT=125]",". No complete result was received; no automatic retry\n[EXIT=125]");
values.put("。源缓存已保留，未用 APK 覆盖。请先备份该文件并移出 wheels 目录，再重试补缺；自定义 wheel 请提供有效版本。",". The source cache is preserved and was not overwritten by the APK. Back up this file and move it out of the wheels directory before retrying. Custom wheels must be valid versions.");
values.put("。点击下方重试。",". Tap Retry below.");
values.put("」异常","” error");
values.put("」（先用 dump 看看实际文字）","” (use dump to inspect the actual text first)");
values.put("」（可用：back/home/recents/notifications/quicksettings/lock）","” (available: back/home/recents/notifications/quicksettings/lock)");
values.put("」，耗时 ","”, elapsed ");
values.put("】里：","]: ");
values.put("一个服务解析失败（错误 ","A service could not be resolved (error ");
values.put("上一项插件操作仍在进行，请完成后重新选择。","The previous plugin operation is still running. Wait, then select again.");
values.put("上次任务因进程退出而中断，未自动重试。请先处理未完成的维护或重新选择备份。\n","The previous task was interrupted when the app process exited; it was not retried automatically. Resolve incomplete maintenance or select a backup again.\n");
values.put("上次任务记录无法读取，请检查数据状态。","Could not read the previous task record. Check the data state.");
values.put("上次保存：","Last saved: ");
values.put("上次环境维护尚未完成，请先恢复中断维护；现有目录未覆盖","Previous environment maintenance is incomplete. Resume recovery first; existing directories were not overwritten.");
values.put("上次环境维护未完成，请先到安装与修复页恢复中断维护","Previous environment maintenance is incomplete. Resume it in Install & repair first.");
values.put("上次环境维护未完成，请先到安装与修复页恢复中断维护。","Previous environment maintenance is incomplete. Resume it in Install & repair first.");
values.put("上次环境维护未完成，请到安装与修复页恢复维护，再刷新或操作插件","Previous environment maintenance is incomplete. Resume recovery in Install & repair before refreshing or changing plugins.");
values.put("上游模块结构与输入适配补丁不符，原文件保留","Upstream module does not match the input patch; original file preserved");
values.put("下载及校验完成，点击「安装更新」继续","Download and verification complete. Tap Install update to continue.");
values.put("下载尚未开始：","Download has not started: ");
values.put("下载文件发布失败","Could not publish the downloaded file");
values.put("下载文件提交失败，已有备份已保留","Could not commit the downloaded file; existing backup preserved");
values.put("下载暂停：","Download paused: ");
values.put("下载服务已中断，进度已保留，可继续下载","Download service interrupted. Progress is saved; resume downloading.");
values.put("下载清单无效","Invalid download manifest");
values.put("下载超过清单大小","Download exceeds manifest size");
values.put("下载重定向次数过多","Too many download redirects");
values.put("下载重定向缺少地址","Download redirect has no destination");
values.put("不匹配；切回来源通道或重新检查后才能下载/安装"," does not match. Switch back to the source channel or check again before downloading/installing.");
values.put("不支持嵌套执行器","Nested command executors are not supported");
values.put("不是普通 wheel 文件（链接/目录/特殊条目已保留）","Not a regular wheel file (link/directory/special entry preserved)");
values.put("不能在快照或归档回调内停止 Web；请先结束快照，再开始恢复或维护","Cannot stop the Web service inside a snapshot or archive callback. Finish the snapshot before starting restoration or maintenance.");
values.put("不能移除授权标记 ","Could not remove authorization marker ");
values.put("不要用 /root/dsh-bin/adb 或裸 adb —— 那是守卫包装脚本，会失败。\n","Do not use /root/dsh-bin/adb or bare adb; those are guarded wrappers and will fail.\n");
values.put("不认识的命令不执行：","Unrecognized command blocked: ");
values.put("与 ","File conflicts with ");
values.put("个人数据安全副本已存在","Personal data safety copy already exists");
values.put("个人数据归档复制校验失败","Personal data archive copy verification failed");
values.put("个人数据迁移必须持有维护任务锁","Personal data migration requires the maintenance task lock");
values.put("个人数据迁移达到一小时上限，原环境已保留；请减少数据量后重试","Personal data migration reached its one-hour limit. The original environment is preserved. Reduce the data size and retry.");
values.put("个人数据验证摘要无效","Invalid personal data verification digest");
values.put("个人文件安全副本校验失败","Personal file safety copy verification failed");
values.put("个人文件恢复后校验未完成","Post-restore personal file verification is incomplete");
values.put("个人文件摘要无效","Invalid personal file digest");
values.put("个人文件迁移失败（退出码 ","Personal file migration failed (exit code ");
values.put("个人文件迁移必须持有维护任务锁","Personal file migration requires the maintenance task lock");
values.put("中断的维护已回滚；安全备份、旧环境及失败的新环境均已保留。\n","Interrupted maintenance rolled back. The safety backup, old environment and failed new environment are preserved.\n");
values.put("中断的运行时更新已回切；个人目录、会话和配置保持原位。\n","Interrupted runtime update rolled back. Personal directories, conversations and settings stay in place.\n");
values.put("临时目录清理失败：","Temporary directory cleanup failed: ");
values.put("临时目录清理路径越界","Temporary cleanup path is outside the allowed directory");
values.put("主线程尚未执行，已取消本次剪贴板操作；可重试","The main thread had not started this clipboard operation, so it was canceled. You can retry.");
values.put("主线程未接受操作","The main thread did not accept the operation");
values.put("主线程等待期限必须大于零","Main-thread wait timeout must be positive");
values.put("产出报告用 /app/export，别只留在容器里。\n","Use /app/export to deliver reports; do not leave them only in the container.\n");
values.put("仅 debug 可注入 token 文件","Token-file injection is available only in debug builds");
values.put("仅备份对话记录","Back up conversations only");
values.put("仅备份插件","Back up plugins only");
values.put("仅备份设置","Back up settings only");
values.put("仅执行已识别的单条命令；允许读取各目录和明确路径的普通文件操作。禁止脚本、管道、重定向、未知命令。\n","Only recognized single commands are allowed, including directory reads and ordinary file operations on explicit paths. Scripts, pipes, redirects and unknown commands are blocked.\n");
values.put("仅用于 HTTPS 服务端认证","For HTTPS server authentication only");
values.put("仅隔离 debug fixture 可观察提问窗口","Question-window observation is available only in isolated debug fixtures");
values.put("仍有 Web 进程未退出，原环境保留","Web processes are still running; original environment preserved");
values.put("从容器取文件失败: ","Could not retrieve file from container: ");
values.put("任务仍在执行，不能提前释放环境锁","The task is still running; its environment lock cannot be released early");
values.put("任务凭据已释放或正在使用","Task lease is released or already in use");
values.put("任务失败：","Task failed: ");
values.put("任务完成提醒","Task completion alerts");
values.put("任务已取消","Task canceled");
values.put("任务已取消，已完成的结果与修复保留","Task canceled. Completed results and repairs are preserved.");
values.put("任务异常结束，请查看详细输出后重试","Task ended unexpectedly. Review the detailed output before retrying.");
}
private static void part15(Map<String,String> values) {
values.put("任务异常：","Task error: ");
values.put("任务状态无法写入存储","Could not write task state to storage");
values.put("任务记录","Task record");
values.put("任务通知","Task notifications");
values.put("会话 ","Session ");
values.put("会话交互适配未应用，原文件保留：","Session interaction patch was not applied; original file preserved: ");
values.put("会话交互适配的模块路径不安全","Session interaction module path is unsafe");
values.put("会话内临时插件，请在 Web 页面管理；重启后需重新定义，不作为安装包备份。","Temporary session plugin. Manage it in the Web UI. Redefine it after restarting; it is not backed up as an installed package.");
values.put("会话写入补丁","Session write patch");
values.put("传感器/手电 ","Sensors/flashlight ");
values.put("位置 ","Location ");
values.put("使用兼容方式继续安装离线工具","Continue offline tool installation in compatibility mode");
values.put("保存后的日志校验失败","Saved log verification failed");
values.put("保存失败：","Save failed: ");
values.put("保持 DeepSeek Harness Web UI 后台运行","Keep DeepSeek Harness Web UI running in the background");
values.put("保活探测异常: ","Keep-alive check error: ");
values.put("保活探测未完成：","Keep-alive check incomplete: ");
values.put("保活：WRITE_SECURE_SETTINGS 已开启无线调试","Keep-alive: WRITE_SECURE_SETTINGS enabled Wireless debugging");
values.put("修复失败：","Repair failed: ");
values.put("修复第 2 步：准备随包证书与命令入口","Repair step 2: prepare bundled certificates and command entry points");
values.put("修复第 2 步：联网补齐 curl / git（取消将在本轮软件包操作后生效）","Repair step 2: download missing curl / git packages (cancellation takes effect after this package operation)");
values.put("修复第 2 步：补齐离线 Python","Repair step 2: add offline Python");
values.put("修复第 4 步：补齐离线 pnpm","Repair step 4: add offline pnpm");
values.put("修复第 6 步：DNS、会话写入与局域网设置补丁","Repair step 6: DNS, session writing and LAN settings patches");
values.put("修复第 6 步：补齐 Android 用户组","Repair step 6: add Android groups");
values.put("候选来源与当前通道不匹配或任务已改变，请重新检查","Candidate source does not match the current channel, or the task changed. Check again.");
values.put("停止 Web 未完成：","Web stop incomplete: ");
values.put("停止操作已完成","Stop completed");
values.put("停止旧 Web 进程","Stop previous Web process");
values.put("停止用户应用：","Stop user app: ");
values.put("停止等待被中断，请检查 Web 状态","Stop wait interrupted. Check Web status.");
values.put("停用插件失败：","Could not disable plugin: ");
values.put("停用故障插件","Disable failing plugins");
values.put("允许","Allow");
values.put("先恢复上次中断的维护，再尝试重建","Resume the previous interrupted maintenance before rebuilding");
values.put("先恢复上次运行时更新","Recover the previous runtime update first");
values.put("关","Off");
values.put("兼容内核：","Compatibility engine: ");
values.put("兼容重试失败：","Compatibility retry failed: ");
values.put("内存页：","Memory page size: ");
values.put("内核进程身份无法解析","Could not parse kernel process identity");
values.put("内核：","Kernel: ");
values.put("内置 Python / pnpm 修复失败","Bundled Python / pnpm repair failed");
values.put("内置 Python 无法使用，请从诊断页修复工具","Bundled Python is unusable. Repair tools from Diagnostics.");
values.put("内置 npm 文件缺失：","Bundled npm file missing: ");
values.put("内置插件注册: ","Bundled plugin registration: ");
values.put("内置插件脚本执行失败: ","Bundled plugin script failed: ");
values.put("内置组件无法运行；本页不覆盖用户升级的 Node/dsh，请备份后修复该组件","A bundled component cannot run. This page does not overwrite user-upgraded Node/dsh. Back up before repairing the component.");
values.put("写停止标记失败，将由停止脚本重试","Could not write stop marker; the stop script will retry");
values.put("写入路径含符号链接，请使用明确的实际目录：","Write path contains symbolic links. Use the explicit physical directory: ");
values.put("写操作必须使用明确的绝对路径，禁止通配符或上级跳转","Writes require explicit absolute paths; wildcards and parent traversal are blocked");
values.put("准备 ADB 环境","Prepare ADB environment");
values.put("准备应用工具","Prepare app tools");
values.put("准备检查","Prepare checks");
values.put("准备独立基础配置","Prepare isolated basic configuration");
values.put("准备解压","Prepare extraction");
values.put("准备运行环境","Prepare runtime environment");
values.put("分享","Share");
values.put("创建 Web 进程","Create Web process");
values.put("删除未完成，请刷新后重试：","Deletion incomplete. Refresh and retry: ");
values.put("前台宿主不能为空","Foreground host must not be null");
values.put("前台服务未获系统允许: ","Android did not allow the foreground service: ");
values.put("助手提问","Assistant question");
values.put("包装命令不存在时：python3 /root/.dsh/adb-shell.py \"命令\"\n","If the wrapper is missing: python3 /root/.dsh/adb-shell.py \"command\"\n");
values.put("原环境位置不明，已保留所有现场文件","Original environment location is unknown; all recovery files preserved");
values.put("原生设置写入失败","Could not write app settings");
values.put("参数过多","Too many arguments");
values.put("发现仍在运行的 Web，但缺少对应 PID 记录；原环境保留","A Web process is still running, but its PID record is missing. Original environment preserved.");
values.put("受保护目录只读：","Protected directory is read-only: ");
values.put("只允许本 Android 用户","Only the current Android user is allowed");
values.put("只允许系统目录中的已识别命令","Only recognized commands in system directories are allowed");
values.put("只打包会话、索引、附件与工作区结构，恢复时不动设置与插件","Back up sessions, indexes, attachments and workspace structure only. Restoration leaves settings and plugins unchanged.");
values.put("只打包插件清单、配置和已安装插件数据","Back up plugin manifests, settings and installed plugin data only");
values.put("只接受正数 PID，禁止整组或全部进程信号","Only positive PIDs are accepted; signals to entire groups or all processes are blocked");
values.put("只能在目录内创建文件","Files can only be created inside a directory");
values.put("只能选择已识别的短信字段","Only recognized SMS fields may be selected");
values.put("可用存储：","Available storage: ");
values.put("可用空间不足：本阶段预计需要 ","Insufficient free space. This stage requires approximately ");
values.put("可用设备命令分别查询 pm list packages -U -3 和 pm list packages -U -s。原因：","Use supported device commands to query pm list packages -U -3 and pm list packages -U -s separately. Reason: ");
values.put("可能包含号码、正文和验证码；允许后内容会返回请求该操作的助手或插件。\n\n","May include numbers, message bodies and verification codes. If allowed, the results return to the requesting assistant or plugin.\n\n");
}
private static void part16(Map<String,String> values) {
values.put("同一工作锁不能交给不同进程","One task lock cannot be assigned to different processes");
values.put("同名文件过多，请更换名称","Too many files with the same name. Choose a different name.");
values.put("同步 ADB 授权","Sync ADB authorization");
values.put("名称不能包含路径分隔符或 . / ..","Names cannot contain path separators or . / ..");
values.put("后台暂不能启动 ADB 保活: ","Cannot start ADB keep-alive in the background yet: ");
values.put("后台进程尚未退出，维护日志及新旧环境均保留。请等待进程退出后再恢复中断维护。","Background processes have not exited. Maintenance records and both environments are preserved. Wait for exit, then resume interrupted maintenance.");
values.put("后台进程尚未退出，请稍后恢复运行时更新","Background processes have not exited. Recover the runtime update later.");
values.put("启动 Web","Start Web");
values.put("启动一次容器探测，逐项检查实际运行结果","Run one container probe and verify each component's actual result");
values.put("启动失败且无法确认子进程已回收，保留环境占用","Startup failed and child-process cleanup is unconfirmed; environment remains in use");
values.put("启动失败：","Startup failed: ");
values.put("启动失败：进程在鉴权前退出。下方保留实际错误；可查看恢复选项或安全启动。","Startup failed: the process exited before authentication. Actual errors are retained below. See recovery options or use Safe start.");
values.put("启动排队失败：","Could not queue startup: ");
values.put("启动时间较长，仍在等待鉴权；可查看日志或手动停止","Startup is taking longer; still waiting for authentication. View logs or stop manually.");
values.put("启动未完成：","Startup incomplete: ");
values.put("启动状态回调失败","Startup status callback failed");
values.put("周期","Periodic");
values.put("命令为空","Command is empty");
values.put("命令为空或过长","Command is empty or too long");
values.put("命令执行超时（600 秒），本次进程已停止","Command timed out (600 seconds); this process was stopped");
values.put("命令等待已中断","Command wait interrupted");
values.put("命令等待已中断，本次进程已关闭\n[EXIT=interrupted]","Command wait interrupted; this process was closed\n[EXIT=interrupted]");
values.put("命令被中断","Command interrupted");
values.put("命令超时（","Command timed out (");
values.put("回答必须经 answer 提交","Answers must be submitted through answer");
values.put("在【","In [");
values.put("在输入框里填入「","Type into the input field: “");
values.put("基础工具安装失败（退出码 ","Base tools installation failed (exit code ");
values.put("备份全部数据","Back up all data");
values.put("备份成功，归档与导出文件已校验。\n","Backup succeeded. Archive and exported file verified.\n");
values.put("备份文件标识无效","Invalid backup file identifier");
values.put("备份核心没有返回结果","Backup engine returned no result");
values.put("多份运行时维护未完成，已停止切换","Multiple runtime maintenance operations are incomplete; switching stopped");
values.put("失败记录暂不可读\n","Failure record temporarily unavailable\n");
values.put("失败（退出码 ","Failed (exit code ");
values.put("失败：","Failed: ");
values.put("好","OK");
values.put("存储不足，请留出剩余下载大小加 32 MiB 空间","Insufficient storage. Leave space for the remaining download plus 32 MiB.");
values.put("存在","Present");
values.put("存在多份未完成维护，已阻止覆盖环境","Multiple incomplete maintenance operations exist; environment overwrite blocked");
values.put("存在未完成的环境维护，请先恢复中断维护","Environment maintenance is incomplete. Resume recovery first.");
values.put("守门人：这条命令要执行吗？","Confirmation: run this command?");
values.put("安全启动仅加载官方基础界面；原插件开关和配置保留，点普通重启可返回。","Safe start loads only the official basic interface. Original plugin switches and settings are preserved. Use a normal restart to return.");
values.put("安全备份不能位于待替换环境内","Safety backup must be outside the environment being replaced");
values.put("安全备份与逐文件校验通过，正在保留旧环境…","Safety backup and per-file verification passed. Preserving the old environment…");
values.put("安全备份校验失败，原环境未切换","Safety backup verification failed; original environment unchanged");
values.put("安全备份校验通过，正在重置配置…","Safety backup verified. Resetting settings…");
values.put("安全备份目标已存在","Safety backup destination already exists");
values.put("安全归档发生变化","Safety archive changed");
values.put("安全确认","Confirmation");
values.put("安全配置创建失败：","Could not create safe-mode configuration: ");
values.put("安装 ADB 离线依赖","Install offline ADB dependencies");
values.put("安装 Python 与 pnpm","Install Python and pnpm");
values.put("安装与按需修复","Installation & selective repair");
values.put("安装准备被中断","Installation preparation interrupted");
values.put("安装前校验失败：","Pre-installation verification failed: ");
values.put("安装前校验已因进程重建中断，请点击「安装更新」重试","Pre-installation verification was interrupted by process recreation. Tap Install update to retry.");
values.put("安装包不支持当前 Android 版本","APK does not support this Android version");
values.put("安装包不是 DSHA","APK is not DSHA");
values.put("安装包不是当前高/低安卓版本","APK does not match the current Standard/Compatibility edition");
values.put("安装包大小发生变化，请重新下载","APK size changed. Download again.");
values.put("安装包已保留，安装前将重新校验","APK preserved. It will be verified again before installation.");
values.put("安装包版本不匹配或不是更新版本","APK version does not match or is not newer");
values.put("安装包签名不匹配","APK signature mismatch");
values.put("安装发布及回滚失败；旧文件仍保留在 ","Installation commit and rollback failed; old files remain at ");
values.put("安装命令等待被中断","Installation command wait interrupted");
values.put("安装失败：\n","Installation failed:\n");
values.put("安装子进程尚未完全退出，已暂停后续维护","Installation subprocess has not fully exited; further maintenance paused");
values.put("安装检查","Installation checks");
values.put("安装步骤必须为 0—6","Installation step must be 0–6");
values.put("安装监督进程未退出","Installation supervisor has not exited");
values.put("安装离线 curl、git 与证书","Install offline curl, git and certificates");
values.put("安装第 1 步：首次解压离线环境（当前解压完成后可停止）","Install step 1: extract the offline environment for first use (can stop after this extraction finishes)");
values.put("安装进程组尚未结束","Installation process group has not exited");
values.put("安装进程组身份不可确认，已停止后续维护","Installation process group identity is unconfirmed; further maintenance stopped");
values.put("安装链接无效，请从 dsha.cc 重新选择插件，或在插件页粘贴下载链接","Invalid installation link. Select the plugin again on dsha.cc or paste its download URL on the Plugins page.");
values.put("完成「","Completed “");
values.put("容器探测退出码 ","Container probe exit code ");
values.put("容器文件与个人数据","Container files & personal data");
values.put("对话提示适配未应用，原文件保留：","Conversation tooltip patch was not applied; original file preserved: ");
}
private static void part17(Map<String,String> values) {
values.put("对话提示适配的文件缺失或路径不安全","Conversation tooltip patch file is missing or its path is unsafe");
values.put("对话输入适配未应用，原文件保留：","Conversation input patch was not applied; original file preserved: ");
values.put("导出摘要校验失败","Export checksum verification failed");
values.put("尚未启动","Not started");
values.put("尚未安装 Shizuku。安装并启动后可在这里授权。","Shizuku is not installed. Install and start it, then authorize it here.");
values.put("尚未检查","Not checked");
values.put("尚未检查更新","Updates not yet checked");
values.put("尚未配对，请到设备能力授权页完成一次无线配对","Not paired. Complete wireless pairing in Device permissions first.");
values.put("尚未验证 root 授权","Root authorization not yet verified");
values.put("局域网代理已就绪：同网段设备可访问，启动页可复制地址","LAN proxy ready. Devices on the same network can connect; copy the address from Start.");
values.put("局域网设置补丁","LAN settings patch");
values.put("屏幕广播注册失败: ","Could not register screen broadcast receiver: ");
values.put("屏幕点亮/解锁","Screen on/unlocked");
values.put("已","Already ");
values.put("已 patch /etc/bash.bashrc：$(groups) 加 2>/dev/null","Patched /etc/bash.bashrc: added 2>/dev/null to $(groups)");
values.put("已 patch dsh session 持久化 link→rename: ","Patched dsh session persistence from link to rename: ");
values.put("已 patch dsh 客户端 settings persistence→host（局域网可用）","Patched dsh client settings persistence to host for LAN access");
values.put("已从配对弹窗读到配对码（端口 ","Read the code from the pairing dialog (port ");
values.put("已保存到所选位置：","Saved to selected location: ");
values.put("已保存：Download/DSHA/","Saved: Download/DSHA/");
values.put("已写入容器 /etc/resolv.conf（node DNS 修复）","Wrote container /etc/resolv.conf (Node DNS fix)");
values.put("已取消下载，进度已保留","Download canceled; progress saved");
values.put("已取消恢复，当前数据未覆盖。","Restoration canceled. Current data was not overwritten.");
values.put("已取消解析并清理临时包","Inspection canceled; temporary package removed");
values.put("已取消，可重新检查或下载","Canceled. Check or download again.");
values.put("已启用并经 root 管理器授权的 su 可直接执行，无需 ADB 配对；其次使用 Shizuku，再使用 ADB。\n","When su is enabled and authorized by the root manager, commands run directly without ADB pairing. Otherwise, Shizuku is used before ADB.\n");
values.put("已存在同名文件","A file with this name already exists");
values.put("已安装，服务尚未连接。请在 Shizuku 中启动服务，然后返回本页。","Installed, but the service is not connected. Start it in Shizuku and return here.");
values.put("已将 ","Exported ");
values.put("已就绪","Ready");
values.put("已建 /root/手机存储 -> /sdcard 软链（WebUI 选工作区直达手机存储）","Created the phone-storage shortcut under /root pointing to /sdcard (direct access from the Web UI workspace picker)");
values.put("已开","On");
values.put("已按需修复 ","Repaired ");
values.put("已授权 · 设备 Shell 已连接，可直接使用，无需 ADB 配对","Authorized · Device shell connected; no ADB pairing required");
values.put("已授权，正在连接设备 Shell…","Authorized. Connecting device shell…");
values.put("已授权，连接失败：","Authorized, but connection failed: ");
values.put("已有备份、恢复或维护任务，请等待完成","A backup, restore or maintenance task is already running. Wait for it to finish.");
values.put("已有恢复任务正在进行","A restore task is already running");
values.put("已有环境任务启动，请稍后刷新或重试插件操作","An environment task has started. Refresh or retry the plugin operation later.");
values.put("已有环境任务启动，请等待完成后重试","An environment task has started. Wait for it to finish and retry.");
values.put("已有环境，必须先完成安全备份","An environment already exists. Complete a safety backup first.");
values.put("已有运行环境，必须先通过备份和维护事务重建；禁止直接覆盖旧数据","An environment already exists. Rebuild through the backup and maintenance transaction; direct overwrite of old data is blocked.");
values.put("已确认恢复，正在停止 Web 并等待退出…","Restore confirmed. Stopping the Web service and waiting for exit…");
values.put("已自动开启无线调试（WRITE_SECURE_SETTINGS）","Wireless debugging enabled automatically (WRITE_SECURE_SETTINGS)");
values.put("已补 ","Added ");
values.put("已请求停止，Web 尚未退出；稍后可重试，未强杀容器启动器","Stop requested, but Web has not exited. Retry later; the container launcher was not forcibly killed.");
values.put("已请求停止；等待当前修复完成安全收尾，再停止后续步骤。","Stop requested. Waiting for the current repair to finish safely before stopping later steps.");
values.put("已请求取消检查，正在结束探测进程…","Check cancellation requested. Stopping the probe process…");
values.put("已读取离线包 ","Read offline archive ");
values.put("已释放的工作锁不能重新保留进程","A released task lock cannot retain another process");
values.put("带中文/空格的参数一律用 -G --data-urlencode，别手写 URL 编码。\n","For parameters containing Chinese text or spaces, use -G --data-urlencode instead of encoding the URL manually.\n");
values.put("应用归属冲突","Conflicting app ownership");
values.put("应用更新下载","App update download");
values.put("应用清单不完整，未结束任何应用","App list is incomplete; no app was stopped");
values.put("应用清单格式无法确认","App list format could not be verified");
values.put("建议：需要用户拍板用 /app/ask 而不是干等；长任务结束用 notify 或 vibrate 叫人；\n","Use /app/ask when a decision is needed, and notify or vibrate when a long task finishes.\n");
values.put("开始启动 DSH","Starting DSH");
values.put("开始安全启动：使用独立基础配置，原插件和配置保留","Starting safe mode with isolated basic settings; original plugins and settings preserved");
values.put("开机/升级自启：尝试自动开启无线调试 + 拉起设备桥","Startup after boot/update: try enabling Wireless debugging and starting the device bridge");
values.put("引号不完整","Unclosed quote");
values.put("归档与导出摘要不符","Archive and export checksums do not match");
values.put("当前界面","Current interface");
values.put("待恢复文件发生变化，请重新选择","Restore file changed. Select it again.");
values.put("待恢复文件已变化","Restore file changed");
values.put("待授权","Authorization pending");
values.put("待清理目录不属于本应用：","Cleanup directory does not belong to this app: ");
values.put("待等待的进程不能为空","Process to wait for must not be null");
values.put("快速离线安装不可用：","Fast offline installation unavailable: ");
values.put("快速维护运行时不可用","Fast maintenance runtime unavailable");
values.put("忽略过期的确认点击（epoch ","Ignored expired confirmation tap (epoch ");
values.put("恢复后已重置 3090 桥 token（老备份里带的是别的机器的）","Reset the 3090 bridge token after restoration (the old backup contained another device's token)");
values.put("恢复后重置桥 token 失败: ","Could not reset bridge token after restoration: ");
values.put("恢复完成：","Restoration complete: ");
values.put("恢复尚未提交","Restoration not committed");
values.put("恢复必须持有全局任务锁","Restoration requires the global task lock");
values.put("恢复数据事务","Data restoration transaction");
values.put("恢复设置事务写入失败","Could not write restored settings transaction");
values.put("悬浮条创建失败（权限被撤？）: ","Could not create overlay (permission may have been revoked): ");
values.put("悬浮条更新失败: ","Could not update overlay: ");
values.put("悬浮条确认显示失败: ","Could not display overlay confirmation: ");
}
private static void part18(Map<String,String> values) {
values.put("或到系统设置 → 无障碍 → DSHA 配对助手 打开。","or enable it in system Settings → Accessibility → DSHA Pairing Assistant.");
values.put("截取当前屏幕并保存为图片","Capture the current screen and save it as an image");
values.put("截屏  /app/ui/screenshot   → 存 PNG 到 Download/DSHA 并返回路径（不回 base64）\n","Screenshot  /app/ui/screenshot   → Save PNG to Download/DSHA and return its path (not base64)\n");
values.put("所选备份为空","Selected backup is empty");
values.put("所选文档不是目录","Selected document is not a directory");
values.put("手势滑动需 Android 7+（当前系统过旧）","Swipe gestures require Android 7+ (this Android version is too old)");
values.put("手势点按需 Android 7+（当前系统过旧）","Tap gestures require Android 7+ (this Android version is too old)");
values.put("手机存储","Phone storage");
values.put("打包 settings.yaml 和运行参数；原生 API Key 遵循备份密钥开关","Back up settings.yaml and runtime parameters; the app API key follows the backup-key setting");
values.put("打包产物不完整","Packaged output is incomplete");
values.put("报连不上/未配对：先看上面的 App 层接口能不能办成；确实必须 shell 才请用户到\n","If a connection or pairing error occurs, first check whether the app-level APIs above can perform the task. Only if a shell is essential, ask the user to open\n");
values.put("拒绝","Deny");
values.put("持续运行 · 后台保活已开启","Running continuously · Background keep-alive enabled");
values.put("按下系统按键 ","Press system key ");
values.put("按名称结束应用必须使用完整包名，禁止模糊匹配","Stopping an app by name requires its full package name; fuzzy matching is blocked");
values.put("按完整包名调用 am force-stop / killall / pkill -x；kill 正数 PID 会核对 UID 后按包名停止。\n","Use the full package name with am force-stop / killall / pkill -x. A positive PID with kill is checked against its UID before stopping by package name.\n");
values.put("按键  /app/ui/key?name=back  （back/home/recents/notifications/quicksettings/lock）\n","Key  /app/ui/key?name=back  (back/home/recents/notifications/quicksettings/lock)\n");
values.put("授权请求尚未完成，请重试","Authorization request is incomplete. Try again.");
values.put("排序只支持短信编号或时间","Sorting supports only SMS ID or timestamp");
values.put("排队启动","Queue startup");
values.put("接收连接失败：","Could not accept connection: ");
values.put("推文件进容器失败: ","Could not copy file into container: ");
values.put("提问期限必须大于零","Question timeout must be positive");
values.put("插件「","Plugin “");
values.put("插件任务未开始：","Plugin task did not start: ");
values.put("插件加载失败：","Plugin loading failed: ");
values.put("插件加载异常","Plugin loading error");
values.put("插件包不能超过 256 MiB","Plugin package must not exceed 256 MiB");
values.put("插件包为空","Plugin package is empty");
values.put("插件包写入容器失败","Could not write plugin package into container");
values.put("插件包取回失败","Could not retrieve plugin package");
values.put("插件包已解析，请确认作者、版本和兼容范围后安装","Plugin package inspected. Confirm its author, version and compatibility before installing.");
values.put("插件压缩包","Plugin archive");
values.put("插件压缩包 · ","Plugin archive · ");
values.put("插件安装预览已取消","Plugin installation preview canceled");
values.put("插件操作","Plugin operation");
values.put("插件操作返回了不完整的结果","Plugin operation returned an incomplete result");
values.put("插件检测完成；新检测到的插件可开启开关加入 Web，变更后重启 Web 生效","Plugin detection complete. Enable newly detected plugins to include them in the Web service, then restart it to apply.");
values.put("插件注册失败：","Plugin registration failed: ");
values.put("插件清理失败，保留环境占用：","Plugin cleanup failed; environment remains in use: ");
values.put("插件管理器","Plugin manager");
values.put("插件管理脚本执行失败: ","Plugin manager script failed: ");
values.put("插件预览标识无效","Invalid plugin preview identifier");
values.put("操作失败：","Operation failed: ");
values.put("操作已取消","Operation canceled");
values.put("数据快照","Data snapshot");
values.put("数据校验通过，正在释放旧运行环境和迁移临时文件…","Data verified. Removing the old runtime and temporary migration files…");
values.put("数据维护","Data maintenance");
values.put("文件不存在或软链接目标已失效：","File is missing or its symbolic-link target is no longer valid: ");
values.put("文件不存在：","File does not exist: ");
values.put("文件位置已改变，请刷新目录后重试","File location changed. Refresh the directory and retry.");
values.put("文件名无效","Invalid filename");
values.put("文件大小无效：","Invalid file size: ");
values.put("文件已移除","File removed");
values.put("文件接口初始化失败","File provider initialization failed");
values.put("文件接口未初始化","File provider is not initialized");
values.put("文件操作参数不完整","Incomplete file operation arguments");
values.put("文件未下载完整，请重试","File download is incomplete. Retry.");
values.put("文件资源协议适配的模块路径不安全或文件缺失","File resource protocol module path is unsafe or missing");
values.put("文件超出允许大小","File exceeds the allowed size");
values.put("文件超过允许大小","File exceeds the allowed size");
values.put("文档编号为空","Document ID is empty");
values.put("文档路径越界","Document path is outside the allowed directory");
values.put("新文件已发布，但旧副本清理失败：","New file published, but old copy cleanup failed: ");
values.put("新版 dsh 作用域目录无法读取","Could not read the new dsh scope directory");
values.put("新版 dsh 依赖目录缺失","New dsh dependency directory is missing");
values.put("新版运行时准备完成，正在保留并切换受管文件…","New runtime prepared. Preserving and switching managed files…");
values.put("新环境安装校验未通过","New environment installation validation failed");
values.put("新环境第 ","New environment step ");
values.put("新环境运行校验失败，将保留并回切原环境。\n","New environment runtime validation failed. Preserving it and restoring the original environment.\n");
values.put("新运行时缺少文件：","New runtime is missing file: ");
values.put("无 WRITE_SECURE_SETTINGS 权限，靠 Shizuku/看门狗兜底","No WRITE_SECURE_SETTINGS permission; relying on Shizuku/watchdog recovery");
values.put("无前台界面且通知权限被拒，确认必然超时拒绝：","No foreground page and notification permission denied; confirmation will time out and be denied: ");
values.put("无效日志参数","Invalid log argument");
values.put("无效日志行数","Invalid log line count");
values.put("无效的命令期限","Invalid command timeout");
values.put("无效的提问期限","Invalid question timeout");
values.put("无效的文本补丁","Invalid text patch");
values.put("无效的文档路径","Invalid document path");
values.put("无效的进程限制","Invalid process limit");
}
private static void part19(Map<String,String> values) {
values.put("无法保存任务状态，已停止操作","Could not save task state; operation stopped");
values.put("无法保持 Web 停止状态","Could not keep the Web service stopped");
values.put("无法保留/切换环境：","Could not preserve/switch environment: ");
values.put("无法保留个人数据安全副本，原环境未切换","Could not preserve personal data safety copy; original environment unchanged");
values.put("无法保留恢复前设置","Could not preserve settings before restoration");
values.put("无法保留旧 Python 文件：","Could not preserve old Python file: ");
values.put("无法写入下载文件","Could not write download file");
values.put("无法写入停止标记，尚未停止 Web","Could not write stop marker; Web has not been stopped");
values.put("无法切换运行时：","Could not switch runtime: ");
values.put("无法列出 wheel 缓存目录","Could not list the wheel cache directory");
values.put("无法列出缓存父目录","Could not list the cache parent directory");
values.put("无法创建 ADB 设置目录","Could not create ADB settings directory");
values.put("无法创建 APK wheel 临时目录","Could not create temporary APK wheel directory");
values.put("无法创建 Download/DSHA，请检查存储权限","Could not create Download/DSHA. Check storage permission.");
values.put("无法创建 pnpm 命令目录","Could not create pnpm command directory");
values.put("无法创建 wheel 解包临时目录","Could not create temporary wheel extraction directory");
values.put("无法创建 wheel 解包目录","Could not create wheel extraction directory");
values.put("无法创建下载文件","Could not create download file");
values.put("无法创建文件，请检查可用空间","Could not create file. Check available space.");
values.put("无法创建更新目录","Could not create update directory");
values.put("无法创建目录：","Could not create directory: ");
values.put("无法创建运行工具目录","Could not create runtime tools directory");
values.put("无法发布 Python 文件，旧文件已恢复：","Could not publish Python file; old file restored: ");
values.put("无法发布 Python 文件：","Could not publish Python file: ");
values.put("无法发送取消请求","Could not send cancellation request");
values.put("无法取得完整设备信息，未执行写入或停止操作","Complete device information is unavailable; no write or stop operation performed");
values.put("无法启动安装任务：","Could not start installation task: ");
values.put("无法启动进程退出监听，已保留环境保护；请结束后台进程后重启 App","Could not start process-exit monitoring. Environment protection retained; stop background processes and restart the app.");
values.put("无法回收安装进程组","Could not clean up installation process group");
values.put("无法完整读取目录","Could not read the complete directory");
values.put("无法建立切换目录","Could not create switching directory");
values.put("无法建立安装标记目录","Could not create installation-marker directory");
values.put("无法建立独立安装进程组","Could not create an isolated installation process group");
values.put("无法建立独立维护任务目录","Could not create an isolated maintenance task directory");
values.put("无法建立独立运行时暂存目录","Could not create an isolated runtime staging directory");
values.put("无法建立私有维护目录","Could not create private maintenance directory");
values.put("无法建立运行时事务","Could not create runtime transaction");
values.put("无法建立运行时维护目录","Could not create runtime maintenance directory");
values.put("无法开始诊断：","Could not start diagnostics: ");
values.put("无法打开所选文件，请重新选择位置","Could not open the selected file. Choose the location again.");
values.put("无法提交安装标记：","Could not commit installation marker: ");
values.put("无法提交维护阶段：","Could not commit maintenance stage: ");
values.put("无法提交运行时维护阶段","Could not commit runtime maintenance stage");
values.put("无法更新 Python 命令入口","Could not update Python command entry point");
values.put("无法更新 pnpm 命令入口","Could not update pnpm command entry point");
values.put("无法查询终端会话（errno=","Could not query terminal session (errno=");
values.put("无法核对路径元数据，未执行写入：","Could not verify path metadata; no write performed: ");
values.put("无法核验本应用进程（PID ","Could not verify app process (PID ");
values.put("无法核验终端后台进程","Could not verify terminal background processes");
values.put("无法核验终端独立会话，原环境保持保护","Could not verify isolated terminal session; original environment remains protected");
values.put("无法核验终端进程归属","Could not verify terminal process ownership");
values.put("无法检查文件链接","Could not inspect file link");
values.put("无法清理安装临时文件：","Could not remove temporary installation files: ");
values.put("无法清理无效下载","Could not remove invalid download");
values.put("无法清理旧 Web 身份记录","Could not remove old Web identity record");
values.put("无法清理旧文件：","Could not remove old file: ");
values.put("无法清除停止标记","Could not remove stop marker");
values.put("无法确认后台进程退出，保留环境保护：","Background process exit is unconfirmed; environment protection retained: ");
values.put("无法确认当前 Android 用户","Could not identify the current Android user");
values.put("无法确认本次终端进程身份，尚未停止","Could not verify this terminal's process identity; not stopped");
values.put("无法确认终端会话身份，原环境保持保护","Terminal session identity is unconfirmed; original environment remains protected");
values.put("无法确认终端可执行文件","Could not verify the terminal executable");
values.put("无法确认终端身份，原环境保持保护","Terminal identity is unconfirmed; original environment remains protected");
values.put("无法确认进程 UID","Could not verify process UID");
values.put("无法终止本次进程","Could not terminate this process");
values.put("无法识别 settings 参数","Unrecognized settings arguments");
values.put("无法识别应用筛选条件","Unrecognized app filter");
values.put("无法识别用户编号","Unrecognized user ID");
values.put("无法识别：支持 npm 包名、GitHub 仓库、分支/子目录、Release 下载链接或 HTTPS 压缩包直链","Unrecognized source. Use an npm package, GitHub repository, branch/subdirectory, release URL or direct HTTPS archive URL.");
values.put("无法读取安装包","Could not read APK");
values.put("无法读取待清理目录：","Could not read cleanup directory: ");
values.put("无法读取操作记录\n","Could not read operation records\n");
values.put("无法读取文件","Could not read file");
values.put("无法读取本应用进程清单，原环境保留","Could not read this app's process list; original environment preserved");
values.put("无法读取维护日志","Could not read maintenance log");
values.put("无法读取运行时维护日志","Could not read runtime maintenance log");
values.put("无法读取运行时路径状态","Could not read runtime path status");
values.put("无法连接本机 Web 服务，请确认服务仍在运行后重试","Could not connect to the local Web service. Check that it is running and retry.");
values.put("无法释放个人文件临时归档","Could not remove temporary personal-file archive");
values.put("无法隔离内置数据目录，已停止恢复","Could not isolate the bundled data directory; restoration stopped");
}
private static void part20(Map<String,String> values) {
values.put("无法隔离旧 Web 进程记录","Could not isolate old Web process record");
values.put("无法验证：Linux 环境未就绪，请先处理第 1 项","Cannot verify: Linux environment is not ready. Address item 1 first.");
values.put("无线调试似乎已关闭（失败 ","Wireless debugging appears to be off (failures: ");
values.put("无线调试连接尚未验证；请检查连接端口或重新配对。","Wireless debugging connection is not verified. Check the connection port or pair again.");
values.put("无障碍服务已连接","Accessibility service connected");
values.put("日志保存在本机，导出时隐藏常见密钥字段。","Logs stay on this device. Common secret fields are redacted on export.");
values.put("日志大小限制必须为正数","Log size limit must be positive");
values.put("旧 PID 保留位置异常","Invalid location for preserving the old PID record");
values.put("旧 PID 已失效，但本应用仍有 Web 进程运行；原环境保留","Old PID expired, but this app still has a running Web process; original environment preserved");
values.put("旧文件状态无法确认，已停止清理","Old file state is unconfirmed; cleanup stopped");
values.put("旧运行时位置不明，已保留全部现场","Old runtime location is unknown; all recovery files preserved");
values.put("显示 ","Show ");
values.put("智能体任务完成时通知","Notify when an agent task finishes");
values.put("智能体已结束任务，点击查看结果","The agent finished its task. Tap to view the result.");
values.put("智能体通过 App 发送的通知","Notifications sent by the agent through this app");
values.put("暂无 Web 运行日志。\n","No Web runtime logs yet.\n");
values.put("暂无保留的失败记录\n","No retained failure record\n");
values.put("暂无失败或操作记录\n","No failure or operation records yet\n");
values.put("更新 ADB 脚本","Update ADB scripts");
values.put("更新…","updates…");
values.put("更新候选已恢复，可重新检查或继续下载","Update candidate restored. Check again or continue downloading.");
values.put("更新地址必须使用 HTTPS","Update URL must use HTTPS");
values.put("更新清单版本不兼容","Incompatible update manifest version");
values.put("更新清单过大","Update manifest is too large");
values.put("更新运行工具失败：","Could not update runtime tools: ");
values.put("更新运行环境","Update runtime environment");
values.put("最近启动失败\n","Most recent startup failure\n");
values.put("最近失败原因：","Most recent failure: ");
values.put("最近失败阶段：","Most recent failed stage: ");
values.put("有安装、备份、恢复或维护任务正在进行","An installation, backup, restore or maintenance task is running");
values.put("服务健康检查","Service health check");
values.put("服务器返回的文件大小与清单不符","Server file size does not match the manifest");
values.put("服务器返回的续传范围与安装包不符","Server resume range does not match the APK");
values.put("服务已就绪，等待进入网页","Service ready; waiting to open the page");
values.put("服务已连接，尚未授权 DSHA。点击下方授权。","Service connected, but DSHA is not authorized. Tap Authorize below.");
values.put("服务连续三次健康检查未响应","Service failed to respond to three consecutive health checks");
values.put("未内置","Not bundled");
values.put("未启用 · 开启后可直接申请 root 授权","Disabled · Enable to request root authorization");
values.put("未在时限内发现本机端口，请确认系统配对弹窗仍打开，或手动填写端口","No local port found within the time limit. Keep the system pairing dialog open or enter the port manually.");
values.put("未就绪，请完成首次解压","Not ready. Complete initial extraction.");
values.put("未找到 su，可使用 Shizuku 或 ADB 通道","su not found. Use Shizuku or ADB.");
values.put("未校验安全备份，禁止切换环境","Safety backup is not verified; environment switching blocked");
values.put("未注明","Not specified");
values.put("未知","Unknown");
values.put("未知更新通道","Unknown update channel");
values.put("未识别","Not recognized");
values.put("未识别的 dumpsys 参数；禁止用诊断命令改设备状态","Unrecognized dumpsys arguments; diagnostic commands must not change device state");
values.put("未识别的 pm 选项","Unrecognized pm option");
values.put("未识别的文件操作参数","Unrecognized file operation argument");
values.put("未识别的文件操作选项","Unrecognized file operation option");
values.put("未通过 · ","Failed · ");
values.put("本地插件包","Local plugin package");
values.put("本次进程仍未退出，不能开始下一任务","This process has not exited; the next task cannot start");
values.put("本次进程尚未退出，正在继续回收；其他环境任务暂不可开始","This process has not exited. Cleanup continues; other environment tasks cannot start yet.");
values.put("本次进程已回收，检查未完成，请重新检查","This process was cleaned up, but the check is incomplete. Check again.");
values.put("本次进程身份已变化或不可确认，未发送信号","This process's identity changed or cannot be verified; no signal sent");
values.put("本轮鉴权地址尚未就绪，请返回启动页查看状态","The current authentication address is not ready. Return to Start to check status.");
values.put("机型：","Device: ");
values.put("条目路径冲突：","Conflicting entry path: ");
values.put("来源：","Source: ");
values.put("架构：","Architecture: ");
values.put("查询选项缺值或重复","Query option has no value or is duplicated");
values.put("标记、版本和 bash 在位","Markers, version and bash are present");
values.put("校验期间通道或候选已改变，请重试安装","The channel or candidate changed during verification. Retry installation.");
values.put("根目录及系统目录只读；禁止块设备/分区、SELinux、系统设置写入、挂载和刷机操作。\n","Root and system directories are read-only. Block devices/partitions, SELinux changes, system setting writes, mounts and firmware flashing are blocked.\n");
values.put("检查","Check");
values.put("检查 ADB 脚本","Check ADB scripts");
values.put("检查 Web 进程失败（PID ","Web process check failed (PID ");
values.put("检查全部通过，无需修复","All checks passed. No repair needed.");
values.put("检查完成，仍有步骤未通过；失败项与详细输出已保留","Checks finished, but some steps failed. Failed items and detailed output are retained.");
values.put("检查完成：Linux 环境未就绪，其余组件无法验证；现有文件已保留","Checks finished: Linux is not ready, so other components cannot be verified. Existing files are preserved.");
values.put("检查未完成：","Check incomplete: ");
values.put("检查第 ","Check step ");
values.put("检查第 1 步：Linux 解压标记、版本与 bash","Check step 1: Linux extraction marker, version and bash");
values.put("检查随包运行工具","Check bundled runtime tools");
values.put("模型执行危险操作时的确认提醒","Confirmation alerts for sensitive model actions");
values.put("模型试图在设备上执行：\n","The model wants to run on the device:\n");
values.put("模型试图执行：","The model wants to run: ");
values.put("正在下载并核对更新包…","Downloading and verifying update package…");
values.put("正在下载并解析：","Downloading and inspecting: ");
}
private static void part21(Map<String,String> values) {
values.put("正在下载，离开页面后继续","Downloading; continues when you leave this page");
values.put("正在从 APK 补齐缺少的 wheel，保留已恢复的修改版与额外文件…","Adding missing wheels from the APK while preserving restored modifications and extra files…");
values.put("正在使用兼容文件迁移，准备统计进度…","Using compatibility file migration. Preparing progress totals…");
values.put("正在使用快速文件迁移，准备统计进度…","Using fast file migration. Preparing progress totals…");
values.put("正在保护个人目录、项目文件和已登记工作区…","Protecting personal directories, project files and registered workspaces…");
values.put("正在停止 Web，等待运行队列完成…","Stopping Web and waiting for the runtime queue…");
values.put("正在准备…","Preparing…");
values.put("正在准备下载…","Preparing download…");
values.put("正在准备下载，可离开此页面","Preparing download; you may leave this page");
values.put("正在准备数据快照…","Preparing data snapshot…");
values.put("正在准备新版内置插件和界面适配…","Preparing updated bundled plugins and UI integration…");
values.put("正在准备证书与网络工具修复…\n","Preparing certificate and network-tool repair…\n");
values.put("正在创建完整安全备份（含私有配置、会话和本地插件）…","Creating a complete safety backup (private settings, conversations and local plugins)…");
values.put("正在删除 ","Deleting ");
values.put("正在取消，请等待当前提交完成或临时文件清理…","Canceling. Waiting for the current commit or temporary-file cleanup…");
values.put("正在同步 ADB 授权设置…","Syncing ADB authorization settings…");
values.put("正在回退 ","Rolling back ");
values.put("正在备份重置前的数据…","Backing up data before reset…");
values.put("正在安装已确认的插件包…","Installing the confirmed plugin package…");
values.put("正在安装离线依赖与新版 ADB 入口，最长等待 3 分钟…","Installing offline dependencies and the updated ADB entry point (up to 3 minutes)…");
values.put("正在恢复…","Restoring…");
values.put("正在恢复下载…","Resuming download…");
values.put("正在恢复个人目录与工作区，并逐文件校验…","Restoring personal directories and workspaces, with per-file verification…");
values.put("正在恢复此前启用的第三方插件…","Restoring previously enabled third-party plugins…");
values.put("正在恢复配置、会话与本地插件…","Restoring settings, conversations and local plugins…");
values.put("正在打包并保存插件…","Packaging and saving plugins…");
values.put("正在打包并校验备份…","Packaging and verifying backup…");
values.put("正在执行环境任务，完成后再启动 Web","An environment task is running. Wait before starting Web.");
values.put("正在收集并保存错误日志…","Collecting and saving error logs…");
values.put("正在暂时停用第三方插件…","Temporarily disabling third-party plugins…");
values.put("正在更新 ADB 脚本与授权设置","Updating ADB scripts and authorization settings");
values.put("正在校验所有缓存 wheel 并安装；损坏缓存会原样保留并报告…","Verifying and installing all cached wheels. Damaged caches are preserved and reported…");
values.put("正在核验包名、版本与签名…","Verifying package name, version and signature…");
values.put("正在检查","Checking ");
values.put("正在检查 ADB 脚本版本…","Checking ADB script version…");
values.put("正在检查 Ubuntu Python…","Checking Ubuntu Python…");
values.put("正在检查插件版本…","Checking plugin versions…");
values.put("正在检查离线 ADB 依赖…","Checking offline ADB dependencies…");
values.put("正在检测 Web、终端和本地安装的插件…","Detecting plugins installed through the Web UI, terminal and local files…");
values.put("正在清理插件安装预览…","Cleaning up plugin installation preview…");
values.put("正在维护环境，请完成后再启动终端或后台任务","Environment maintenance is running. Wait before starting a terminal or background task.");
values.put("正在补装 ADB 依赖","Installing missing ADB dependencies");
values.put("正在解压内置环境… ","Extracting bundled environment… ");
values.put("正在解压内置环境（首次约需几分钟，请勿退出）…","Extracting bundled environment (first use may take a few minutes; do not exit)…");
values.put("正在解压新版 dsh（保留现有 Ubuntu 与个人目录）…","Extracting updated dsh (preserving existing Ubuntu and personal directories)…");
values.put("正在解析本地插件包，安装前需确认…","Inspecting local plugin package; confirmation required before installation…");
values.put("正在读取独立副本并检查归档…","Reading an isolated copy and checking the archive…");
values.put("正在读取设备与环境信息…\n","Reading device and environment information…\n");
values.put("正在进行环境任务，完成后再停用插件。","An environment task is running. Wait before disabling plugins.");
values.put("正在验证 Node、Python、原生模块及新版 dsh…","Validating Node, Python, native modules and updated dsh…");
values.put("此系统不支持独立安装进程组","This system does not support isolated installation process groups");
values.put("此通道暂无适合当前设备的更新；当前版本码 ","This channel has no update for the current device; current build ");
values.put("没有内置离线环境包：请用完整 APK（含 offline-rootfs）安装","No bundled offline environment. Install a full APK containing offline-rootfs.");
values.put("没有可用的信任根","No trusted root certificates available");
values.put("没有可重置的配置（.env 已重写）","No configuration to reset (.env was rewritten)");
values.put("没有收到插件管理结果","No plugin manager result received");
values.put("没有未完成的环境维护。","No incomplete environment maintenance.");
values.put("注册插件","Register plugins");
values.put("深墨绿","Deep green");
values.put("深海蓝","Ocean blue");
values.put("深灰蓝","Slate blue");
values.put("深紫","Deep purple");
values.put("源文件在导出期间发生变化","Source file changed during export");
values.put("滑动  /app/ui/swipe?x1=500&y1=1500&x2=500&y2=500&ms=300\n","Swipe  /app/ui/swipe?x1=500&y1=1500&x2=500&y2=500&ms=300\n");
values.put("滑动 (","Swipe (");
values.put("滑动屏幕 (","Swipe screen (");
values.put("点击「","Tap “");
values.put("点击坐标 (","Tap coordinates (");
values.put("点按  curl -s -G 127.0.0.1:3090/app/ui/tap --data-urlencode \"text=设置\" --data-urlencode \"token=$T\"\n","Tap  curl -s -G 127.0.0.1:3090/app/ui/tap --data-urlencode \"text=Settings\" --data-urlencode \"token=$T\"\n");
values.put("点按 (","Tap (");
values.put("照原话告诉用户去哪开，不要重试 —— 重试不会让开关自己变。\n","Tell the user exactly where to enable it. Do not retry; retrying cannot turn the setting on.\n");
values.put("版本：","Version: ");
values.put("环境任务","Environment task");
values.put("环境任务正在进行，兼容重试未启动；完成后可选择 proot 再启动。","An environment task is running, so compatibility retry did not start. When it finishes, select proot and start again.");
values.put("环境任务进行中，稍后重试","Environment task running. Retry later.");
values.put("环境入口目录不能删除","Environment root directory cannot be deleted");
values.put("环境入口目录不能重命名","Environment root directory cannot be renamed");
values.put("环境准备完成，可进入主界面。","Environment ready. You can open the app.");
values.put("环境数据未完整恢复","Environment data was not fully restored");
values.put("环境更新完成，个人目录、工作区、配置、会话和插件已恢复并校验。","Environment updated. Personal directories, workspaces, settings, conversations and plugins were restored and verified.");
}
private static void part22(Map<String,String> values) {
values.put("环境未就绪","Environment not ready");
values.put("环境未就绪，请先完成安装","Environment not ready. Complete installation first.");
values.put("环境未就绪，请先完成解压 / 安装","Environment not ready. Complete extraction/installation first.");
values.put("环境未就绪，请先完成首次解压","Environment not ready. Complete initial extraction first.");
values.put("环境未就绪；保留现有文件，不自动重解压或清除，请先备份后恢复环境","Environment not ready. Existing files are preserved; no automatic re-extraction or deletion. Back up before restoring the environment.");
values.put("环境正在维护，请稍后重试","Environment maintenance is running. Retry later.");
values.put("环境维护尚未完成，请先恢复维护，再刷新或操作插件","Environment maintenance is incomplete. Resume recovery before refreshing or changing plugins.");
values.put("环境维护必须经过停止屏障与全局数据任务锁","Environment maintenance requires the stop barrier and global data-task lock");
values.put("环境解压完成，正在启动 dsh web…","Environment extracted. Starting dsh web…");
values.put("环境诊断","Environment diagnostics");
values.put("生成时间：","Generated: ");
values.put("目录位置已有其他条目，已保留：","Another entry occupies the directory path; preserved: ");
values.put("目录或特殊文件不能直接打开","Directories and special files cannot be opened directly");
values.put("目录无法读取，未执行写入：","Directory unreadable; no write performed: ");
values.put("目录是符号链接，已保留且未写入：","Directory is a symbolic link; preserved without writing: ");
values.put("目录暂时无法读取","Directory temporarily unreadable");
values.put("目录过大，无法完整核验；请缩小操作范围","Directory is too large for complete verification. Narrow the operation scope.");
values.put("目录过大，请缩小操作范围","Directory is too large. Narrow the operation scope.");
values.put("目录项目过多，请分批操作","Too many directory entries. Process them in batches.");
values.put("省电模式 · 已空闲，允许系统休眠","Power saving · Idle; Android may sleep");
values.put("省电模式 · 有任务或状态待确认，继续保活","Power saving · Task active or status unconfirmed; keeping alive");
values.put("短信只允许当前 Android 用户的 content query --uri content://sms，默认关闭；设置 → 设备能力授权可开启或撤销。\n","SMS queries only allow content query --uri content://sms for the current Android user. Off by default; enable or revoke in Device permissions.\n");
values.put("短信授权不包含其他 Android 用户或工作资料","SMS authorization does not include other Android users or work profiles");
values.put("短信授权不包含其他内容提供者或 URI 参数","SMS authorization does not include other content providers or URI parameters");
values.put("短信查询不支持此选项：","Unsupported SMS query option: ");
values.put("短信能力只允许 content query","SMS access permits only content query");
values.put("短信预授权可能返回正文及验证码；不允许发送、修改或删除，Android 仍可拒绝访问。Shizuku 不执行此敏感查询。\n","Preauthorized SMS queries may return message bodies and verification codes. Sending, editing and deleting are blocked; Android may still deny access. Shizuku does not run this sensitive query.\n");
values.put("硬链接探测失败，保留 --link2symlink: ","Hard-link probe failed; retaining --link2symlink: ");
values.put("硬链接支持=","Hard-link support=");
values.put("确认弹窗弹出失败，仍可从通知确认：","Could not show confirmation dialog; confirmation remains available from the notification: ");
values.put("确认恢复将停止 Web，并中断正在执行的任务。\n\n","Confirming restoration stops the Web service and interrupts running tasks.\n\n");
values.put("禁止变量、命令展开和转义脚本","Variables, command expansion and escaped scripts are blocked");
values.put("禁止多行脚本或控制字符","Multiline scripts and control characters are blocked");
values.put("禁止更新用户数据路径","User data paths cannot be updated");
values.put("禁止脚本、管道、重定向、变量或嵌套命令；请分条执行","Scripts, pipes, redirects, variables and nested commands are blocked. Run commands separately.");
values.put("禁止设备分区、SELinux、系统属性、挂载或刷机操作：","Partition, SELinux, system property, mount and firmware operations are blocked: ");
values.put("离线 Python 修复失败；请检查可用空间与安装包完整性","Offline Python repair failed. Check free space and APK integrity.");
values.put("离线 Python 文件已补齐，稍后验证实际运行结果","Missing offline Python files added; execution will be verified next");
values.put("离线 pnpm 修复失败，请检查可用空间","Offline pnpm repair failed. Check free space.");
values.put("离线 pnpm 入口缺失","Offline pnpm entry point is missing");
values.put("离线 pnpm 安装失败: ","Offline pnpm installation failed: ");
values.put("离线 pnpm 文件已核对，开始复验","Offline pnpm files checked. Starting revalidation.");
values.put("离线基础工具安装失败，原环境可回切：\n","Offline base-tool installation failed; the original environment can be restored:\n");
values.put("离线基础工具安装被中断","Offline base-tool installation interrupted");
values.put("离线工具临时目录已存在，已停止覆盖","Offline tool staging directory already exists; overwrite stopped");
values.put("离线环境：","Offline environment: ");
values.put("私有安全备份复制校验失败，原环境保持原位","Private safety backup copy verification failed; original environment stays in place");
values.put("稳定通道","Stable channel");
values.put("空 wheel","Empty wheel");
values.put("窗口应用: ","Window app: ");
values.put("端口 ","Port ");
values.put("端口发现失败：","Port discovery failed: ");
values.put("端口发现未启动（错误 ","Port discovery did not start (error ");
values.put("端口必须在 1—65535 之间","Port must be between 1 and 65535");
values.put("端口必须是 1—65535 的整数","Port must be an integer from 1 to 65535");
values.put("端口请输入 1—65535 的整数","Enter a port from 1 to 65535");
values.put("第 1 步检查通过","Step 1 check passed");
values.put("等待 Web 停止前必须释放归档锁","Release the archive lock before waiting for Web to stop");
values.put("等待 Web 或它启动的后台进程退出超时；原环境未移动，请结束运行任务后重试","Timed out waiting for Web or its background processes to exit. The original environment has not moved. Stop running tasks and retry.");
values.put("等待停止失败","Stop wait failed");
values.put("等待停止被中断","Stop wait interrupted");
values.put("等待鉴权链接","Wait for authentication link");
values.put("策略拦截返回 [POLICY_BLOCKED]/126；root 和旧确认开关不能放行。不可用其它解释器或 UI 绕过。\n","Policy blocks return [POLICY_BLOCKED]/126. Root and legacy confirmation switches cannot override them. Do not use another interpreter or the UI to bypass a block.\n");
values.put("筛选只支持短信数字字段、号码与 AND 条件","Filters support only numeric SMS fields, numbers and AND conditions");
values.put("签名与已安装版本不同，已阻止安装","Signature differs from the installed version; installation blocked");
values.put("系统、关键或未识别应用不可结束：","System, essential or unidentified apps cannot be stopped: ");
values.put("系统关键进程或归属不明的 PID 不可结束：","Essential system processes or PIDs with unknown ownership cannot be stopped: ");
values.put("系统已暂停长时间下载，进度已保留，请在更新页继续","Android paused the long download. Progress is saved; resume from Updates.");
values.put("系统未提供版本信息","Android did not provide version information");
values.put("系统没有端口发现服务，请手动填写端口","No port discovery service is available. Enter the port manually.");
values.put("系统设置只允许 get/list，禁止写入","System settings allow get/list only; writes are blocked");
values.put("系统：Android ","System: Android ");
values.put("纯黑","Black");
values.put("终端仍在退出，已保留原环境；请稍后重试","Terminal is still exiting. Original environment preserved; retry later.");
values.put("终端会话不能为空","Terminal session must not be null");
values.put("终端停止失败，后台任务仍保留保护","Terminal stop failed; background tasks remain protected");
values.put("终端初始化异常后仍无法确认退出，已保留环境保护","Exit after terminal initialization failure is unconfirmed; environment protection retained");
values.put("终端后台命令仍在退出，原环境保持保护；稍后可直接重试","Terminal background commands are still exiting. Original environment remains protected; retry later.");
values.put("终端后台命令尚未退出，原环境保持保护","Terminal background commands have not exited; original environment remains protected");
values.put("终端回收暂未确认，下次维护将重新核验：","Terminal cleanup is unconfirmed and will be verified during the next maintenance: ");
}
private static void part23(Map<String,String> values) {
values.put("终端组长身份已变化，停止回收","Terminal session leader identity changed; cleanup stopped");
values.put("终端解码缓冲区溢出","Terminal decoding buffer overflow");
values.put("终端读取被中断","Terminal read interrupted");
values.put("终端身份登记不能嵌套","Terminal identity capture cannot be nested");
values.put("终端进程回收失败","Terminal process cleanup failed");
values.put("终端进程身份已变化，未发送信号","Terminal process identity changed; no signal sent");
values.put("结束进程前自动刷新全量用户/系统应用清单；普通用户应用直接结束，系统应用与关键进程拦截。\n","Refresh the complete user/system app list before stopping processes. Ordinary user apps may be stopped; system apps and essential processes are protected.\n");
values.put("维护保护只能由持有线程释放","Maintenance protection can only be released by the owning thread");
values.put("维护回滚必须经过停止屏障与全局数据任务锁","Maintenance rollback requires the stop barrier and global data-task lock");
values.put("维护备份必须持有全局任务锁","Maintenance backup requires the global task lock");
values.put("维护失败且自动回切未完成；所有目录均保留。请使用「恢复中断维护」。\n","Maintenance failed and automatic rollback is incomplete. All directories are preserved. Use Resume interrupted maintenance.\n");
values.put("维护恢复必须持有全局任务锁","Maintenance recovery requires the global task lock");
values.put("维护日志不完整，已阻止覆盖环境","Maintenance log is incomplete; environment overwrite blocked");
values.put("维护未完成，原环境已保留；安全备份位置：\n","Maintenance incomplete. Original environment preserved. Safety backup location:\n");
values.put("维护未完成，后台进程尚未退出，已暂停自动回切。维护日志、旧环境和新环境均保留。","Maintenance incomplete. Background processes have not exited, so automatic rollback is paused. Maintenance records and both environments are preserved.");
values.put("维护未完成，正在回切原环境…","Maintenance incomplete. Restoring the original environment…");
values.put("维护目录不安全","Unsafe maintenance directory");
values.put("维护目录不能是外部链接","Maintenance directory must not be an external link");
values.put("维护路径不在预期私有目录：","Maintenance path is outside the expected private directory: ");
values.put("维护阶段已存在：","Maintenance stage already exists: ");
values.put("缺 ","Missing ");
values.put("缺失，可尝试修复证书与 npm","Missing; try Repair certificates & npm");
values.put("缺少 toybox 子命令","Missing toybox subcommand");
values.put("缺少个人文件迁移脚本","Personal file migration script is missing");
values.put("缺少内置离线环境包","Bundled offline environment archive is missing");
values.put("缺少备份支持脚本：","Backup support script missing: ");
values.put("缺少备份核心脚本","Backup engine script is missing");
values.put("缺少短信 URI","Missing SMS URI");
values.put("缺少进程目标","Missing process target");
values.put("网络传输中断，进度已保留，可继续下载","Network transfer interrupted. Progress is saved; resume downloading.");
values.put("网络恢复","Network restored");
values.put("网络断开，等待恢复","Network disconnected; waiting to reconnect");
values.put("网络监听注册失败: ","Could not register network listener: ");
values.put("网页已就绪","Web page ready");
values.put("网页脚本拼接优化未应用，原文件保留：","Web script bundling optimization was not applied; original file preserved: ");
values.put("网页脚本模块路径不安全，原文件保留","Web script module path is unsafe; original file preserved");
values.put("自动开无线调试失败: ","Could not enable Wireless debugging automatically: ");
values.put("自动重开无线调试后重连","Reconnect after automatically re-enabling Wireless debugging");
values.put("自动重连未成功。打开「开发者选项 → 无线调试」后会自动恢复","Automatic reconnection failed. Open Developer options → Wireless debugging to resume automatically.");
values.put("节奏：每次点按/输入后先 dump 再决定下一步，别凭记忆连点。\n","After each tap or input, dump the screen again before deciding the next step. Do not tap repeatedly from memory.\n");
values.put("补 /etc/group 失败（不影响核心功能）: ","Could not update /etc/group (core features unaffected): ");
values.put("补缺产生的未完整文件保留在 ","Incomplete files created while filling missing dependencies remain at ");
values.put("覆盖 settings.yaml 和原生运行设置，不改聊天记录和插件","Replace settings.yaml and app runtime settings; preserve conversations and plugins");
values.put("覆盖插件 profile 和插件源码，不改聊天记录和设置","Replace plugin profiles and source; preserve conversations and settings");
values.put("覆盖聊天记录、会话索引与附件，不改设置和插件","Replace conversations, session indexes and attachments; preserve settings and plugins");
values.put("覆盖配置、聊天记录、附件、插件与工作区 .env/日志","Replace settings, conversations, attachments, plugins and workspace .env/logs");
values.put("解压 Ubuntu 与 Node","Extract Ubuntu and Node");
values.put("解压 dsh 与内置依赖","Extract dsh and bundled dependencies");
values.put("解压与离线安装完成","Extraction and offline installation complete");
values.put("解压运行环境","Extract runtime environment");
values.put("触发原因：","Trigger: ");
values.put("设备 Shell 已退出","Device shell exited");
values.put("设备 Shell 未返回 Binder","Device shell returned no Binder");
values.put("设备 Shell 绑定已失效","Device shell binding expired");
values.put("设备 Shell 返回了失效的 Binder","Device shell returned an invalid Binder");
values.put("设备 Shell 连接断开","Device shell disconnected");
values.put("设备 Shell 连接超时","Device shell connection timed out");
values.put("设备命令过长","Device command is too long");
values.put("设备文件写入请走下方受保护的设备 shell；普通 Download 文件可操作，DCIM/Pictures/Android/data/obb 只读。\n","Use the protected device shell below for device file writes. Ordinary Download files are writable; DCIM/Pictures/Android/data/obb remain read-only.\n");
values.put("设备确认桥未就绪：","Device confirmation bridge is not ready: ");
values.put("设备：","Device: ");
values.put("设置 → 设备能力授权中连接可用通道，别反复试同一条命令。\n","Settings → Device permissions to connect an available channel. Do not keep retrying the same command.\n");
values.put("证书、Python、npm 与 pnpm 已修复并通过启动检查。\n","Certificates, Python, npm and pnpm repaired and startup checks passed.\n");
values.put("识别到多个链接，请每次只粘贴一个插件链接","Multiple URLs detected. Paste one plugin URL at a time.");
values.put("诊断修复","Diagnostic repair");
values.put("诊断未完成：","Diagnostics incomplete: ");
values.put("请先下载并校验安装包","Download and verify the APK first");
values.put("请先在当前通道下载并校验安装包","Download and verify the APK from the current channel first");
values.put("请先恢复中断的环境维护","Resume interrupted environment maintenance first");
values.put("请在独立数据任务线程等待 Web 停止，不能阻塞界面线程","Wait for Web to stop on a separate data-task thread; do not block the UI thread");
values.put("请填写本机无线调试页面的 IP 地址","Enter the IP address shown on this device's Wireless debugging page");
values.put("请等待后台进程退出后，再使用「恢复中断维护」。\n","Wait for background processes to exit, then use Resume interrupted maintenance.\n");
values.put("请粘贴插件链接或 owner/repo","Paste a plugin URL or owner/repo");
values.put("读取 ADB 状态","Read ADB status");
values.put("读取当前屏幕上的文字与控件","Read text and controls on the current screen");
values.put("读取日志请指定 -d 或 -t 行数","Specify -d or a -t line count when reading logs");
values.put("读取本 Android 用户的短信。\n","Query SMS messages for the current Android user.\n");
values.put("读屏  curl -s \"127.0.0.1:3090/app/ui/dump?token=$T\"\n","Read screen  curl -s \"127.0.0.1:3090/app/ui/dump?token=$T\"\n");
values.put("读配对码失败：","Could not read pairing code: ");
values.put("跳过 · ","Skipped · ");
}
private static void part24(Map<String,String> values) {
values.put("软链接循环或层级过多","Symbolic-link cycle or excessive link depth");
values.put("软链接目标超出 DSHA 目录","Symbolic-link target is outside the DSHA directory");
values.put("软链接路径越界","Symbolic-link path is outside the allowed directory");
values.put("输入  curl -s -G 127.0.0.1:3090/app/ui/input --data-urlencode \"text=内容\" --data-urlencode \"token=$T\"\n","Input  curl -s -G 127.0.0.1:3090/app/ui/input --data-urlencode \"text=content\" --data-urlencode \"token=$T\"\n");
values.put("输入适配的模块路径不安全，原文件保留","Input patch module path is unsafe; original file preserved");
values.put("迁移所需的 Python 未就绪，原环境已保留","Python required for migration is not ready; original environment preserved");
values.put("运行工具准备失败：","Runtime tools preparation failed: ");
values.put("运行方式：","Runtime mode: ");
values.put("运行日志读取失败：","Could not read runtime logs: ");
values.put("运行日志路径为符号链接，未读取。\n","Runtime log path is a symbolic link; not read.\n");
values.put("运行时事务已结束","Runtime transaction has ended");
values.put("运行时别名不在受管范围","Runtime alias is outside the managed scope");
values.put("运行时文件尚未切换完整","Runtime file switching is incomplete");
values.put("运行时更新必须持有停止屏障与数据任务锁","Runtime update requires the stop barrier and data-task lock");
values.put("运行时更新未完成，原运行时及个人数据已保留：\n","Runtime update incomplete. Original runtime and personal data are preserved:\n");
values.put("运行时更新清单无效","Invalid runtime update manifest");
values.put("运行时维护日志无效","Invalid runtime maintenance log");
values.put("运行时维护清单数量无效","Invalid runtime maintenance manifest count");
values.put("运行时维护清单无效","Invalid runtime maintenance manifest");
values.put("运行时维护目录不安全","Unsafe runtime maintenance directory");
values.put("运行时维护路径不安全：","Unsafe runtime maintenance path: ");
values.put("运行时阶段已存在：","Runtime stage already exists: ");
values.put("运行环境尚未恢复，可先在主界面查看日志与配置，再进入安装与修复页处理","Runtime recovery is incomplete. View logs and settings in the app, then continue in Install & repair.");
values.put("运行补丁失败（退出码 ","Runtime patch failed (exit code ");
values.put("这三类返回 DISABLED（用户没开该能力）或 NO_PERMISSION（没授系统权限）时，\n","When these APIs return DISABLED (feature off) or NO_PERMISSION (system permission missing),\n");
values.put("进程信息超过核验上限","Process information exceeds the verification limit");
values.put("进程命令行暂不可读","Process command line temporarily unreadable");
values.put("进程核验被中断","Process verification interrupted");
values.put("连接来自 ","Connection from ");
values.put("连续 Web 失败：","Consecutive Web failures: ");
values.put("连续失败，自动重启已暂停；点此查看恢复选项","Repeated failures. Automatic restart paused; tap for recovery options.");
values.put("退出码 ","Exit code ");
values.put("适配 dsh 运行时","Apply dsh runtime integration");
values.put("选择运行时失败，降回 proot: ","Runtime selection failed; falling back to proot: ");
values.put("选择链接安装或导入本地插件包","Install from a URL or import a local plugin package");
values.put("通过","Passed");
values.put("通过 · ","Passed · ");
values.put("通道或候选已改变，请重新检查后重试安装","Channel or candidate changed. Check again before retrying installation.");
values.put("部分内置插件待修复，请检查环境","Some bundled plugins need repair. Check the environment.");
values.put("部分完成：\n","Partially completed:\n");
values.put("部分旧环境待清理：","Some old environment files remain for cleanup: ");
values.put("配对信息已失效，请到「设备能力授权」页重新配对一次","Pairing information expired. Pair again in Device permissions.");
values.put("配对完成，等待连接验证","Pairing complete; waiting for connection verification");
values.put("配对已失效，需要重新配对","Pairing expired; pair again");
values.put("配对或连接验证未完成，请查看配对页详情","Pairing or connection verification is incomplete. See the pairing page for details.");
values.put("配对码","Pairing code");
values.put("配对页已验证设备连接","Device connection verified on the pairing page");
values.put("配置、对话、附件、插件与工作区 .env/日志，换机或重装用这个","Settings, conversations, attachments, plugins and workspace .env/logs. Use for device migration or reinstallation.");
values.put("配置已重置，对话记录已保留\n（.env 已按当前配置重写）","Settings reset; conversations preserved\n(.env rewritten from current settings)");
values.put("重命名失败，原文件已保留","Rename failed; original file preserved");
values.put("重置失败","Reset failed");
values.put("重置失败：","Reset failed: ");
values.put("重置配置","Reset settings");
values.put("重连端口 ","Reconnect port ");
values.put("鉴权成功","Authenticated");
values.put("鉴权链接已就绪，点「进入对话」即可进入 dsh","Authentication link ready. Tap Open conversation to enter dsh.");
values.put("链接实际指向受保护目录：","Link resolves to a protected directory: ");
values.put("随包证书与命令入口已核对","Bundled certificates and command entry points checked");
values.put("需要重新配对","Pair again");
values.put("非法 wheel 路径","Invalid wheel path");
values.put("预构建包损坏（文件过大 size=","Prebuilt archive is damaged (file too large; size=");
values.put("预构建包损坏（超长元数据记录 size=","Prebuilt archive is damaged (metadata record too long; size=");
values.put("预构建包损坏（非法文件条目: ","Prebuilt archive is damaged (invalid file entry: ");
values.put("预构建包被截断","Prebuilt archive is truncated");
values.put("预览通道","Preview channel");
values.put("验证 ADB 连接","Verify ADB connection");
values.put("验证通过，正在释放旧受管运行时…","Validation passed. Removing the old managed runtime…");
values.put("（light 环境光 lux / accel / gyro / magnet / pressure / proximity /\n","(light: ambient lux / accel / gyro / magnet / pressure / proximity /\n");
values.put("（剪贴板为空）","(clipboard empty)");
values.put("（来源：","(source: ");
values.put("（没有可读节点）\n","(no readable nodes)\n");
values.put("（点按查看）","(tap to view)");
values.put("（等待鉴权链接…）","(waiting for authentication link…)");
values.put("（该应用没有启动入口或未安装）","(app has no launch activity or is not installed)");
values.put("（较早输出已省略，以下为最近日志）\n","(earlier output omitted; recent logs follow)\n");
values.put("（鉴权前）","(before authentication)");
values.put("（鉴权后）","(after authentication)");
values.put("），与当前","), compared with the current ");
values.put("），可手动填写端口","), enter the port manually if needed");
values.put("），已完成的部分会保留","), completed work is preserved");
}
private static void part25(Map<String,String> values) {
values.put("），继续查找本机端口…","), continuing to search for the local port…");
values.put("），请查看上方软件源/网络输出","), check the repository/network output above");
values.put("），请查看启动日志","), check startup logs");
values.put("），请稍后重试","), try again later");
values.put("），请重新启动服务后进入","), restart the service before opening");
values.put("），请重试或重新启动服务","), retry or restart the service");
values.put("，可能被其它手势打断）",", possibly interrupted by another gesture)");
values.put("，太频繁了，隔一秒再试",", too frequent; wait one second and retry");
values.put("，完成后可重新生成报告。","; generate another report after it finishes.");
values.put("，已用 ",", used ");
values.put("，当前可用 ",", available now ");
values.put("，检查未完整执行",", checks were not fully completed");
values.put("，请稍后刷新或重试插件操作","; refresh or retry the plugin operation later");
values.put("，请稍后重试或使用发布页下载","; try later or download from the releases page");
values.put("，进度已保留，可稍后继续下载","; progress saved, resume downloading later");
values.put("：失败（退出码 ",": failed (exit code ");
values.put("：未收到结果",": no result received");
values.put("：正常",": OK");
values.put("；保存任务状态失败，下次需要重新检查","; could not save task state, check again next time");
values.put("；保留此通道上次结果，可重试检查或继续使用已下载包","; retaining this channel's previous result. Retry the check or use the downloaded package.");
values.put("；原数据已保留，完成后可手动启动 Web。","; original data preserved. Start Web manually afterward.");
values.put("；可继续下载","; download can resume");
values.put("；可重新检查","; check again");
values.put("；命令尚未发送，已保留。完成后请重试重启]\n","; command not sent and retained. Tap Retry restart after the task finishes.]\n");
values.put("；已有缓存原样保留，未用 APK 覆盖","; existing cache preserved and not overwritten by the APK");
values.put("；待发命令保留，请再次点中止重试]\n","; queued commands retained. Tap Stop again to retry.]\n");
values.put("；未发送的命令保留，重试后继续]\n","; unsent commands retained and will continue after retry.]\n");
values.put("；请先恢复中断的环境维护","; resume interrupted environment maintenance first");
values.put("；请在更新页重试","; retry on the Updates page");
values.put("；请检查执行结果。","; verify the execution result. ");
values.put("；请选择需要使用的版本","; select the version you want to use");
values.put("；请重试","; retry");
values.put("；重启 Web 后生效","; restart Web to apply");
values.put("界面语言","Interface language");
values.put("Agent 预设","Agent preset");
values.put("适配的模块路径不安全或缺失"," integration module path is unsafe or missing");
values.put("适配未应用，原文件保留："," integration was not applied; original file preserved: ");
values.put("⚙ 正在执行命令","⚙ Running command");
values.put("⚙ 正在修改文件","⚙ Editing files");
values.put("⚙ 正在读取文件","⚙ Reading files");
values.put("⚙ 正在搜索","⚙ Searching");
values.put("⚙ 正在联网查资料","⚙ Searching the web");
values.put("⚙ 正在整理任务清单","⚙ Updating the task list");
values.put("⚙ 正在派子任务","⚙ Delegating subtasks");
values.put("⚙ 正在看图","⚙ Inspecting an image");
values.put("⚙ 正在调用手机功能","⚙ Using device features");
values.put("⚙ 正在使用工具","⚙ Using a tool");
values.put("⚙ 正在使用 ","⚙ Using ");
values.put("尽可能的使dsh适配竖屏等移动端设备","Adapts dsh for portrait screens and mobile devices");
values.put("Agent 已完成一轮对话，点击查看结果","The agent completed a turn. Tap to view the result.");
values.put("DSHA · 已达到输出上限","DSHA · Output limit reached");
values.put("请查看结果，按需继续对话","Review the result and continue the conversation if needed.");
values.put("DSHA · 任务已停止","DSHA · Task stopped");
values.put("本轮任务未完成，点击查看状态","This task is incomplete. Tap to check its status.");
values.put("DSHA · 任务需要处理","DSHA · Task needs attention");
values.put("本轮任务因错误或阻塞结束，请查看对话详情","The task ended with an error or blocker. See the conversation for details.");
values.put("：",": ");
values.put("；","; ");
values.put("，",", ");
values.put("。",".");
values.put("（","(");
values.put("）",")");
values.put("「","“");
values.put("」","”");
values.put("： ",": ");
values.put("语言 · 简体中文","Language · Simplified Chinese");
values.put("暂无终端。","No terminals.");
values.put("检查启动配置和插件清单","Checking startup configuration and plugin list");
values.put("加载 DSH 和已启用插件","Loading DSH and enabled plugins");
values.put("配置文件超过 1 MiB","Configuration file exceeds 1 MiB");
values.put("dsh.profile.bundles 必须是插件名称数组","dsh.profile.bundles must be an array of plugin names");
values.put("插件清单含无效名称","The plugin list contains an invalid name");
values.put("缺少 dsh.bundle.patch 声明或补丁文件","Missing dsh.bundle.patch declaration or patch file");
values.put("未知版本","Unknown version");
values.put("读取启动恢复记录","Read startup recovery records");
values.put("启动配置快照","Startup configuration snapshot");
values.put("RUNTIME_LINKS_CACHED: 共享依赖未变化，复用已检查链接","RUNTIME_LINKS_CACHED: Shared dependencies unchanged; reusing verified links");
values.put("RUNTIME_LINKS_CHECK: 检查共享依赖链接","RUNTIME_LINKS_CHECK: Checking shared dependency links");
values.put("启动配置或插件加载失败","Startup configuration or plugin loading failed");
values.put("BUILTIN_REGISTER: 无内置插件实体，跳过","BUILTIN_REGISTER: No bundled plugin files; skipped");
}
private static void part26(Map<String,String> values) {
values.put("无效插件名","Invalid plugin name");
values.put("profile 不存在，先运行注册","Profile does not exist; register plugins first");
values.put("正在自动选择可用 Web 端口，首选端口设置保留","Selecting an available Web port; the preferred port setting is retained");
values.put("Web 进程已创建，等待系统分配端口和鉴权链接","Web process created; waiting for its assigned port and authentication link");
values.put("管理文件访问权限","Manage file access");
values.put("定位访问","Location access");
values.put("传感器访问","Sensor access");
values.put("屏幕操作","Screen control");
values.put("DeepSeek Harness 安卓启动器","DeepSeek Harness for Android");
values.put("QQ 交流群","QQ community");
values.put("正在启用 %s","Enabling %s");
values.put("正在禁用 %s","Disabling %s");
values.put("已启用 %s；重启 Web 后生效","Enabled %s; restart Web to apply");
values.put("已禁用 %s；重启 Web 后生效","Disabled %s; restart Web to apply");
values.put("正在删除 %s…","Deleting %s…");
values.put("正在回退 %s…","Rolling back %s…");
values.put("正在下载并解析：%s","Downloading and parsing: %s");
values.put("操作失败：%s","Operation failed: %s");
values.put("插件任务未开始：%s","Plugin task did not start: %s");
values.put("插件清理失败，保留环境占用：%s","Plugin cleanup failed; environment remains locked: %s");
values.put("已将 %s 个插件导出到所选位置，可在另一台 DSHA 中导入","Exported %s plugins to the selected location; import them on another DSHA device");
values.put("正在准备插件依赖：%s","Preparing plugin dependencies: %s");
values.put("正在打包：%s","Packaging: %s");
values.put("已安装 %s；重启 Web 后生效。","Installed %s; restart Web to apply.");
values.put("会话 %s","Session %s");
values.put("检查失败：%s","Check failed: %s");
values.put("下载失败：%s","Download failed: %s");
values.put("下载暂停：%s","Download paused: %s");
values.put("文件处理失败：%s","File processing failed: %s");
values.put("检测到 %s 个插件","Detected %s plugins");
values.put("正在下载插件包… %s","Downloading plugin package… %s");
values.put("环境任务进行中：%s","Environment task running: %s");
values.put("正在%s，请稍后刷新或重试插件操作","Running %s; wait before refreshing or retrying the plugin operation");
values.put("DNS 解析","DNS resolution");
values.put("自动兼容（推荐）","Automatic compatibility (recommended)");
values.put("IPv4 DNS 兼容","IPv4 DNS compatibility");
values.put("原生双栈解析","Native dual-stack resolution");
values.put("自动模式保留 IPv6，仅在 Node 双栈解析失败时尝试 IPv4。IPv4 兼容模式适用于拒绝 AAAA 查询的网络，但无法解析仅有 IPv6 的域名。保存后重新启动 Web 或新建终端生效。","Automatic mode preserves IPv6 and retries IPv4 only when Node dual-stack DNS fails. IPv4 compatibility helps networks that reject AAAA queries, but cannot resolve IPv6-only domains. Save, then restart Web or open a new terminal.");
values.put("API 密钥","API credentials");
values.put("DeepSeek API 密钥","DeepSeek API key");
values.put("Ubuntu 根文件系统","Ubuntu root filesystem");
values.put("正在读取授权状态…","Checking authorization…");
values.put("所有文件访问权限","All files access");
values.put("权限访问","Permission access");
values.put("设备命令通道","Device command channels");
values.put("插件排序","Sort plugins");
values.put("名称 A–Z","Name A–Z");
values.put("名称 Z–A","Name Z–A");
values.put("可更新优先","Updates first");
values.put("管理器已安装，服务尚未连接。点击授权重新连接；若仍未连接，请启动管理器服务，并检查隐藏模式是否允许 DSHA。","Manager installed, service not connected. Tap Authorize to reconnect. If it still fails, start the service in the manager and check whether hidden mode allows DSHA.");
values.put("保护个人数据并重建？","Protect personal data and rebuild?");
values.put("保护数据并重建","Protect data and rebuild");
values.put("将停止 Web 和终端，只备份对话、附件、配置、插件与个人项目，不打包 Ubuntu / Node 系统。数据保护失败不切换环境，重建失败保留原环境。","Stop Web and terminals, then back up conversations, attachments, configuration, plugins and personal projects only. Ubuntu / Node is excluded. Keep the original environment if protection or rebuilding fails.");
values.put("数据维护必须持有停止屏障","Data maintenance requires the barrier");
values.put("个人数据目录无效，已停止操作","Invalid personal data directory");
values.put("独立恢复工具目录无效","Invalid recovery tools path");
values.put("无法准备独立恢复工具","Cannot prepare recovery tools");
values.put("APK 缺少独立恢复所需的基础文件","Missing recovery base asset");
values.put("独立恢复工具校验失败","Recovery tools validation failed");
values.put("独立恢复必须持有维护停止屏障","Recovery requires the maintenance barrier");
values.put("数据保护失败：","Data protection failed: ");
values.put("正在选择个人目录与登记工作区","Selecting personal directories and registered workspaces");
values.put("正在保护个人文件","Protecting personal files");
values.put("正在核对源文件状态","Checking source file status");
values.put("正在校验完整安全副本","Verifying the complete data copy");
values.put("个人文件保护校验完成","Personal file backup verified");
values.put("正在逐文件校验安全副本","Verifying each file in the data copy");
values.put("正在恢复个人文件","Restoring personal files");
values.put("正在校验恢复后的文件","Verifying restored files");
values.put("正在由 Android 校验并保留重置前配置…","Android is verifying and retaining the original configuration…");
values.put("配置已重置，对话及原生凭据保留。重置前配置原件：\n%s","Configuration reset; conversations and native credentials retained. Original configuration:\n%s");
values.put("中断的配置重置已在宿主侧恢复，原件保留。","Interrupted configuration reset recovered on the host; originals retained.");
values.put("proroot 已确认退出，正在使用 proot 进行一次兼容验证…","proroot has stopped; verifying once with proot compatibility mode…");
values.put("正在确认隔离运行环境与网页连接；请保持应用在前台，可继续等待慢启动…","Verifying the isolated runtime and browser connection; keep the app in the foreground. Slow startup continues waiting…");
values.put("正在由 Android 保护应用数据与个人目录；不执行旧环境…","Android is protecting application data and personal folders without executing the old environment…");
values.put("正在恢复本机数据并逐文件校验…","Restoring local data and verifying every file…");
values.put("终端进程身份暂不可读，保留环境保护","Terminal process identity is temporarily unreadable; runtime protection remains");
values.put("API Key 暂时无法读取，请解锁设备后重试。原凭据已保留。","The API key is temporarily unavailable. Unlock the device and retry. The saved credential has been retained.");
values.put("保存 API Key 的设备密钥已失效，请重新输入。原记录未自动删除。","The device key protecting the API key has been invalidated. Enter your API key again. The original record has not been deleted.");
values.put("当前设备无法读取已保存的 API Key，请重试或重新输入。原记录已保留。","This device cannot read the saved API key. Retry or enter it again. The original record has been retained.");
}
private static void part27(Map<String,String> values) {
values.put("移除","Remove");
values.put("有其他操作正在进行，请稍后重试。","Another operation is in progress. Try again after it finishes.");
values.put("设备桥端口 3090 被占用，设备工具暂不可用；Web 可独立启动。关闭占用端口的其他实例后重试：","Device bridge port 3090 is in use. Device tools are temporarily unavailable; Web can still start. Close the other instance using this port and retry: ");
values.put("兼容运行时已通过本轮隔离试运行并启用。对话、配置和项目保持原位。","The compatible runtime passed this isolated trial and is active. Conversations, configuration and projects stayed in place.");
values.put("旧运行时身份无法确认；原件保留，按当前 APK 修复受管文件。","The old runtime identity cannot be verified. Retain originals and repair managed files from this APK.");
values.put("环境重建完成，本机数据副本和旧环境原件保留。基础界面已通过隔离验证，第三方插件在下一次正常启动时单独检查。\n","Environment rebuilt. Local data snapshots and the original environment are retained. The basic interface passed the isolated trial; third-party plugins are checked separately at the next normal start.\n");
values.put("环境重建未完成，原件及宿主数据副本已保留：\n","Environment rebuild did not complete; originals and host data snapshots were retained:\n");
values.put("正在核验受管文件…","Verifying managed files…");
values.put("中断的环境重建已在宿主侧回切，数据副本及新旧环境均保留。","Interrupted environment rebuild rolled back on the host; data snapshots and both environment trees are retained.");
values.put("配置事务已在宿主侧处理，原配置和日志继续保留。","Configuration recovery was handled on the host; original configuration and records are retained.");
values.put("中断的运行时事务已回切，个人数据保持原位。","Interrupted runtime transaction rolled back; personal data stayed in place.");
values.put("宿主数据事务已恢复一致状态，原件保留。","Host data transaction recovered; originals retained.");
values.put("运行环境缺失或需要更新，请进入安装与修复；配置安全启动不能修复系统文件。","The runtime is missing or needs an update. Open installation and repair; safe configuration cannot repair system files.");
values.put("配置修复尚未完成，请先进入启动恢复。","Configuration repair is incomplete. Open Startup Recovery first.");
values.put("本次配置快照暂不可用：","Configuration snapshot unavailable for this start: ");
values.put("首选 Web 端口已占用：","Preferred Web port is in use: ");
values.put("实际 Web 端口：","Active Web port: ");
values.put("配置已重置，对话及原生凭据保留。重置前配置原件：\n","Configuration reset; conversations and native credentials retained. Original configuration:\n");
values.put("旧状态标记已保留到私有记录中。没有配置日志可回滚，当前配置保持原样；可继续检查或修复运行环境。","The old state marker was retained privately. No configuration journal was available to roll back, so current configuration stayed unchanged. Continue inspecting or repairing the runtime.");
values.put("配置修复已完成，原配置快照已保留。可重试启动；已卸载的插件需要重新安装。","Configuration repaired; the previous configuration was saved. Retry startup. Removed plugins must be reinstalled if needed.");
values.put("插件已卸载，可重试启动：","Plugin removed. You can retry startup: ");
values.put("副本无法重新导出，请检查记录或当前作业。","The copy cannot be exported. Review its record or the current operation.");
values.put("密码没有保存在设备中，请重新输入后导出。","The password was not saved. Enter it again to export.");
values.put("已有任务或无法创建私有作业，请检查状态。","A task is already running or private storage is unavailable.");
values.put("已选择项目目录：","Selected project folders: ");
values.put("无法读取所选目录，请重新授权。","Cannot read the folder. Grant access again.");
values.put("应用数据与救援","Application data and recovery");
values.put("直接由 Android 读取数据，不要求 Ubuntu、Python、Node 或网页可用。导出使用密码加密。","Android reads the data directly. Ubuntu, Python, Node and the web page are not required. Exports are password-encrypted.");
values.put("选择数据范围","Choose data scope");
values.put("应用数据","Application data");
values.put("对话与附件","Conversations and attachments");
values.put("所选项目文件","Selected project files");
values.put("包含原生 API Key（默认不包含）","Include native API key (excluded by default)");
values.put("项目文件需单独选择目录；不会扫描整部手机。","Choose project folders explicitly; the app does not scan the whole device.");
values.put("选择项目目录","Choose project folder");
values.put("查看数据范围与位置","Review data scope and locations");
values.put("导出与恢复","Export and restore");
values.put("导出应用数据","Export application data");
values.put("只读救援导出","Read-only rescue export");
values.put("选择备份并预检恢复","Select backup and inspect restore");
values.put("重新导出已验证副本","Export a verified copy again");
values.put("保留副本与旧树管理","Manage retained copies and old trees");
values.put("取消当前作业","Cancel current operation");
values.put("恢复与维护","Recovery and maintenance");
values.put("选择已有数据目录","Choose existing data directory");
values.put("恢复中断的数据提交","Recover interrupted data commit");
values.put("将先停止写任务，再根据宿主日志恢复一致状态。无需旧 Python 或备份密码，原件将保留。","Stop writers first, then restore consistency from the host journal. The old Python and backup password are not required. Originals are retained.");
values.put("没有可自动处理的提交，或需要先检查损坏/冲突的日志。","No automatically recoverable commit, or damaged/conflicting records need review.");
values.put("回退兼容运行时","Roll back compatible runtime");
values.put("原容器数据目录","Original container data directory");
values.put("宿主持久数据目录","Persistent host data directory");
values.put("选择要使用的数据目录","Choose the data directory to use");
values.put("会先停止 Web 和终端，再选择已有目录。两份数据都保留，不合并或清空。所选目录必须存在且可读取。","Stop Web and terminals, then select an existing directory. Both data sets remain; neither is merged or cleared. The chosen directory must exist and be readable.");
values.put("正在读取私有副本记录…","Reading private copy records…");
values.put(" 份记录暂不可用，原件已保留；其余副本仍可选择。"," records are unavailable and retained; other copies can still be selected.");
values.put("还没有可重新导出的私有验证副本。","No private verified copies are available yet.");
values.put("选择已验证的加密副本","Choose a verified encrypted copy");
values.put("重新导出副本","Export the copy again");
values.put("将先重新核对私有文件的摘要，再复制到新建目标。仍使用该副本原来的备份密码；不会重新读取工作目录，也不会覆盖已有备份。","Recheck the private file checksum, then copy it to a newly created destination. It keeps its original backup password. The workspace is not read again and existing backups are preserved.");
values.put("预检保留原件","Inspect retained original");
values.put("先只读扫描所选原件并建立私有验证副本，不执行其中的程序。预检完成后还需确认目标；项目原件会恢复到新的独立目录。","Read the selected original into private verified staging without running its programs. Confirm the targets after inspection. Project originals restore into a new separate directory.");
values.put("开始预检","Inspect");
values.put("无法开始预检，请检查记录或当前任务。","Inspection could not start. Review the record or current operation.");
values.put("正在统计所选范围、大小与排除项…","Reviewing selected scope, sizes and exclusions…");
values.put(" 个文件 · 已知大小 "," files · known size ");
values.put("\n可用空间：","\nFree space: ");
values.put("\n尺寸未知的文件：","\nFiles with unknown size: ");
values.put("\n缺失或不可读取项：","\nMissing or unreadable entries: ");
values.put("\n这是读取时的预估；实际导出仍会检查变化和空间。\n","\nThese are read-time estimates; export checks changes and space again.\n");
values.put("原生设置","Native settings");
values.put(" 项 · "," items · ");
values.put("\n排除项：","\nExclusions: ");
values.put("数据范围与大小","Data scope and size");
values.put("项目文件","Project files");
values.put("待确认范围","Scope needs review");
values.put("救援不会停止当前写入，结果将标明尽力救援或部分数据。不能据此删除原件。","Rescue does not stop current writers. The result is best-effort or partial and cannot justify deleting originals.");
values.put("将停止 Web、终端和写入任务后建立快照。项目、配置与聊天都可能含敏感内容；请保存至少 12 个字符的密码。","Web, terminals and write tasks will stop before the snapshot. Projects, configuration and conversations may contain secrets. Keep a password of at least 12 characters.");
values.put("备份密码","Backup password");
values.put("再次输入","Repeat password");
values.put("救援导出","Rescue export");
}
private static void part28(Map<String,String> values) {
values.put("加密导出","Encrypted export");
values.put("至少 12 个字符，且两次输入一致","Use at least 12 characters and matching passwords");
values.put("加密备份请输入密码；旧版明文 tar.gz 可留空。先在私有目录验证，确认前不会覆盖当前数据。","Enter the encrypted backup password, or leave it empty for legacy plain tar.gz. Verification uses private staging and does not overwrite current data.");
values.put("恢复原生 API Key（默认保留本机凭据）","Restore native API key (keep local credentials by default)");
values.put("项目恢复位置（创建新的独立目录）","Project destination (creates a new separate directory)");
values.put("应用私有项目区","App-private projects");
values.put("容器主目录 /root","Container home /root");
values.put("备份预检","Inspect backup");
values.put("已有任务，完成后再试。","Another task is in progress.");
values.put("归档已通过完整预检。\n文件/目录：","Archive inspection passed.\nFiles/directories: ");
values.put("\n同名文件冲突：","\nExisting-file conflicts: ");
values.put("\n确认后将停止 Web、终端和写任务，合并所选范围并替换归档中同名文件。未提及的文件保留。插件在独立目录隔离导入，项目恢复到新的独立目录。","\nConfirmation stops Web, terminals and writers, merges selected roots and replaces matching files from the archive. Unmentioned files remain. Plugins are quarantined and projects use new folders.");
values.put("\n这是历史格式备份；摘要验证不代表来源身份认证。","\nThis is a legacy backup; checksum validation does not authenticate its sender.");
values.put("\n该来源含未确认的格式或恢复提示；不承诺可用于所有历史运行时。原件继续保留。","\nThis source has unconfirmed format or restore warnings. Compatibility with every historical runtime is not established. Originals remain retained.");
values.put("\n项目位置：","\nProject destination: ");
values.put("容器主目录的新目录","A new directory in container home");
values.put("应用私有项目区的新目录","A new directory in app-private projects");
values.put("确认恢复范围","Confirm restore scope");
values.put("确认并恢复","Confirm and restore");
values.put("预检记录不可读取，请重新选择备份。","The inspection record is unavailable. Select the backup again.");
values.put("导出完成，私有产物与目标均已校验。","Export complete; private artifact and destination verified.");
values.put("已写入，未完成目标读回校验；私有验证副本保留。","Written, but destination readback was not verified. The private verified copy is retained.");
values.put("部分救援：缺失或变化的内容已记录，不能视为完整备份。","Partial rescue: missing or changed content was recorded; this is not a complete backup.");
values.put("尽力救援完成，未承诺应用级一致性。","Best-effort rescue completed without an application-consistency guarantee.");
values.put("数据已恢复，插件、可执行配置与待确认的自定义数据已隔离保存，尚未启用。","Data restored; plugins, executable configuration and unclassified custom data are quarantined and not enabled.");
values.put("数据已恢复；运行兼容性仍需检查。","Data restored; runtime compatibility still needs verification.");
values.put("数据已保存，插件依赖有缺失或未确认项。","Data saved with missing or unverified plugin dependencies.");
values.put("中断的提交已恢复一致状态，原件保留。","The interrupted commit is consistent again; originals were retained.");
values.put("密码不匹配，或备份已损坏、被修改。当前数据保持原位。","The password does not match, or the backup is damaged or modified. Current data stayed in place.");
values.put("可用空间不足。请释放空间后重试，原件与已验证副本保留。","Not enough free space. Free up space and retry; originals and verified copies are retained.");
values.put("原设备的密钥不可用。可先不包含原生 API Key 导出其他数据，再重新填写凭据。","The original device key is unavailable. Export other data without the native API key, then re-enter the credential.");
values.put("数据访问权限不可用。请重新选择目录或授予访问权限。","Data access is unavailable. Select the folder again or restore its permission.");
values.put("此备份格式尚不支持，当前数据未覆盖。","This backup format is unsupported. Current data was not overwritten.");
values.put("数据在核验期间发生变化，已停止操作并保留原件。","Data changed during verification. The operation stopped and originals were retained.");
values.put("目标读回校验失败，私有验证副本保留，可另选位置导出。","Destination readback failed verification. The private verified copy is retained for export elsewhere.");
values.put("所选私有副本或记录未通过复核，已停止复制并保留原件。可选择另一份副本。","The private copy or its record failed verification. Copying stopped and originals were retained. Choose another copy.");
values.put("操作已取消；若已进入提交阶段，会先恢复一致状态。","Operation cancelled; a commit already in progress converges before releasing protection.");
values.put("数据操作未完成。请查看错误代码和保留记录后重试。","The data operation did not complete. Review its error code and retained records before retrying.");
values.put("错误代码：","Error code: ");
values.put("等待操作","Ready");
values.put("准备与读取数据","Preparing and reading data");
values.put("生成私有快照","Creating private snapshot");
values.put("加密备份","Encrypting backup");
values.put("验证完整性与认证","Verifying integrity and authentication");
values.put("写入所选位置","Writing to destination");
values.put("提交数据，正在保持一致性","Committing data and maintaining consistency");
values.put("准备恢复并停止写入","Preparing restore and stopping writers");
values.put("上次作业中断，原件与私有副本保留","Previous operation interrupted; originals and private copies retained");
values.put("作业未完成，原件保留","Operation incomplete; originals retained");
values.put("处理数据中","Processing data");
values.put("保留副本与旧树","Retained copies and old trees");
values.put("原件保持只读。记录中的成功状态不是本次重新验证；检查、导出与恢复分别处理。未知或受损原件继续保留。","Originals remain read-only. A recorded success is not a fresh verification. Inspect, export and restore are separate operations. Unknown or damaged originals remain retained.");
values.put("刷新清单","Refresh list");
values.put("检查所选记录","Inspect selected records");
values.put("审阅隔离插件","Review quarantined plugin");
values.put("确认启用","Confirm enable");
values.put("加密副本","Encrypted copy");
values.put("旧环境数据","Old environment data");
values.put("运行时原件","Runtime original");
values.put("恢复原件","Restore original");
values.put("插件原件","Plugin original");
values.put("隔离插件","Quarantined plugin");
values.put("原操作已提交","Original operation committed");
values.put("原操作已回切","Original operation rolled back");
values.put("需要恢复中断操作","Interrupted operation needs recovery");
values.put("已记录验证，操作前复核","Previously verified; recheck before use");
values.put("来源或记录未确认","Source or record unconfirmed");
values.put("原件保留","Original retained");
values.put("不自动删除","No automatic deletion");
values.put("暂无保留副本。","No retained copies.");
values.put("查看与操作","Details and actions");
values.put("不会执行保留目录中的程序，也不会自动删除原件。","Programs in the retained directory will not run, and originals will not be deleted automatically.");
values.put("保留记录","Retained record");
values.put("导出","Export");
values.put("审阅启用","Review activation");
values.put("预检恢复","Inspect restore");
values.put("摘要与验证记录一致","Checksum matches the verification record");
values.put("本次读取一致；没有据此确认历史格式或完整性","Reads are consistent; historical format/integrity remains unconfirmed");
values.put("插件依赖声明无效","Invalid plugin dependency declaration");
values.put("操作失败：插件依赖声明无效","Operation failed: Invalid plugin dependency declaration");
}
private static void part29(Map<String,String> values) {
values.put("安装失败：\n插件依赖声明无效","Installation failed:\nInvalid plugin dependency declaration");
values.put("部分完成：\n插件依赖声明无效","Partially completed:\nInvalid plugin dependency declaration");
values.put("插件依赖声明必须是对象","Plugin dependency declarations must be objects");
values.put("操作失败：插件依赖声明必须是对象","Operation failed: Plugin dependency declarations must be objects");
values.put("安装失败：\n插件依赖声明必须是对象","Installation failed:\nPlugin dependency declarations must be objects");
values.put("部分完成：\n插件依赖声明必须是对象","Partially completed:\nPlugin dependency declarations must be objects");
values.put("插件目录不可读取或不存在","The plugin directory is unreadable or missing");
values.put("操作失败：插件目录不可读取或不存在","Operation failed: The plugin directory is unreadable or missing");
values.put("安装失败：\n插件目录不可读取或不存在","Installation failed:\nThe plugin directory is unreadable or missing");
values.put("部分完成：\n插件目录不可读取或不存在","Partially completed:\nThe plugin directory is unreadable or missing");
values.put("插件包含不能审阅的特殊文件","The plugin contains unsupported special files");
values.put("操作失败：插件包含不能审阅的特殊文件","Operation failed: The plugin contains unsupported special files");
values.put("安装失败：\n插件包含不能审阅的特殊文件","Installation failed:\nThe plugin contains unsupported special files");
values.put("部分完成：\n插件包含不能审阅的特殊文件","Partially completed:\nThe plugin contains unsupported special files");
values.put("无法确认 pnpm 版本，未更改已安装插件","The pnpm version could not be verified. Installed plugins are unchanged");
values.put("操作失败：无法确认 pnpm 版本，未更改已安装插件","Operation failed: The pnpm version could not be verified. Installed plugins are unchanged");
values.put("安装失败：\n无法确认 pnpm 版本，未更改已安装插件","Installation failed:\nThe pnpm version could not be verified. Installed plugins are unchanged");
values.put("部分完成：\n无法确认 pnpm 版本，未更改已安装插件","Partially completed:\nThe pnpm version could not be verified. Installed plugins are unchanged");
values.put("插件依赖缓存路径异常","Unexpected plugin dependency cache path");
values.put("操作失败：插件依赖缓存路径异常","Operation failed: Unexpected plugin dependency cache path");
values.put("安装失败：\n插件依赖缓存路径异常","Installation failed:\nUnexpected plugin dependency cache path");
values.put("部分完成：\n插件依赖缓存路径异常","Partially completed:\nUnexpected plugin dependency cache path");
values.put("插件依赖安装失败：","Plugin dependency installation failed: ");
values.put("插件依赖安装失败：%s","Plugin dependency installation failed: %s");
values.put("操作失败：插件依赖安装失败：","Operation failed: Plugin dependency installation failed: ");
values.put("操作失败：插件依赖安装失败：%s","Operation failed: Plugin dependency installation failed: %s");
values.put("安装失败：\n插件依赖安装失败：","Installation failed:\nPlugin dependency installation failed: ");
values.put("安装失败：\n插件依赖安装失败：%s","Installation failed:\nPlugin dependency installation failed: %s");
values.put("部分完成：\n插件依赖安装失败：","Partially completed:\nPlugin dependency installation failed: ");
values.put("部分完成：\n插件依赖安装失败：%s","Partially completed:\nPlugin dependency installation failed: %s");
values.put("插件依赖缓存记录不一致，未重新解析依赖","Dependency cache records do not match. Dependencies were not resolved again");
values.put("操作失败：插件依赖缓存记录不一致，未重新解析依赖","Operation failed: Dependency cache records do not match. Dependencies were not resolved again");
values.put("安装失败：\n插件依赖缓存记录不一致，未重新解析依赖","Installation failed:\nDependency cache records do not match. Dependencies were not resolved again");
values.put("部分完成：\n插件依赖缓存记录不一致，未重新解析依赖","Partially completed:\nDependency cache records do not match. Dependencies were not resolved again");
values.put("插件依赖中存在不支持的特殊文件","Plugin dependencies contain unsupported special files");
values.put("操作失败：插件依赖中存在不支持的特殊文件","Operation failed: Plugin dependencies contain unsupported special files");
values.put("安装失败：\n插件依赖中存在不支持的特殊文件","Installation failed:\nPlugin dependencies contain unsupported special files");
values.put("部分完成：\n插件依赖中存在不支持的特殊文件","Partially completed:\nPlugin dependencies contain unsupported special files");
values.put("插件依赖目录超过核验上限","The dependency tree exceeds the verification limit");
values.put("操作失败：插件依赖目录超过核验上限","Operation failed: The dependency tree exceeds the verification limit");
values.put("安装失败：\n插件依赖目录超过核验上限","Installation failed:\nThe dependency tree exceeds the verification limit");
values.put("部分完成：\n插件依赖目录超过核验上限","Partially completed:\nThe dependency tree exceeds the verification limit");
values.put("插件锁文件不可读取","The plugin lockfile is unreadable");
values.put("操作失败：插件锁文件不可读取","Operation failed: The plugin lockfile is unreadable");
values.put("安装失败：\n插件锁文件不可读取","Installation failed:\nThe plugin lockfile is unreadable");
values.put("部分完成：\n插件锁文件不可读取","Partially completed:\nThe plugin lockfile is unreadable");
values.put("插件源码链接目标类型异常","Unexpected plugin source link target type");
values.put("操作失败：插件源码链接目标类型异常","Operation failed: Unexpected plugin source link target type");
values.put("安装失败：\n插件源码链接目标类型异常","Installation failed:\nUnexpected plugin source link target type");
values.put("部分完成：\n插件源码链接目标类型异常","Partially completed:\nUnexpected plugin source link target type");
values.put("插件依赖包名无效","Invalid dependency package name");
values.put("操作失败：插件依赖包名无效","Operation failed: Invalid dependency package name");
values.put("安装失败：\n插件依赖包名无效","Installation failed:\nInvalid dependency package name");
values.put("部分完成：\n插件依赖包名无效","Partially completed:\nInvalid dependency package name");
values.put("插件依赖内容与确认快照不一致","Dependency contents no longer match the confirmed snapshot");
values.put("操作失败：插件依赖内容与确认快照不一致","Operation failed: Dependency contents no longer match the confirmed snapshot");
values.put("安装失败：\n插件依赖内容与确认快照不一致","Installation failed:\nDependency contents no longer match the confirmed snapshot");
values.put("部分完成：\n插件依赖内容与确认快照不一致","Partially completed:\nDependency contents no longer match the confirmed snapshot");
values.put("插件锁文件摘要不一致","The plugin lockfile checksum does not match");
values.put("操作失败：插件锁文件摘要不一致","Operation failed: The plugin lockfile checksum does not match");
values.put("安装失败：\n插件锁文件摘要不一致","Installation failed:\nThe plugin lockfile checksum does not match");
values.put("部分完成：\n插件锁文件摘要不一致","Partially completed:\nThe plugin lockfile checksum does not match");
values.put("历史依赖信息不足，未重新解析原版本","Historical dependency information is incomplete. The old version was not resolved again");
values.put("操作失败：历史依赖信息不足，未重新解析原版本","Operation failed: Historical dependency information is incomplete. The old version was not resolved again");
values.put("安装失败：\n历史依赖信息不足，未重新解析原版本","Installation failed:\nHistorical dependency information is incomplete. The old version was not resolved again");
values.put("部分完成：\n历史依赖信息不足，未重新解析原版本","Partially completed:\nHistorical dependency information is incomplete. The old version was not resolved again");
values.put("插件锁文件包含本地来源或认证信息，不能作为可移植依赖快照","The lockfile contains local sources or authentication information and cannot be used as a portable dependency snapshot");
values.put("操作失败：插件锁文件包含本地来源或认证信息，不能作为可移植依赖快照","Operation failed: The lockfile contains local sources or authentication information and cannot be used as a portable dependency snapshot");
values.put("安装失败：\n插件锁文件包含本地来源或认证信息，不能作为可移植依赖快照","Installation failed:\nThe lockfile contains local sources or authentication information and cannot be used as a portable dependency snapshot");
values.put("部分完成：\n插件锁文件包含本地来源或认证信息，不能作为可移植依赖快照","Partially completed:\nThe lockfile contains local sources or authentication information and cannot be used as a portable dependency snapshot");
values.put("插件锁定补丁需要包含完整离线依赖","Locked plugin patches require a complete offline dependency bundle");
values.put("操作失败：插件锁定补丁需要包含完整离线依赖","Operation failed: Locked plugin patches require a complete offline dependency bundle");
values.put("安装失败：\n插件锁定补丁需要包含完整离线依赖","Installation failed:\nLocked plugin patches require a complete offline dependency bundle");
values.put("部分完成：\n插件锁定补丁需要包含完整离线依赖","Partially completed:\nLocked plugin patches require a complete offline dependency bundle");
values.put("插件 dependencies 格式无效","Invalid plugin dependencies format");
values.put("操作失败：插件 dependencies 格式无效","Operation failed: Invalid plugin dependencies format");
values.put("安装失败：\n插件 dependencies 格式无效","Installation failed:\nInvalid plugin dependencies format");
values.put("部分完成：\n插件 dependencies 格式无效","Partially completed:\nInvalid plugin dependencies format");
values.put("插件依赖记录不可读取，原版本已保留","Dependency records are unreadable. The original version is retained");
values.put("操作失败：插件依赖记录不可读取，原版本已保留","Operation failed: Dependency records are unreadable. The original version is retained");
}
private static void part30(Map<String,String> values) {
values.put("安装失败：\n插件依赖记录不可读取，原版本已保留","Installation failed:\nDependency records are unreadable. The original version is retained");
values.put("部分完成：\n插件依赖记录不可读取，原版本已保留","Partially completed:\nDependency records are unreadable. The original version is retained");
values.put("插件仍引用本地工作区依赖，请使用包含依赖的发布包","The plugin references local workspace dependencies. Use a release archive containing its dependencies");
values.put("操作失败：插件仍引用本地工作区依赖，请使用包含依赖的发布包","Operation failed: The plugin references local workspace dependencies. Use a release archive containing its dependencies");
values.put("安装失败：\n插件仍引用本地工作区依赖，请使用包含依赖的发布包","Installation failed:\nThe plugin references local workspace dependencies. Use a release archive containing its dependencies");
values.put("部分完成：\n插件仍引用本地工作区依赖，请使用包含依赖的发布包","Partially completed:\nThe plugin references local workspace dependencies. Use a release archive containing its dependencies");
values.put("插件依赖图超过审阅上限","The dependency graph exceeds the review limit");
values.put("操作失败：插件依赖图超过审阅上限","Operation failed: The dependency graph exceeds the review limit");
values.put("安装失败：\n插件依赖图超过审阅上限","Installation failed:\nThe dependency graph exceeds the review limit");
values.put("部分完成：\n插件依赖图超过审阅上限","Partially completed:\nThe dependency graph exceeds the review limit");
values.put("插件源码含未归属的外部链接，原件已保留","Plugin source contains unassigned external links. Originals are retained");
values.put("操作失败：插件源码含未归属的外部链接，原件已保留","Operation failed: Plugin source contains unassigned external links. Originals are retained");
values.put("安装失败：\n插件源码含未归属的外部链接，原件已保留","Installation failed:\nPlugin source contains unassigned external links. Originals are retained");
values.put("部分完成：\n插件源码含未归属的外部链接，原件已保留","Partially completed:\nPlugin source contains unassigned external links. Originals are retained");
values.put("冻结安装修改了锁文件，未提交插件","The frozen installation changed the lockfile. The plugin was not committed");
values.put("操作失败：冻结安装修改了锁文件，未提交插件","Operation failed: The frozen installation changed the lockfile. The plugin was not committed");
values.put("安装失败：\n冻结安装修改了锁文件，未提交插件","Installation failed:\nThe frozen installation changed the lockfile. The plugin was not committed");
values.put("部分完成：\n冻结安装修改了锁文件，未提交插件","Partially completed:\nThe frozen installation changed the lockfile. The plugin was not committed");
values.put("插件依赖链接缺失或越界","A dependency link is missing or outside its allowed root");
values.put("操作失败：插件依赖链接缺失或越界","Operation failed: A dependency link is missing or outside its allowed root");
values.put("安装失败：\n插件依赖链接缺失或越界","Installation failed:\nA dependency link is missing or outside its allowed root");
values.put("部分完成：\n插件依赖链接缺失或越界","Partially completed:\nA dependency link is missing or outside its allowed root");
values.put("保留的插件锁记录已达上限，原记录未自动删除","The retained lock record limit has been reached. Existing records were not deleted");
values.put("操作失败：保留的插件锁记录已达上限，原记录未自动删除","Operation failed: The retained lock record limit has been reached. Existing records were not deleted");
values.put("安装失败：\n保留的插件锁记录已达上限，原记录未自动删除","Installation failed:\nThe retained lock record limit has been reached. Existing records were not deleted");
values.put("部分完成：\n保留的插件锁记录已达上限，原记录未自动删除","Partially completed:\nThe retained lock record limit has been reached. Existing records were not deleted");
values.put("插件依赖快照与包声明不一致","The dependency snapshot does not match the package manifest");
values.put("操作失败：插件依赖快照与包声明不一致","Operation failed: The dependency snapshot does not match the package manifest");
values.put("安装失败：\n插件依赖快照与包声明不一致","Installation failed:\nThe dependency snapshot does not match the package manifest");
values.put("部分完成：\n插件依赖快照与包声明不一致","Partially completed:\nThe dependency snapshot does not match the package manifest");
values.put("插件已附带部分依赖，缺失项未自动覆盖，请提供完整依赖包","The archive contains partial dependencies. They were not overwritten automatically; provide a complete dependency bundle");
values.put("操作失败：插件已附带部分依赖，缺失项未自动覆盖，请提供完整依赖包","Operation failed: The archive contains partial dependencies. They were not overwritten automatically; provide a complete dependency bundle");
values.put("安装失败：\n插件已附带部分依赖，缺失项未自动覆盖，请提供完整依赖包","Installation failed:\nThe archive contains partial dependencies. They were not overwritten automatically; provide a complete dependency bundle");
values.put("部分完成：\n插件已附带部分依赖，缺失项未自动覆盖，请提供完整依赖包","Partially completed:\nThe archive contains partial dependencies. They were not overwritten automatically; provide a complete dependency bundle");
values.put("插件启用未完成，原件已保留","Plugin activation did not finish. Originals are retained");
values.put("操作失败：插件启用未完成，原件已保留","Operation failed: Plugin activation did not finish. Originals are retained");
values.put("安装失败：\n插件启用未完成，原件已保留","Installation failed:\nPlugin activation did not finish. Originals are retained");
values.put("部分完成：\n插件启用未完成，原件已保留","Partially completed:\nPlugin activation did not finish. Originals are retained");
values.put("预览内容已变化，请重新审阅","Preview contents changed. Review them again");
values.put("操作失败：预览内容已变化，请重新审阅","Operation failed: Preview contents changed. Review them again");
values.put("安装失败：\n预览内容已变化，请重新审阅","Installation failed:\nPreview contents changed. Review them again");
values.put("部分完成：\n预览内容已变化，请重新审阅","Partially completed:\nPreview contents changed. Review them again");
values.put("请审阅实际插件与依赖后明确启用","Review the actual plugin and dependencies before explicitly enabling it");
values.put("操作失败：请审阅实际插件与依赖后明确启用","Operation failed: Review the actual plugin and dependencies before explicitly enabling it");
values.put("安装失败：\n请审阅实际插件与依赖后明确启用","Installation failed:\nReview the actual plugin and dependencies before explicitly enabling it");
values.put("部分完成：\n请审阅实际插件与依赖后明确启用","Partially completed:\nReview the actual plugin and dependencies before explicitly enabling it");
values.put("插件输入在复制时变化，未进入安装","The plugin input changed during copying. Installation did not begin");
values.put("操作失败：插件输入在复制时变化，未进入安装","Operation failed: The plugin input changed during copying. Installation did not begin");
values.put("安装失败：\n插件输入在复制时变化，未进入安装","Installation failed:\nThe plugin input changed during copying. Installation did not begin");
values.put("部分完成：\n插件输入在复制时变化，未进入安装","Partially completed:\nThe plugin input changed during copying. Installation did not begin");
values.put("插件缺少运行依赖，原件保持隔离，请先修复依赖","Required dependencies are missing. The plugin remains quarantined until they are repaired");
values.put("操作失败：插件缺少运行依赖，原件保持隔离，请先修复依赖","Operation failed: Required dependencies are missing. The plugin remains quarantined until they are repaired");
values.put("安装失败：\n插件缺少运行依赖，原件保持隔离，请先修复依赖","Installation failed:\nRequired dependencies are missing. The plugin remains quarantined until they are repaired");
values.put("部分完成：\n插件缺少运行依赖，原件保持隔离，请先修复依赖","Partially completed:\nRequired dependencies are missing. The plugin remains quarantined until they are repaired");
values.put("找不到插件实体，请重新导入：","Plugin files were not found. Import the plugin again: ");
values.put("找不到插件实体，请重新导入：%s","Plugin files were not found. Import the plugin again: %s");
values.put("操作失败：找不到插件实体，请重新导入：","Operation failed: Plugin files were not found. Import the plugin again: ");
values.put("操作失败：找不到插件实体，请重新导入：%s","Operation failed: Plugin files were not found. Import the plugin again: %s");
values.put("安装失败：\n找不到插件实体，请重新导入：","Installation failed:\nPlugin files were not found. Import the plugin again: ");
values.put("安装失败：\n找不到插件实体，请重新导入：%s","Installation failed:\nPlugin files were not found. Import the plugin again: %s");
values.put("部分完成：\n找不到插件实体，请重新导入：","Partially completed:\nPlugin files were not found. Import the plugin again: ");
values.put("部分完成：\n找不到插件实体，请重新导入：%s","Partially completed:\nPlugin files were not found. Import the plugin again: %s");
values.put("内置插件由签名应用维护，不能从恢复原件覆盖","Built-in plugins are maintained by the signed application and cannot be replaced from restored originals");
values.put("操作失败：内置插件由签名应用维护，不能从恢复原件覆盖","Operation failed: Built-in plugins are maintained by the signed application and cannot be replaced from restored originals");
values.put("安装失败：\n内置插件由签名应用维护，不能从恢复原件覆盖","Installation failed:\nBuilt-in plugins are maintained by the signed application and cannot be replaced from restored originals");
values.put("部分完成：\n内置插件由签名应用维护，不能从恢复原件覆盖","Partially completed:\nBuilt-in plugins are maintained by the signed application and cannot be replaced from restored originals");
values.put("插件源码在依赖准备期间变化，未进入安装","Plugin source changed during dependency preparation. Installation did not begin");
values.put("操作失败：插件源码在依赖准备期间变化，未进入安装","Operation failed: Plugin source changed during dependency preparation. Installation did not begin");
values.put("安装失败：\n插件源码在依赖准备期间变化，未进入安装","Installation failed:\nPlugin source changed during dependency preparation. Installation did not begin");
values.put("部分完成：\n插件源码在依赖准备期间变化，未进入安装","Partially completed:\nPlugin source changed during dependency preparation. Installation did not begin");
values.put("无效插件审阅请求","Invalid plugin review request");
values.put("操作失败：无效插件审阅请求","Operation failed: Invalid plugin review request");
values.put("安装失败：\n无效插件审阅请求","Installation failed:\nInvalid plugin review request");
values.put("部分完成：\n无效插件审阅请求","Partially completed:\nInvalid plugin review request");
values.put("正在启用恢复的插件…","Enabling the restored plugin…");
values.put("操作失败：正在启用恢复的插件…","Operation failed: Enabling the restored plugin…");
values.put("安装失败：\n正在启用恢复的插件…","Installation failed:\nEnabling the restored plugin…");
values.put("部分完成：\n正在启用恢复的插件…","Partially completed:\nEnabling the restored plugin…");
values.put("请在原生插件界面确认安装，等待 Web 与终端停止后再提交","Confirm installation in the native plugin interface. Commit follows Web and terminal shutdown");
values.put("操作失败：请在原生插件界面确认安装，等待 Web 与终端停止后再提交","Operation failed: Confirm installation in the native plugin interface. Commit follows Web and terminal shutdown");
}
private static void part31(Map<String,String> values) {
values.put("安装失败：\n请在原生插件界面确认安装，等待 Web 与终端停止后再提交","Installation failed:\nConfirm installation in the native plugin interface. Commit follows Web and terminal shutdown");
values.put("部分完成：\n请在原生插件界面确认安装，等待 Web 与终端停止后再提交","Partially completed:\nConfirm installation in the native plugin interface. Commit follows Web and terminal shutdown");
values.put("已存在同名插件，当前版本保持不变，请先处理冲突","A plugin with this name already exists. The current version is unchanged; resolve the conflict first");
values.put("操作失败：已存在同名插件，当前版本保持不变，请先处理冲突","Operation failed: A plugin with this name already exists. The current version is unchanged; resolve the conflict first");
values.put("安装失败：\n已存在同名插件，当前版本保持不变，请先处理冲突","Installation failed:\nA plugin with this name already exists. The current version is unchanged; resolve the conflict first");
values.put("部分完成：\n已存在同名插件，当前版本保持不变，请先处理冲突","Partially completed:\nA plugin with this name already exists. The current version is unchanged; resolve the conflict first");
values.put("已启用已审阅插件；重启 Web 后观察实际加载结果","The reviewed plugin is enabled. Restart Web to observe its actual loading result");
values.put("操作失败：已启用已审阅插件；重启 Web 后观察实际加载结果","Operation failed: The reviewed plugin is enabled. Restart Web to observe its actual loading result");
values.put("安装失败：\n已启用已审阅插件；重启 Web 后观察实际加载结果","Installation failed:\nThe reviewed plugin is enabled. Restart Web to observe its actual loading result");
values.put("部分完成：\n已启用已审阅插件；重启 Web 后观察实际加载结果","Partially completed:\nThe reviewed plugin is enabled. Restart Web to observe its actual loading result");
values.put("隔离插件标识无效","Invalid quarantined plugin identifier");
values.put("操作失败：隔离插件标识无效","Operation failed: Invalid quarantined plugin identifier");
values.put("安装失败：\n隔离插件标识无效","Installation failed:\nInvalid quarantined plugin identifier");
values.put("部分完成：\n隔离插件标识无效","Partially completed:\nInvalid quarantined plugin identifier");
values.put("预览记录不可读取或已变化，原件已保留","The preview record is unreadable or changed. Originals are retained");
values.put("操作失败：预览记录不可读取或已变化，原件已保留","Operation failed: The preview record is unreadable or changed. Originals are retained");
values.put("安装失败：\n预览记录不可读取或已变化，原件已保留","Installation failed:\nThe preview record is unreadable or changed. Originals are retained");
values.put("部分完成：\n预览记录不可读取或已变化，原件已保留","Partially completed:\nThe preview record is unreadable or changed. Originals are retained");
values.put("恢复隔离区","Restore quarantine");
values.put("操作失败：恢复隔离区","Operation failed: Restore quarantine");
values.put("安装失败：\n恢复隔离区","Installation failed:\nRestore quarantine");
values.put("部分完成：\n恢复隔离区","Partially completed:\nRestore quarantine");
values.put("恢复的插件已启用，原隔离副本保留；重启 Web 后确认加载","The restored plugin is enabled and its original quarantine copy is retained. Restart Web to confirm loading");
values.put("操作失败：恢复的插件已启用，原隔离副本保留；重启 Web 后确认加载","Operation failed: The restored plugin is enabled and its original quarantine copy is retained. Restart Web to confirm loading");
values.put("安装失败：\n恢复的插件已启用，原隔离副本保留；重启 Web 后确认加载","Installation failed:\nThe restored plugin is enabled and its original quarantine copy is retained. Restart Web to confirm loading");
values.put("部分完成：\n恢复的插件已启用，原隔离副本保留；重启 Web 后确认加载","Partially completed:\nThe restored plugin is enabled and its original quarantine copy is retained. Restart Web to confirm loading");
values.put("请先准备正常 Web 配置，再启用恢复的插件","Prepare a normal Web profile before enabling restored plugins");
values.put("操作失败：请先准备正常 Web 配置，再启用恢复的插件","Operation failed: Prepare a normal Web profile before enabling restored plugins");
values.put("安装失败：\n请先准备正常 Web 配置，再启用恢复的插件","Installation failed:\nPrepare a normal Web profile before enabling restored plugins");
values.put("部分完成：\n请先准备正常 Web 配置，再启用恢复的插件","Partially completed:\nPrepare a normal Web profile before enabling restored plugins");
values.put("隔离插件路径越界","The quarantined plugin path is outside its allowed root");
values.put("操作失败：隔离插件路径越界","Operation failed: The quarantined plugin path is outside its allowed root");
values.put("安装失败：\n隔离插件路径越界","Installation failed:\nThe quarantined plugin path is outside its allowed root");
values.put("部分完成：\n隔离插件路径越界","Partially completed:\nThe quarantined plugin path is outside its allowed root");
values.put("插件已安装到待审阅状态，请明确启用后再重启 Web","The plugin is installed but awaiting activation review. Explicitly enable it before restarting Web");
values.put("操作失败：插件已安装到待审阅状态，请明确启用后再重启 Web","Operation failed: The plugin is installed but awaiting activation review. Explicitly enable it before restarting Web");
values.put("安装失败：\n插件已安装到待审阅状态，请明确启用后再重启 Web","Installation failed:\nThe plugin is installed but awaiting activation review. Explicitly enable it before restarting Web");
values.put("部分完成：\n插件已安装到待审阅状态，请明确启用后再重启 Web","Partially completed:\nThe plugin is installed but awaiting activation review. Explicitly enable it before restarting Web");
values.put("保留的插件预览已达上限，请先明确取消不再需要的预览","The retained preview limit has been reached. Explicitly cancel previews you no longer need");
values.put("操作失败：保留的插件预览已达上限，请先明确取消不再需要的预览","Operation failed: The retained preview limit has been reached. Explicitly cancel previews you no longer need");
values.put("安装失败：\n保留的插件预览已达上限，请先明确取消不再需要的预览","Installation failed:\nThe retained preview limit has been reached. Explicitly cancel previews you no longer need");
values.put("部分完成：\n保留的插件预览已达上限，请先明确取消不再需要的预览","Partially completed:\nThe retained preview limit has been reached. Explicitly cancel previews you no longer need");
values.put("插件依赖确认对象已变化","The confirmed dependency object has changed");
values.put("操作失败：插件依赖确认对象已变化","Operation failed: The confirmed dependency object has changed");
values.put("安装失败：\n插件依赖确认对象已变化","Installation failed:\nThe confirmed dependency object has changed");
values.put("部分完成：\n插件依赖确认对象已变化","Partially completed:\nThe confirmed dependency object has changed");
values.put("无法保留插件停用状态，请先完成恢复","The disabled plugin state could not be preserved. Complete recovery first");
values.put("操作失败：无法保留插件停用状态，请先完成恢复","Operation failed: The disabled plugin state could not be preserved. Complete recovery first");
values.put("安装失败：\n无法保留插件停用状态，请先完成恢复","Installation failed:\nThe disabled plugin state could not be preserved. Complete recovery first");
values.put("部分完成：\n无法保留插件停用状态，请先完成恢复","Partially completed:\nThe disabled plugin state could not be preserved. Complete recovery first");
values.put("插件启动记录标识无效","Invalid plugin startup record identifier");
values.put("操作失败：插件启动记录标识无效","Operation failed: Invalid plugin startup record identifier");
values.put("安装失败：\n插件启动记录标识无效","Installation failed:\nInvalid plugin startup record identifier");
values.put("部分完成：\n插件启动记录标识无效","Partially completed:\nInvalid plugin startup record identifier");
values.put("预览目录存在未确认文件，已保留原件","The preview directory contains unconfirmed files. Originals are retained");
values.put("操作失败：预览目录存在未确认文件，已保留原件","Operation failed: The preview directory contains unconfirmed files. Originals are retained");
values.put("安装失败：\n预览目录存在未确认文件，已保留原件","Installation failed:\nThe preview directory contains unconfirmed files. Originals are retained");
values.put("部分完成：\n预览目录存在未确认文件，已保留原件","Partially completed:\nThe preview directory contains unconfirmed files. Originals are retained");
values.put("插件或依赖在审阅后发生变化，请重新审阅","The plugin or dependencies changed after review. Review them again");
values.put("操作失败：插件或依赖在审阅后发生变化，请重新审阅","Operation failed: The plugin or dependencies changed after review. Review them again");
values.put("安装失败：\n插件或依赖在审阅后发生变化，请重新审阅","Installation failed:\nThe plugin or dependencies changed after review. Review them again");
values.put("部分完成：\n插件或依赖在审阅后发生变化，请重新审阅","Partially completed:\nThe plugin or dependencies changed after review. Review them again");
values.put("正在启用已审阅插件…","Enabling the reviewed plugin…");
values.put("操作失败：正在启用已审阅插件…","Operation failed: Enabling the reviewed plugin…");
values.put("安装失败：\n正在启用已审阅插件…","Installation failed:\nEnabling the reviewed plugin…");
values.put("部分完成：\n正在启用已审阅插件…","Partially completed:\nEnabling the reviewed plugin…");
values.put("安装确认对象已变化，请重新审阅","The installation confirmation object changed. Review it again");
values.put("操作失败：安装确认对象已变化，请重新审阅","Operation failed: The installation confirmation object changed. Review it again");
values.put("安装失败：\n安装确认对象已变化，请重新审阅","Installation failed:\nThe installation confirmation object changed. Review it again");
values.put("部分完成：\n安装确认对象已变化，请重新审阅","Partially completed:\nThe installation confirmation object changed. Review it again");
values.put("插件加载状态记录无效，原记录已保留","The plugin loading record is invalid. The original record is retained");
values.put("操作失败：插件加载状态记录无效，原记录已保留","Operation failed: The plugin loading record is invalid. The original record is retained");
values.put("安装失败：\n插件加载状态记录无效，原记录已保留","Installation failed:\nThe plugin loading record is invalid. The original record is retained");
values.put("部分完成：\n插件加载状态记录无效，原记录已保留","Partially completed:\nThe plugin loading record is invalid. The original record is retained");
values.put("插件加载状态记录已达上限，原记录已保留","The plugin loading record limit has been reached. Existing records are retained");
values.put("操作失败：插件加载状态记录已达上限，原记录已保留","Operation failed: The plugin loading record limit has been reached. Existing records are retained");
values.put("安装失败：\n插件加载状态记录已达上限，原记录已保留","Installation failed:\nThe plugin loading record limit has been reached. Existing records are retained");
values.put("部分完成：\n插件加载状态记录已达上限，原记录已保留","Partially completed:\nThe plugin loading record limit has been reached. Existing records are retained");
values.put("插件目标在审阅后出现，当前内容未修改","A plugin target appeared after review. Current contents are unchanged");
values.put("操作失败：插件目标在审阅后出现，当前内容未修改","Operation failed: A plugin target appeared after review. Current contents are unchanged");
}
private static void part32(Map<String,String> values) {
values.put("安装失败：\n插件目标在审阅后出现，当前内容未修改","Installation failed:\nA plugin target appeared after review. Current contents are unchanged");
values.put("部分完成：\n插件目标在审阅后出现，当前内容未修改","Partially completed:\nA plugin target appeared after review. Current contents are unchanged");
values.put("安装预览缺少冻结依赖，请重新解析","The preview lacks frozen dependencies. Prepare it again");
values.put("操作失败：安装预览缺少冻结依赖，请重新解析","Operation failed: The preview lacks frozen dependencies. Prepare it again");
values.put("安装失败：\n安装预览缺少冻结依赖，请重新解析","Installation failed:\nThe preview lacks frozen dependencies. Prepare it again");
values.put("部分完成：\n安装预览缺少冻结依赖，请重新解析","Partially completed:\nThe preview lacks frozen dependencies. Prepare it again");
values.put("插件加载状态已更新","Plugin loading state updated");
values.put("操作失败：插件加载状态已更新","Operation failed: Plugin loading state updated");
values.put("安装失败：\n插件加载状态已更新","Installation failed:\nPlugin loading state updated");
values.put("部分完成：\n插件加载状态已更新","Partially completed:\nPlugin loading state updated");
values.put("插件恢复授权标识无效","Invalid plugin recovery authorization identifier");
values.put("操作失败：插件恢复授权标识无效","Operation failed: Invalid plugin recovery authorization identifier");
values.put("安装失败：\n插件恢复授权标识无效","Installation failed:\nInvalid plugin recovery authorization identifier");
values.put("部分完成：\n插件恢复授权标识无效","Partially completed:\nInvalid plugin recovery authorization identifier");
values.put("插件来源记录异常，原件已保留","Unexpected plugin source records. Originals are retained");
values.put("操作失败：插件来源记录异常，原件已保留","Operation failed: Unexpected plugin source records. Originals are retained");
values.put("安装失败：\n插件来源记录异常，原件已保留","Installation failed:\nUnexpected plugin source records. Originals are retained");
values.put("部分完成：\n插件来源记录异常，原件已保留","Partially completed:\nUnexpected plugin source records. Originals are retained");
values.put("插件必须先完成静态预览并确认，不能直接安装","A static preview and confirmation are required before plugin installation");
values.put("操作失败：插件必须先完成静态预览并确认，不能直接安装","Operation failed: A static preview and confirmation are required before plugin installation");
values.put("安装失败：\n插件必须先完成静态预览并确认，不能直接安装","Installation failed:\nA static preview and confirmation are required before plugin installation");
values.put("部分完成：\n插件必须先完成静态预览并确认，不能直接安装","Partially completed:\nA static preview and confirmation are required before plugin installation");
values.put("插件包已生成；凭据配置未导出，原生锁文件保留，导入时重新核对内容","Plugin archive created. Credential configuration was excluded; native lockfiles are retained and contents will be checked again on import");
values.put("操作失败：插件包已生成；凭据配置未导出，原生锁文件保留，导入时重新核对内容","Operation failed: Plugin archive created. Credential configuration was excluded; native lockfiles are retained and contents will be checked again on import");
values.put("安装失败：\n插件包已生成；凭据配置未导出，原生锁文件保留，导入时重新核对内容","Installation failed:\nPlugin archive created. Credential configuration was excluded; native lockfiles are retained and contents will be checked again on import");
values.put("部分完成：\n插件包已生成；凭据配置未导出，原生锁文件保留，导入时重新核对内容","Partially completed:\nPlugin archive created. Credential configuration was excluded; native lockfiles are retained and contents will be checked again on import");
values.put("中断的插件操作已恢复，原件已保留","Interrupted plugin operations recovered. Originals are retained");
values.put("操作失败：中断的插件操作已恢复，原件已保留","Operation failed: Interrupted plugin operations recovered. Originals are retained");
values.put("安装失败：\n中断的插件操作已恢复，原件已保留","Installation failed:\nInterrupted plugin operations recovered. Originals are retained");
values.put("部分完成：\n中断的插件操作已恢复，原件已保留","Partially completed:\nInterrupted plugin operations recovered. Originals are retained");
values.put("插件恢复必须从原生维护入口进行","Plugin recovery must use the native maintenance entry");
values.put("操作失败：插件恢复必须从原生维护入口进行","Operation failed: Plugin recovery must use the native maintenance entry");
values.put("安装失败：\n插件恢复必须从原生维护入口进行","Installation failed:\nPlugin recovery must use the native maintenance entry");
values.put("部分完成：\n插件恢复必须从原生维护入口进行","Partially completed:\nPlugin recovery must use the native maintenance entry");
values.put("插件停用标记类型异常，原件已保留","Unexpected disabled-marker type. Originals are retained");
values.put("操作失败：插件停用标记类型异常，原件已保留","Operation failed: Unexpected disabled-marker type. Originals are retained");
values.put("安装失败：\n插件停用标记类型异常，原件已保留","Installation failed:\nUnexpected disabled-marker type. Originals are retained");
values.put("部分完成：\n插件停用标记类型异常，原件已保留","Partially completed:\nUnexpected disabled-marker type. Originals are retained");
values.put("插件事务配置类型或大小异常","Unexpected plugin transaction configuration type or size");
values.put("操作失败：插件事务配置类型或大小异常","Operation failed: Unexpected plugin transaction configuration type or size");
values.put("安装失败：\n插件事务配置类型或大小异常","Installation failed:\nUnexpected plugin transaction configuration type or size");
values.put("部分完成：\n插件事务配置类型或大小异常","Partially completed:\nUnexpected plugin transaction configuration type or size");
values.put("插件事务包名无效","Invalid package name in the plugin transaction");
values.put("操作失败：插件事务包名无效","Operation failed: Invalid package name in the plugin transaction");
values.put("安装失败：\n插件事务包名无效","Installation failed:\nInvalid package name in the plugin transaction");
values.put("部分完成：\n插件事务包名无效","Partially completed:\nInvalid package name in the plugin transaction");
values.put("插件事务原件摘要不一致","Plugin transaction original checksums do not match");
values.put("操作失败：插件事务原件摘要不一致","Operation failed: Plugin transaction original checksums do not match");
values.put("安装失败：\n插件事务原件摘要不一致","Installation failed:\nPlugin transaction original checksums do not match");
values.put("部分完成：\n插件事务原件摘要不一致","Partially completed:\nPlugin transaction original checksums do not match");
values.put("插件历史在中断后变化，全部现场保留","Plugin history changed after interruption. All evidence is retained");
values.put("操作失败：插件历史在中断后变化，全部现场保留","Operation failed: Plugin history changed after interruption. All evidence is retained");
values.put("安装失败：\n插件历史在中断后变化，全部现场保留","Installation failed:\nPlugin history changed after interruption. All evidence is retained");
values.put("部分完成：\n插件历史在中断后变化，全部现场保留","Partially completed:\nPlugin history changed after interruption. All evidence is retained");
values.put("无法确认插件原件，已保留全部现场","The original plugin could not be verified. All evidence is retained");
values.put("操作失败：无法确认插件原件，已保留全部现场","Operation failed: The original plugin could not be verified. All evidence is retained");
values.put("安装失败：\n无法确认插件原件，已保留全部现场","Installation failed:\nThe original plugin could not be verified. All evidence is retained");
values.put("部分完成：\n无法确认插件原件，已保留全部现场","Partially completed:\nThe original plugin could not be verified. All evidence is retained");
values.put("插件事务目录映射无效","Invalid plugin transaction directory mapping");
values.put("操作失败：插件事务目录映射无效","Operation failed: Invalid plugin transaction directory mapping");
values.put("安装失败：\n插件事务目录映射无效","Installation failed:\nInvalid plugin transaction directory mapping");
values.put("部分完成：\n插件事务目录映射无效","Partially completed:\nInvalid plugin transaction directory mapping");
values.put("插件历史原件已变化，全部现场保留","Historical plugin originals changed. All evidence is retained");
values.put("操作失败：插件历史原件已变化，全部现场保留","Operation failed: Historical plugin originals changed. All evidence is retained");
values.put("安装失败：\n插件历史原件已变化，全部现场保留","Installation failed:\nHistorical plugin originals changed. All evidence is retained");
values.put("部分完成：\n插件历史原件已变化，全部现场保留","Partially completed:\nHistorical plugin originals changed. All evidence is retained");
values.put("插件事务标识无效","Invalid plugin transaction identifier");
values.put("操作失败：插件事务标识无效","Operation failed: Invalid plugin transaction identifier");
values.put("安装失败：\n插件事务标识无效","Installation failed:\nInvalid plugin transaction identifier");
values.put("部分完成：\n插件事务标识无效","Partially completed:\nInvalid plugin transaction identifier");
values.put("插件事务标记无效，原件已保留","Invalid plugin transaction marker. Originals are retained");
values.put("操作失败：插件事务标记无效，原件已保留","Operation failed: Invalid plugin transaction marker. Originals are retained");
values.put("安装失败：\n插件事务标记无效，原件已保留","Installation failed:\nInvalid plugin transaction marker. Originals are retained");
values.put("部分完成：\n插件事务标记无效，原件已保留","Partially completed:\nInvalid plugin transaction marker. Originals are retained");
values.put("插件目标类型在中断后变化，原件已保留","The plugin target type changed after interruption. Originals are retained");
values.put("操作失败：插件目标类型在中断后变化，原件已保留","Operation failed: The plugin target type changed after interruption. Originals are retained");
values.put("安装失败：\n插件目标类型在中断后变化，原件已保留","Installation failed:\nThe plugin target type changed after interruption. Originals are retained");
values.put("部分完成：\n插件目标类型在中断后变化，原件已保留","Partially completed:\nThe plugin target type changed after interruption. Originals are retained");
values.put("插件目标变为链接，原件已保留","The plugin target became a link. Originals are retained");
values.put("操作失败：插件目标变为链接，原件已保留","Operation failed: The plugin target became a link. Originals are retained");
}
private static void part33(Map<String,String> values) {
values.put("安装失败：\n插件目标变为链接，原件已保留","Installation failed:\nThe plugin target became a link. Originals are retained");
values.put("部分完成：\n插件目标变为链接，原件已保留","Partially completed:\nThe plugin target became a link. Originals are retained");
values.put("插件在中断后被修改，未覆盖新内容","The plugin changed after interruption. New contents were not overwritten");
values.put("操作失败：插件在中断后被修改，未覆盖新内容","Operation failed: The plugin changed after interruption. New contents were not overwritten");
values.put("安装失败：\n插件在中断后被修改，未覆盖新内容","Installation failed:\nThe plugin changed after interruption. New contents were not overwritten");
values.put("部分完成：\n插件在中断后被修改，未覆盖新内容","Partially completed:\nThe plugin changed after interruption. New contents were not overwritten");
values.put("插件链接在中断后变化，未覆盖新内容","The plugin link changed after interruption. New contents were not overwritten");
values.put("操作失败：插件链接在中断后变化，未覆盖新内容","Operation failed: The plugin link changed after interruption. New contents were not overwritten");
values.put("安装失败：\n插件链接在中断后变化，未覆盖新内容","Installation failed:\nThe plugin link changed after interruption. New contents were not overwritten");
values.put("部分完成：\n插件链接在中断后变化，未覆盖新内容","Partially completed:\nThe plugin link changed after interruption. New contents were not overwritten");
values.put("插件事务目录越界","The plugin transaction directory is outside its allowed root");
values.put("操作失败：插件事务目录越界","Operation failed: The plugin transaction directory is outside its allowed root");
values.put("安装失败：\n插件事务目录越界","Installation failed:\nThe plugin transaction directory is outside its allowed root");
values.put("部分完成：\n插件事务目录越界","Partially completed:\nThe plugin transaction directory is outside its allowed root");
values.put("插件事务配置映射无效","Invalid plugin transaction configuration mapping");
values.put("操作失败：插件事务配置映射无效","Operation failed: Invalid plugin transaction configuration mapping");
values.put("安装失败：\n插件事务配置映射无效","Installation failed:\nInvalid plugin transaction configuration mapping");
values.put("部分完成：\n插件事务配置映射无效","Partially completed:\nInvalid plugin transaction configuration mapping");
values.put("保留的插件事务超过上限","The retained plugin transaction limit was exceeded");
values.put("操作失败：保留的插件事务超过上限","Operation failed: The retained plugin transaction limit was exceeded");
values.put("安装失败：\n保留的插件事务超过上限","Installation failed:\nThe retained plugin transaction limit was exceeded");
values.put("部分完成：\n保留的插件事务超过上限","Partially completed:\nThe retained plugin transaction limit was exceeded");
values.put("插件失败候选已存在，原件已保留","A failed plugin candidate already exists. Originals are retained");
values.put("操作失败：插件失败候选已存在，原件已保留","Operation failed: A failed plugin candidate already exists. Originals are retained");
values.put("安装失败：\n插件失败候选已存在，原件已保留","Installation failed:\nA failed plugin candidate already exists. Originals are retained");
values.put("部分完成：\n插件失败候选已存在，原件已保留","Partially completed:\nA failed plugin candidate already exists. Originals are retained");
values.put("插件配置在中断后变化，未覆盖新内容","Plugin configuration changed after interruption. New contents were not overwritten");
values.put("操作失败：插件配置在中断后变化，未覆盖新内容","Operation failed: Plugin configuration changed after interruption. New contents were not overwritten");
values.put("安装失败：\n插件配置在中断后变化，未覆盖新内容","Installation failed:\nPlugin configuration changed after interruption. New contents were not overwritten");
values.put("部分完成：\n插件配置在中断后变化，未覆盖新内容","Partially completed:\nPlugin configuration changed after interruption. New contents were not overwritten");
values.put("存在中断的插件事务，请先恢复","An interrupted plugin transaction requires recovery first");
values.put("操作失败：存在中断的插件事务，请先恢复","Operation failed: An interrupted plugin transaction requires recovery first");
values.put("安装失败：\n存在中断的插件事务，请先恢复","Installation failed:\nAn interrupted plugin transaction requires recovery first");
values.put("部分完成：\n存在中断的插件事务，请先恢复","Partially completed:\nAn interrupted plugin transaction requires recovery first");
values.put("插件事务链接已被实体替换，原件已保留","A plugin transaction link was replaced by a real object. Originals are retained");
values.put("操作失败：插件事务链接已被实体替换，原件已保留","Operation failed: A plugin transaction link was replaced by a real object. Originals are retained");
values.put("安装失败：\n插件事务链接已被实体替换，原件已保留","Installation failed:\nA plugin transaction link was replaced by a real object. Originals are retained");
values.put("部分完成：\n插件事务链接已被实体替换，原件已保留","Partially completed:\nA plugin transaction link was replaced by a real object. Originals are retained");
values.put("保留的插件事务已达上限，原件未自动删除","The retained plugin transaction limit has been reached. Originals were not deleted automatically");
values.put("操作失败：保留的插件事务已达上限，原件未自动删除","Operation failed: The retained plugin transaction limit has been reached. Originals were not deleted automatically");
values.put("安装失败：\n保留的插件事务已达上限，原件未自动删除","Installation failed:\nThe retained plugin transaction limit has been reached. Originals were not deleted automatically");
values.put("部分完成：\n保留的插件事务已达上限，原件未自动删除","Partially completed:\nThe retained plugin transaction limit has been reached. Originals were not deleted automatically");
values.put("插件事务记录类型异常","Unexpected plugin transaction record type");
values.put("操作失败：插件事务记录类型异常","Operation failed: Unexpected plugin transaction record type");
values.put("安装失败：\n插件事务记录类型异常","Installation failed:\nUnexpected plugin transaction record type");
values.put("部分完成：\n插件事务记录类型异常","Partially completed:\nUnexpected plugin transaction record type");
values.put("插件历史目录类型异常，原件已保留","Unexpected plugin history directory type. Originals are retained");
values.put("操作失败：插件历史目录类型异常，原件已保留","Operation failed: Unexpected plugin history directory type. Originals are retained");
values.put("安装失败：\n插件历史目录类型异常，原件已保留","Installation failed:\nUnexpected plugin history directory type. Originals are retained");
values.put("部分完成：\n插件历史目录类型异常，原件已保留","Partially completed:\nUnexpected plugin history directory type. Originals are retained");
values.put("插件配置在提交期间变化，原件已保留","Plugin configuration changed during commit. Originals are retained");
values.put("操作失败：插件配置在提交期间变化，原件已保留","Operation failed: Plugin configuration changed during commit. Originals are retained");
values.put("安装失败：\n插件配置在提交期间变化，原件已保留","Installation failed:\nPlugin configuration changed during commit. Originals are retained");
values.put("部分完成：\n插件配置在提交期间变化，原件已保留","Partially completed:\nPlugin configuration changed during commit. Originals are retained");
values.put("插件事务目录无效","Invalid plugin transaction directory");
values.put("操作失败：插件事务目录无效","Operation failed: Invalid plugin transaction directory");
values.put("安装失败：\n插件事务目录无效","Installation failed:\nInvalid plugin transaction directory");
values.put("部分完成：\n插件事务目录无效","Partially completed:\nInvalid plugin transaction directory");
values.put("插件事务暂存文件已变化，原件已保留","Plugin transaction staging changed. Originals are retained");
values.put("操作失败：插件事务暂存文件已变化，原件已保留","Operation failed: Plugin transaction staging changed. Originals are retained");
values.put("安装失败：\n插件事务暂存文件已变化，原件已保留","Installation failed:\nPlugin transaction staging changed. Originals are retained");
values.put("部分完成：\n插件事务暂存文件已变化，原件已保留","Partially completed:\nPlugin transaction staging changed. Originals are retained");
values.put("插件事务记录无效，原件已保留","Invalid plugin transaction record. Originals are retained");
values.put("操作失败：插件事务记录无效，原件已保留","Operation failed: Invalid plugin transaction record. Originals are retained");
values.put("安装失败：\n插件事务记录无效，原件已保留","Installation failed:\nInvalid plugin transaction record. Originals are retained");
values.put("部分完成：\n插件事务记录无效，原件已保留","Partially completed:\nInvalid plugin transaction record. Originals are retained");
values.put("BUILTIN_REGISTER_FAIL: 请在原生插件界面审阅并确认启用","BUILTIN_REGISTER_FAIL: Review and confirm activation in the native plugin interface");
values.put("操作失败：BUILTIN_REGISTER_FAIL: 请在原生插件界面审阅并确认启用","Operation failed: BUILTIN_REGISTER_FAIL: Review and confirm activation in the native plugin interface");
values.put("安装失败：\nBUILTIN_REGISTER_FAIL: 请在原生插件界面审阅并确认启用","Installation failed:\nBUILTIN_REGISTER_FAIL: Review and confirm activation in the native plugin interface");
values.put("部分完成：\nBUILTIN_REGISTER_FAIL: 请在原生插件界面审阅并确认启用","Partially completed:\nBUILTIN_REGISTER_FAIL: Review and confirm activation in the native plugin interface");
values.put("中断的插件操作已恢复，旧版本、依赖与失败候选均保留。","Interrupted plugin operations recovered. Previous versions, dependencies and failed candidates are retained.");
values.put("操作失败：中断的插件操作已恢复，旧版本、依赖与失败候选均保留。","Operation failed: Interrupted plugin operations recovered. Previous versions, dependencies and failed candidates are retained.");
values.put("安装失败：\n中断的插件操作已恢复，旧版本、依赖与失败候选均保留。","Installation failed:\nInterrupted plugin operations recovered. Previous versions, dependencies and failed candidates are retained.");
values.put("部分完成：\n中断的插件操作已恢复，旧版本、依赖与失败候选均保留。","Partially completed:\nInterrupted plugin operations recovered. Previous versions, dependencies and failed candidates are retained.");
values.put("插件加载确认","Plugin loading confirmation");
values.put("操作失败：插件加载确认","Operation failed: Plugin loading confirmation");
values.put("安装失败：\n插件加载确认","Installation failed:\nPlugin loading confirmation");
values.put("部分完成：\n插件加载确认","Partially completed:\nPlugin loading confirmation");
values.put("\n这些是静态与完整性检查，不是安全认证。插件启用后在 DSHA 的权限范围内运行，暂存目录不提供权限隔离。","\nThese are static and integrity checks, not security certification. Enabled plugins run with DSHA permissions; staging directories do not provide permission isolation.");
values.put("操作失败：\n这些是静态与完整性检查，不是安全认证。插件启用后在 DSHA 的权限范围内运行，暂存目录不提供权限隔离。","Operation failed: \nThese are static and integrity checks, not security certification. Enabled plugins run with DSHA permissions; staging directories do not provide permission isolation.");
}
private static void part34(Map<String,String> values) {
values.put("安装失败：\n\n这些是静态与完整性检查，不是安全认证。插件启用后在 DSHA 的权限范围内运行，暂存目录不提供权限隔离。","Installation failed:\n\nThese are static and integrity checks, not security certification. Enabled plugins run with DSHA permissions; staging directories do not provide permission isolation.");
values.put("部分完成：\n\n这些是静态与完整性检查，不是安全认证。插件启用后在 DSHA 的权限范围内运行，暂存目录不提供权限隔离。","Partially completed:\n\nThese are static and integrity checks, not security certification. Enabled plugins run with DSHA permissions; staging directories do not provide permission isolation.");
values.put("历史依赖信息不足；本次核对现存源码和实际依赖，不重新解析旧版本。\n","Historical dependency information is incomplete. This review checks existing source and actual dependencies without resolving the old version again.\n");
values.put("操作失败：历史依赖信息不足；本次核对现存源码和实际依赖，不重新解析旧版本。\n","Operation failed: Historical dependency information is incomplete. This review checks existing source and actual dependencies without resolving the old version again.\n");
values.put("安装失败：\n历史依赖信息不足；本次核对现存源码和实际依赖，不重新解析旧版本。\n","Installation failed:\nHistorical dependency information is incomplete. This review checks existing source and actual dependencies without resolving the old version again.\n");
values.put("部分完成：\n历史依赖信息不足；本次核对现存源码和实际依赖，不重新解析旧版本。\n","Partially completed:\nHistorical dependency information is incomplete. This review checks existing source and actual dependencies without resolving the old version again.\n");
values.put("缺失依赖：","Missing dependencies: ");
values.put("缺失依赖：%s","Missing dependencies: %s");
values.put("操作失败：缺失依赖：","Operation failed: Missing dependencies: ");
values.put("操作失败：缺失依赖：%s","Operation failed: Missing dependencies: %s");
values.put("安装失败：\n缺失依赖：","Installation failed:\nMissing dependencies: ");
values.put("安装失败：\n缺失依赖：%s","Installation failed:\nMissing dependencies: %s");
values.put("部分完成：\n缺失依赖：","Partially completed:\nMissing dependencies: ");
values.put("部分完成：\n缺失依赖：%s","Partially completed:\nMissing dependencies: %s");
values.put("摘要显示前 50 项；确认时仍核对完整依赖内容。\n","The summary shows the first 50 entries; confirmation still checks all dependency contents.\n");
values.put("操作失败：摘要显示前 50 项；确认时仍核对完整依赖内容。\n","Operation failed: The summary shows the first 50 entries; confirmation still checks all dependency contents.\n");
values.put("安装失败：\n摘要显示前 50 项；确认时仍核对完整依赖内容。\n","Installation failed:\nThe summary shows the first 50 entries; confirmation still checks all dependency contents.\n");
values.put("部分完成：\n摘要显示前 50 项；确认时仍核对完整依赖内容。\n","Partially completed:\nThe summary shows the first 50 entries; confirmation still checks all dependency contents.\n");
values.put("正在读取待审阅插件…","Reading pending plugin reviews…");
values.put("操作失败：正在读取待审阅插件…","Operation failed: Reading pending plugin reviews…");
values.put("安装失败：\n正在读取待审阅插件…","Installation failed:\nReading pending plugin reviews…");
values.put("部分完成：\n正在读取待审阅插件…","Partially completed:\nReading pending plugin reviews…");
values.put("现存内容与旧依赖记录不同；请按本次实际内容审阅。\n","Existing contents differ from old dependency records. Review the actual current contents.\n");
values.put("操作失败：现存内容与旧依赖记录不同；请按本次实际内容审阅。\n","Operation failed: Existing contents differ from old dependency records. Review the actual current contents.\n");
values.put("安装失败：\n现存内容与旧依赖记录不同；请按本次实际内容审阅。\n","Installation failed:\nExisting contents differ from old dependency records. Review the actual current contents.\n");
values.put("部分完成：\n现存内容与旧依赖记录不同；请按本次实际内容审阅。\n","Partially completed:\nExisting contents differ from old dependency records. Review the actual current contents.\n");
values.put("实际依赖数量：","Actual dependency count: ");
values.put("实际依赖数量：%s","Actual dependency count: %s");
values.put("操作失败：实际依赖数量：","Operation failed: Actual dependency count: ");
values.put("操作失败：实际依赖数量：%s","Operation failed: Actual dependency count: %s");
values.put("安装失败：\n实际依赖数量：","Installation failed:\nActual dependency count: ");
values.put("安装失败：\n实际依赖数量：%s","Installation failed:\nActual dependency count: %s");
values.put("部分完成：\n实际依赖数量：","Partially completed:\nActual dependency count: ");
values.put("部分完成：\n实际依赖数量：%s","Partially completed:\nActual dependency count: %s");
values.put("已准备内容 SHA-256：","Prepared contents SHA-256: ");
values.put("已准备内容 SHA-256：%s","Prepared contents SHA-256: %s");
values.put("操作失败：已准备内容 SHA-256：","Operation failed: Prepared contents SHA-256: ");
values.put("操作失败：已准备内容 SHA-256：%s","Operation failed: Prepared contents SHA-256: %s");
values.put("安装失败：\n已准备内容 SHA-256：","Installation failed:\nPrepared contents SHA-256: ");
values.put("安装失败：\n已准备内容 SHA-256：%s","Installation failed:\nPrepared contents SHA-256: %s");
values.put("部分完成：\n已准备内容 SHA-256：","Partially completed:\nPrepared contents SHA-256: ");
values.put("部分完成：\n已准备内容 SHA-256：%s","Partially completed:\nPrepared contents SHA-256: %s");
values.put("正在只读准备隔离插件审阅…","Preparing a read-only quarantined plugin review…");
values.put("操作失败：正在只读准备隔离插件审阅…","Operation failed: Preparing a read-only quarantined plugin review…");
values.put("安装失败：\n正在只读准备隔离插件审阅…","Installation failed:\nPreparing a read-only quarantined plugin review…");
values.put("部分完成：\n正在只读准备隔离插件审阅…","Partially completed:\nPreparing a read-only quarantined plugin review…");
values.put("当前已有同名插件，现有版本不会被覆盖。请先到插件管理处理冲突。\n","A plugin with this name already exists and will not be overwritten. Resolve the conflict in plugin management first.\n");
values.put("操作失败：当前已有同名插件，现有版本不会被覆盖。请先到插件管理处理冲突。\n","Operation failed: A plugin with this name already exists and will not be overwritten. Resolve the conflict in plugin management first.\n");
values.put("安装失败：\n当前已有同名插件，现有版本不会被覆盖。请先到插件管理处理冲突。\n","Installation failed:\nA plugin with this name already exists and will not be overwritten. Resolve the conflict in plugin management first.\n");
values.put("部分完成：\n当前已有同名插件，现有版本不会被覆盖。请先到插件管理处理冲突。\n","Partially completed:\nA plugin with this name already exists and will not be overwritten. Resolve the conflict in plugin management first.\n");
values.put("正在准备插件启用审阅…","Preparing plugin activation review…");
values.put("操作失败：正在准备插件启用审阅…","Operation failed: Preparing plugin activation review…");
values.put("安装失败：\n正在准备插件启用审阅…","Installation failed:\nPreparing plugin activation review…");
values.put("部分完成：\n正在准备插件启用审阅…","Partially completed:\nPreparing plugin activation review…");
values.put("\n\n确认后停止 Web 和终端，再提交所审阅的启用或回退操作。","\n\nConfirmation stops Web and terminals before committing the reviewed activation or rollback.");
values.put("操作失败：\n\n确认后停止 Web 和终端，再提交所审阅的启用或回退操作。","Operation failed: \n\nConfirmation stops Web and terminals before committing the reviewed activation or rollback.");
values.put("安装失败：\n\n\n确认后停止 Web 和终端，再提交所审阅的启用或回退操作。","Installation failed:\n\n\nConfirmation stops Web and terminals before committing the reviewed activation or rollback.");
values.put("部分完成：\n\n\n确认后停止 Web 和终端，再提交所审阅的启用或回退操作。","Partially completed:\n\n\nConfirmation stops Web and terminals before committing the reviewed activation or rollback.");
values.put("\n\n确认后停止 Web 和终端，安装为停用状态；明确启用前不会加载。同名更新保留上一版。","\n\nConfirmation stops Web and terminals and installs the plugin disabled. It will not load before explicit activation. An update retains the previous version.");
values.put("操作失败：\n\n确认后停止 Web 和终端，安装为停用状态；明确启用前不会加载。同名更新保留上一版。","Operation failed: \n\nConfirmation stops Web and terminals and installs the plugin disabled. It will not load before explicit activation. An update retains the previous version.");
values.put("安装失败：\n\n\n确认后停止 Web 和终端，安装为停用状态；明确启用前不会加载。同名更新保留上一版。","Installation failed:\n\n\nConfirmation stops Web and terminals and installs the plugin disabled. It will not load before explicit activation. An update retains the previous version.");
values.put("部分完成：\n\n\n确认后停止 Web 和终端，安装为停用状态；明确启用前不会加载。同名更新保留上一版。","Partially completed:\n\n\nConfirmation stops Web and terminals and installs the plugin disabled. It will not load before explicit activation. An update retains the previous version.");
values.put("已批准，等待加载","Approved, awaiting load");
values.put("操作失败：已批准，等待加载","Operation failed: Approved, awaiting load");
values.put("安装失败：\n已批准，等待加载","Installation failed:\nApproved, awaiting load");
values.put("部分完成：\n已批准，等待加载","Partially completed:\nApproved, awaiting load");
values.put("查看待审阅插件","View pending plugin reviews");
values.put("操作失败：查看待审阅插件","Operation failed: View pending plugin reviews");
values.put("安装失败：\n查看待审阅插件","Installation failed:\nView pending plugin reviews");
values.put("部分完成：\n查看待审阅插件","Partially completed:\nView pending plugin reviews");
values.put("已确认加载","Loading confirmed");
values.put("操作失败：已确认加载","Operation failed: Loading confirmed");
values.put("安装失败：\n已确认加载","Installation failed:\nLoading confirmed");
values.put("部分完成：\n已确认加载","Partially completed:\nLoading confirmed");
values.put("没有待审阅的插件候选。安装前的预览会保留到确认或取消。","No plugin candidates await review. Installation previews remain until confirmed or cancelled.");
values.put("操作失败：没有待审阅的插件候选。安装前的预览会保留到确认或取消。","Operation failed: No plugin candidates await review. Installation previews remain until confirmed or cancelled.");
values.put("安装失败：\n没有待审阅的插件候选。安装前的预览会保留到确认或取消。","Installation failed:\nNo plugin candidates await review. Installation previews remain until confirmed or cancelled.");
values.put("部分完成：\n没有待审阅的插件候选。安装前的预览会保留到确认或取消。","Partially completed:\nNo plugin candidates await review. Installation previews remain until confirmed or cancelled.");
values.put("审阅插件启用或回退","Review plugin activation or rollback");
values.put("操作失败：审阅插件启用或回退","Operation failed: Review plugin activation or rollback");
}
private static void part35(Map<String,String> values) {
values.put("安装失败：\n审阅插件启用或回退","Installation failed:\nReview plugin activation or rollback");
values.put("部分完成：\n审阅插件启用或回退","Partially completed:\nReview plugin activation or rollback");
values.put("加载未确认，保持停用","Loading unconfirmed; kept disabled");
values.put("操作失败：加载未确认，保持停用","Operation failed: Loading unconfirmed; kept disabled");
values.put("安装失败：\n加载未确认，保持停用","Installation failed:\nLoading unconfirmed; kept disabled");
values.put("部分完成：\n加载未确认，保持停用","Partially completed:\nLoading unconfirmed; kept disabled");
values.put("待审阅启用","Awaiting activation review");
values.put("操作失败：待审阅启用","Operation failed: Awaiting activation review");
values.put("安装失败：\n待审阅启用","Installation failed:\nAwaiting activation review");
values.put("部分完成：\n待审阅启用","Partially completed:\nAwaiting activation review");
values.put("待审阅插件","Pending plugin reviews");
values.put("操作失败：待审阅插件","Operation failed: Pending plugin reviews");
values.put("安装失败：\n待审阅插件","Installation failed:\nPending plugin reviews");
values.put("部分完成：\n待审阅插件","Partially completed:\nPending plugin reviews");
values.put("确认回退","Confirm rollback");
values.put("操作失败：确认回退","Operation failed: Confirm rollback");
values.put("安装失败：\n确认回退","Installation failed:\nConfirm rollback");
values.put("部分完成：\n确认回退","Partially completed:\nConfirm rollback");
values.put("正在确认加载","Confirming loading");
values.put("操作失败：正在确认加载","Operation failed: Confirming loading");
values.put("安装失败：\n正在确认加载","Installation failed:\nConfirming loading");
values.put("部分完成：\n正在确认加载","Partially completed:\nConfirming loading");
values.put("内容已变化，需要重新审阅","Contents changed; review required");
values.put("操作失败：内容已变化，需要重新审阅","Operation failed: Contents changed; review required");
values.put("安装失败：\n内容已变化，需要重新审阅","Installation failed:\nContents changed; review required");
values.put("部分完成：\n内容已变化，需要重新审阅","Partially completed:\nContents changed; review required");
values.put("；未通过或未完整读取：","; failed or incomplete reads: ");
values.put("；未通过或未完整读取：%s","; failed or incomplete reads: %s");
values.put("操作失败：；未通过或未完整读取：","Operation failed: ; failed or incomplete reads: ");
values.put("操作失败：；未通过或未完整读取：%s","Operation failed: ; failed or incomplete reads: %s");
values.put("安装失败：\n；未通过或未完整读取：","Installation failed:\n; failed or incomplete reads: ");
values.put("安装失败：\n；未通过或未完整读取：%s","Installation failed:\n; failed or incomplete reads: %s");
values.put("部分完成：\n；未通过或未完整读取：","Partially completed:\n; failed or incomplete reads: ");
values.put("部分完成：\n；未通过或未完整读取：%s","Partially completed:\n; failed or incomplete reads: %s");
values.put("检查已取消，尚未检查的条目保持原状。","Inspection cancelled. Unchecked entries remain unchanged.");
values.put("操作失败：检查已取消，尚未检查的条目保持原状。","Operation failed: Inspection cancelled. Unchecked entries remain unchanged.");
values.put("安装失败：\n检查已取消，尚未检查的条目保持原状。","Installation failed:\nInspection cancelled. Unchecked entries remain unchanged.");
values.put("部分完成：\n检查已取消，尚未检查的条目保持原状。","Partially completed:\nInspection cancelled. Unchecked entries remain unchanged.");
values.put("保留记录无法读取，原件未改动。","Retained records are unreadable. Originals are unchanged.");
values.put("操作失败：保留记录无法读取，原件未改动。","Operation failed: Retained records are unreadable. Originals are unchanged.");
values.put("安装失败：\n保留记录无法读取，原件未改动。","Installation failed:\nRetained records are unreadable. Originals are unchanged.");
values.put("部分完成：\n保留记录无法读取，原件未改动。","Partially completed:\nRetained records are unreadable. Originals are unchanged.");
values.put("检查通过：","Checks passed: ");
values.put("检查通过：%s","Checks passed: %s");
values.put("操作失败：检查通过：","Operation failed: Checks passed: ");
values.put("操作失败：检查通过：%s","Operation failed: Checks passed: %s");
values.put("安装失败：\n检查通过：","Installation failed:\nChecks passed: ");
values.put("安装失败：\n检查通过：%s","Installation failed:\nChecks passed: %s");
values.put("部分完成：\n检查通过：","Partially completed:\nChecks passed: ");
values.put("部分完成：\n检查通过：%s","Partially completed:\nChecks passed: %s");
values.put("随包依赖，未运行包管理器","Bundled dependencies; package manager not run");
values.put("上一页","Previous page");
values.put("下一页","Next page");
values.put("正在检查所选原件…","Inspecting selected originals…");
values.put("%s · 摘要与验证记录一致","%s · Checksum matches the verification record");
values.put("%s · 本次读取一致；没有据此确认历史格式或完整性","%s · Reads are consistent; historical format/integrity remains unconfirmed");
values.put("检查通过：%s；未通过或未完整读取：%s","Inspection passed: %s; failed or incomplete: %s");
values.put("范围未确认","Scope unconfirmed");
values.put("操作前重新核对加密文件摘要","Recheck the encrypted file checksum before use");
values.put("启用前需要审阅","Review required before activation");
values.put("只读救援来源","Read-only rescue source");
values.put("原件或记录保持保留","Originals or records remain retained");
values.put("范围：","Scope: ");
values.put("语言 / Language","Language");
values.put("界面语言 / Interface language","Interface language");
values.put("跟随系统","Follow system");
values.put("简体中文","Simplified Chinese");
values.put(" · 当前"," · current");
values.put("中文","Chinese");
values.put("对话画中画","Chat picture-in-picture");
values.put("保存后，退出 DSH 对话页或返回桌面时保留网页小窗；停止 DSH 后收起。点小窗可切换横/竖版，展开后继续输入。原生页面不进入画中画。","After saving, leaving DSH chat or going Home keeps the web page in a small window until DSH stops. Tap to switch portrait/landscape; expand to type. Native pages stay outside picture-in-picture.");
values.put("切换横版","Switch to landscape");
values.put("切换竖版","Switch to portrait");
values.put("当前设备不支持系统画中画，需要 Android 8.0+ 及设备支持。","Picture-in-picture requires Android 8.0+ and a supported device.");
values.put("已保存。请在系统设置中允许 DSHA 使用画中画。","Saved. Allow picture-in-picture for DSHA in system settings.");
values.put("此目录为应用内部数据保护记录","This directory contains private data protection records");
values.put("数据保护","Data protection");
values.put("正在确认任务状态…","Checking task state…");
values.put("正在保护数据并验证运行环境","Protecting data and verifying the runtime");
values.put("DSHA 数据保护","DSHA data protection");
}
private static void part36(Map<String,String> values) {
values.put("选择数据目录","Select data directory");
values.put("已选择数据目录，另一份原件仍保留。","Data directory selected; the other original remains retained.");
values.put("修复启动配置","Repair startup configuration");
values.put("卸载故障插件","Remove faulty plugin");
values.put("暂无冷安装记录\n","No cold-install record\n");
values.put("\n=== 冷安装与环境准备（含首次尝试与回退）===\n","\n=== Cold installation and fallback attempts ===\n");
values.put("\n=== 最近五次启动 ===\n","\n=== Last five starts ===\n");
values.put("Web 端口被占用：","Web port in use: ");
values.put("检查安装条件","Checking installation prerequisites");
values.put("社区插件生态","Community plugins");
values.put("正在连接社区…","Connecting to the community…");
values.put("社区暂时无法连接，请检查网络后重试。","Unable to connect. Check your network and retry.");
values.put("无法打开此链接。","Unable to open this link.");
values.put("Android 提供方沿用 DSHA 设备确认。读屏与操作需要无障碍服务；系统截屏需要 Android 11+。切换到 Cua Driver 前先在插件管理停用 Android 提供方。","The Android provider uses DSHA device confirmations. Observation and input require Accessibility; system screenshots require Android 11+. Disable the Android provider before selecting Cua Driver.");
values.put("设置无障碍授权","Accessibility permission");
values.put("无法打开系统无障碍设置","Cannot open Accessibility settings");
values.put("维护步骤已结束，但环境就绪检查未通过。已停止自动跳转，请查看原因或进入受限主界面。","Maintenance ended, but readiness checks did not pass. Automatic navigation stopped. Review the reason or enter the limited interface.");
values.put("本次自动维护未能启动。已有任务结束后可手动重试，不会反复启动维护。","Automatic maintenance could not start. Retry manually after the current task ends; maintenance will not start repeatedly.");
values.put("等待确认恢复备份","Backup restore awaiting confirmation");
values.put(" · 点击查看进度"," · View progress");
values.put("位置：","Location: ");
values.put("收起详情","Collapse details");
values.put("展开插件详情","Plugin details");
values.put(" 的安装文件与启用记录将删除；对话、其他插件和外部源码目录保留。"," installation and enabled state will be removed. Conversations, other plugins and external source folders remain.");
values.put("兼容运行时","Compatible runtimes");
values.put("没有可确认兼容的直接前代。未知或受损原件仍保留；可先导出数据，再向前修复环境。","No direct predecessor is confirmed compatible. Unknown or damaged originals remain retained. Export readable data, then repair the environment forward.");
values.put("选择保留的运行时","Choose a retained runtime");
values.put("将停止 Web、终端和写入任务，复核保留文件，随后在当前 APK 下重新进行隔离试运行。对话、设置和项目保持原位，不恢复旧数据快照。","Stop Web, terminals and writers, recheck the retained files, then run an isolated trial under the current APK. Conversations, settings and projects stay in place; no old data snapshot is restored.");
values.put("运行时记录待检查","Runtime records need review");
values.put("存在未完成或不可读取的维护记录。请先恢复中断维护，原件不会被覆盖。","Maintenance records are incomplete or unreadable. Recover the interrupted maintenance first; originals will not be overwritten.");
values.put(" · MIT 许可"," · MIT License");
values.put("English","English");
values.put("跟随系统 · ","Follow system · ");
values.put("宿主备份与只读救援","Host backup and read-only rescue");
values.put("先停止 Web、终端和写任务，再由 Android 保存原配置并重置 settings.yaml 与工作目录的 .env。对话和原生凭据保留；无需旧 Python。外部目录或链接需先单独确认，不会强行覆盖。","Stop Web, terminals and writers, then let Android retain the original configuration and reset settings.yaml and the workspace .env. Conversations and native credentials stay intact. The old Python is not required. External folders and links require separate review and will not be overwritten.");
values.put("保留原件并重置","Retain originals and reset");
values.put("随时开始你的下一项任务。","Ready for your next task.");
values.put("▶  启动 DSHA","▶  Start DSHA");
values.put("↻  重启","↻  Restart");
values.put("□  停止","□  Stop");
values.put("实际 Web 端口","Active Web port");
values.put("运行环境","Runtime environment");
values.put("模型配置","Model settings");
values.put("服务商、接口与模型目录","Providers, endpoints and models");
values.put("访问地址","Access addresses");
values.put("查看本机与局域网地址","Local and LAN addresses");
values.put("启动日志","Startup log");
values.put("展开","Expand");
values.put("下载","Save");
values.put("快捷入口","Quick access");
values.put("让工作台按你的习惯运行。","Make your workspace feel like yours.");
values.put("工作台","Workspace");
values.put("使用体验","Experience");
values.put("外观与语言","Appearance and language");
values.put("主题、字体与界面语言","Theme, text size and language");
values.put("悬浮条","Floating status");
values.put("显示内容、透明度与停留时间","Content, opacity and display time");
values.put("支持","Support");
values.put("版本更新","App updates");
values.put("自检与诊断","Diagnostics");
values.put("运行状态、错误记录与日志导出","Runtime checks and diagnostic logs");
values.put("版本、开源许可与反馈","Version, licenses and feedback");
values.put("环境恢复与重建","Environment recovery");
values.put("发现社区插件，查看介绍与安装来源","Explore plugins and installation sources");
values.put("从链接安装","Install from a link");
values.put("仓库或下载链接","Repository or download URL");
values.put("已安装插件","Installed plugins");
values.put("从设备选择 ZIP 插件包","Select a plugin ZIP from your device");
values.put("导出插件","Export plugins");
values.put("保存已安装插件的副本","Save a copy of installed plugins");
values.put("本地插件","Local plugins");
values.put("先安装，再审阅。启用前核对插件内容与权限。","Install first, review before enabling.");
values.put("你的 AI 工作台，\n就在手机里。","Your AI workspace,\nright on your phone.");
values.put("写代码、处理文件、使用工具。\n把完整的工作环境，随身带走。","Write code, work with files and use tools.\nTake your workspace with you.");
values.put("离线部署  ·  无需 ROOT  ·  0.1.6-alpha1","Offline setup  ·  No root  ·  0.1.6-alpha1");
values.put("从一个想法，\n到实际完成。","From an idea\nto getting it done.");
values.put("对话、文件与工具，在同一个工作空间。","Conversations, files and tools, together.");
values.put("对话与任务","Conversations and tasks");
values.put("让模型理解问题，协作完成工作。","Work with models to get things done.");
values.put("完整的终端","A full terminal");
}
private static void part37(Map<String,String> values) {
values.put("保留熟悉的 Ubuntu 命令与多会话。","Ubuntu commands and independent sessions.");
values.put("插件与设备能力","Plugins and device tools");
values.put("按需安装插件，连接手机能力。","Add plugins and enable device capabilities.");
values.put("权限由你决定，\n数据有处可寻。","Your permissions.\nYour data.");
values.put("开始使用不需要授予设备控制权限。","Device control permission is optional.");
values.put("对话与文件","Conversations and files");
values.put("保存在本机，可手动导出。","Stored locally, with manual exports.");
values.put("API Key","API keys");
values.put("保留本机凭据保护；备份默认排除。","Protected locally and excluded from backups by default.");
values.put("设备操作","Device actions");
values.put("Root、Shizuku、ADB 与短信单独授权。","Root, Shizuku, ADB and SMS have separate permissions.");
values.put("使用在线模型时，消息及你选择的附件会发送到所配置的模型服务。","Online models receive the messages and attachments you choose to send.");
values.put("认识 DSHA","Discover DSHA");
values.put("跳过介绍","Skip introduction");
values.put("安装与环境","Installation and runtime");
values.put("接口与运行配置","Providers and runtime");
values.put("解析安装","Resolve and install");
values.put("导出、恢复与文件共享。","Exports, recovery and file sharing.");
values.put("选择范围，以密码保护本机副本","Choose data to include and protect it with a password");
values.put("先核验内容与兼容性，再确认恢复","Verify contents and compatibility before restoring");
values.put("保留副本","Retained copies");
values.put("查看旧树、验证记录与恢复选项","Inspect retained data and recovery options");
values.put("导出选项","Export options");
values.put("备份与只读救援","Backup and read-only recovery");
values.put("查看作业、重新导出已验证副本","Inspect operations and re-export verified copies");
values.put("工作目录","Workspace");
values.put("当前原生启动目录；对话工作区可在 DSH 中单独选择。","Native launch directory; conversation workspaces are selected in DSH.");
values.put("打开工作台","Open workspace");
values.put("维护与恢复","Maintenance and recovery");
values.put("Ubuntu 环境","Ubuntu environment");
values.put("查看检查结果与修复选项","Inspect results and repair options");
values.put("离线基础工具","Offline tools");
values.put("Node.js 24","Node.js 24");
values.put("pnpm","pnpm");
values.put("DeepSeek Harness","DeepSeek Harness");
values.put("启动与环境检查","Startup and runtime checks");
values.put("按组件检查状态，修复需要处理的部分。","Inspect each component and repair only what needs attention.");
values.put("环境状态","Environment state");
values.put("Ubuntu 基础环境","Ubuntu base");
values.put("受管运行时","Managed runtime");
values.put("应用版本","App version");
values.put("六个安装步骤","Six installation steps");
values.put("检查全部组件","Check all components");
values.put("更新受管运行时","Update managed runtime");
values.put("只更新随包组件，保留个人数据","Update bundled components and retain personal data");
values.put("按需修复组件","Repair components");
values.put("检查缺失部分，保留可用组件","Inspect missing parts and retain working components");
values.put("环境修复与恢复","Environment recovery");
values.put("查看启动依赖与中断维护","Inspect startup dependencies and interrupted maintenance");
values.put("检查与安装日志","Check and installation log");
values.put("原生凭据（可选）","Native credential (optional)");
values.put("也可直接在模型配置中保存服务商凭据。","Provider credentials can also be saved in model settings.");
values.put("修改后保存。端口与运行方式在下次启动生效。","Save your changes. Port and runtime changes apply on the next start.");
values.put("服务商 · API Key · 地址 · 协议 · 模型目录","Providers · Credentials · Endpoint · Protocol · Models");
values.put("运行与网络","Runtime and network");
values.put("首选 Web 端口","Preferred Web port");
values.put("端口占用时保留首选设置，自动使用可用端口。","If occupied, keep the preferred port and use an available one.");
values.put("DNS 解析策略","DNS policy");
values.put("显示与启动","Display and startup");
values.put("单独编辑样式、内容与预览","Edit style, contents and preview");
values.put("运行时兼容选项","Runtime compatibility");
values.put("按需开启。普通对话和终端不依赖设备控制授权。","Optional capabilities. Conversations and terminals do not require device control permission.");
values.put("设备执行通道","Device command channels");
values.put("系统权限","System permissions");
values.put("独立敏感能力","Sensitive capabilities");
values.put("系统兼容性","System compatibility");
values.put("查看应用与运行组件的版本信息。","View app and runtime component versions.");
values.put("当前应用","Current app");
values.put("管理","Management");
values.put("兼容运行时回退","Compatible runtime rollback");
values.put("通过隔离试运行后再切换","Switch only after isolated verification");
values.put("检查组件、存储与服务，生成脱敏报告。","Inspect components, storage and services and generate a redacted report.");
values.put("运行状态检查","Runtime status check");
values.put("排查与修复","Troubleshooting");
values.put("补充复现步骤","Reproduction notes");
values.put("在系统无线调试中取得配对码，再连接当前设备。","Get the pairing code from Wireless debugging to connect this device.");
values.put("连接状态","Connection state");
values.put("连接工具","Connection tools");
values.put("执行任务","Runtime task");
values.put("后台进程","Background process");
}
private static void part38(Map<String,String> values) {
values.put("容器命令","Container command");
values.put("后台容器进程","Background container process");
values.put("等待进程退出后释放环境保护","Waiting for the process to exit before releasing environment protection");
values.put("正在检测已安装插件…","Detecting installed plugins…");
values.put("正在更新插件状态…","Updating plugin state…");
values.put("插件已删除，正在同步列表…","Plugin removed. Updating the list…");
values.put("插件检测完成；变更后重启 Web 生效","Plugin scan complete. Restart Web to apply changes.");
values.put("[无法核验终端本次进程身份，保留环境占用：","[Could not verify this terminal process identity; environment remains protected: ");
values.put("终端会话身份发生变化","Terminal session identity changed");
values.put("终端组号缺少本次出生身份","Terminal group lacks this session's birth identity");
values.put("未取得终端本次会话身份，保留环境占用","Could not establish this terminal session identity; environment remains protected");
values.put("终端进程身份无效","Invalid terminal process identity");
values.put("终端本次进程身份不匹配，原环境保持保护","Terminal process identity does not match this session; the environment remains protected");
values.put("终端会话号已变化，原环境保持保护","Terminal session ID changed; the environment remains protected");
values.put("终端本次进程身份缺失","This terminal process identity is missing");
values.put("终端组长出生身份已变化，未发送信号","Terminal leader birth identity changed; no signal was sent");
values.put("终端进程 UID 不属于本应用","Terminal process UID does not belong to this app");
values.put("无法核验终端进程 UID","Could not verify terminal process UID");
values.put("下载源：","Download source: ");
values.put("自动选择（推荐）","Automatic (recommended)");
values.put("npm 官方源","Official npm registry");
values.put("npmmirror 国内镜像","npmmirror registry");
values.put("插件下载源","Plugin download source");
values.put("自动选择可用的 npm 源；镜像失败时回退官方源。GitHub 使用官方直连。","Automatic selects an available npm registry; mirror failures fall back to the official registry. GitHub uses its official endpoints.");
values.put("正在选择可用的 npm 下载源…","Selecting an available npm registry…");
values.put("当前 npm 源不可用，正在切换备用源…","The npm registry is unavailable; trying the fallback…");
values.put("正在并行检查插件版本…","Checking plugin versions in parallel…");
values.put("正在下载插件及依赖：%s","Downloading plugin and dependencies: %s");
values.put("当前跟随系统，点击切换白天；长按跟随系统","Following system. Tap for light mode; hold to follow system");
values.put("当前白天模式，点击切换黑夜；长按跟随系统","Light mode. Tap for dark mode; hold to follow system");
values.put("当前黑夜模式，点击切换跟随系统；长按跟随系统","Dark mode. Tap to follow system; hold to follow system");
values.put("已跟随系统主题","Following the system theme");
values.put("已切换白天模式","Light mode selected");
values.put("已切换黑夜模式","Dark mode selected");
values.put("不透明度 %s · 行数 %s · 字号 %s","Opacity %s · Lines %s · Text size %s");
values.put("不透明度：%s","Opacity: %s");
values.put("文字大小：%s","Text size: %s");
values.put("欢迎介绍：第 %s 页，共 %s 页","Introduction page %s of %s");
values.put("%s 行","%s lines");
values.put("1 行","1 line");
values.put("%s 秒","%s seconds");
values.put("%s 秒（当前）","%s seconds (current)");
values.put("网页提示（%s）","Web alert (%s)");
values.put("网页确认（%s）","Web confirmation (%s)");
values.put("大小未知","Unknown size");
values.put("时间未知","Unknown time");
values.put("已复制连接地址，请只分享给可信设备","Connection address copied. Share only with trusted devices");
values.put("报告已复制，请在公开分享前查看内容","Report copied. Review its content before public sharing");
values.put("本机有可用的 API Key。","An API key is available on this device.");
values.put("本机尚无可用 API Key，请在配置页填写或明确选择恢复历史凭据。","No API key is currently available. Enter one in Configuration or explicitly choose historical credential restore.");
values.put("上传失败：%s","Upload failed: %s");
values.put("当前内核缺少：%s。\n更新 Android System WebView / Chrome 后重试，或在浏览器中打开。","The current engine lacks: %s.\nUpdate Android System WebView / Chrome and retry, or open in a browser.");
values.put("服务可能仍在启动或已退出。请稍后重试，持续失败时返回启动页查看日志。\n错误代码：%s","The service may still be starting or may have exited. Retry later; if it keeps failing, check the startup log.\nError code: %s");
values.put("HTTP %s。请返回启动页重新进入对话，或稍后重试。","HTTP %s. Reopen the conversation from the startup page, or retry later.");
values.put("请确认服务仍在运行，点击重试。错误代码：%s","Check that the service is still running, then retry. Error code: %s");
values.put("下载失败：HTTP %s","Download failed: HTTP %s");
values.put("可尝试在系统浏览器打开。错误：%s","Try opening in the system browser. Error: %s");
values.put("配置保存未完成：%s","Settings were not fully saved: %s");
values.put("\n可更新：%s","\nUpdate available: %s");
values.put("更多操作：%s","More actions: %s");
values.put("1. 停止正式 Web 与终端并核验进程身份；无法确认退出即停止。\n2. 重新读取中断维护记录，按唯一已识别事务执行原有恢复/回切接口；多份冲突或损坏记录保持原样。\n3. 当前没有待恢复事务时只核验状态，不猜测要覆盖哪份数据。\n4. 原件、失败候选与维护记录继续保留；已提交事务不得覆盖后来的对话或配置。\n5. 完成后仍须重试正式 Web 并验证实际可用；本次确认不代表网页已恢复。","1. Stop normal Web and terminals and verify their process identities; stop if exit is unconfirmed.\n2. Re-read interrupted maintenance records and recover only the uniquely identified transaction. Preserve conflicting or damaged records.\n3. With no pending transaction, check status only; do not guess which data to overwrite.\n4. Retain originals, failed candidates and journals. Committed transactions cannot overwrite later conversations or settings.\n5. Retry normal Web and verify it works. This confirmation does not itself prove page recovery.");
values.put("1. 停止正式 Web 与终端，取得原有数据维护屏障。\n2. 从当前签名 APK 准备运行时；同一基础环境执行受管更新，基础环境确需重建时先由宿主保护个人数据。\n3. 先校验候选，再执行隔离启动、存储和网页连接试验；未通过即按原事务保留现场或回切。\n4. 对话、配置、插件原件按现有事务保护；不会从应急模型下载程序或执行其代码。\n5. 当前原件及回切记录保存在应用私有 host-runtime-operations / host-environment-operations；成功后仍须核验正式 Web。","1. Stop normal Web and terminals and acquire the existing maintenance barrier.\n2. Prepare runtime assets from this signed APK. Use a managed update for the same base; protect personal data before a necessary base rebuild.\n3. Verify the candidate, then run isolated startup, storage and browser-connection checks. Preserve or roll back a failed trial.\n4. Existing transactions protect conversation, configuration and plugin originals. Do not download or execute emergency-model code.\n5. Originals and rollback records stay in private host-runtime-operations / host-environment-operations. Verify normal Web after success.");
values.put("1. 停止正式 Web 与终端，取得原有数据维护屏障。\n2. 仅从当前签名 APK 的受管 DSH/Node 依赖树恢复缺失或损坏的 CLI 依赖；不接受包名、版本、路径或命令参数。\n3. 按现有运行时事务校验摘要、隔离启动、存储、网页连接和插件加载；任何检查失败均保留原件并回切。\n4. 不执行 npm 生命周期脚本，不从应急模型下载代码，不直接修改用户 node_modules。\n5. 完成后仍须重试正式 Web，并以诊断结果确认 CLI 已就绪。","1. Stop normal Web and terminals and acquire the existing maintenance barrier.\n2. Restore missing or damaged CLI dependencies only from the managed DSH/Node tree in this signed APK. No package, version, path or command parameters are accepted.\n3. Verify digests, isolated startup, storage, browser connectivity and plugin loading through the existing runtime transaction. Preserve originals and roll back failed checks.\n4. Do not run npm lifecycle scripts, download model-supplied code or directly modify user node_modules.\n5. Retry normal Web and verify CLI readiness in diagnostics.");
values.put("profiles/web/package.json → 官方基础 bundles：dsh-base + dsh-web-app\nprofiles/web/cordis.patch.yml → []\n旧插件构成与设置保存在配置快照；既有会话与凭据保持原位。","Save old composition/settings, create basic Web profile; retain conversations and credentials.");
values.put("cordis.patch.yml → []\n对全部 Profile 的全局覆盖生效；原文保存在配置快照。","Clears global overrides for every profile; original retained in snapshot.");
values.put("按原事务恢复中断维护，保留原件。","Recover the recorded transaction and retain originals.");
values.put("从当前签名 APK 重建受管运行时，完成隔离试运行。","Rebuild from this signed APK and run the isolated trial.");
values.put("从当前签名 APK 恢复受管 CLI/Node 依赖并完成隔离试运行；不执行任意 shell。","Restore managed CLI/Node dependencies from this signed APK and run the isolated trial; no arbitrary shell is executed.");
values.put("宿主直接保留原件并创建基础配置，无需先启动损坏 DSH。已存在的插件源码保留，恢复使用须审阅。","Host retains originals and creates base configuration without starting broken DSH; plugin source retained for review.");
values.put("只应用经当前 DSH schema 验证的普通设置；插件构成与凭据不由此入口修改。","Apply only current-schema declarative settings; preserve plugin composition and credentials.");
values.put("su：%s\n尚未验证 root 授权","su: %s\nRoot authorization has not been verified");
values.put("su：%s\nroot 通道已响应 · 设备命令仍受策略保护","su: %s\nRoot channel responded; device commands remain protected by policy");
values.put("su：%s\nroot 授权或执行超时，请在 root 管理器查看 DSHA 授权","su: %s\nRoot authorization or execution timed out. Check DSHA authorization in your root manager");
values.put("su：%s\nroot 授权或执行失败：%s","su: %s\nRoot authorization or execution failed: %s");
values.put("上次保存：%s（点按查看）","Last saved: %s (tap to view)");
values.put("已保存：Download/DSHA/%s\n点按此处查看日志","Saved: Download/DSHA/%s\nTap here to view the log");
values.put("已保存到所选位置：%s\n点按此处查看日志","Saved to the selected location: %s\nTap here to view the log");
values.put("保存失败：%s\n可点「另存为」选择位置后重试。","Save failed: %s\nChoose a location with Save as and retry.");
values.put("正在%s，完成后再保存配置","%s is in progress. Save settings after it finishes");
values.put("启动中…（%s）","Starting… (%s)");
}
private static void part39(Map<String,String> values) {
values.put("Web 鉴权失败，请点「进入」重试（%s）","Web authentication failed. Tap Enter to retry (%s)");
values.put("无法打开 Web 页面，请重试（%s）","Unable to open the Web page. Retry (%s)");
values.put("局域网地址：%s\n点按查看或复制连接链接；流量未加密，请只在可信网络使用。","LAN address: %s\nTap to view or copy the connection link. Traffic is unencrypted; use trusted networks.");
values.put("此链接包含访问凭据。局域网使用 HTTP，流量未加密，请只在可信网络使用并只分享给可信设备。\n\n%s","This link contains access credentials. LAN access uses HTTP with unencrypted traffic. Use trusted networks and share only with trusted devices.\n\n%s");
values.put("局域网连接链接","LAN connection link");
values.put("复制连接链接","Copy connection link");
values.put("连接已变化，请重新查看链接。","The connection changed. View the link again.");
values.put("下载源：%s","Download source: %s");
values.put("已识别：%s","Recognized: %s");
values.put("更新至 %s","Update to %s");
values.put("回退至 %s","Roll back to %s");
values.put("备份任务进行中：%s · %s 项","Backup in progress: %s · %s entries");
values.put("原生授权即时生效；%s","Native authorization applies immediately; %s");
values.put("%s · 本阶段 %s 秒 · 总计 %s 秒\n%s","%s · Stage %s seconds · Total %s seconds\n%s");
values.put("%s\n兼容内核 Gecko 143","%s\nCompatibility engine: Gecko 143");
values.put("终端启动失败：%s","Terminal failed to start: %s");
values.put("会话已结束（退出码 %s）","Session ended (exit code %s)");
values.put("终端 %s","Terminal %s");
values.put("终端 %s · 关闭中…","Terminal %s · Closing…");
values.put("切换到终端 %s","Switch to terminal %s");
values.put("请在插件管理中查看 %s 的安装和启用状态","View the installation and enabled state of %s in plugin management");
values.put("下载并解析插件包后自动安装、启用。\n\n%s","The plugin installs and enables automatically after download and validation.\n\n%s");
values.put("已显示 %s–%s / %s 条 · 第 %s 页","Showing %s–%s / %s records · Page %s");
values.put("Profile：%s\n请选择需要恢复的字段；未选字段保持当前值。\n%s","Profile: %s\nSelect fields to restore. Unselected fields retain their current values.\n%s");
values.put("已选择项目目录：%s","Selected project folders: %s");
values.put("%s\n%s 项 · %s%s%s","%s\n%s entries · %s%s%s");
values.put("%s\n\n版本：%s\n位置：%s\n来源：%s","%s\n\nVersion: %s\nLocation: %s\nSource: %s");
values.put("禁用 %s","Disable %s");
values.put("启用 %s","Enable %s");
values.put("已释放 %s","Freed %s");
values.put("还没有可重新导出的私有验证副本。\n%s","No private verified copies are available yet.\n%s");
values.put("尚未确认 Web 退出；进程身份无法核验，保留运行屏障。请查看诊断后重试停止。","Web exit is unconfirmed and process identity cannot be verified. The execution barrier remains. Inspect diagnostics and retry stopping.");
values.put("强制结束本次 Web？","Force stop this Web process?");
values.put("普通停止尚未确认 Web 退出。本次已核验进程属于 DSHA；强制结束可能中断正在写入的对话或文件。\n\n确认后只结束这次已核验的 Web 进程；身份或状态变化会拒绝执行。取消会保留现场与运行屏障。","Normal stopping has not confirmed Web exit. This process was verified as belonging to DSHA. Force stopping may interrupt conversation or file writes.\n\nConfirmation applies only to this verified Web process. Identity or state changes reject the operation. Cancel keeps the process state and execution barrier.");
values.put("强制结束","Force stop");
values.put("Web 状态或进程身份已变化，本次强制结束未执行。请重新停止后确认。","Web state or process identity changed. Force stopping was not performed. Stop again and confirm.");
values.put("正在强制结束本次已核验的 Web…","Force stopping this verified Web process…");
values.put("3090 桥绑定失败：%s","3090 bridge bind failed: %s");
values.put("设备桥端口 3090 被占用，设备工具暂不可用；Web 可独立启动。关闭占用端口的其他实例后重试：%s","Device bridge port 3090 is in use. Device tools are temporarily unavailable; Web can still start. Close the other instance using this port and retry: %s");
values.put("3090 的 IPv6 附加监听不可用：%s","Additional IPv6 listener on 3090 unavailable: %s");
values.put("在【%s】里：%s  # 这类应用涉及支付或隐私，每次都需要你确认","In [%s]: %s  # Payment or privacy-sensitive apps require confirmation every time");
values.put("%s  # 本次 DSH 运行期间有效，可在设备能力授权中随时撤销","%s  # Valid for this DSH run. Revoke anytime in Device permissions");
values.put("点击「%s」","Tap “%s”");
values.put("点击坐标 (%s,%s)","Tap coordinates (%s,%s)");
values.put("在输入框里填入「%s」","Type into the input field: “%s”");
values.put("按下系统按键 %s","Press system key %s");
values.put("滑动屏幕 (%s,%s)→(%s,%s)","Swipe screen (%s,%s)→(%s,%s)");
values.put("BRIDGE_PROTOCOL=%s\nBRIDGE_AUTH=header-x-token\nAPP_VERSION=%s\nAPP_CODE=%s\nHINT=端点清单见 /app/help；判版本请用 >= 而不是 ==\n","BRIDGE_PROTOCOL=%s\nBRIDGE_AUTH=header-x-token\nAPP_VERSION=%s\nAPP_CODE=%s\nHINT=See /app/help for endpoints; compare versions using >= rather than ==\n");
values.put("DSHA 3090 桥端点清单（BRIDGE_PROTOCOL=%s）\n凭据由宿主写入 /root/.dsh/.bridge_headers；使用 curl -H @/root/.dsh/.bridge_headers，不把 token 写进 URL 或命令参数。\n带中文/空格的参数一律用 -G --data-urlencode，别手写 URL 编码。\n\n== 屏幕操作（无障碍服务，不需要 ADB/Shizuku）==\n读屏  curl -s -H @/root/.dsh/.bridge_headers \"127.0.0.1:3090/app/ui/dump\"\n      → 每行「[序号] \"文字\" 可点击 中心=(x,y) 区域=l,t,r,b」\n点按  curl -s -G 127.0.0.1:3090/app/ui/tap --data-urlencode \"text=设置\" -H @/root/.dsh/.bridge_headers\n      → 优先按文字点：控件位置随滚动/动画变，文字不变。没有文字才用 ?x=&y=\n输入  curl -s -G 127.0.0.1:3090/app/ui/input --data-urlencode \"text=内容\" -H @/root/.dsh/.bridge_headers\n      → 填到当前焦点框；没有焦点先 tap 一下输入框\n按键  /app/ui/key?name=back  （back/home/recents/notifications/quicksettings/lock）\n滑动  /app/ui/swipe?x1=500&y1=1500&x2=500&y2=500&ms=300\n截屏  /app/ui/screenshot   → 存 PNG 到应用截图目录并返回路径（不回 base64）\n节奏：每次点按/输入后先 dump 再决定下一步，别凭记忆连点。\n\n== 独立虚拟屏（Android 11+；每次输入必须带最新 frameSeq）==\n/app/vscreen/create?orientation=portrait|landscape  创建虚拟屏\n/app/vscreen/status  查询 displayId、尺寸和 frameSeq\n/app/vscreen/launch?package=com.example.app  启动已安装应用\n/app/vscreen/see  获取最新预览；tap/swipe/type/key 必须携带该 frameSeq\n/app/vscreen/close  关闭并回收虚拟屏\n\n== 设备与应用 ==\n/app/device                     机型/系统/电量/网络/屏幕/存储/内存\n/app/apps                       全部已装应用，分用户应用与系统应用；可加 q/limit/user=1 筛选显示\n/app/launch?pkg=com.tencent.mm  启动应用\n/app/clip                       读剪贴板（需 App 在前台，系统限制）\n/app/clip + text=…              写剪贴板\n/app/readfile?path=/…          读取绝对路径的目录或文本，仍受 Android 权限限制；凭据区（.dsh/.ssh/.android）不可读\n设备文件写入请走下方受保护的设备 shell；普通 Download 文件可操作，DCIM/Pictures/Android/data/obb 只读。\n\n== 与用户交互 ==\n/app/ask?options=继续|取消 + q=…  弹窗阻塞等回答（最多三个选项）\n/app/notify?title=… + text=…      通知栏\n/app/toast + text=…               App 内提示\n/app/vibrate?ms=300               震动（长任务跑完叫醒用户）\n/app/share（text= 或 path=）      分享到其它应用\n/app/open?url=https://…           打开链接\n/app/export?path=/root/report.md  把产物交给用户 → 落 Download/DSHA；凭据区不可导出\n建议：需要用户拍板用 /app/ask 而不是干等；长任务结束用 notify 或 vibrate 叫人；\n产出报告用 /app/export，别只留在容器里。\n\n== 传感器与位置（默认关闭，需用户在配置页勾选）==\n/app/location（加 fresh=1 强制重新定位，可能等数秒）\n/app/sensors 列表 · /app/sensor?name=light 读值\n（light 环境光 lux / accel / gyro / magnet / pressure / proximity /\n gravity / rotation 姿态四元数 / steps 开机后步数）\n/app/torch?on=1 手电\n这三类返回 DISABLED（用户没开该能力）或 NO_PERMISSION（没授系统权限）时，\n照原话告诉用户去哪开，不要重试 —— 重试不会让开关自己变。\n\n== 元信息 ==\n/app/version                          桥协议版本 + App 版本（特性检测用）\n/app/help                             本清单\n\n== 插件状态 ==\n/app/plugins                          读回上次上报的加载状态\n/app/plugins?loaded=a,b&failed=c      上报（插件侧用）\n\n== 设备 shell（自动选择 root / Shizuku / ADB）==\n/root/dsh-bin/adb-shell \"命令\"        用 id 核验实际身份\n包装命令不存在时：python3 /root/.dsh/adb-shell.py \"命令\"\n短信只允许当前 Android 用户的 content query --uri content://sms，默认关闭；设置 → 设备能力授权可开启或撤销。\n短信预授权可能返回正文及验证码；不允许发送、修改或删除，Android 仍可拒绝访问。Shizuku 不执行此敏感查询。\n仅执行已识别的单条命令；允许读取各目录和明确路径的普通文件操作。禁止脚本、管道、重定向、未知命令。\n根目录及系统目录只读；禁止块设备/分区、SELinux、系统设置写入、挂载和刷机操作。\n结束进程前自动刷新全量用户/系统应用清单；普通用户应用直接结束，系统应用与关键进程拦截。\n按完整包名调用 am force-stop / killall / pkill -x；kill 正数 PID 会核对 UID 后按包名停止。\n策略拦截返回 [POLICY_BLOCKED]/126；root 和旧确认开关不能放行。不可用其它解释器或 UI 绕过。\n报连不上/未配对：先看上面的 App 层接口能不能办成；确实必须 shell 才请用户到\n设置 → 设备能力授权中连接可用通道，别反复试同一条命令。\n不要用 /root/dsh-bin/adb 或裸 adb —— 那是守卫包装脚本，会失败。\n\n== root（--su）==\n已启用并经 root 管理器授权的 su 可直接执行，无需 ADB 配对；其次使用 Shizuku，再使用 ADB。\n--su 仅在明确需要 root 时使用，须先在设备能力授权页允许；同一设备保护策略始终生效。\n[EXECUTION_UNKNOWN] 表示命令可能已执行，先核对实际状态，不能切换通道或自动重放。\n","DSHA 3090 bridge endpoints (BRIDGE_PROTOCOL=%s）\nThe host writes credentials to /root/.dsh/.bridge_headers. Use curl -H @/root/.dsh/.bridge_headers; keep tokens out of URLs and command arguments.\nFor parameters containing Chinese text or spaces, use -G --data-urlencode instead of encoding the URL manually.\n\n== Screen control (accessibility service; no ADB/Shizuku required) ==\nRead screen  curl -s -H @/root/.dsh/.bridge_headers \"127.0.0.1:3090/app/ui/dump\"\n      → Each line: [index] \"text\" clickable center=(x,y) bounds=l,t,r,b\nTap  curl -s -G 127.0.0.1:3090/app/ui/tap --data-urlencode \"text=Settings\" -H @/root/.dsh/.bridge_headers\n      → Prefer tapping by text: positions change with scrolling and animation. Use ?x=&y= only when no text is available.\nInput  curl -s -G 127.0.0.1:3090/app/ui/input --data-urlencode \"text=content\" -H @/root/.dsh/.bridge_headers\n      → Types into the focused field. Tap an input field first if none is focused.\nKey  /app/ui/key?name=back  (back/home/recents/notifications/quicksettings/lock)\nSwipe  /app/ui/swipe?x1=500&y1=1500&x2=500&y2=500&ms=300\nScreenshot  /app/ui/screenshot   → save a PNG in the app's screenshot folder and return its path (not base64)\nAfter each tap or input, dump the screen again before deciding the next step. Do not tap repeatedly from memory.\n\n== Independent virtual display (Android 11+; each input requires the latest frameSeq) ==\n/app/vscreen/create?orientation=portrait|landscape  Create a virtual display\n/app/vscreen/status  Query displayId, size and frameSeq\n/app/vscreen/launch?package=com.example.app  Launch an installed application\n/app/vscreen/see  Get the latest preview; tap/swipe/type/key must include its frameSeq\n/app/vscreen/close  Close and release the virtual display\n\n== Device & apps ==\n/app/device                     Model / Android / battery / network / display / storage / memory\n/app/apps                       Installed apps, separated into user and system apps; filter with q/limit/user=1\n/app/launch?pkg=com.tencent.mm  Launch app\n/app/clip                       Read clipboard (app must be in foreground; Android restriction)\n/app/clip + text=…              Write clipboard\n/app/readfile?path=/…          Read a directory or text at an absolute path, subject to Android permissions; credential directories (.dsh/.ssh/.android) cannot be read\nUse the protected device shell below for device file writes. Ordinary Download files are writable; DCIM/Pictures/Android/data/obb remain read-only.\n\n== User interaction ==\n/app/ask?options=Continue|Cancel + q=…  Ask in a blocking dialog (up to three options)\n/app/notify?title=… + text=…      Notification\n/app/toast + text=…               In-app toast\n/app/vibrate?ms=300               Vibrate (notify the user after a long task)\n/app/share (text= or path=)      Share to another app\n/app/open?url=https://…           Open URL\n/app/export?path=/root/report.md  Export an artifact to Download/DSHA; credential directories cannot be exported\nUse /app/ask when a decision is needed, and notify or vibrate when a long task finishes.\nUse /app/export to deliver reports; do not leave them only in the container.\n\n== Sensors & location (off by default; enable in Configuration) ==\n/app/location (fresh=1 forces a new fix; may take a few seconds)\n/app/sensors lists sensors · /app/sensor?name=light reads a value\n(light: ambient lux / accel / gyro / magnet / pressure / proximity /\n gravity / rotation quaternion / steps since boot)\n/app/torch?on=1 Flashlight\nWhen these APIs return DISABLED (feature off) or NO_PERMISSION (system permission missing),\nTell the user exactly where to enable it. Do not retry; retrying cannot turn the setting on.\n\n== Metadata ==\n/app/version                          Bridge protocol + app version (feature detection)\n/app/help                             This endpoint list\n\n== Plugin status ==\n/app/plugins                          Read last reported loading status\n/app/plugins?loaded=a,b&failed=c      Report status (for plugins)\n\n== Device shell (selects root / Shizuku / ADB automatically) ==\n/root/dsh-bin/adb-shell \"command\"        Use id to verify the actual identity\nIf the wrapper is missing: python3 /root/.dsh/adb-shell.py \"command\"\nSMS queries only allow content query --uri content://sms for the current Android user. Off by default; enable or revoke in Device permissions.\nPreauthorized SMS queries may return message bodies and verification codes. Sending, editing and deleting are blocked; Android may still deny access. Shizuku does not run this sensitive query.\nOnly recognized single commands are allowed, including directory reads and ordinary file operations on explicit paths. Scripts, pipes, redirects and unknown commands are blocked.\nRoot and system directories are read-only. Block devices/partitions, SELinux changes, system setting writes, mounts and firmware flashing are blocked.\nRefresh the complete user/system app list before stopping processes. Ordinary user apps may be stopped; system apps and essential processes are protected.\nUse the full package name with am force-stop / killall / pkill -x. A positive PID with kill is checked against its UID before stopping by package name.\nPolicy blocks return [POLICY_BLOCKED]/126. Root and legacy confirmation switches cannot override them. Do not use another interpreter or the UI to bypass a block.\nIf a connection or pairing error occurs, first check whether the app-level APIs above can perform the task. Only if a shell is essential, ask the user to open\nSettings → Device permissions to connect an available channel. Do not keep retrying the same command.\nDo not use /root/dsh-bin/adb or bare adb; those are guarded wrappers and will fail.\n\n== root（--su）==\nWhen su is enabled and authorized by the root manager, commands run directly without ADB pairing. Otherwise, Shizuku is used before ADB.\nUse --su only when root is explicitly required and enabled in Device permissions. The same device protection policy always applies.\n[EXECUTION_UNKNOWN] means the command may have executed. Verify the actual state before proceeding; do not switch connections or replay automatically.\n");
values.put("插件加载失败：%s","Plugin loading failed: %s");
values.put("FORBIDDEN: 路径无法解析（%s）","FORBIDDEN: Could not resolve path (%s)");
values.put("NOT_FOUND_OR_NO_PERMISSION: 路径不存在或 Android 未授予读取权限：%s","NOT_FOUND_OR_NO_PERMISSION: Path does not exist or Android denied read access: %s");
values.put("[APP_LIST_UNAVAILABLE] Android 未提供完整应用清单；设备停止操作会通过 ADB/Shizuku 重新读取。可用设备命令分别查询 pm list packages -U -3 和 pm list packages -U -s。原因：%s","[APP_LIST_UNAVAILABLE] Android did not provide a complete app list. Device stop operations will fetch it again through ADB/Shizuku.Use supported device commands to query pm list packages -U -3 and pm list packages -U -s separately. Reason: %s");
values.put("OK: 已打开 %s","OK: Opened %s");
values.put("OK: 震动 %sms","OK: Vibrating %sms");
values.put("模型试图在设备上执行：\n%s\n\n是否允许？","The model wants to run on the device:\n%s\n\nAllow this?");
values.put("确认弹窗弹出失败，仍可从通知确认：%s","Could not show confirmation dialog; confirmation remains available from the notification: %s");
values.put("无前台界面且通知权限被拒，确认必然超时拒绝：%s","No foreground page and notification permission denied; confirmation will time out and be denied: %s");
values.put("模型试图执行：%s","The model wants to run: %s");
values.put("[ERR] 读屏失败：%s","[ERR] Screen read failed: %s");
values.put("[ERR] 屏幕上找不到可点击的「%s」（先用 dump 看看实际文字）","[ERR] No clickable text found on screen: “%s” (use dump to inspect the actual text first)");
values.put("OK 已点击「%s」","OK Tapped “%s”");
values.put("[ERR] 点击失败：%s","[ERR] Tap failed: %s");
values.put("OK 已输入 %s 个字符","OK Entered %s characters");
values.put("[ERR] 输入失败：%s","[ERR] Input failed: %s");
values.put("[ERR] 不认识的按键「%s」（可用：back/home/recents/notifications/quicksettings/lock）","[ERR] Unknown key “%s” (available: back/home/recents/notifications/quicksettings/lock)");
values.put("OK 已发送 %s","OK Sent %s");
values.put("[ERR] 系统拒绝了 %s","[ERR] Android denied %s");
values.put("[ERR] 按键失败：%s","[ERR] Key press failed: %s");
values.put("[ERR] 手势未被接受（%s）","[ERR] Gesture not accepted (%s)");
values.put("[ERR] 手势超时（%s）","[ERR] Gesture timed out (%s)");
values.put("OK 已%s","OK %s");
values.put("[ERR] 手势被取消（%s，可能被其它手势打断）","[ERR] Gesture canceled (%s, possibly interrupted by another gesture)");
values.put("[ERR] 手势失败：%s","[ERR] Gesture failed: %s");
values.put("[ERR] 截屏需要 Android 11 及以上（当前 API %s）","[ERR] Screenshots require Android 11+ (current API %s)");
values.put("[ERR] 保存截屏失败：%s","[ERR] Could not save screenshot: %s");
values.put("[ERR] 截屏失败：%s","[ERR] Screenshot failed: %s");
values.put("[ERR] 建不了目录 %s","[ERR] Could not create directory %s");
values.put("OK 截屏已保存：%s（%sx%s）","OK Screenshot saved: %s(%sx%s)");
values.put("[ERR] 写截屏文件失败：%s","[ERR] Could not write screenshot file: %s");
}
private static void part40(Map<String,String> values) {
values.put("LAN 代理已启动：0.0.0.0:%s -> 127.0.0.1:%s","LAN proxy started: 0.0.0.0:%s -> 127.0.0.1:%s");
values.put("接收连接失败：%s","Could not accept connection: %s");
values.put("LAN 代理绑定失败：%s","LAN proxy bind failed: %s");
values.put("连接来自 %s","Connection from %s");
values.put("SCRIPTS_FAILED: ADB 脚本更新未完成\n%s","SCRIPTS_FAILED: ADB script update is incomplete\n%s");
values.put("GLIBC_PY_INSTALL_FAIL: 无法安装 Ubuntu Python3，请先修复基础环境\n%s","GLIBC_PY_INSTALL_FAIL: Could not install Ubuntu Python3. Repair the base environment first.\n%s");
values.put("SETUP_FAILED: 安装后验证未通过，请检查以下输出\n%s","SETUP_FAILED: Post-installation verification failed. Check the output below.\n%s");
values.put("WHEELS_INJECT_FAIL: %s；已有缓存原样保留，未用 APK 覆盖","WHEELS_INJECT_FAIL: %s; existing cache preserved and not overwritten by the APK");
values.put("WRITE_SECURE_SETTINGS 授权结果: %s","WRITE_SECURE_SETTINGS authorization result: %s");
values.put("KEEPALIVE_WARN: 连接已验证，但自动恢复授权未完成；重启后可能需手动打开无线调试\n%s","KEEPALIVE_WARN: Connection verified, but automatic recovery is not authorized. You may need to enable Wireless debugging manually after restart.\n%s");
values.put("WRITE_SECURE_SETTINGS 授权失败: %s","WRITE_SECURE_SETTINGS authorization failed: %s");
values.put("端口发现未启动（错误 %s），可手动填写端口","Port discovery did not start (error %s), enter the port manually if needed");
values.put("一个服务解析失败（错误 %s），继续查找本机端口…","A service could not be resolved (error %s), continuing to search for the local port…");
values.put("端口发现失败：%s","Port discovery failed: %s");
values.put("NOT_FOUND: %s（该应用没有启动入口或未安装）","NOT_FOUND: %s(app has no launch activity or is not installed)");
values.put("OK: 已启动 %s","OK: Launched %s");
values.put("OK: 已写入剪贴板（%s 字）","OK: Clipboard updated (%s characters)");
values.put("%s…（已截断）","%s…(truncated)");
values.put("ERROR: 剪贴板操作失败：%s","ERROR: Clipboard operation failed: %s");
values.put("%s主线程尚未执行，已取消本次剪贴板操作；可重试","%sThe main thread had not started this clipboard operation, so it was canceled. You can retry.");
values.put("禁止设备分区、SELinux、系统属性、挂载或刷机操作：%s","Partition, SELinux, system property, mount and firmware operations are blocked: %s");
values.put("不认识的命令不执行：%s","Unrecognized command blocked: %s");
values.put("受保护目录只读：%s","Protected directory is read-only: %s");
values.put("系统、关键或未识别应用不可结束：%s","System, essential or unidentified apps cannot be stopped: %s");
values.put("系统关键进程或归属不明的 PID 不可结束：%s","Essential system processes or PIDs with unknown ownership cannot be stopped: %s");
values.put("启动敏感应用：%s","Launch sensitive application: %s");
values.put("操作独立虚拟屏：%s","Operate independent virtual display: %s");
values.put("点按 (%d,%d)","Tap (%d,%d)");
values.put("滑动 (%d,%d)→(%d,%d)","Swipe (%d,%d)→(%d,%d)");
values.put("[ERR] 无障碍服务未开启。请让用户在 DSHA「设置 → 设备能力授权」点「设置屏幕操作」，或到系统设置 → 无障碍 → DSHA 配对助手 打开。","[ERR] Accessibility is off. Ask the user to open DSHA Settings → Device permissions → Screen control, or enable DSHA Pairing Assistant in Android Settings → Accessibility.");
values.put("[ERR] 截屏被系统拒绝（错误码 %d，太频繁了，隔一秒再试）","[ERR] Screenshot rejected by the system (error %d; too frequent, wait a second before retrying)");
values.put("[ERR] 截屏被系统拒绝（错误码 %d）","[ERR] Screenshot rejected by the system (error %d)");
values.put("显示 %d 个；Android 返回 %d 个可见应用。系统可能限制可见范围；结束应用前会另行核对完整清单。","Showing %d apps; Android returned %d visible apps. The system may restrict visibility; the complete inventory is checked again before stopping an app.");
values.put("检查%s失败：%s；保留此通道上次结果，可重试检查或继续使用已下载包","Checking %s failed: %s; this channel's previous result is retained. Retry the check or use the downloaded package");
values.put("检查%s失败：%s；可重新检查","Checking %s failed: %s; retry the check");
values.put("正在检查%s更新…","Checking for %s updates…");
values.put("发现新版本 %s","New version found: %s");
values.put("此通道暂无适合当前设备的更新；当前版本码 %s","This channel has no update compatible with this device; current version code %s");
values.put("下载尚未开始：%s；请在更新页重试","Download did not start: %s; retry on the update page");
values.put("下载暂停：%s；可继续下载","Download paused: %s; you can resume it");
values.put("%s\n已保留 %s 及已有下载文件，但无法确认查询来源；请联网重新检查，确认当前通道后才能下载/安装","%s\nRetained %s and its existing downloads, but the check channel is unknown; check online and confirm the current channel before downloading or installing");
values.put("%s\n候选来源：%s","%s\nCandidate channel: %s");
values.put("%s\n已保留 %s（来源：%s），与当前%s不匹配；切回来源通道或重新检查后才能下载/安装","%s\nRetained %s (source: %s), which does not match the current %s; switch back to its channel or check again before downloading or installing");
values.put("%s；保存任务状态失败，下次需要重新检查","%s; saving the task state failed; check again next time");
values.put("安装前校验失败：%s","Pre-install validation failed: %s");
values.put("安装前校验失败：%s；请重试","Pre-install validation failed: %s; retry");
values.put("安装包不是正式非调试版本","The package is not a non-debug release");
values.put("前台服务未获系统允许：%s","The system did not allow the foreground service: %s");
values.put("onStartCommand startForeground 失败：%s","onStartCommand startForeground failed: %s");
values.put("[保活] 取锁失败（不致命）：%s","[Keepalive] Power lease unavailable (nonfatal): %s");
values.put("备份成功，归档与导出文件已校验。\n%s","Backup succeeded; the archive and exported file were verified.\n%s");
values.put("确认恢复将停止 Web，并中断正在执行的任务。\n\n%s","Confirming restore will stop Web and interrupt running tasks.\n\n%s");
values.put("正在%s，完成后可重新生成报告。","%s is in progress; regenerate the report when it finishes.");
values.put("修复失败：%s\n","Repair failed: %s\n");
values.put("诊断未完成：%s","Diagnostics incomplete: %s");
values.put("无法开始诊断：%s","Cannot start diagnostics: %s");
values.put("\n建议操作\n证书或 npm 异常：点击「修复证书与 npm」。\n文件选择无返回：到插件页使用「其他文件选择器」。\n第三方插件导致启动失败：使用启动页的安全启动，再逐个恢复插件。\n存储不足：清理下载目录后重试，避免重新解压整个环境。\n\n隐私范围：未读取 API 配置、对话、终端命令或系统完整日志；没有自动上传此报告。可在下面补充复现步骤后复制或导出。\n","\nSuggested actions\nCertificate or npm errors: select “Repair certificates and npm”.\nFile picker returns nothing: use “Other file picker” on the Plugins page.\nA third-party plugin prevents startup: use Safe startup, then restore plugins one at a time.\nLow storage: clear the downloads directory and retry; avoid extracting the entire environment again.\n\nPrivacy scope: this report did not read API settings, conversations, terminal commands, or complete system logs, and was not uploaded automatically. Add reproduction steps below before copying or exporting it.\n");
values.put("无法启动安装任务：%s","Cannot start the installation task: %s");
values.put("任务异常：%s","Task exception: %s");
values.put("任务失败：%s","Task failed: %s");
values.put("无法确认后台进程退出，保留环境保护：%s","Cannot confirm the background process exited; environment protection remains: %s");
values.put("正在%s，请稍后再打开终端或发送命令","%s is in progress; open the terminal or send commands after it finishes.");
values.put("正在执行环境任务，请稍后再打开终端或发送命令","An environment task is in progress; open the terminal or send commands after it finishes.");
values.put("终端尚未停止，保留会话与环境保护：%s","The terminal has not stopped; its session and environment protection remain: %s");
values.put("最近启动失败\n%s\n%s\n\n%s\n\n=== 进程输出 ===\n","Latest startup failure\n%s\n%s\n\n%s\n\n=== Process output ===\n");
values.put("部分旧环境待清理：%s","Some older environments still need cleanup: %s");
values.put("插件注册失败：%s","Plugin registration failed: %s");
values.put("内置插件未完整注册，请先修复环境：%s","Built-in plugins were not fully registered; repair the environment first: %s");
values.put("rc1 迁移快照未完成，已阻止导入；原件保留。请检查存储权限和空间后重试：%s","rc1 snapshots are incomplete; import is blocked and originals are retained. Check storage access and space, then retry: %s");
values.put("本次配置快照暂不可用：%s","Configuration snapshot unavailable for this start: %s");
values.put("运行方式：%s","Runtime mode: %s");
values.put("启动未完成：%s","Startup incomplete: %s");
values.put("启动排队失败：%s","Cannot queue startup: %s");
values.put("本次实际运行方式：%s","Runtime mode used for this start: %s");
values.put("3090 桥启动失败：%s","Bridge 3090 failed to start: %s");
values.put("启动失败：%s","Startup failed: %s");
values.put("兼容重试失败：%s","Compatibility retry failed: %s");
values.put("停止旧 Web 失败：%s","Failed to stop the previous Web process: %s");
values.put("停用插件失败：%s","Failed to disable the plugin: %s");
values.put("dsh web 进程已创建 → 127.0.0.1:%s（等待鉴权链接…）","The dsh web process was created → 127.0.0.1:%s (waiting for its authentication link…)");
}
private static void part41(Map<String,String> values) {
values.put("%s 进程退出，退出码 %s（鉴权后）","%s process exited with code %s (after authentication)");
values.put("%s 进程退出，退出码 %s（鉴权前）","%s process exited with code %s (before authentication)");
values.put("首选 Web 端口已占用：%s","Preferred Web port is in use: %s");
values.put("实际 Web 端口：%s","Active Web port: %s");
values.put("上次任务因进程退出而中断，未自动重试。请先处理未完成的维护或重新选择备份。\n%s","The previous task was interrupted when the process exited and was not retried automatically. Resolve unfinished maintenance or select the backup again.\n%s");
values.put("Web 鉴权链接已失效（HTTP %s），请重新启动服务后进入","Web authentication link expired (HTTP %s); restart the service before opening it.");
values.put("Web 服务尚未就绪（HTTP %s），请稍后重试","The Web service is not ready (HTTP %s); retry later.");
values.put("Web 鉴权响应异常（HTTP %s），请查看启动日志","Unexpected Web authentication response (HTTP %s); review the startup log.");
values.put("Web 未接受登录凭据（HTTP %s），请重试或重新启动服务","Web did not accept the login credential (HTTP %s); retry or restart the service.");
values.put("Web 页面尚不可用（HTTP %s），请查看启动日志","The Web page is unavailable (HTTP %s); review the startup log.");
values.put("缺少备份支持脚本：%s","Missing backup support script: %s");
values.put("%s\n%s\n文件数：%d\n解压内容：%s\n来自版本：%s%s%s\n\n恢复会先停止 Web。当前数据会保留为 .pre-restore-*，恢复失败自动回滚；完成后可手动启动 Web。","%s\n%s\nFiles: %d\nExtracted contents: %s\nSource version: %s%s%s\n\nRestore stops Web first. Current data is retained as .pre-restore-* and restore failures roll back. Start Web manually afterward.");
values.put("%s\n文件数：%d","%s\nFiles: %d");
values.put("恢复完成：%s%s%s","Restore complete: %s%s%s");
values.put("文件不存在或软链接目标已失效：%s","File is missing or its symbolic-link target is no longer valid: %s");
values.put("文件不存在：%s","File does not exist: %s");
values.put("运行时更新未完成，原运行时及个人数据已保留：\n%s\n%s","Runtime update did not complete; the previous runtime and personal data were retained:\n%s\n%s");
values.put("\n部分旧运行时待下次清理：%s","\nSome old runtimes await a later cleanup: %s");
values.put("dsh 与内置插件更新完成；Ubuntu、个人目录、会话、配置和第三方插件保持原位。%s","dsh and built-in plugins updated; Ubuntu, personal folders, sessions, configuration and third-party plugins stayed in place.%s");
values.put("正在解压内置环境… %s","Extracting the bundled environment… %s");
values.put("环境重建未完成，原件及宿主数据副本已保留：\n%s\n%s","Environment rebuild did not complete; originals and host data snapshots were retained:\n%s\n%s");
values.put("可用空间不足：本阶段预计需要 %s，当前可用 %s。原环境保持原位，请释放空间后重试。","Insufficient free space: this stage is estimated to need %s; %s is available. The previous environment stays in place. Free some space and retry.");
values.put("新环境第 %d 步检查失败：%s","New environment step %d verification failed: %s");
values.put("新环境运行校验失败，将保留并回切原环境。\n%s","New environment runtime verification failed; the previous environment will be retained and restored.\n%s");
values.put("待清理目录不属于本应用：%s","Directory selected for cleanup does not belong to this app: %s");
values.put("无法读取待清理目录：%s","Cannot read the directory selected for cleanup: %s");
values.put("无法清理旧文件：%s","Cannot remove the old file: %s");
values.put("中断的运行时更新已回切；个人目录、会话和配置保持原位。\n%s","Interrupted runtime update rolled back; personal folders, sessions and configuration stayed in place.\n%s");
values.put("中断的维护已回滚；安全备份、旧环境及失败的新环境均已保留。\n%s","Interrupted maintenance rolled back; the safety backup and both environment trees were retained.\n%s");
values.put("WHEELS_CACHE_READY: 补齐 %d 个，原版已在位 %d 个，保留修改版 %d 个，保留额外 wheel %d 个%s%s","WHEELS_CACHE_READY: Added %d, bundled originals %d, modified files retained %d, extra wheels retained %d%s%s");
values.put("WHEELS_JAVA_EXTRACTED: 已校验并安装 %d 个 wheel，源缓存全部保留","WHEELS_JAVA_EXTRACTED: Verified and installed %d wheels; all source caches retained");
values.put("文件大小无效：%s","Invalid file size: %s");
values.put("条目路径冲突：%s","Entry path conflict: %s");
values.put("CRC/长度校验失败：%s","CRC/length verification failed: %s");
values.put("与 %s 的文件冲突：%s；请选择需要使用的版本","File conflicts with %s: %s; select the version you need");
values.put("WHEELS_CACHE_INVALID: %s：%s。源缓存已保留，未用 APK 覆盖。请先备份该文件并移出 wheels 目录，再重试补缺；自定义 wheel 请提供有效版本。","WHEELS_CACHE_INVALID: %s: %s. The source cache was retained. Back up this file and move it out of the wheels directory before retrying. Provide a valid version for a custom wheel.");
values.put("无法发布 Python 文件：%s","Cannot publish the Python file: %s");
values.put("目录是符号链接，已保留且未写入：%s","The directory is a symbolic link; retained without writing: %s");
values.put("目录位置已有其他条目，已保留：%s","Another entry occupies the directory location; retained: %s");
values.put("临时目录清理失败：%s","Temporary directory cleanup failed: %s");
values.put("维护路径不在预期私有目录：%s","Maintenance path is outside the expected private directory: %s");
values.put("维护阶段已存在：%s","Maintenance stage already exists: %s");
values.put("运行时维护路径不安全：%s","Unsafe runtime maintenance path: %s");
values.put("运行时阶段已存在：%s","Runtime stage already exists: %s");
values.put("新运行时缺少文件：%s","New runtime is missing a file: %s");
values.put("%s 分 %s 秒","%s min %s s");
values.put("%s 时 %s 分","%s h %s min");
values.put("npm 插件包 · %s","npm plugin package · %s");
values.put("插件压缩包 · %s","Plugin archive · %s");
values.put("%s · 默认分支","%s · default branch");
values.put("%s\n分支/目录：%s","%s\nBranch/directory: %s");
values.put("短信查询不支持此选项：%s","SMS query does not support this option: %s");
values.put("%s：未收到结果","%s: no result received");
values.put("%s：正常","%s: ready");
values.put("%s：失败（退出码 %s）","%s: failed (exit code %s)");
values.put("[关闭会话：取消 %s 条尚未发送的命令]\n","[Closing session: cancelled %s commands that have not been sent]\n");
values.put("[终端启动失败：%s；未发送的命令保留，重试后继续]\n","[Terminal startup failed: %s; unsent commands are retained and will continue after retry]\n");
values.put("[终端启动清理失败，保留环境占用：%s]\n","[Terminal startup cleanup failed; environment protection retained: %s]\n");
values.put("[无法核验终端本次进程身份，保留环境占用：%s]\n","[Cannot verify this terminal process identity; environment protection retained: %s]\n");
values.put("[%s；命令尚未发送，已保留。完成后请重试重启]\n","[%s; the command has not been sent and is retained. Retry restarting after the operation finishes]\n");
values.put("[发送结果不确定，未自动重发：%s；请检查执行结果。%s]\n","[Send result is uncertain; no automatic resend: %s; check the execution result. %s]\n");
values.put("[中止失败，未创建新会话：%s；待发命令保留，请再次点中止重试]\n","[Stop failed; no new session was created: %s; pending commands are retained. Tap Stop again to retry]\n");
values.put("[终端读取失败：%s]\n","[Terminal read failed: %s]\n");
values.put("symlink 失败: %s -> %s: %s","symlink failed: %s -> %s: %s");
values.put("link 失败: %s -> %s: %s","link failed: %s -> %s: %s");
values.put("终端回收暂未确认，下次维护将重新核验：%s","Terminal cleanup is not confirmed; the next maintenance operation will check again: %s");
values.put("\n已准备内容 SHA-256：%s","\nPrepared contents SHA-256: %s");
values.put("自动开无线调试失败: %s","Could not enable wireless debugging automatically: %s");
values.put("后台暂不能启动 ADB 保活: %s","ADB keep-alive cannot start in the background yet: %s");
values.put("ADB 保活启动失败: %s","ADB keep-alive failed to start: %s");
values.put("3090 桥启动失败: %s","Bridge on port 3090 failed to start: %s");
values.put("Shizuku 绑定失败: %s","Could not bind Shizuku: %s");
values.put("网络监听注册失败: %s","Could not register the network listener: %s");
values.put("屏幕广播注册失败: %s","Could not register screen broadcasts: %s");
values.put("保活探测异常: %s","Keep-alive probe error: %s");
values.put("保活探测未完成：%s","Keep-alive probe did not complete: %s");
values.put("设备确认桥未就绪：%s","Device confirmation bridge is not ready: %s");
values.put("ADB 准备失败：%s","ADB preparation failed: %s");
values.put("触发原因：%s","Triggered by: %s");
values.put("重连端口 %s","Reconnecting on port %s");
}
private static void part42(Map<String,String> values) {
values.put("无线调试连接尚未验证；请检查连接端口或重新配对。%s","The wireless debugging connection has not been verified. Check the connection port or pair again. %s");
values.put("无线调试似乎已关闭（失败 %s 次）","Wireless debugging appears to be disabled (%s failed attempts)");
values.put("已授权，连接失败：%s。点击下方重试。","Authorized, but the connection failed: %s. Retry below.");
values.put("[EXECUTION_UNKNOWN] 设备命令结果未确认，不会自动重试：%s\n[EXIT=125]","[EXECUTION_UNKNOWN] Device command result is unconfirmed; it will not be retried automatically: %s\n[EXIT=125]");
values.put("[EXECUTION_UNKNOWN] 虚拟屏启动结果未确认，不会自动重试：%s\n[EXIT=125]","[EXECUTION_UNKNOWN] Virtual screen startup result is unconfirmed; it will not be retried automatically: %s\n[EXIT=125]");
values.put("位置 %s","Location %s");
values.put("传感器/手电 %s","Sensors/flashlight %s");
values.put("BAD_KEY 支持的名字：light accel gyro magnet pressure proximity humidity temperature gravity rotation steps","BAD_KEY Supported names: light accel gyro magnet pressure proximity humidity temperature gravity rotation steps");
values.put("运行工具准备失败：%s","Runtime tools could not be prepared: %s");
values.put("推文件进容器失败: %s","Could not copy the file into the container: %s");
values.put("从容器取文件失败: %s","Could not copy the file out of the container: %s");
values.put("Ubuntu Python 安装失败: %s","Ubuntu Python installation failed: %s");
values.put("离线 pnpm 安装失败: %s","Bundled pnpm installation failed: %s");
values.put("停止隔离检查进程未完成：%s","The isolated trial process has not stopped: %s");
values.put("停止 Web 未完成：%s","Web has not stopped: %s");
values.put("PDF 兼容适配未应用，原文件保留：%s","PDF compatibility was not applied; the original file is retained: %s");
values.put("网页脚本拼接优化未应用，原文件保留：%s","Script combination was not applied; the original file is retained: %s");
values.put("检查未完成：%s","The check did not finish: %s");
values.put("proroot 运行时缺 %s","The proroot runtime is missing %s");
values.put("内置 npm 文件缺失：%s-cli.js","Bundled npm file is missing: %s-cli.js");
values.put("缺 %s 个运行时文件（%s 等）","Missing %s runtime files (including %s)");
values.put("ERROR: 命令执行超时（%s 秒），已请求停止本次进程","ERROR: Command timed out after %s seconds; stopping has been requested");
values.put("基础工具安装失败（退出码 %s），请查看上方软件源/网络输出","Basic tools installation failed (exit code %s); check the repository and network output above");
values.put("退出码 %s：\n%s","Exit code %s:\n%s");
values.put("无法查询终端会话（errno=%s），请稍后重试","Could not query the terminal session (errno=%s); try again later");
values.put("命令超时（%s 秒），当前步骤未完成，请重新检查","Command timed out after %s seconds; this step is incomplete and needs to be checked again");
values.put("跳过 · %s：%s","Skipped · %s: %s");
values.put("已读取离线包 %s MiB","Read %s MiB from the bundled archive");
values.put("已按需修复 %s 步，并通过复验","Repaired %s steps as needed and verified them again");
values.put("检查第 %s 步：%s","Checking step %s: %s");
values.put("%s：通过","%s: passed");
values.put("容器探测退出码 %s，检查未完整执行","Container probe exited with code %s; the checks did not finish");
values.put("检查 Web 进程失败（PID %s，errno=%s）","Could not inspect the Web process (PID %s, errno=%s)");
values.put("无法核验本应用进程（PID %s）：%s","Could not verify this app process (PID %s): %s");
values.put("打不开，请手动访问：%s","Could not open. Visit manually: %s");
values.put("打不开 QQ，请手动搜索群号：%s","Could not open QQ. Search for group number: %s");
values.put("找不到开发者选项时，到关于手机连续点按系统版本号。系统或厂商未提供无线调试时，填写端口无法启用它。\n\n通常让地址与端口留空即可自动发现。配对端口来自 6 位码弹窗，连接端口来自无线调试主页面，两者不能互换。\n\n首次准备依赖可能较久；配对码失效时请重新获取。自动读码需要屏幕操作权限，手动输入无需此权限。","If Developer options is missing, tap the build number repeatedly in About phone. Entering a port cannot enable Wireless debugging if your Android version or manufacturer does not provide it.\n\nUsually, leave address and port blank for automatic discovery. The pairing port comes from the 6-digit-code dialog; the connection port comes from the main Wireless debugging page. They are not interchangeable.\n\nInitial dependency preparation may take time. Get a fresh code if yours expires. Auto-read requires screen-control permission; manual entry does not.");
values.put("ADB 操作未完成：%s","ADB operation incomplete: %s");
values.put("连接已验证，ADB 设备命令可用。\n\n%s","Connection verified. ADB device commands are available.\n\n%s");
values.put("配对已完成，连接尚未验证。请检查连接端口后点「验证已有连接」，无需再次配对。\n\n%s","Pairing is complete, but the connection is not yet verified. Check the connection port and tap Verify connection. There is no need to pair again.\n\n%s");
values.put("LAN 开关生效失败: %s","Could not apply LAN setting: %s");
values.put("无法打开 Shizuku：%s","Could not open Shizuku: %s");
values.put("正在重连无线调试…%s","Reconnecting to Wireless debugging…%s");
values.put("连接已验证 · 端口 %s%s","Connection verified · Port %s%s");
values.put("配对密钥已保存，连接尚未验证。%s","Pairing key saved. Connection not yet verified.%s");
values.put("ADB 状态读取失败：%s","Could not read ADB status: %s");
values.put("打开设置失败：%s","Could not open settings: %s");
values.put("导出失败：%s","Export failed: %s");
values.put("\n用户补充复现步骤：\n%s","\nAdditional steps to reproduce:\n%s");
values.put(" · 总耗时 %s 秒%s%s"," · Total time %s s%s%s");
values.put(" · 当前阶段 %s 秒"," · Current stage %s s");
values.put("会停止 Web 并中断正在执行的任务，完整备份并校验配置、会话和本地插件，再重建环境并恢复数据。\n\n备份失败不切换环境，后续失败回切旧环境；安全备份和旧环境会保留并占用额外空间。额外安装的系统软件留在旧环境中。","Stop the Web service and interrupt running tasks. Back up and verify settings, conversations and local plugins, then rebuild the environment and restore data.\n\nIf backup fails, the environment is unchanged. If a later step fails, the old environment is restored. The safety backup and old environment use additional space. Extra system software remains in the old environment.");
values.put("无法打开维护页，可到数据与备份页查看任务：%s","Could not open maintenance. Check the task in Backup & data: %s");
values.put("拉起保活服务失败: %s","Could not start the keep-alive service: %s");
values.put("\n\n本机 Web 地址（可长按复制）：\n%s","\n\nLocal Web address (press and hold to copy):\n%s");
values.put("检测到 %s 项异常，查看插件与恢复选项","Detected %s issues; check plugins and recovery options");
values.put("失败 %s/3，%s，查看恢复选项","Failed %s/3, %s; see recovery options");
values.put("复制失败：%s","Copy failed: %s");
values.put("发现新版本 %s · %s","New version available: %s · %s");
values.put("无法打开文件选择器，请检查系统文件应用：%s","Unable to open the file picker. Check the system Files app: %s");
values.put("\n\n版本：%s%s%s%s%s%s","\n\nVersion: %s%s%s%s%s%s");
values.put("\n位置：%s","\nLocation: %s");
values.put("\n来源：%s","\nSource: %s");
values.put("\n上次检查版本：%s","\nLast checked version: %s");
values.put("\n可回退：%s","\nRollback available: %s");
values.put("PTY 启动失败：%s","PTY startup failed: %s");
values.put("关闭失败，会话仍保留：%s","Close failed; session retained: %s");
values.put("保留记录无法读取，原件未改动。\n%s","Retained records are unreadable. Originals are unchanged.\n%s");
values.put("…（输出过长已截断）\n%s","…(long output truncated)\n%s");
values.put("关闭终端 %s","Close terminal %s");
values.put("无法安装：%s；可重试","Cannot install: %s; retry available");
values.put("正在下载 %s","Downloading %s");
values.put("服务返回 HTTP %s","Service returned HTTP %s");
values.put("已保存：%s","Saved: %s");
values.put("标准版预览内核: %s","Standard browser engine: %s");
values.put("系统 WebView 初始化失败: %s","System WebView initialization failed: %s");
values.put("请更新或启用 Android System WebView / Chrome，也可以使用系统浏览器进入对话。","Update or enable Android System WebView / Chrome. You can also open the conversation in a system browser.");
values.put("\n上次未完成：%s","\nPreviously incomplete: %s");
values.put("⚠ 请求执行：%s","⚠ Requested command: %s");
values.put("悬浮条确认显示失败: %s","Could not display overlay confirmation: %s");
}
private static void part43(Map<String,String> values) {
values.put("悬浮条更新失败: %s","Could not update overlay: %s");
values.put("悬浮条预览显示失败: %s","Overlay preview failed: %s");
values.put("悬浮条创建失败（权限被撤？）: %s","Could not create overlay (permission may have been revoked): %s");
values.put("%s · 总耗时 %s 秒%s%s","%s · Total time %s seconds%s%s");
values.put("%s\n\n版本：%s%s%s%s%s%s","%s\n\nVersion: %s%s%s%s%s%s");
values.put("%s · 点击查看进度","%s · View progress");
values.put("%s，%s，点击查看详情","%s, %s. Tap for details");
values.put("内置插件脚本执行失败: %s","The bundled plugin helper failed: %s");
values.put("rc1 数据迁移保护失败：%s","Legacy migration protection failed: %s");
values.put("插件管理脚本执行失败: %s","The plugin manager failed: %s");
values.put("proot 路径: %s\nnativeLibDir: %s\nruntimeMode: %s\nrootfs exec: %s\n","proot path: %s\nnativeLibDir: %s\nruntimeMode: %s\nrootfs exec: %s\n");
values.put("命令执行超时（%s 秒），已请求停止本次进程","Command timed out after %s seconds; stopping has been requested");
values.put("安装步骤失败（%s）：%s","Installation stage failed (%s): %s");
values.put("QQ群 %s · 问题反馈","QQ group %s · Issue tracker");
values.put("无法打开浏览器，请在浏览器中访问 %s","Could not open the browser. Visit %s");
values.put("Web 根目录是链接，未终止任何进程","The Web root is a link; no process was stopped.");
values.put("Web 根目录不属于本应用，未终止任何进程","The Web root is not owned by this app; no process was stopped.");
values.put("Web 根目录权限无法确认：%s","Cannot confirm Web root access: %s");
values.put("Web 记录不属于本应用，未终止任何进程","The Web record is not owned by this app; no process was stopped.");
values.put("Web 记录权限无法确认：%s","Cannot confirm Web record access: %s");
values.put("无法核验本应用进程：%s","Cannot verify this app process: %s");
values.put("Web 旧记录隔离目录异常，原环境保留","The old Web record quarantine is invalid; the environment is retained.");
values.put("无法隔离旧 Web 记录，原环境保留","Cannot quarantine the old Web record; the environment is retained.");
values.put("无法隔离旧 Web 身份记录，原环境保留","Cannot quarantine the old Web identity record; the environment is retained.");
values.put("Web 身份记录暂未保存：%s","The Web identity record could not be saved: %s");
values.put("Web 进程身份尚未确认，原环境保留：%s","The Web process identity is unconfirmed; the environment is retained: %s");
values.put("隔离验证进程身份已变化，原现场保留","The isolated trial process identity changed; its original state is retained.");
values.put("系统拒绝终止本次 Web，原环境保留","The system denied stopping this Web process; the environment is retained.");
values.put("Web 退出尚未确认，原环境保留：%s","Web exit is unconfirmed; the environment is retained: %s");
values.put("隔离验证停止未完成：%s","The isolated trial stop is incomplete: %s");
values.put("隔离验证进程退出尚未确认，原现场保留","The isolated trial process exit is unconfirmed; its original state is retained.");
values.put("本应用仍有未退出的 Web，原环境保留","This app still has a running Web process; the environment is retained.");
values.put("本应用进程清单尚未确认，原环境保留：%s","This app process list is unconfirmed; the environment is retained: %s");
values.put("无法核验本次 Web 停止候选，未终止任何进程：%s","Cannot verify this Web stop candidate; no process was stopped: %s");
values.put("请先完成普通停止；只有退出尚未确认时才能准备强制停止候选","Complete the normal stop first; a force-stop candidate is available only while exit remains unconfirmed.");
values.put("Web 停止请求已变化，请重新检查当前状态","The Web stop request changed; check the current state again.");
values.put("Web 身份记录无效，原环境保留","The Web identity record is invalid; the environment is retained.");
values.put("隔离验证进程不可读取，原现场保留","The isolated trial process is unreadable; its original state is retained.");
values.put("已知 Web 启动器未能确认退出","The known Web launcher has not been confirmed to exit.");
values.put("未完成的操作：%s\n最后记录阶段：%s\n\n%s\n\n原件状态：尚未确认恢复完成。请查看记录后使用“恢复中断维护”；也可进入受限主界面导出可读副本。","Incomplete operation: %s\nLast recorded stage: %s\n\n%s\n\nOriginal state: recovery has not been confirmed. Inspect the record and use Recover interrupted maintenance, or enter the limited interface to export readable copies.");
values.put("最近手动备份：%s\n%s","Latest manual backup: %s\n%s");
values.put("\n最近自动副本：%s","\nLatest automatic copy: %s");
values.put("发现已有备份：\n%s\n\n先核验内容和实际范围，确认后才会恢复。","A backup was found:\n%s\n\nIts contents and actual scope are verified before you confirm a restore.");
values.put("\n另有 %s 个备份无法自动读取，可手动选择。","\n%s other backups cannot be read automatically; you can choose one manually.");
values.put("%s 将从加载路径移除；原件保留在数据页的保留区。对话、其他插件和外部源码目录保留。","%s will be removed from the loading path. Originals remain in the retained data area. Conversations, other plugins and external source folders are preserved.");
values.put("应急网页无法加载：%s","Cannot load the emergency page: %s");
values.put("DSHA v%s · MIT 许可","DSHA v%s · MIT License");
values.put("跟随系统 · %s","Follow system · %s");
values.put("\n已安全清理 %s 项 · %s","\nSafely removed %s items · %s");
values.put("Web 端口被占用：%s","Web port in use: %s");
values.put("插件已卸载，可重试启动：%s","Plugin removed. You can retry startup: %s");
values.put("%s 项 · %s","%s entries · %s");
values.put("旧环境清理暂缓，原件保留：%s","Old environment cleanup was deferred; originals retained: %s");
values.put("\n旧事务归档暂缓，原件保留：%s","\nOld transaction archival deferred; originals retained: %s");
values.put("检查离线安装运行方式：%s","Checking cold-install runtime: %s");
values.put("使用已验证方式安装离线工具：%s","Installing offline tools with verified runtime: %s");
values.put("离线工具尚未安装完成；已保留解压文件、安装现场和诊断：\n%s","Offline tools are incomplete; extracted files, installation state and diagnostics are retained:\n%s");
values.put("隔离检查插件无法启动，详细原因：\n%s","The isolated verification plugin could not start. Details:\n%s");
values.put("%s\n错误代码：%s","%s\nError code: %s");
values.put("应急 DSH 未就绪：%s","Recovery DSH is not ready: %s");
values.put("应急进程退出尚未确认：%s","Recovery process exit is unconfirmed: %s");
values.put("正在校验应急安装包 (%s/%s)…","Verifying recovery archive (%s/%s)…");
values.put("正在准备应急环境 (%s/%s)…","Preparing recovery runtime (%s/%s)…");
values.put("已保留的应急运行时约 %s；应急会话约 %s。原件保留，未自动删除。","Retained recovery runtimes: approximately %s; recovery sessions: approximately %s. Originals are retained; no automatic deletion was performed.");
values.put("正在核验应急文件 (%s/%s)…","Verifying recovery files (%s/%s)…");
values.put("作品与文件导出","Files and exports");
values.put("储存指南","Storage guide");
values.put("技能（Skills）","Skills");
values.put("浏览工作区 · 保存到手机 · 分享","Browse workspace · Save to device · Share");
values.put("数据位置 · 导出备份 · 恢复与清理","Data locations · Export backups · Restore and clean up");
values.put("查看技能 · 导入 SKILL.md","View skills · Import SKILL.md");
values.put("作品文件导出","Export work files");
values.put("选择工作目录里的作品文件，保存到手机或分享给其他应用。无需 Root；这是普通文件导出，完整数据备份另有入口。","Choose a file from your workspace to save on the device or share with another app. No root is needed. Full data backups have a separate entry.");
values.put("上一级","Up");
values.put("刷新","Refresh");
values.put("取消导出","Cancel export");
values.put("保存原始文件，或选择接收文件的应用。","Save the original file or choose an app to receive it.");
values.put("保存到…","Save to…");
values.put("分享…","Share…");
values.put("分享作品文件","Share work file");
}
private static void part44(Map<String,String> values) {
values.put("正在读取目录…","Reading folder…");
values.put("这个目录没有可读取的文件。","This folder has no readable files.");
values.put("已取消文件操作。","File operation cancelled.");
values.put("应用在选择保存位置期间重新启动，请重新选择文件导出。","The app restarted while choosing a destination. Select the file again.");
values.put("已打开分享选择器，请在接收应用中完成分享。","The share picker is open. Complete sharing in the receiving app.");
values.put("点目录继续浏览，点文件选择保存或分享。","Tap a folder to browse, or a file to save or share.");
values.put("文件发生了变化，请等待写入完成后刷新并重试。","The file changed. Wait for writing to finish, then refresh and retry.");
values.put("保存后的文件未通过字节核验，请重新选择保存位置。","The saved file failed verification. Choose another destination and retry.");
values.put("请选择手机或其他文件服务中的新文件保存位置。","Choose a new file destination on the device or another file service.");
values.put("所选项目不是可导出的普通文件。","The selected item is not an exportable regular file.");
values.put("目录","Folder");
values.put("正在核对并导出：%s","Verifying and exporting: %s");
values.put("已保存文件：%s","File saved: %s");
values.put("文件操作未完成：%s\n可刷新目录，或返回上一级查找作品文件。","File operation incomplete: %s\nRefresh the folder or go up to find your work files.");
values.put("位置：%s","Location: %s");
values.put("作品文件浏览","Browse work files");
values.put("存储、备份与重建说明","Storage, backups and rebuilding");
values.put("先看保留范围，再选择操作。打开本页不会修改文件或停止 DSH。","Check what is kept before choosing an operation. Opening this guide does not change files or stop DSH.");
values.put("只想腾空间，从这里开始","Start here to free up space");
values.put("先到「存储与文件」查看占用。完整 Ubuntu、Node 和插件依赖属于应用数据，通常比 Android 缓存大得多。Android「清缓存」可能只有几十 MB，清完不会移除这套运行环境。","Check usage in Storage and files first. The full Ubuntu environment, Node and plugin dependencies are app data, usually much larger than Android's cache. Clear cache may free only a few dozen MB and does not remove the runtime.");
values.put("应用内清理只移除可再生缓存和已核验的多余运行时副本。对话、附件、设置、插件、手动备份和无法核验的原件保留。清理前仍会在原页面确认，并安全停止 DSH 和终端。","In-app cleanup removes reproducible caches and verified excess runtime copies. It keeps conversations, attachments, settings, plugins, manual backups and unverified originals. The existing page still asks for confirmation and safely stops DSH and terminals before cleanup.");
values.put("查看占用与清理选项","View usage and cleanup options");
values.put("打开存储页后才统计详细大小；清理仍需原页面确认。","Detailed sizes are calculated after opening the storage page. Cleanup still needs confirmation there.");
values.put("重要数据，先导出再维护","Export important data before maintenance");
values.put("导出选择「应用数据」可保存对话、附件、配置和用户插件，不会复制完整 Ubuntu。个人项目要另选目录；原生 API Key 默认不包含，需要时在导出页主动勾选。","Choose Application data to export conversations, attachments, settings and user plugins, without copying the full Ubuntu environment. Select personal project folders separately. The native API key is excluded by default; explicitly select it on the export page if needed.");
values.put("新导出文件为 DSHA-data-v5-….tar.gz，无需备份密码。请用系统保存窗口存到 App 外的文档、下载或云盘，并另留一份。导出完成后可先做恢复预检，确认范围和文件可读；预检不会立即覆盖当前数据。","New exports are DSHA-data-v5-….tar.gz files and need no backup password. Use the system save dialog to store the file outside the app, in Documents, Downloads or cloud storage, and keep another copy. Then inspect it before restoring to check its scope and readability. Inspection does not immediately overwrite current data.");
values.put("本机自动备份和重建保护副本仍在 App 内，不保证清除全部存储或卸载后可用。历史加密备份仍需保存原密码。","Local automatic backups and rebuild protection copies stay inside the app and are not guaranteed to survive clearing app storage or uninstalling. Keep the original passwords for older encrypted backups.");
values.put("去导出重要数据","Export important data");
values.put("选择备份做恢复预检","Choose a backup to inspect");
values.put("先检查文件，再由原页面确认是否恢复。","Check the file first, then confirm any restoration on the existing page.");
values.put("适合：Ubuntu 或运行组件损坏、普通修复无效。它会保护并核验对话、附件、配置、用户插件和个人项目，再重建运行环境并恢复数据；原生 API Key 保留在本机。","Use this when Ubuntu or runtime components are damaged and ordinary repair has not helped. It protects and verifies conversations, attachments, settings, user plugins and personal projects, then rebuilds the runtime and restores the data. The native API key stays on this device.");
values.put("影响：会停止 DSH、终端和正在执行的任务，需要时间和额外空间。额外安装的系统软件留在旧环境中，可能要在新环境重新安装。保护副本和旧环境按核验规则保留，不能保证重建后立刻腾出空间。","Effects: DSH, terminals and active tasks stop. Rebuilding takes time and extra space. Additional system software stays in the old environment and may need reinstalling in the new one. Protection copies and old environments are retained under verification rules, so rebuilding may not immediately free space.");
values.put("保护失败时不切换环境，后续失败会尝试回切原环境。建议先把重要数据导出到 App 外；只想腾空间时先用存储页的清理选项。","If data protection fails, the environment is not switched. Later failures attempt to return to the original environment. Export important data outside the app first. To free space, start with cleanup on the storage page.");
values.put("打开安装与环境","Open installation and environment");
values.put("查看原有修复和重建入口，打开页面不会开始重建。","View the existing repair and rebuild options. Opening the page does not start a rebuild.");
values.put("重置配置（保留对话）","Reset settings (keep conversations)");
values.put("适合：网页设置错误。保留对话、附件、用户插件、个人文件和原生保存的 API Key，不重建 Ubuntu，也不移除额外安装的软件。","Use this for incorrect web settings. It keeps conversations, attachments, user plugins, personal files and the natively saved API key. Ubuntu is not rebuilt, and additional software is not removed.");
values.put("影响：先停止 DSH、终端和写入任务，再重置当前网页的普通设置和工作目录配置。原配置保留以便恢复；原生 API Key 不会因此清空。入口在「设置 → 数据与备份 → 重置配置」，仍需原来的确认。","Effects: DSH, terminals and writers stop before the current web profile's ordinary settings and workspace configuration are reset. The original settings are retained for recovery, and the native API key is not cleared. Open Settings → Data and backups → Reset settings; the existing confirmation still applies.");
values.put("Android 系统「清缓存」","Android's Clear cache");
values.put("通常只删除 Android 标记的临时缓存，之后使用会重新生成。Ubuntu、插件依赖、对话和本机备份存放在应用数据中，不会靠清缓存释放。系统显示缓存只有几十 MB，而应用数据很大，是两种不同的占用。","This usually removes only temporary files marked as cache by Android; they are recreated with use. Ubuntu, plugin dependencies, conversations and local backups are app data and are not freed by clearing cache. A cache of a few dozen MB and much larger app data are different kinds of storage usage.");
values.put("Android 系统「清除全部存储／清除数据」","Android's Clear storage / Clear data");
values.put("会删除 App 私有目录中的对话、附件、插件、配置、API Key、本机备份和 Ubuntu 环境。下次打开需要重新解压和设置。卸载应用也会删除这些私有数据。","This deletes conversations, attachments, plugins, settings, API keys, local backups and Ubuntu from the app's private directory. The next launch needs fresh extraction and setup. Uninstalling also deletes these private data.");
values.put("本机副本会随私有数据一起删除，不能依赖它救回数据。只有事先存到 App 外且可读的导出文件，才可在重新初始化后手动导入其中的数据范围。未导出的私有数据，App 无法恢复。","Local copies are deleted along with private data and cannot be relied on for recovery. Only a readable export saved outside the app beforehand can be imported manually after fresh setup, within its exported scope. The app cannot recover private data that was never exported.");
values.put("应用内「完整格式化」","In-app full format");
values.put("用于确实要从头开始。原有确认和停止检查通过后，会删除运行环境、对话、插件、配置、API Key 等核心私有数据，并回到欢迎页。它不是保留对话的配置重置；操作前先导出重要数据到 App 外。","Use this to start over completely. After the existing confirmation and shutdown checks, it deletes the runtime, conversations, plugins, settings, API keys and other core private data, then returns to the welcome page. It does not keep conversations like a settings reset. Export important data outside the app first.");
values.put("为什么占用会增长","Why storage usage grows");
values.put("首次解压完整 Ubuntu、安装软件或插件依赖、保存附件和项目、生成备份都会占空间。自动备份正常保留 3 份；手动备份、未知记录和受损原件不会自动删除。更新也会保留可用的回退副本，方便出现问题时恢复。","Extracting Ubuntu, installing software or plugin dependencies, saving attachments and projects, and making backups all use space. Normally, three automatic backups are kept. Manual backups, unknown records and damaged originals are not deleted automatically. Updates also keep usable rollback copies for recovery.");
values.put("存储页会按规则清理已核验的多余副本；被修改、含额外文件或无法确认的原件继续保留。需要查看这些内容时，可打开保留副本清单；不要为了腾空间直接手动删除 Ubuntu 或依赖目录。","The storage page cleans verified excess copies under its existing rules. Modified originals, copies with extra files and unverified originals remain retained. Browse the retained-copy list to inspect them. Avoid manually deleting Ubuntu or dependency folders to free space.");
values.put("查看本机自动备份","View local automatic backups");
values.put("查看计划和已保留的自动副本。","View the schedule and retained automatic copies.");
values.put("查看保留副本与旧环境","View retained copies and old environments");
values.put("只读查看清单，检查、导出与恢复仍由原页面处理。","Browse the list without changing originals. Inspection, export and restoration use their existing pages.");
values.put("从文件导入 SKILL.md，让 DSH 按需读取可复用的任务说明。无需 Root。","Import SKILL.md files so DSH can load reusable task instructions as needed. Root is not required.");
values.put("这里管理用户全局技能。导入仅复制 SKILL.md，正文中的命令不会自动执行；引用的脚本和资料需用文件入口另行放入同一技能目录。","This page manages global user skills. Import copies only SKILL.md and does not run commands in its body. Add referenced scripts and resources to the same skill folder through Files.");
values.put("导入 SKILL.md","Import SKILL.md");
values.put("刷新技能","Refresh skills");
values.put("取消读取","Cancel reading");
values.put("尚无可读取的用户全局技能。","No readable global user skills yet.");
values.put("可读取的用户全局技能：%s","Readable global user skills: %s");
values.put("另有 %s 个技能文件无法通过导入格式检查，原件已保留。","%s additional skill files did not pass the import format checks. Their originals were retained.");
values.put("查看 SKILL.md","View SKILL.md");
values.put("模型可按需调用 skill 工具读取。","The model can load this with the skill tool as needed.");
values.put("此技能禁止模型自主调用。","This skill disables autonomous model invocation.");
values.put("在聊天中输入 /%s 可明确调用。","Enter /%s in chat to invoke it explicitly.");
values.put("复制调用命令","Copy invocation");
values.put("此技能禁止用户直接调用。","This skill disables direct user invocation.");
values.put("选择技能文件后可查看内容并复制调用命令。","Select a skill to view its contents and copy its invocation.");
values.put("正在读取用户技能…","Reading user skills…");
values.put("正在读取并检查 SKILL.md…","Reading and checking SKILL.md…");
values.put("已导入技能：%s\n%s\nDSH 会在后续请求中发现此技能；若目录尚未刷新，可重启 Web。","Imported skill: %s\n%s\nDSH discovers this skill on subsequent requests. Restart Web if its catalog has not refreshed.");
values.put("已取消读取，未导入技能。","Reading cancelled. No skill was imported.");
values.put("请选择名为 SKILL.md 的文件，不能导入目录或压缩包。","Choose a file named SKILL.md. Folders and archives cannot be imported.");
values.put("SKILL.md 必须为非空文件，且不超过 1 MiB。","SKILL.md must be non-empty and at most 1 MiB.");
values.put("SKILL.md 必须是有效 UTF-8 文本。","SKILL.md must contain valid UTF-8 text.");
values.put("技能格式无效。文件需以 --- YAML 开头，包含小写短横线 name 和非空 description；调用开关使用 disable-model-invocation / user-invocable。未导入文件。","Invalid skill format. Start with --- YAML frontmatter, include a lowercase kebab-case name and non-empty description, and use disable-model-invocation / user-invocable for invocation controls. No file was imported.");
values.put("已有同名技能或目录，未覆盖原件。请先在源文件中使用不同的 name。","A skill or folder with this name already exists. The original was retained. Use a different name in the source file first.");
values.put("有安装、备份、恢复或维护任务正在进行，请完成后重试。","An install, backup, restore or maintenance operation is active. Retry after it finishes.");
values.put("当前 DSH 用户目录不可安全读取，请先完成环境安装或修复。未创建替代目录。","The current DSH user folder cannot be read safely. Complete environment setup or repair first. No replacement folder was created.");
values.put("技能目录不是可安全读取的普通目录，或条目超过 512 项。原件已保留。","The skills folder is not a safely readable regular directory, or it has more than 512 entries. Originals were retained.");
values.put("技能操作未完成。请检查文件授权、可用空间和目录状态；已有技能未覆盖。","The skill operation did not finish. Check file access, free space and the folder state. Existing skills were retained.");
}
private static void part45(Map<String,String> values) {
values.put("技能读取","Read skills");
values.put("技能导入","Import skill");
values.put("配置的工作目录暂不可读取，已打开个人文件目录。","The configured workspace is temporarily unreadable. The personal files folder is open.");
values.put("首次安装测速","First-install timing");
values.put("在独立目录完整执行首次安装，保留当前环境、数据和设置。开始时会正常停止 DSH 和终端；测速期间请保持应用在前台。","Run a complete first install in an isolated directory while keeping the existing environment, data and settings. DSH and terminals stop normally before timing. Keep the app in the foreground.");
values.put("开始测速","Start timing");
values.put("正在准备独立安装目录…","Preparing an isolated install directory…");
values.put("完整首次安装完成：%.2f 秒；临时环境已清理，原数据保留。","Full first install completed in %.2f seconds. Temporary files were cleaned; existing data was kept.");
values.put("测速未完成：%s","Timing did not complete: %s");
values.put("正在加载内置组件：%d/%d…","Loading built-in components: %d/%d…");
values.put("正在核验原生模块…","Checking native modules…");
values.put("正在准备组件加载器…","Preparing the component loader…");
values.put("正在核验文件锁…","Checking file locking…");
values.put("正在确认网页鉴权…","Confirming browser authentication…");
values.put("正在确认网页与数据读写…","Confirming the browser and data access…");
values.put("正在启动 DSH 网页…","Starting the DSH browser interface…");
values.put("核对完整安装文件…","Checking complete installation files…");
values.put("确认安装文件并提交…","Confirming and publishing installation files…");
values.put("安装文件已提交","Installation files published");
values.put("检查启动配置…","Checking startup configuration…");
values.put("核验 pnpm 入口…","Checking the pnpm entry…");
values.put("核验数据读写…","Checking data access…");
values.put("在独立进程重开数据…","Reopening data in a fresh process…");
values.put("核验会话重开…","Checking session reopening…");
values.put("数据与会话已通过核验","Data and session checks passed");
values.put("局域网地址缺少访问凭据。请回到 DSHA 启动页，点局域网地址并复制完整连接链接。","The LAN address has no access credential. Open the DSHA Launch page, tap the LAN address, and copy the complete connection link.");
values.put("局域网访问凭据已失效或不匹配。请回到 DSHA 启动页重新复制连接链接；DSH 重启或关闭局域网访问后，旧链接和浏览器凭据会失效。","The LAN credential has expired or does not match. Copy a new connection link from the DSHA Launch page. Restarting DSH or turning LAN access off invalidates old links and browser credentials.");
values.put("局域网访问凭据尚未就绪。请在 DSHA 中启动 DSH，等待局域网地址出现后重新复制连接链接。","The LAN credential is not ready. Start DSH in DSHA, wait for the LAN address, then copy a new connection link.");
values.put("局域网代理正在等待 DSH 认证。请回到 DSHA 确认 DSH 已启动，再刷新此页；此状态不表示局域网链接失效。","The LAN proxy is waiting for DSH authentication. Confirm DSH is running in DSHA, then refresh this page. This does not mean the LAN link has expired.");
values.put("局域网代理暂时繁忙。请稍后刷新；持续失败时请在 DSHA 中查看启动日志。","The LAN proxy is temporarily busy. Refresh shortly. If this persists, inspect the startup log in DSHA.");
values.put("局域网代理无法连接 DSH。请回到 DSHA 确认 DSH 正在运行并查看启动日志，再刷新此页。","The LAN proxy could not connect to DSH. Confirm DSH is running and inspect the startup log in DSHA, then refresh this page.");
values.put("读取请求超时。请检查网络后重试。","The request timed out. Check the network and retry.");
values.put("请求格式无效或超出限制。请使用 DSHA 复制的完整连接链接重试。","The request is invalid or exceeds a limit. Retry with the complete connection link copied from DSHA.");
values.put("失败线索（显示摘要）：\n","Failure clues (display summary):\n");
values.put("\n上下文：\n","\nContext:\n");
values.put("… [已省略部分显示内容，原始记录仍保留] …","… [display shortened; original record retained] …");
values.put("此链接包含访问凭据。局域网使用 HTTP，流量未加密，请只在可信网络使用并只分享给可信设备。DSH 重启或关闭局域网访问后，旧链接会失效，请重新复制。\n\n%s","This link contains an access credential. LAN traffic uses unencrypted HTTP; use a trusted network and share only with trusted devices. Restarting DSH or turning LAN access off invalidates old links; copy a new link.\n\n%s");
values.put("使用说明","How to use");
values.put("先连接设备通道，再点“创建竖屏”或“创建横屏”。","Connect a device channel, then tap Create portrait or Create landscape.");
values.put("调整预览大小","Adjust preview size");
values.put("创建竖屏","Create portrait");
values.put("创建横屏","Create landscape");
values.put("应用","App");
values.put("键盘","Keyboard");
values.put("控件树","AI tree");
values.put("选择应用后会自动填入包名","Choose an app to fill its package");
values.put("选择","Choose");
values.put("本机键盘输入（中文需无障碍）","Keyboard input (accessibility for Unicode)");
values.put("发送","Send");
values.put("兼容版暂不支持虚拟屏，请使用标准版","Virtual screen is not available in the Low build yet; use Standard");
values.put("虚拟屏需要 Android 11 及以上","Requires Android 11 or later");
values.put("虚拟屏开启与使用","Start and use a virtual screen");
values.put("1. 使用标准版，手机系统需为 Android 11 或更高。兼容版暂不支持虚拟屏。\n\n2. 打开“设置 → 设备能力授权”，连接 ADB、Shizuku 或 Root 中的一种通道即可。没有 Root 时，可在系统开发者选项开启“无线调试”，再按 DSHA 的 ADB 配对页提示完成配对与连接。仅打开无线调试开关还不够，请确认通道已连接。\n\n3. 回到“设备能力授权”，点“打开虚拟屏”。在本页点“创建竖屏”或“创建横屏”，等待画面出现。打开此页或开启无障碍，都不会自动创建虚拟屏。\n\n4. 点“应用 → 选择”，选中想操作的应用，再点“启动”，把它打开到虚拟屏。预览里可以点击、滑动；双指用于调整预览。\n\n5. 读控件树和中文输入需要开启 DSHA 无障碍。让助手操作时，还要按应用提示确认本次读屏与操作授权，并将操作目标设为虚拟屏。\n\nVSCREEN_NOT_RUNNING 表示虚拟屏还没创建、已经关闭，或连接已断开。先检查设备通道，再点创建按钮；不需要清除数据或重新解压环境。\n\n创建仍失败：到“设置 → 自检与诊断”查看错误记录并导出日志。仅开启无障碍不能解决设备通道或系统兼容问题。\n\n不用时点本页“关闭”回收虚拟屏；连接断开或授权被撤销后，需要重新连接并创建。","1. Use Standard on Android 11 or later. Low does not support virtual screens yet.\n\n2. Open Settings → Device capability access and connect one channel: ADB, Shizuku, or Root. Without Root, enable Wireless debugging in the system Developer options, then follow DSHA's ADB pairing page to pair and connect. Enabling the system switch alone is not enough; confirm the channel is connected.\n\n3. In Device capability access, tap Open virtual screen. Tap Create portrait or Create landscape here and wait for a picture. Opening this page or enabling accessibility does not create a virtual screen automatically.\n\n4. Tap App → Choose, select an app, then tap Launch to open it on the virtual screen. Tap and swipe in the preview; use two fingers to adjust the preview.\n\n5. Enable DSHA accessibility for the control tree and Unicode input. For assistant control, also confirm this run's screen access when prompted and choose the virtual screen as the action target.\n\nVSCREEN_NOT_RUNNING means no virtual screen has been created, it was closed, or its connection was lost. Check the device channel, then tap a create button. You do not need to clear data or extract the environment again.\n\nIf creation still fails, open Settings → Diagnostics to inspect the error record and export logs. Accessibility alone cannot resolve a missing device channel or system compatibility problem.\n\nTap Close when finished. After a disconnection or revoked access, reconnect and create the virtual screen again.");
values.put("选择已安装应用","Choose installed app");
values.put("控件树（给 AI 使用）","Accessibility tree for AI");
values.put("操作完成","Done");
values.put("虚拟屏已开启","Virtual screen ready");
values.put("虚拟屏尚未开启或已关闭。先连接设备通道，再点“创建竖屏”或“创建横屏”；开启无障碍不会自动创建。","The virtual screen has not started or was closed. Connect a device channel, then tap Create portrait or Create landscape. Accessibility does not create it automatically.");
values.put("画面已变化，请看最新画面后再操作","The view changed. Observe again.");
values.put("请先在设备能力授权中连接通道","Connect a device channel first");
values.put("中文输入需要开启无障碍服务","Enable accessibility for Unicode input");
values.put("未完成：","Not completed: ");
values.put("设备通道状态","Device channel status");
values.put("让助手读屏、点击和输入。先完成屏幕操作设置，再在对话中描述任务。","Let the assistant observe, tap and type. Set up screen control, then describe the task in a conversation.");
values.put("撤销本次读屏与操作授权","Revoke screen access for this run");
values.put("已撤销，后续屏幕操作需要重新确认","Revoked. Future screen actions require confirmation");
values.put("打开虚拟屏","Open virtual screen");
values.put("虚拟屏需要已连接的设备通道。无障碍不会自动创建，请打开虚拟屏后点“创建竖屏”或“创建横屏”；页内有使用说明。","A virtual screen requires a connected device channel. Accessibility does not create it automatically. Open virtual screen, then tap Create portrait or Create landscape. Instructions are available on that page.");
values.put("已关闭短信读取","SMS reading disabled");
values.put("已关闭 · 查询会被阻止","Off · queries are blocked");
values.put("需要系统定位权限","Location permission required");
values.put("位置读取保持关闭。请在系统应用权限中允许定位，再返回这里开启；如果系统定位服务关闭，也需要先开启系统定位。","Location reading remains off. Allow location in system app permissions, then return and enable it here. System location services must also be enabled.");
values.put("暂不开启","Not now");
values.put("打开系统权限设置","Open app permissions");
values.put("请在系统设置中打开 DSHA 应用权限","Open DSHA permissions in system settings");
values.put("已连接，可以在对话中使用 Computer Use。","Connected. Computer Use is available in conversations.");
values.put("开关已开启，正在等待系统连接；可重新开关服务。","Enabled, waiting for the system to connect. Try toggling the service.");
values.put("打开方式","Open with");
values.put("WHEELS_OPTIONAL_SKIP: Python 依赖导入已通过，跳过失败的缓存注入或安装并继续准备 ADB","WHEELS_OPTIONAL_SKIP: Python imports passed; skipping the failed cache injection or installation and continuing ADB setup");
values.put("WHEELS_INJECT_FAIL: %s；目标 %s；%s；未覆盖已有条目","WHEELS_INJECT_FAIL: %s; target %s; %s; existing entries were not overwritten");
}
private static void part46(Map<String,String> values) {
values.put("正在准备离线 ADB 环境…","Preparing the offline ADB environment…");
values.put("ADB_OFFLINE_READY: 离线依赖已准备好，未验证连接。请开启无线调试后再次验证。","ADB_OFFLINE_READY: Offline dependencies are ready; the connection has not been verified. Enable wireless debugging, then verify again.");
}
static final String[][] FORMATS = new String[][] {
{"DSHA 3090 桥端点清单（BRIDGE_PROTOCOL=%s）\n凭据由宿主写入 /root/.dsh/.bridge_headers；使用 curl -H @/root/.dsh/.bridge_headers，不把 token 写进 URL 或命令参数。\n带中文/空格的参数一律用 -G --data-urlencode，别手写 URL 编码。\n\n== 屏幕操作（无障碍服务，不需要 ADB/Shizuku）==\n读屏  curl -s -H @/root/.dsh/.bridge_headers \"127.0.0.1:3090/app/ui/dump\"\n      → 每行「[序号] \"文字\" 可点击 中心=(x,y) 区域=l,t,r,b」\n点按  curl -s -G 127.0.0.1:3090/app/ui/tap --data-urlencode \"text=设置\" -H @/root/.dsh/.bridge_headers\n      → 优先按文字点：控件位置随滚动/动画变，文字不变。没有文字才用 ?x=&y=\n输入  curl -s -G 127.0.0.1:3090/app/ui/input --data-urlencode \"text=内容\" -H @/root/.dsh/.bridge_headers\n      → 填到当前焦点框；没有焦点先 tap 一下输入框\n按键  /app/ui/key?name=back  （back/home/recents/notifications/quicksettings/lock）\n滑动  /app/ui/swipe?x1=500&y1=1500&x2=500&y2=500&ms=300\n截屏  /app/ui/screenshot   → 存 PNG 到应用截图目录并返回路径（不回 base64）\n节奏：每次点按/输入后先 dump 再决定下一步，别凭记忆连点。\n\n== 独立虚拟屏（Android 11+；每次输入必须带最新 frameSeq）==\n/app/vscreen/create?orientation=portrait|landscape  创建虚拟屏\n/app/vscreen/status  查询 displayId、尺寸和 frameSeq\n/app/vscreen/launch?package=com.example.app  启动已安装应用\n/app/vscreen/see  获取最新预览；tap/swipe/type/key 必须携带该 frameSeq\n/app/vscreen/close  关闭并回收虚拟屏\n\n== 设备与应用 ==\n/app/device                     机型/系统/电量/网络/屏幕/存储/内存\n/app/apps                       全部已装应用，分用户应用与系统应用；可加 q/limit/user=1 筛选显示\n/app/launch?pkg=com.tencent.mm  启动应用\n/app/clip                       读剪贴板（需 App 在前台，系统限制）\n/app/clip + text=…              写剪贴板\n/app/readfile?path=/…          读取绝对路径的目录或文本，仍受 Android 权限限制；凭据区（.dsh/.ssh/.android）不可读\n设备文件写入请走下方受保护的设备 shell；普通 Download 文件可操作，DCIM/Pictures/Android/data/obb 只读。\n\n== 与用户交互 ==\n/app/ask?options=继续|取消 + q=…  弹窗阻塞等回答（最多三个选项）\n/app/notify?title=… + text=…      通知栏\n/app/toast + text=…               App 内提示\n/app/vibrate?ms=300               震动（长任务跑完叫醒用户）\n/app/share（text= 或 path=）      分享到其它应用\n/app/open?url=https://…           打开链接\n/app/export?path=/root/report.md  把产物交给用户 → 落 Download/DSHA；凭据区不可导出\n建议：需要用户拍板用 /app/ask 而不是干等；长任务结束用 notify 或 vibrate 叫人；\n产出报告用 /app/export，别只留在容器里。\n\n== 传感器与位置（默认关闭，需用户在配置页勾选）==\n/app/location（加 fresh=1 强制重新定位，可能等数秒）\n/app/sensors 列表 · /app/sensor?name=light 读值\n（light 环境光 lux / accel / gyro / magnet / pressure / proximity /\n gravity / rotation 姿态四元数 / steps 开机后步数）\n/app/torch?on=1 手电\n这三类返回 DISABLED（用户没开该能力）或 NO_PERMISSION（没授系统权限）时，\n照原话告诉用户去哪开，不要重试 —— 重试不会让开关自己变。\n\n== 元信息 ==\n/app/version                          桥协议版本 + App 版本（特性检测用）\n/app/help                             本清单\n\n== 插件状态 ==\n/app/plugins                          读回上次上报的加载状态\n/app/plugins?loaded=a,b&failed=c      上报（插件侧用）\n\n== 设备 shell（自动选择 root / Shizuku / ADB）==\n/root/dsh-bin/adb-shell \"命令\"        用 id 核验实际身份\n包装命令不存在时：python3 /root/.dsh/adb-shell.py \"命令\"\n短信只允许当前 Android 用户的 content query --uri content://sms，默认关闭；设置 → 设备能力授权可开启或撤销。\n短信预授权可能返回正文及验证码；不允许发送、修改或删除，Android 仍可拒绝访问。Shizuku 不执行此敏感查询。\n仅执行已识别的单条命令；允许读取各目录和明确路径的普通文件操作。禁止脚本、管道、重定向、未知命令。\n根目录及系统目录只读；禁止块设备/分区、SELinux、系统设置写入、挂载和刷机操作。\n结束进程前自动刷新全量用户/系统应用清单；普通用户应用直接结束，系统应用与关键进程拦截。\n按完整包名调用 am force-stop / killall / pkill -x；kill 正数 PID 会核对 UID 后按包名停止。\n策略拦截返回 [POLICY_BLOCKED]/126；root 和旧确认开关不能放行。不可用其它解释器或 UI 绕过。\n报连不上/未配对：先看上面的 App 层接口能不能办成；确实必须 shell 才请用户到\n设置 → 设备能力授权中连接可用通道，别反复试同一条命令。\n不要用 /root/dsh-bin/adb 或裸 adb —— 那是守卫包装脚本，会失败。\n\n== root（--su）==\n已启用并经 root 管理器授权的 su 可直接执行，无需 ADB 配对；其次使用 Shizuku，再使用 ADB。\n--su 仅在明确需要 root 时使用，须先在设备能力授权页允许；同一设备保护策略始终生效。\n[EXECUTION_UNKNOWN] 表示命令可能已执行，先核对实际状态，不能切换通道或自动重放。\n","DSHA 3090 bridge endpoints (BRIDGE_PROTOCOL=%s）\nThe host writes credentials to /root/.dsh/.bridge_headers. Use curl -H @/root/.dsh/.bridge_headers; keep tokens out of URLs and command arguments.\nFor parameters containing Chinese text or spaces, use -G --data-urlencode instead of encoding the URL manually.\n\n== Screen control (accessibility service; no ADB/Shizuku required) ==\nRead screen  curl -s -H @/root/.dsh/.bridge_headers \"127.0.0.1:3090/app/ui/dump\"\n      → Each line: [index] \"text\" clickable center=(x,y) bounds=l,t,r,b\nTap  curl -s -G 127.0.0.1:3090/app/ui/tap --data-urlencode \"text=Settings\" -H @/root/.dsh/.bridge_headers\n      → Prefer tapping by text: positions change with scrolling and animation. Use ?x=&y= only when no text is available.\nInput  curl -s -G 127.0.0.1:3090/app/ui/input --data-urlencode \"text=content\" -H @/root/.dsh/.bridge_headers\n      → Types into the focused field. Tap an input field first if none is focused.\nKey  /app/ui/key?name=back  (back/home/recents/notifications/quicksettings/lock)\nSwipe  /app/ui/swipe?x1=500&y1=1500&x2=500&y2=500&ms=300\nScreenshot  /app/ui/screenshot   → save a PNG in the app's screenshot folder and return its path (not base64)\nAfter each tap or input, dump the screen again before deciding the next step. Do not tap repeatedly from memory.\n\n== Independent virtual display (Android 11+; each input requires the latest frameSeq) ==\n/app/vscreen/create?orientation=portrait|landscape  Create a virtual display\n/app/vscreen/status  Query displayId, size and frameSeq\n/app/vscreen/launch?package=com.example.app  Launch an installed application\n/app/vscreen/see  Get the latest preview; tap/swipe/type/key must include its frameSeq\n/app/vscreen/close  Close and release the virtual display\n\n== Device & apps ==\n/app/device                     Model / Android / battery / network / display / storage / memory\n/app/apps                       Installed apps, separated into user and system apps; filter with q/limit/user=1\n/app/launch?pkg=com.tencent.mm  Launch app\n/app/clip                       Read clipboard (app must be in foreground; Android restriction)\n/app/clip + text=…              Write clipboard\n/app/readfile?path=/…          Read a directory or text at an absolute path, subject to Android permissions; credential directories (.dsh/.ssh/.android) cannot be read\nUse the protected device shell below for device file writes. Ordinary Download files are writable; DCIM/Pictures/Android/data/obb remain read-only.\n\n== User interaction ==\n/app/ask?options=Continue|Cancel + q=…  Ask in a blocking dialog (up to three options)\n/app/notify?title=… + text=…      Notification\n/app/toast + text=…               In-app toast\n/app/vibrate?ms=300               Vibrate (notify the user after a long task)\n/app/share (text= or path=)      Share to another app\n/app/open?url=https://…           Open URL\n/app/export?path=/root/report.md  Export an artifact to Download/DSHA; credential directories cannot be exported\nUse /app/ask when a decision is needed, and notify or vibrate when a long task finishes.\nUse /app/export to deliver reports; do not leave them only in the container.\n\n== Sensors & location (off by default; enable in Configuration) ==\n/app/location (fresh=1 forces a new fix; may take a few seconds)\n/app/sensors lists sensors · /app/sensor?name=light reads a value\n(light: ambient lux / accel / gyro / magnet / pressure / proximity /\n gravity / rotation quaternion / steps since boot)\n/app/torch?on=1 Flashlight\nWhen these APIs return DISABLED (feature off) or NO_PERMISSION (system permission missing),\nTell the user exactly where to enable it. Do not retry; retrying cannot turn the setting on.\n\n== Metadata ==\n/app/version                          Bridge protocol + app version (feature detection)\n/app/help                             This endpoint list\n\n== Plugin status ==\n/app/plugins                          Read last reported loading status\n/app/plugins?loaded=a,b&failed=c      Report status (for plugins)\n\n== Device shell (selects root / Shizuku / ADB automatically) ==\n/root/dsh-bin/adb-shell \"command\"        Use id to verify the actual identity\nIf the wrapper is missing: python3 /root/.dsh/adb-shell.py \"command\"\nSMS queries only allow content query --uri content://sms for the current Android user. Off by default; enable or revoke in Device permissions.\nPreauthorized SMS queries may return message bodies and verification codes. Sending, editing and deleting are blocked; Android may still deny access. Shizuku does not run this sensitive query.\nOnly recognized single commands are allowed, including directory reads and ordinary file operations on explicit paths. Scripts, pipes, redirects and unknown commands are blocked.\nRoot and system directories are read-only. Block devices/partitions, SELinux changes, system setting writes, mounts and firmware flashing are blocked.\nRefresh the complete user/system app list before stopping processes. Ordinary user apps may be stopped; system apps and essential processes are protected.\nUse the full package name with am force-stop / killall / pkill -x. A positive PID with kill is checked against its UID before stopping by package name.\nPolicy blocks return [POLICY_BLOCKED]/126. Root and legacy confirmation switches cannot override them. Do not use another interpreter or the UI to bypass a block.\nIf a connection or pairing error occurs, first check whether the app-level APIs above can perform the task. Only if a shell is essential, ask the user to open\nSettings → Device permissions to connect an available channel. Do not keep retrying the same command.\nDo not use /root/dsh-bin/adb or bare adb; those are guarded wrappers and will fail.\n\n== root（--su）==\nWhen su is enabled and authorized by the root manager, commands run directly without ADB pairing. Otherwise, Shizuku is used before ADB.\nUse --su only when root is explicitly required and enabled in Device permissions. The same device protection policy always applies.\n[EXECUTION_UNKNOWN] means the command may have executed. Verify the actual state before proceeding; do not switch connections or replay automatically.\n"},
{"\n建议操作\n证书或 npm 异常：点击「修复证书与 npm」。\n文件选择无返回：到插件页使用「其他文件选择器」。\n第三方插件导致启动失败：使用启动页的安全启动，再逐个恢复插件。\n存储不足：清理下载目录后重试，避免重新解压整个环境。\n\n隐私范围：未读取 API 配置、对话、终端命令或系统完整日志；没有自动上传此报告。可在下面补充复现步骤后复制或导出。\n","\nSuggested actions\nCertificate or npm errors: select “Repair certificates and npm”.\nFile picker returns nothing: use “Other file picker” on the Plugins page.\nA third-party plugin prevents startup: use Safe startup, then restore plugins one at a time.\nLow storage: clear the downloads directory and retry; avoid extracting the entire environment again.\n\nPrivacy scope: this report did not read API settings, conversations, terminal commands, or complete system logs, and was not uploaded automatically. Add reproduction steps below before copying or exporting it.\n"},
{"[APP_LIST_UNAVAILABLE] Android 未提供完整应用清单；设备停止操作会通过 ADB/Shizuku 重新读取。可用设备命令分别查询 pm list packages -U -3 和 pm list packages -U -s。原因：%s","[APP_LIST_UNAVAILABLE] Android did not provide a complete app list. Device stop operations will fetch it again through ADB/Shizuku.Use supported device commands to query pm list packages -U -3 and pm list packages -U -s separately. Reason: %s"},
{"此链接包含访问凭据。局域网使用 HTTP，流量未加密，请只在可信网络使用并只分享给可信设备。DSH 重启或关闭局域网访问后，旧链接会失效，请重新复制。\n\n%s","This link contains an access credential. LAN traffic uses unencrypted HTTP; use a trusted network and share only with trusted devices. Restarting DSH or turning LAN access off invalidates old links; copy a new link.\n\n%s"},
{"未完成的操作：%s\n最后记录阶段：%s\n\n%s\n\n原件状态：尚未确认恢复完成。请查看记录后使用“恢复中断维护”；也可进入受限主界面导出可读副本。","Incomplete operation: %s\nLast recorded stage: %s\n\n%s\n\nOriginal state: recovery has not been confirmed. Inspect the record and use Recover interrupted maintenance, or enter the limited interface to export readable copies."},
{"%s\n%s\n文件数：%d\n解压内容：%s\n来自版本：%s%s%s\n\n恢复会先停止 Web。当前数据会保留为 .pre-restore-*，恢复失败自动回滚；完成后可手动启动 Web。","%s\n%s\nFiles: %d\nExtracted contents: %s\nSource version: %s%s%s\n\nRestore stops Web first. Current data is retained as .pre-restore-* and restore failures roll back. Start Web manually afterward."},
{"WHEELS_CACHE_INVALID: %s：%s。源缓存已保留，未用 APK 覆盖。请先备份该文件并移出 wheels 目录，再重试补缺；自定义 wheel 请提供有效版本。","WHEELS_CACHE_INVALID: %s: %s. The source cache was retained. Back up this file and move it out of the wheels directory before retrying. Provide a valid version for a custom wheel."},
{"[ERR] 无障碍服务未开启。请让用户在 DSHA「设置 → 设备能力授权」点「设置屏幕操作」，或到系统设置 → 无障碍 → DSHA 配对助手 打开。","[ERR] Accessibility is off. Ask the user to open DSHA Settings → Device permissions → Screen control, or enable DSHA Pairing Assistant in Android Settings → Accessibility."},
{"%s 将从加载路径移除；原件保留在数据页的保留区。对话、其他插件和外部源码目录保留。","%s will be removed from the loading path. Originals remain in the retained data area. Conversations, other plugins and external source folders are preserved."},
{"上次任务因进程退出而中断，未自动重试。请先处理未完成的维护或重新选择备份。\n%s","The previous task was interrupted when the process exited and was not retried automatically. Resolve unfinished maintenance or select the backup again.\n%s"},
{"设备桥端口 3090 被占用，设备工具暂不可用；Web 可独立启动。关闭占用端口的其他实例后重试：%s","Device bridge port 3090 is in use. Device tools are temporarily unavailable; Web can still start. Close the other instance using this port and retry: %s"},
{"显示 %d 个；Android 返回 %d 个可见应用。系统可能限制可见范围；结束应用前会另行核对完整清单。","Showing %d apps; Android returned %d visible apps. The system may restrict visibility; the complete inventory is checked again before stopping an app."},
{"%s\n已保留 %s 及已有下载文件，但无法确认查询来源；请联网重新检查，确认当前通道后才能下载/安装","%s\nRetained %s and its existing downloads, but the check channel is unknown; check online and confirm the current channel before downloading or installing"},
{"配对已完成，连接尚未验证。请检查连接端口后点「验证已有连接」，无需再次配对。\n\n%s","Pairing is complete, but the connection is not yet verified. Check the connection port and tap Verify connection. There is no need to pair again.\n\n%s"},
{"此链接包含访问凭据。局域网使用 HTTP，流量未加密，请只在可信网络使用并只分享给可信设备。\n\n%s","This link contains access credentials. LAN access uses HTTP with unencrypted traffic. Use trusted networks and share only with trusted devices.\n\n%s"},
{"KEEPALIVE_WARN: 连接已验证，但自动恢复授权未完成；重启后可能需手动打开无线调试\n%s","KEEPALIVE_WARN: Connection verified, but automatic recovery is not authorized. You may need to enable Wireless debugging manually after restart.\n%s"},
{"BRIDGE_PROTOCOL=%s\nBRIDGE_AUTH=header-x-token\nAPP_VERSION=%s\nAPP_CODE=%s\nHINT=端点清单见 /app/help；判版本请用 >= 而不是 ==\n","BRIDGE_PROTOCOL=%s\nBRIDGE_AUTH=header-x-token\nAPP_VERSION=%s\nAPP_CODE=%s\nHINT=See /app/help for endpoints; compare versions using >= rather than ==\n"},
{"可用空间不足：本阶段预计需要 %s，当前可用 %s。原环境保持原位，请释放空间后重试。","Insufficient free space: this stage is estimated to need %s; %s is available. The previous environment stays in place. Free some space and retry."},
{"已保留的应急运行时约 %s；应急会话约 %s。原件保留，未自动删除。","Retained recovery runtimes: approximately %s; recovery sessions: approximately %s. Originals are retained; no automatic deletion was performed."},
{"%s\n已保留 %s（来源：%s），与当前%s不匹配；切回来源通道或重新检查后才能下载/安装","%s\nRetained %s (source: %s), which does not match the current %s; switch back to its channel or check again before downloading or installing"},
{"dsh 与内置插件更新完成；Ubuntu、个人目录、会话、配置和第三方插件保持原位。%s","dsh and built-in plugins updated; Ubuntu, personal folders, sessions, configuration and third-party plugins stayed in place.%s"},
{"服务可能仍在启动或已退出。请稍后重试，持续失败时返回启动页查看日志。\n错误代码：%s","The service may still be starting or may have exited. Retry later; if it keeps failing, check the startup log.\nError code: %s"},
{"rc1 迁移快照未完成，已阻止导入；原件保留。请检查存储权限和空间后重试：%s","rc1 snapshots are incomplete; import is blocked and originals are retained. Check storage access and space, then retry: %s"},
{"[EXECUTION_UNKNOWN] 虚拟屏启动结果未确认，不会自动重试：%s\n[EXIT=125]","[EXECUTION_UNKNOWN] Virtual screen startup result is unconfirmed; it will not be retried automatically: %s\n[EXIT=125]"},
{"检查%s失败：%s；保留此通道上次结果，可重试检查或继续使用已下载包","Checking %s failed: %s; this channel's previous result is retained. Retry the check or use the downloaded package"},
{"[EXECUTION_UNKNOWN] 设备命令结果未确认，不会自动重试：%s\n[EXIT=125]","[EXECUTION_UNKNOWN] Device command result is unconfirmed; it will not be retried automatically: %s\n[EXIT=125]"},
{"WHEELS_CACHE_READY: 补齐 %d 个，原版已在位 %d 个，保留修改版 %d 个，保留额外 wheel %d 个%s%s","WHEELS_CACHE_READY: Added %d, bundled originals %d, modified files retained %d, extra wheels retained %d%s%s"},
{"中断的运行时更新已回切；个人目录、会话和配置保持原位。\n%s","Interrupted runtime update rolled back; personal folders, sessions and configuration stayed in place.\n%s"},
{"新环境运行校验失败，将保留并回切原环境。\n%s","New environment runtime verification failed; the previous environment will be retained and restored.\n%s"},
{"局域网地址：%s\n点按查看或复制连接链接；流量未加密，请只在可信网络使用。","LAN address: %s\nTap to view or copy the connection link. Traffic is unencrypted; use trusted networks."},
{"[中止失败，未创建新会话：%s；待发命令保留，请再次点中止重试]\n","[Stop failed; no new session was created: %s; pending commands are retained. Tap Stop again to retry]\n"},
{"当前内核缺少：%s。\n更新 Android System WebView / Chrome 后重试，或在浏览器中打开。","The current engine lacks: %s.\nUpdate Android System WebView / Chrome and retry, or open in a browser."},
{"无线调试连接尚未验证；请检查连接端口或重新配对。%s","The wireless debugging connection has not been verified. Check the connection port or pair again. %s"},
{"无前台界面且通知权限被拒，确认必然超时拒绝：%s","No foreground page and notification permission denied; confirmation will time out and be denied: %s"},
{"中断的维护已回滚；安全备份、旧环境及失败的新环境均已保留。\n%s","Interrupted maintenance rolled back; the safety backup and both environment trees were retained.\n%s"},
{"[%s；命令尚未发送，已保留。完成后请重试重启]\n","[%s; the command has not been sent and is retained. Retry restarting after the operation finishes]\n"},
{"离线工具尚未安装完成；已保留解压文件、安装现场和诊断：\n%s","Offline tools are incomplete; extracted files, installation state and diagnostics are retained:\n%s"},
{"[ERR] 截屏被系统拒绝（错误码 %d，太频繁了，隔一秒再试）","[ERR] Screenshot rejected by the system (error %d; too frequent, wait a second before retrying)"},
{"发现已有备份：\n%s\n\n先核验内容和实际范围，确认后才会恢复。","A backup was found:\n%s\n\nIts contents and actual scope are verified before you confirm a restore."},
{"su：%s\nroot 授权或执行超时，请在 root 管理器查看 DSHA 授权","su: %s\nRoot authorization or execution timed out. Check DSHA authorization in your root manager"},
{"配置已重置，对话及原生凭据保留。重置前配置原件：\n%s","Configuration reset; conversations and native credentials retained. Original configuration:\n%s"},
{"GLIBC_PY_INSTALL_FAIL: 无法安装 Ubuntu Python3，请先修复基础环境\n%s","GLIBC_PY_INSTALL_FAIL: Could not install Ubuntu Python3. Repair the base environment first.\n%s"},
{"%s主线程尚未执行，已取消本次剪贴板操作；可重试","%sThe main thread had not started this clipboard operation, so it was canceled. You can retry."},
{"基础工具安装失败（退出码 %s），请查看上方软件源/网络输出","Basic tools installation failed (exit code %s); check the repository and network output above"},
{"确认弹窗弹出失败，仍可从通知确认：%s","Could not show confirmation dialog; confirmation remains available from the notification: %s"},
{"正在执行环境任务，请稍后再打开终端或发送命令","An environment task is in progress; open the terminal or send commands after it finishes."},
{"运行时更新未完成，原运行时及个人数据已保留：\n%s\n%s","Runtime update did not complete; the previous runtime and personal data were retained:\n%s\n%s"},
{"环境重建未完成，原件及宿主数据副本已保留：\n%s\n%s","Environment rebuild did not complete; originals and host data snapshots were retained:\n%s\n%s"},
{"[终端启动失败：%s；未发送的命令保留，重试后继续]\n","[Terminal startup failed: %s; unsent commands are retained and will continue after retry]\n"},
{"[ERR] 屏幕上找不到可点击的「%s」（先用 dump 看看实际文字）","[ERR] No clickable text found on screen: “%s” (use dump to inspect the actual text first)"},
{"命令超时（%s 秒），当前步骤未完成，请重新检查","Command timed out after %s seconds; this step is incomplete and needs to be checked again"},
{"[ERR] 不认识的按键「%s」（可用：back/home/recents/notifications/quicksettings/lock）","[ERR] Unknown key “%s” (available: back/home/recents/notifications/quicksettings/lock)"},
{"终端回收暂未确认，下次维护将重新核验：%s","Terminal cleanup is not confirmed; the next maintenance operation will check again: %s"},
{"Profile：%s\n请选择需要恢复的字段；未选字段保持当前值。\n%s","Profile: %s\nSelect fields to restore. Unselected fields retain their current values.\n%s"},
{"dsh web 进程已创建 → 127.0.0.1:%s（等待鉴权链接…）","The dsh web process was created → 127.0.0.1:%s (waiting for its authentication link…)"},
{"WHEELS_JAVA_EXTRACTED: 已校验并安装 %d 个 wheel，源缓存全部保留","WHEELS_JAVA_EXTRACTED: Verified and installed %d wheels; all source caches retained"},
{"一个服务解析失败（错误 %s），继续查找本机端口…","A service could not be resolved (error %s), continuing to search for the local port…"},
{"[无法核验终端本次进程身份，保留环境占用：%s]\n","[Cannot verify this terminal process identity; environment protection retained: %s]\n"},
{"禁止设备分区、SELinux、系统属性、挂载或刷机操作：%s","Partition, SELinux, system property, mount and firmware operations are blocked: %s"},
{"[发送结果不确定，未自动重发：%s；请检查执行结果。%s]\n","[Send result is uncertain; no automatic resend: %s; check the execution result. %s]\n"},
{"NOT_FOUND_OR_NO_PERMISSION: 路径不存在或 Android 未授予读取权限：%s","NOT_FOUND_OR_NO_PERMISSION: Path does not exist or Android denied read access: %s"},
{"Web 鉴权链接已失效（HTTP %s），请重新启动服务后进入","Web authentication link expired (HTTP %s); restart the service before opening it."},
{"已将 %s 个插件导出到所选位置，可在另一台 DSHA 中导入","Exported %s plugins to the selected location; import them on another DSHA device"},
{"下载并解析插件包后自动安装、启用。\n\n%s","The plugin installs and enables automatically after download and validation.\n\n%s"},
{"无法确认后台进程退出，保留环境保护：%s","Cannot confirm the background process exited; environment protection remains: %s"},
{"Web 未接受登录凭据（HTTP %s），请重试或重新启动服务","Web did not accept the login credential (HTTP %s); retry or restart the service."},
{"SETUP_FAILED: 安装后验证未通过，请检查以下输出\n%s","SETUP_FAILED: Post-installation verification failed. Check the output below.\n%s"},
{"WHEELS_INJECT_FAIL: %s；已有缓存原样保留，未用 APK 覆盖","WHEELS_INJECT_FAIL: %s; existing cache preserved and not overwritten by the APK"},
{"系统关键进程或归属不明的 PID 不可结束：%s","Essential system processes or PIDs with unknown ownership cannot be stopped: %s"},
{"此通道暂无适合当前设备的更新；当前版本码 %s","This channel has no update compatible with this device; current version code %s"},
{"终端尚未停止，保留会话与环境保护：%s","The terminal has not stopped; its session and environment protection remain: %s"},
{"在【%s】里：%s  # 这类应用涉及支付或隐私，每次都需要你确认","In [%s]: %s  # Payment or privacy-sensitive apps require confirmation every time"},
{"安装失败：\n找不到插件实体，请重新导入：%s","Installation failed:\nPlugin files were not found. Import the plugin again: %s"},
{"部分完成：\n找不到插件实体，请重新导入：%s","Partially completed:\nPlugin files were not found. Import the plugin again: %s"},
{"内置插件未完整注册，请先修复环境：%s","Built-in plugins were not fully registered; repair the environment first: %s"},
{"\n另有 %s 个备份无法自动读取，可手动选择。","\n%s other backups cannot be read automatically; you can choose one manually."},
{"操作失败：找不到插件实体，请重新导入：%s","Operation failed: Plugin files were not found. Import the plugin again: %s"},
{"%s · 本次读取一致；没有据此确认历史格式或完整性","%s · Reads are consistent; historical format/integrity remains unconfirmed"},
{"端口发现未启动（错误 %s），可手动填写端口","Port discovery did not start (error %s), enter the port manually if needed"},
{"su：%s\nroot 通道已响应 · 设备命令仍受策略保护","su: %s\nRoot channel responded; device commands remain protected by policy"},
{"Web 鉴权响应异常（HTTP %s），请查看启动日志","Unexpected Web authentication response (HTTP %s); review the startup log."},
{"正在%s，请稍后再打开终端或发送命令","%s is in progress; open the terminal or send commands after it finishes."},
{"Web 进程身份尚未确认，原环境保留：%s","The Web process identity is unconfirmed; the environment is retained: %s"},
{"WHEELS_INJECT_FAIL: %s；目标 %s；%s；未覆盖已有条目","WHEELS_INJECT_FAIL: %s; target %s; %s; existing entries were not overwritten"},
{"HTTP %s。请返回启动页重新进入对话，或稍后重试。","HTTP %s. Reopen the conversation from the startup page, or retry later."},
{"[终端启动清理失败，保留环境占用：%s]\n","[Terminal startup cleanup failed; environment protection retained: %s]\n"},
{"ERROR: 命令执行超时（%s 秒），已请求停止本次进程","ERROR: Command timed out after %s seconds; stopping has been requested"},
{"网页脚本拼接优化未应用，原文件保留：%s","Script combination was not applied; the original file is retained: %s"},
{"本应用进程清单尚未确认，原环境保留：%s","This app process list is unconfirmed; the environment is retained: %s"},
{"[ERR] 手势被取消（%s，可能被其它手势打断）","[ERR] Gesture canceled (%s, possibly interrupted by another gesture)"},
{"PDF 兼容适配未应用，原文件保留：%s","PDF compatibility was not applied; the original file is retained: %s"},
{"正在%s，请稍后刷新或重试插件操作","Running %s; wait before refreshing or retrying the plugin operation"},
{"请确认服务仍在运行，点击重试。错误代码：%s","Check that the service is still running, then retry. Error code: %s"},
{"请在插件管理中查看 %s 的安装和启用状态","View the installation and enabled state of %s in plugin management"},
{"%s  # 本次 DSH 运行期间有效，可在设备能力授权中随时撤销","%s  # Valid for this DSH run. Revoke anytime in Device permissions"},
{"文件不存在或软链接目标已失效：%s","File is missing or its symbolic-link target is no longer valid: %s"},
{"备份成功，归档与导出文件已校验。\n%s","Backup succeeded; the archive and exported file were verified.\n%s"},
{"确认恢复将停止 Web，并中断正在执行的任务。\n\n%s","Confirming restore will stop Web and interrupt running tasks.\n\n%s"},
{"[关闭会话：取消 %s 条尚未发送的命令]\n","[Closing session: cancelled %s commands that have not been sent]\n"},
{"无法核验本次 Web 停止候选，未终止任何进程：%s","Cannot verify this Web stop candidate; no process was stopped: %s"},
{"无法查询终端会话（errno=%s），请稍后重试","Could not query the terminal session (errno=%s); try again later"},
{"无法打开维护页，可到数据与备份页查看任务：%s","Could not open maintenance. Check the task in Backup & data: %s"},
{"悬浮条创建失败（权限被撤？）: %s","Could not create overlay (permission may have been revoked): %s"},
{"命令执行超时（%s 秒），已请求停止本次进程","Command timed out after %s seconds; stopping has been requested"},
{"安装失败：\n插件依赖安装失败：%s","Installation failed:\nPlugin dependency installation failed: %s"},
{"部分完成：\n插件依赖安装失败：%s","Partially completed:\nPlugin dependency installation failed: %s"},
{"Web 页面尚不可用（HTTP %s），请查看启动日志","The Web page is unavailable (HTTP %s); review the startup log."},
{"待清理目录不属于本应用：%s","Directory selected for cleanup does not belong to this app: %s"},
{"目录是符号链接，已保留且未写入：%s","The directory is a symbolic link; retained without writing: %s"},
{"维护路径不在预期私有目录：%s","Maintenance path is outside the expected private directory: %s"},
{"无线调试似乎已关闭（失败 %s 次）","Wireless debugging appears to be disabled (%s failed attempts)"},
{"容器探测退出码 %s，检查未完整执行","Container probe exited with code %s; the checks did not finish"},
{"无法打开文件选择器，请检查系统文件应用：%s","Unable to open the file picker. Check the system Files app: %s"},
{"NOT_FOUND: %s（该应用没有启动入口或未安装）","NOT_FOUND: %s(app has no launch activity or is not installed)"},
{"隔离检查插件无法启动，详细原因：\n%s","The isolated verification plugin could not start. Details:\n%s"},
{"系统、关键或未识别应用不可结束：%s","System, essential or unidentified apps cannot be stopped: %s"},
{"保留记录无法读取，原件未改动。\n%s","Retained records are unreadable. Originals are unchanged.\n%s"},
{"旧环境清理暂缓，原件保留：%s","Old environment cleanup was deferred; originals retained: %s"},
{"操作失败：插件依赖安装失败：%s","Operation failed: Plugin dependency installation failed: %s"},
{"已保存到所选位置：%s\n点按此处查看日志","Saved to the selected location: %s\nTap here to view the log"},
{"目录位置已有其他条目，已保留：%s","Another entry occupies the directory location; retained: %s"},
{"连接已验证，ADB 设备命令可用。\n\n%s","Connection verified. ADB device commands are available.\n\n%s"},
{"正在%s，完成后可重新生成报告。","%s is in progress; regenerate the report when it finishes."},
{"proot 路径: %s\nnativeLibDir: %s\nruntimeMode: %s\nrootfs exec: %s\n","proot path: %s\nnativeLibDir: %s\nruntimeMode: %s\nrootfs exec: %s\n"},
{"\n旧事务归档暂缓，原件保留：%s","\nOld transaction archival deferred; originals retained: %s"},
{"保存失败：%s\n可点「另存为」选择位置后重试。","Save failed: %s\nChoose a location with Save as and retry."},
{"找不到插件实体，请重新导入：%s","Plugin files were not found. Import the plugin again: %s"},
{"Web 退出尚未确认，原环境保留：%s","Web exit is unconfirmed; the environment is retained: %s"},
{"%s；保存任务状态失败，下次需要重新检查","%s; saving the task state failed; check again next time"},
{"已授权，连接失败：%s。点击下方重试。","Authorized, but the connection failed: %s. Retry below."},
{"[ERR] 截屏需要 Android 11 及以上（当前 API %s）","[ERR] Screenshots require Android 11+ (current API %s)"},
{"检测到 %s 项异常，查看插件与恢复选项","Detected %s issues; check plugins and recovery options"},
{"插件清理失败，保留环境占用：%s","Plugin cleanup failed; environment remains locked: %s"},
{"安装失败：\n；未通过或未完整读取：%s","Installation failed:\n; failed or incomplete reads: %s"},
{"部分完成：\n；未通过或未完整读取：%s","Partially completed:\n; failed or incomplete reads: %s"},
{"模型试图在设备上执行：\n%s\n\n是否允许？","The model wants to run on the device:\n%s\n\nAllow this?"},
{"最近启动失败\n%s\n%s\n\n%s\n\n=== 进程输出 ===\n","Latest startup failure\n%s\n%s\n\n%s\n\n=== Process output ===\n"},
{"本次配置快照暂不可用：%s","Configuration snapshot unavailable for this start: %s"},
{"与 %s 的文件冲突：%s；请选择需要使用的版本","File conflicts with %s: %s; select the version you need"},
{"自动开无线调试失败: %s","Could not enable wireless debugging automatically: %s"},
{"后台暂不能启动 ADB 保活: %s","ADB keep-alive cannot start in the background yet: %s"},
{"[ERR] 截屏被系统拒绝（错误码 %d）","[ERR] Screenshot rejected by the system (error %d)"},
{"下载尚未开始：%s；请在更新页重试","Download did not start: %s; retry on the update page"},
{"%s 进程退出，退出码 %s（鉴权前）","%s process exited with code %s (before authentication)"},
{"Web 服务尚未就绪（HTTP %s），请稍后重试","The Web service is not ready (HTTP %s); retry later."},
{"前台服务未获系统允许：%s","The system did not allow the foreground service: %s"},
{"%s 进程退出，退出码 %s（鉴权后）","%s process exited with code %s (after authentication)"},
{"已按需修复 %s 步，并通过复验","Repaired %s steps as needed and verified them again"},
{"安装失败：\n已准备内容 SHA-256：%s","Installation failed:\nPrepared contents SHA-256: %s"},
{"部分完成：\n已准备内容 SHA-256：%s","Partially completed:\nPrepared contents SHA-256: %s"},
{"操作失败：；未通过或未完整读取：%s","Operation failed: ; failed or incomplete reads: %s"},
{"正在%s，完成后再保存配置","%s is in progress. Save settings after it finishes"},
{"Web 鉴权失败，请点「进入」重试（%s）","Web authentication failed. Tap Enter to retry (%s)"},
{"SCRIPTS_FAILED: ADB 脚本更新未完成\n%s","SCRIPTS_FAILED: ADB script update is incomplete\n%s"},
{"[保活] 取锁失败（不致命）：%s","[Keepalive] Power lease unavailable (nonfatal): %s"},
{"无法读取待清理目录：%s","Cannot read the directory selected for cleanup: %s"},
{"检查 Web 进程失败（PID %s，errno=%s）","Could not inspect the Web process (PID %s, errno=%s)"},
{"使用已验证方式安装离线工具：%s","Installing offline tools with verified runtime: %s"},
{"配对密钥已保存，连接尚未验证。%s","Pairing key saved. Connection not yet verified.%s"},
{"安装失败：\n实际依赖数量：%s","Installation failed:\nActual dependency count: %s"},
{"部分完成：\n实际依赖数量：%s","Partially completed:\nActual dependency count: %s"},
{"已保存：Download/DSHA/%s\n点按此处查看日志","Saved: Download/DSHA/%s\nTap here to view the log"},
{"还没有可重新导出的私有验证副本。\n%s","No private verified copies are available yet.\n%s"},
{"3090 的 IPv6 附加监听不可用：%s","Additional IPv6 listener on 3090 unavailable: %s"},
{"从容器取文件失败: %s","Could not copy the file out of the container: %s"},
{"\n\n本机 Web 地址（可长按复制）：\n%s","\n\nLocal Web address (press and hold to copy):\n%s"},
{"操作失败：已准备内容 SHA-256：%s","Operation failed: Prepared contents SHA-256: %s"},
{"su：%s\n尚未验证 root 授权","su: %s\nRoot authorization has not been verified"},
{"su：%s\nroot 授权或执行失败：%s","su: %s\nRoot authorization or execution failed: %s"},
{"新环境第 %d 步检查失败：%s","New environment step %d verification failed: %s"},
{"WRITE_SECURE_SETTINGS 授权结果: %s","WRITE_SECURE_SETTINGS authorization result: %s"},
{"WRITE_SECURE_SETTINGS 授权失败: %s","WRITE_SECURE_SETTINGS authorization failed: %s"},
{"部分旧环境待清理：%s","Some older environments still need cleanup: %s"},
{"推文件进容器失败: %s","Could not copy the file into the container: %s"},
{"停止隔离检查进程未完成：%s","The isolated trial process has not stopped: %s"},
{"打不开 QQ，请手动搜索群号：%s","Could not open QQ. Search for group number: %s"},
{"Web 身份记录暂未保存：%s","The Web identity record could not be saved: %s"},
{"安装失败：\n缺失依赖：%s","Installation failed:\nMissing dependencies: %s"},
{"部分完成：\n缺失依赖：%s","Partially completed:\nMissing dependencies: %s"},
{"操作失败：实际依赖数量：%s","Operation failed: Actual dependency count: %s"},
{"%s · 摘要与验证记录一致","%s · Checksum matches the verification record"},
{"检查通过：%s；未通过或未完整读取：%s","Inspection passed: %s; failed or incomplete: %s"},
{"可尝试在系统浏览器打开。错误：%s","Try opening in the system browser. Error: %s"},
{"原生授权即时生效；%s","Native authorization applies immediately; %s"},
{"\n部分旧运行时待下次清理：%s","\nSome old runtimes await a later cleanup: %s"},
{"无法核验本应用进程（PID %s）：%s","Could not verify this app process (PID %s): %s"},
{"LAN 代理已启动：0.0.0.0:%s -> 127.0.0.1:%s","LAN proxy started: 0.0.0.0:%s -> 127.0.0.1:%s"},
{"停止旧 Web 失败：%s","Failed to stop the previous Web process: %s"},
{"网络监听注册失败: %s","Could not register the network listener: %s"},
{"设备确认桥未就绪：%s","Device confirmation bridge is not ready: %s"},
{"操作失败：缺失依赖：%s","Operation failed: Missing dependencies: %s"},
{"短信查询不支持此选项：%s","SMS query does not support this option: %s"},
{"拉起保活服务失败: %s","Could not start the keep-alive service: %s"},
{"悬浮条确认显示失败: %s","Could not display overlay confirmation: %s"},
{"插件依赖安装失败：%s","Plugin dependency installation failed: %s"},
{"[ERR] 写截屏文件失败：%s","[ERR] Could not write screenshot file: %s"},
{"onStartCommand startForeground 失败：%s","onStartCommand startForeground failed: %s"},
{"隔离验证停止未完成：%s","The isolated trial stop is incomplete: %s"},
{"插件已卸载，可重试启动：%s","Plugin removed. You can retry startup: %s"},
{"安装前校验失败：%s；请重试","Pre-install validation failed: %s; retry"},
{"屏幕广播注册失败: %s","Could not register screen broadcasts: %s"},
{"系统 WebView 初始化失败: %s","System WebView initialization failed: %s"},
{"应急进程退出尚未确认：%s","Recovery process exit is unconfirmed: %s"},
{"正在下载插件及依赖：%s","Downloading plugin and dependencies: %s"},
{"无法打开 Web 页面，请重试（%s）","Unable to open the Web page. Retry (%s)"},
{"操作独立虚拟屏：%s","Operate independent virtual display: %s"},
{"3090 桥启动失败: %s","Bridge on port 3090 failed to start: %s"},
{"运行工具准备失败：%s","Runtime tools could not be prepared: %s"},
{"安装失败：\n检查通过：%s","Installation failed:\nChecks passed: %s"},
{"部分完成：\n检查通过：%s","Partially completed:\nChecks passed: %s"},
{"FORBIDDEN: 路径无法解析（%s）","FORBIDDEN: Could not resolve path (%s)"},
{"下载暂停：%s；可继续下载","Download paused: %s; you can resume it"},
{"无法启动安装任务：%s","Cannot start the installation task: %s"},
{"正在解压内置环境… %s","Extracting the bundled environment… %s"},
{"临时目录清理失败：%s","Temporary directory cleanup failed: %s"},
{"内置 npm 文件缺失：%s-cli.js","Bundled npm file is missing: %s-cli.js"},
{"rc1 数据迁移保护失败：%s","Legacy migration protection failed: %s"},
{"%s · 本阶段 %s 秒 · 总计 %s 秒\n%s","%s · Stage %s seconds · Total %s seconds\n%s"},
{"OK: 已写入剪贴板（%s 字）","OK: Clipboard updated (%s characters)"},
{"ERROR: 剪贴板操作失败：%s","ERROR: Clipboard operation failed: %s"},
{"检查%s失败：%s；可重新检查","Checking %s failed: %s; retry the check"},
{"保活探测未完成：%s","Keep-alive probe did not complete: %s"},
{"Ubuntu Python 安装失败: %s","Ubuntu Python installation failed: %s"},
{"缺 %s 个运行时文件（%s 等）","Missing %s runtime files (including %s)"},
{"正在重连无线调试…%s","Reconnecting to Wireless debugging…%s"},
{"受保护目录只读：%s","Protected directory is read-only: %s"},
{"本次实际运行方式：%s","Runtime mode used for this start: %s"},
{"维护阶段已存在：%s","Maintenance stage already exists: %s"},
{"离线 pnpm 安装失败: %s","Bundled pnpm installation failed: %s"},
{"已读取离线包 %s MiB","Read %s MiB from the bundled archive"},
{"内置插件脚本执行失败: %s","The bundled plugin helper failed: %s"},
{"无法打开浏览器，请在浏览器中访问 %s","Could not open the browser. Visit %s"},
{"Web 记录权限无法确认：%s","Cannot confirm Web record access: %s"},
{"已安装 %s；重启 Web 后生效。","Installed %s; restart Web to apply."},
{"操作失败：检查通过：%s","Operation failed: Checks passed: %s"},
{"[ERR] 保存截屏失败：%s","[ERR] Could not save screenshot: %s"},
{"[ERR] 建不了目录 %s","[ERR] Could not create directory %s"},
{"运行时维护路径不安全：%s","Unsafe runtime maintenance path: %s"},
{"失败 %s/3，%s，查看恢复选项","Failed %s/3, %s; see recovery options"},
{"无法安装：%s；可重试","Cannot install: %s; retry available"},
{"%s\n兼容内核 Gecko 143","%s\nCompatibility engine: Gecko 143"},
{"CRC/长度校验失败：%s","CRC/length verification failed: %s"},
{"无法发布 Python 文件：%s","Cannot publish the Python file: %s"},
{"ADB 保活启动失败: %s","ADB keep-alive failed to start: %s"},
{"打不开，请手动访问：%s","Could not open. Visit manually: %s"},
{"\n用户补充复现步骤：\n%s","\nAdditional steps to reproduce:\n%s"},
{"关闭失败，会话仍保留：%s","Close failed; session retained: %s"},
{"Web 根目录权限无法确认：%s","Cannot confirm Web root access: %s"},
{"无法核验本应用进程：%s","Cannot verify this app process: %s"},
{"应急网页无法加载：%s","Cannot load the emergency page: %s"},
{"已禁用 %s；重启 Web 后生效","Disabled %s; restart Web to apply"},
{"正在准备插件依赖：%s","Preparing plugin dependencies: %s"},
{"配置保存未完成：%s","Settings were not fully saved: %s"},
{"备份任务进行中：%s · %s 项","Backup in progress: %s · %s entries"},
{"%s\n\n版本：%s\n位置：%s\n来源：%s","%s\n\nVersion: %s\nLocation: %s\nSource: %s"},
{"安装前校验失败：%s","Pre-install validation failed: %s"},
{"缺少备份支持脚本：%s","Missing backup support script: %s"},
{"新运行时缺少文件：%s","New runtime is missing a file: %s"},
{"proroot 运行时缺 %s","The proroot runtime is missing %s"},
{"检查离线安装运行方式：%s","Checking cold-install runtime: %s"},
{"正在校验应急安装包 (%s/%s)…","Verifying recovery archive (%s/%s)…"},
{"正在准备应急环境 (%s/%s)…","Preparing recovery runtime (%s/%s)…"},
{"已启用 %s；重启 Web 后生效","Enabled %s; restart Web to apply"},
{"；未通过或未完整读取：%s","; failed or incomplete reads: %s"},
{"不透明度 %s · 行数 %s · 字号 %s","Opacity %s · Lines %s · Text size %s"},
{"不认识的命令不执行：%s","Unrecognized command blocked: %s"},
{"启动敏感应用：%s","Launch sensitive application: %s"},
{"停用插件失败：%s","Failed to disable the plugin: %s"},
{"首选 Web 端口已占用：%s","Preferred Web port is in use: %s"},
{"运行时阶段已存在：%s","Runtime stage already exists: %s"},
{"安装步骤失败（%s）：%s","Installation stage failed (%s): %s"},
{"在输入框里填入「%s」","Type into the input field: “%s”"},
{"[ERR] 手势未被接受（%s）","[ERR] Gesture not accepted (%s)"},
{"接收连接失败：%s","Could not accept connection: %s"},
{"3090 桥启动失败：%s","Bridge 3090 failed to start: %s"},
{"LAN 开关生效失败: %s","Could not apply LAN setting: %s"},
{"正在核验应急文件 (%s/%s)…","Verifying recovery files (%s/%s)…"},
{"正在下载插件包… %s","Downloading plugin package… %s"},
{"已显示 %s–%s / %s 条 · 第 %s 页","Showing %s–%s / %s records · Page %s"},
{"插件注册失败：%s","Plugin registration failed: %s"},
{"兼容重试失败：%s","Compatibility retry failed: %s"},
{"无法清理旧文件：%s","Cannot remove the old file: %s"},
{"\n已准备内容 SHA-256：%s","\nPrepared contents SHA-256: %s"},
{"插件任务未开始：%s","Plugin task did not start: %s"},
{"已准备内容 SHA-256：%s","Prepared contents SHA-256: %s"},
{"连接已验证 · 端口 %s%s","Connection verified · Port %s%s"},
{"ADB 状态读取失败：%s","Could not read ADB status: %s"},
{"插件管理脚本执行失败: %s","The plugin manager failed: %s"},
{"应急 DSH 未就绪：%s","Recovery DSH is not ready: %s"},
{"环境任务进行中：%s","Environment task running: %s"},
{"上次保存：%s（点按查看）","Last saved: %s (tap to view)"},
{"终端启动失败：%s","Terminal failed to start: %s"},
{"会话已结束（退出码 %s）","Session ended (exit code %s)"},
{"已选择项目目录：%s","Selected project folders: %s"},
{"[ERR] 读屏失败：%s","[ERR] Screen read failed: %s"},
{"[ERR] 手势超时（%s）","[ERR] Gesture timed out (%s)"},
{"无法开始诊断：%s","Cannot start diagnostics: %s"},
{"检查未完成：%s","The check did not finish: %s"},
{"ADB 操作未完成：%s","ADB operation incomplete: %s"},
{"发现新版本 %s · %s","New version available: %s · %s"},
{"悬浮条更新失败: %s","Could not update overlay: %s"},
{"正在下载并解析：%s","Downloading and parsing: %s"},
{"实际依赖数量：%s","Actual dependency count: %s"},
{"3090 桥绑定失败：%s","3090 bridge bind failed: %s"},
{"[ERR] 截屏失败：%s","[ERR] Screenshot failed: %s"},
{"[终端读取失败：%s]\n","[Terminal read failed: %s]\n"},
{"打开设置失败：%s","Could not open settings: %s"},
{"…（输出过长已截断）\n%s","…(long output truncated)\n%s"},
{"标准版预览内核: %s","Standard browser engine: %s"},
{"QQ群 %s · 问题反馈","QQ group %s · Issue tracker"},
{"\n已安全清理 %s 项 · %s","\nSafely removed %s items · %s"},
{"文件处理失败：%s","File processing failed: %s"},
{"模型试图执行：%s","The model wants to run: %s"},
{"[ERR] 按键失败：%s","[ERR] Key press failed: %s"},
{"OK 截屏已保存：%s（%sx%s）","OK Screenshot saved: %s(%sx%s)"},
{"诊断未完成：%s","Diagnostics incomplete: %s"},
{"Shizuku 绑定失败: %s","Could not bind Shizuku: %s"},
{"保活探测异常: %s","Keep-alive probe error: %s"},
{"ADB 准备失败：%s","ADB preparation failed: %s"},
{"无法打开 Shizuku：%s","Could not open Shizuku: %s"},
{"\n上次未完成：%s","\nPreviously incomplete: %s"},
{"悬浮条预览显示失败: %s","Overlay preview failed: %s"},
{"\n最近自动副本：%s","\nLatest automatic copy: %s"},
{"插件加载失败：%s","Plugin loading failed: %s"},
{"LAN 代理绑定失败：%s","LAN proxy bind failed: %s"},
{"端口发现失败：%s","Port discovery failed: %s"},
{"\n上次检查版本：%s","\nLast checked version: %s"},
{"最近手动备份：%s\n%s","Latest manual backup: %s\n%s"},
{"缺失依赖：%s","Missing dependencies: %s"},
{"欢迎介绍：第 %s 页，共 %s 页","Introduction page %s of %s"},
{"下载失败：HTTP %s","Download failed: HTTP %s"},
{"OK 已输入 %s 个字符","OK Entered %s characters"},
{"[ERR] 手势失败：%s","[ERR] Gesture failed: %s"},
{"正在检查%s更新…","Checking for %s updates…"},
{"启动排队失败：%s","Cannot queue startup: %s"},
{"symlink 失败: %s -> %s: %s","symlink failed: %s -> %s: %s"},
{"服务返回 HTTP %s","Service returned HTTP %s"},
{"%s · 总耗时 %s 秒%s%s","%s · Total time %s seconds%s%s"},
{"[ERR] 系统拒绝了 %s","[ERR] Android denied %s"},
{"滑动 (%d,%d)→(%d,%d)","Swipe (%d,%d)→(%d,%d)"},
{"文件不存在：%s","File does not exist: %s"},
{"条目路径冲突：%s","Entry path conflict: %s"},
{"npm 插件包 · %s","npm plugin package · %s"},
{"%s：失败（退出码 %s）","%s: failed (exit code %s)"},
{"重连端口 %s","Reconnecting on port %s"},
{"停止 Web 未完成：%s","Web has not stopped: %s"},
{"\n可回退：%s","\nRollback available: %s"},
{"⚠ 请求执行：%s","⚠ Requested command: %s"},
{"终端 %s · 关闭中…","Terminal %s · Closing…"},
{"滑动屏幕 (%s,%s)→(%s,%s)","Swipe screen (%s,%s)→(%s,%s)"},
{"[ERR] 输入失败：%s","[ERR] Input failed: %s"},
{"%s\n候选来源：%s","%s\nCandidate channel: %s"},
{"启动未完成：%s","Startup incomplete: %s"},
{"%s：未收到结果","%s: no result received"},
{"PTY 启动失败：%s","PTY startup failed: %s"},
{"DSHA v%s · MIT 许可","DSHA v%s · MIT License"},
{"网页确认（%s）","Web confirmation (%s)"},
{"\n可更新：%s","\nUpdate available: %s"},
{"切换到终端 %s","Switch to terminal %s"},
{"点击坐标 (%s,%s)","Tap coordinates (%s,%s)"},
{"发现新版本 %s","New version found: %s"},
{"文件大小无效：%s","Invalid file size: %s"},
{"%s\n分支/目录：%s","%s\nBranch/directory: %s"},
{"link 失败: %s -> %s: %s","link failed: %s -> %s: %s"},
{"传感器/手电 %s","Sensors/flashlight %s"},
{" · 当前阶段 %s 秒"," · Current stage %s s"},
{"%s，%s，点击查看详情","%s, %s. Tap for details"},
{"操作失败：%s","Operation failed: %s"},
{"%s 秒（当前）","%s seconds (current)"},
{"[ERR] 点击失败：%s","[ERR] Tap failed: %s"},
{"恢复完成：%s%s%s","Restore complete: %s%s%s"},
{"下载失败：%s","Download failed: %s"},
{"下载暂停：%s","Download paused: %s"},
{"检测到 %s 个插件","Detected %s plugins"},
{"下载源：%s","Download source: %s"},
{"按下系统按键 %s","Press system key %s"},
{"实际 Web 端口：%s","Active Web port: %s"},
{"插件压缩包 · %s","Plugin archive · %s"},
{"%s · 默认分支","%s · default branch"},
{"Web 端口被占用：%s","Web port in use: %s"},
{"OK: 震动 %sms","OK: Vibrating %sms"},
{"连接来自 %s","Connection from %s"},
{"修复失败：%s\n","Repair failed: %s\n"},
{"任务异常：%s","Task exception: %s"},
{"启动失败：%s","Startup failed: %s"},
{"检查第 %s 步：%s","Checking step %s: %s"},
{" · 总耗时 %s 秒%s%s"," · Total time %s s%s%s"},
{"%s · 点击查看进度","%s · View progress"},
{"跟随系统 · %s","Follow system · %s"},
{"检查通过：%s","Checks passed: %s"},
{"上传失败：%s","Upload failed: %s"},
{"导出失败：%s","Export failed: %s"},
{"关闭终端 %s","Close terminal %s"},
{"正在回退 %s…","Rolling back %s…"},
{"检查失败：%s","Check failed: %s"},
{"更多操作：%s","More actions: %s"},
{"运行方式：%s","Runtime mode: %s"},
{"触发原因：%s","Triggered by: %s"},
{"回退至 %s","Roll back to %s"},
{"OK: 已启动 %s","OK: Launched %s"},
{"任务失败：%s","Task failed: %s"},
{"复制失败：%s","Copy failed: %s"},
{"%s\n错误代码：%s","%s\nError code: %s"},
{"网页提示（%s）","Web alert (%s)"},
{"启动中…（%s）","Starting… (%s)"},
{"已识别：%s","Recognized: %s"},
{"%s\n%s 项 · %s%s%s","%s\n%s entries · %s%s%s"},
{"OK 已点击「%s」","OK Tapped “%s”"},
{"%s…（已截断）","%s…(truncated)"},
{"退出码 %s：\n%s","Exit code %s:\n%s"},
{"跳过 · %s：%s","Skipped · %s: %s"},
{"正在下载 %s","Downloading %s"},
{"正在打包：%s","Packaging: %s"},
{"文字大小：%s","Text size: %s"},
{"OK: 已打开 %s","OK: Opened %s"},
{"点按 (%d,%d)","Tap (%d,%d)"},
{"\n\n版本：%s%s%s%s%s%s","\n\nVersion: %s%s%s%s%s%s"},
{"\n位置：%s","\nLocation: %s"},
{"%s\n\n版本：%s%s%s%s%s%s","%s\n\nVersion: %s%s%s%s%s%s"},
{"%s 项 · %s","%s entries · %s"},
{"正在禁用 %s","Disabling %s"},
{"正在删除 %s…","Deleting %s…"},
{"更新至 %s","Update to %s"},
{"%s\n文件数：%d","%s\nFiles: %d"},
{"正在启用 %s","Enabling %s"},
{"不透明度：%s","Opacity: %s"},
{"终端 %s","Terminal %s"},
{"位置 %s","Location %s"},
{"\n来源：%s","\nSource: %s"},
{"会话 %s","Session %s"},
{"%s 秒","%s seconds"},
{"禁用 %s","Disable %s"},
{"OK 已发送 %s","OK Sent %s"},
{"%s：通过","%s: passed"},
{"启用 %s","Enable %s"},
{"%s 分 %s 秒","%s min %s s"},
{"%s 时 %s 分","%s h %s min"},
{"%s：正常","%s: ready"},
{"已保存：%s","Saved: %s"},
{"%s 行","%s lines"},
{"已释放 %s","Freed %s"},
{"点击「%s」","Tap “%s”"},
{"OK 已%s","OK %s"},
};
}
