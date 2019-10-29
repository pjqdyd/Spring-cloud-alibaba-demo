#### 一. 加载nacos外部配置的应用

#### (1)在nacos上新建外部配置

> Data ID: spring-cloud-alibaba-nacos-config.yaml
>
> Group: DEFAULT_GROUP
>
> 配置格式: 勾选yaml
>
>配置内容:
>
```
server:
  port: 8081

spring:
  application:
    name: spring-cloud-alibaba-config-client

  cloud:
    nacos:
      discovery:
        #服务注册中心地址
        server-addr: localhost:8848

#暴露监控健康点
management:
  endpoints:
    web:
      exposure:
        include: "*"
user:
  admin: pjqdyd
```

#### (2)最后发布保存配置, 启动应用即可


### 二, 多环境配置, 使用生产环境配置:

#### (1)在nacos上新建外部配置

> Data ID: spring-cloud-alibaba-nacos-config-prod.yaml
>
> Group: DEFAULT_GROUP
>
> 配置格式: 勾选yaml
>
>配置内容:
>
```
server:
  port: 9090

spring:
  application:
    name: spring-cloud-alibaba-config-client

  cloud:
    nacos:
      discovery:
        server-addr: localhost:8848

management:
  endpoints:
    web:
      exposure:
        include: "*"
user:
  admin: pjqdyd-prod
```

#### 保存发布配置.
   在IDEA中修改Edit Configurations -> Active Profiles输入prod再启动应用就使用
   bootstrap-prod的配置;
   
   在打包发布时使用--spring.profiles.active=prod启动参数同理;
   
   (提示: 生产环境的配置取消中文注释, 以免报错)


