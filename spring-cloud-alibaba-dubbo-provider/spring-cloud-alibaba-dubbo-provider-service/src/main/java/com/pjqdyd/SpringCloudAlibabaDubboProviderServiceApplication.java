package com.pjqdyd;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**   
 * @Description:  [Dubbo提供者服务实现启动类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@EnableDubbo
@SpringBootApplication
public class SpringCloudAlibabaDubboProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaDubboProviderServiceApplication.class, args);
    }

}
