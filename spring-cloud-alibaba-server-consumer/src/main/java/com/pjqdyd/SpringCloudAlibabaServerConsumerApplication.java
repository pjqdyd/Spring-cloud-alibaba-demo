package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**   
 * @Description:  [SpringCloudAlibaba消费者启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAlibabaServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaServerConsumerApplication.class, args);
    }

}
