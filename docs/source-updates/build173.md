# build173 源码更新（2026-10-15）

本次将已在本地交付的 build173 源码同步到 GitHub，诊断版本仍为 `0.2.24-20261014.1308-dsh0.2.0-rc.2` / 173。本次 Git 提交不包含 APK、源码压缩包、验收原件、用户数据或签名资料，也不发布 Release 或部署网站。已发布下载仍指向 build170。

- 引擎迁移为 bxroot / proot；未知执行结果、慢启动和业务写任务不自动重放。
- 移除彻底重装与完整格式化的生产能力，外置工作区维护仅断开私有引用。
- 更新内置移动插件至 3.1.0，保留原生导航并迁移沉浸式系统栏；撤回 QuickChat。
- 修复数据导出、覆盖升级维护、停止画中画后重新进入工作台的缩放残留，以及严格开机边界证明后的旧进程现场恢复。

应用执行源码沿用本轮已验证字节。为源码同步补充了 CI 检出适配：按 Git 规则统一普通文本 LF，三份由摘要直接锁定的元数据保留原字节并独立核验；源码 CI 明确延后 native 二进制检查，完整打包门禁仍默认严格检查。Standard 在一台 Android 13 设备完成同签名覆盖、真实重启恢复、限定 PiP / 全屏 / 旋转及无密码导出检查；最终软件门禁 37 项通过，两版 JUnit 各 1700 项、40 项跳过，Release Lint 与资产签名检查通过。这不是所有机型或完整设备矩阵通过，Low 设备验收仍暂缓；四小时只继承输入相同的历史桌面证据。历史未归因的数据项和有限日志中的 renderer / SAF 回调异常继续保留，不宣称零崩溃。

## 从源码构建

本次仅提交源码，不更新或新增生成的 native 二进制与离线运行时归档。仓库既有预编译文件不能代表 build173 的最终包；打包前必须按当前锁文件重新生成 / 恢复并完整核对，包括 bxroot、原生会话桥、Ubuntu、DSH 和独立应急资产。缺少这些输入的源码检出不等于可安装的精简 APK。

构建入口见 [BUILD.md](../../BUILD.md) 和 [CONTRIBUTING.md](../../CONTRIBUTING.md)。bxroot 固定上游、补丁及工具链信息位于 `tools/bxroot/lock.json`，准备源码使用 `python tools/bxroot/build.py --prepare-source <空目录>`，构建入口为 `tools/bxroot/build-linux.sh`；原生会话桥由 `tools/native-session/build.py` 生成。源码检查使用 `python tools/verify-runtime-descriptor-source.py --source-only`，输出会列出未核验的 native 文件，不能据此宣称原生包通过。完整包仍须使用不带该选项的严格默认入口，并执行原生闭包、单测、Release Lint、资产和历史签名门禁，不能绕过缺失或不匹配的输入。

Star History 通过 GitHub stargazers API 重新生成浅色 / 深色 SVG 与仅含日期和数量的汇总，保留主分支已有的每 12 小时自动刷新计划。
