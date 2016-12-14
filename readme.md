# 笔记

## 分布式启动流程
    - 先启动config-server服务器
    - 再启动eureka-server服务器（2个集群）
    - 启动eureka-client

## Maven
    <parent>标签
    <dependencyManagement>标签

## Spring Cloud Config
    Server端配置
    Client端配置
    - server.port也可以通过下载获得

## Spring Cloud Eureka
    Server集群高可用配置
    -eureka.instance.metadataMap.instanceId 配置是作用于eureka客户端上的，eureka服务器只能使用IP或hostname标记
