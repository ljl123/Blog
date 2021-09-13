# Blog
# 简介
基于 Spring Boot + Vue 的前后端分离博客系统 参考 https://juejin.cn/post/6844903823966732302 然后增加了些功能和做了优化
# 启动项目
下载之后
后端数据库的账户名和密码改为自己本机的，然后运行提供的数据库脚本blog.sql
前端npm install安装所需包，然后npm run serve运行项目
# 后端
* 核心框架：Spring Boot
* 安全框架：shiro
* Token 认证：jwt
* 持久层框架：MyBatisPlus
* java版本：JDK8
# 前端
* 核心框架：Vue、Element UI、axios
* 编辑：markdown
# 功能
* 主页（按时间排序查看所有博客）
* 分类（分类查看博客）
* 发表博客、修改博客
* 关于我
* 登录（没做注册）
# 后续部署可以参考的文档
（https://juejin.im/post/6886061338804617229）
