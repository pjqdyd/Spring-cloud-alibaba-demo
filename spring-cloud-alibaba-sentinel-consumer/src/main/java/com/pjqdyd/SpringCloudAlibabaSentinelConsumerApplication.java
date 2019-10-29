package com.pjqdyd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**   
 * @Description:  [使用了Sentinel 的消费者启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudAlibabaSentinelConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaSentinelConsumerApplication.class, args);
    }

}
