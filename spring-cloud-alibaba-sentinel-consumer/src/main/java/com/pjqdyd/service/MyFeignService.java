package com.pjqdyd.service;

import com.pjqdyd.service.fallback.MyFeignServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**   
 * @Description:  [Feign远程调用服务接口]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@FeignClient(value = "spring-cloud-alibaba-server-provider", fallback = MyFeignServiceFallback.class)
public interface MyFeignService {

    @GetMapping(value = "/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name);

}
