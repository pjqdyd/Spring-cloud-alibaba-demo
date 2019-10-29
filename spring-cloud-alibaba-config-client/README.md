#### 加载nacos外表配置的应用

#### 1. 在nacos上新建外部配置

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

#### 2. 最后发布保存配置