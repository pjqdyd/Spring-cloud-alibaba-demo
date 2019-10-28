package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**   
 * @Description:  [SpringCloudAlibaba提供者启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAlibabaServerProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaServerProviderApplication.class, args);
    }

}
