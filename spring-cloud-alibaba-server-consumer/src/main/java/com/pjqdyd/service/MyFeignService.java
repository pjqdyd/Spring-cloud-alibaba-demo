package com.pjqdyd.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**   
 * @Description:  [Feign远程调用服务接口]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient(name = "spring-cloud-alibaba-server-provider")
public interface MyFeignService {

    @GetMapping(value = "/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name);

}
