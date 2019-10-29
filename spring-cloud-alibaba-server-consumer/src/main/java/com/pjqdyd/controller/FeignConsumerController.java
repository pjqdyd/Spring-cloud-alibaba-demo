package com.pjqdyd.controller;

import com.pjqdyd.service.MyFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [调用由Feign提供的接口的Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RefreshScope
@RestController
public class FeignConsumerController {

    @Autowired
    private MyFeignService myFeignService;

    @Value("${user.admin}")
    private String admin;

    @GetMapping("/feign/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return myFeignService.sayHi(name);
    }

    @GetMapping("/feign/getAdmin")
    public String getAdmin(){
        return admin;
    }

}
