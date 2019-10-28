#### docker安装nacos

1. clone项目:

```
git clone https://github.com/nacos-group/nacos-docker.git
cd nacos-docker
```

2. 单机模式:
```
docker-compose -f example/standalone-mysql.yaml up -d
```

访问: http://[docker主机ip]:8848/nacos 进入nacos控制台