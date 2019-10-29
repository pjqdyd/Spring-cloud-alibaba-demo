### Spring Cloud Alibaba 使用案例

#### 依赖版本信息:

>spring-boot  2.1.8.RELEASE
>
>spring-cloud  Greenwich.RELEASE
>
>spring-cloud-alibaba  2.1.0.RELEASE



### 项目结构:

```
  ├─spring-cloud-alibaba-server-provider   服务提供者模块
  ├─spring-cloud-alibaba-server-consumer   服务消费者模块
  ├─spring-cloud-alibaba-config-client     使用nacos外部配置模块
  ├─nacos-docker.md                        docker启动nacos
  ├─.gitignore                             .gitignore文件
  ├─README.md                              README.md文件
  └─pom.xml                                父模块pom文件
 ```

### 如何启动:

1. 先使用[docker启动nacos](./nacos-docker.md)服务注册中心;

2. 访问http://[docker主机ip]:8848/nacos, 登录nacos, 默认账户密码都是nacos;

3. 启动对应服务, 注册到注册中心;


