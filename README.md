# beauty

#### 介绍

- 此项目是 分布式微服务的  web 项目脚手架

- 基于 当前 主流 前后端 框架； 

- 实现 开发人员 通过简单配置 一键搭建， 快速开发

#### 软件架构
软件架构说明


#### 安装教程

1.  xxxx
2.  xxxx
3.  xxxx


#### 使用说明

##### 1. 技术选型 依据



##### 2. 技术栈

- spring cloud 
  - eureka 
  - config 
  - openfeign 
  - bus 
  - zipkin 
  - hytrix 
  - gateway

- 数据库 mysql
- 缓存 redis
- 检索 es
- mq
    - kafka
    - rabbitmq
- 分布式事务 seata
- 分布式锁 redis redisson（zookeeper）
- 分库分表 sharding/mycat
- 部署 docker k8s
- 涉及算法
  - 生成id snowflake
  - 缓存穿透 布隆过滤器

##### 3. 项目模块说明

| 模块名 | 描述 |
| ---- | ---- |
| beauty-flow |工作流/审批流模块|
| beauty-auth |鉴权模块|
| beauty-base |基础模块|
| beauty-cache |缓存模块|
| beauty-distribute |分布式模块|
 |-- beauty-registcenter |注册中心|
 |-- beauty-config-server |配置中心|
 |-- beauty-geteway |网关 模块|
| beauty-file |文件模块|
| beauty-generator |代码生成器|
| beauty-log |日志系统模块|
| beauty-openapi |开放API模块|
| beauty-search |检索模块|
| beauty-timedtask |定时任务模块|
| beauty-front |前端部分|
#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 码云特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5.  码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
