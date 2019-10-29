package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**   
 * @Description:  [加载nacos外部配置的应用启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAlibabaConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaConfigClientApplication.class, args);
    }

}
