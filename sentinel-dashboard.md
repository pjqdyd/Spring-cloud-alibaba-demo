### 使用sentinel 流量控制,熔断限流,应用监控


#### 1.启动sentinel-dashboard控制台

-访问[https://github.com/alibaba/Sentinel/releases](https://github.com/alibaba/Sentinel/releases)下载发布的jar包;

-目前下载的版本sentinel-dashboard-1.6.3.jar;

-运行命令启动:
```
java -Dserver.port=8888 -Dcsp.sentinel.dashboard.server=localhost:8888 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.6.3.jar
```
或:
```
java -jar sentinel-dashboard-1.6.3.jar --server.port=8888 --csp.sentinel.dashboard.server=localhost:8888 --project.name=sentinel-dashboard 
```

访问: localhost:8888 进入控制台, 账户密码默认都是sentinel;
