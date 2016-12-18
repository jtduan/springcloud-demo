# 笔记

## 分布式启动流程
    - 先启动config-server服务器
    - 再启动eureka-server服务器（2个集群）
    - 启动eureka-client(Servcie)
    - 启动app(应用)

## Maven
    <parent>标签
    <dependencyManagement>标签

## Spring Cloud Config
    Server端配置(配置后，不要随意修改)
    Client端配置
    - server.port也可以通过下载获得

## Spring Cloud Eureka
    Server集群高可用配置(配置后，不要随意修改，因为Client需要Server的地址)
    -eureka.instance.metadataMap.instanceId 配置是作用于eureka客户端上的，eureka服务器只能使用IP或hostname标记

## Spring Cloud Ribbon
    负载均衡
    - 只需要在应用层模块加入Ribbon包即可
    - app为应用，启动后访问url,查看eureka-client的输出,启动2个eureka-client观察负载均衡的效果

## Spring Cloud Hystrix
## Spring Cloud Admin

## Spring Cloud Bus
## SringCloud Secruity
## Spring Cloud Feign

## 配置文件
    - ${profile:dev1} 可以引用profile变量的值,若不存在，则使用dev1
    - spring.profiles.active == spring.cloud.config.profile
    - spring.application.name == spring.cloud.config.name
    - sprint boot 项目中<build>标签一定要有，否则打包出jar无法运行(父pom有了则子pom可以不写)
        ```
            <build>
               <plugins>
                   <plugin>
                       <groupId>org.springframework.boot</groupId>
                       <artifactId>spring-boot-maven-plugin</artifactId>
                   </plugin>
               </plugins>
           </build>
        ```
