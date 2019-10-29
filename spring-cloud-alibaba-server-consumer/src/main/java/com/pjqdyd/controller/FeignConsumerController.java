package com.pjqdyd.controller;

import com.pjqdyd.service.MyFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [调用由Feign提供的接口的Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class FeignConsumerController {

    @Autowired
    private MyFeignService myFeignService;

    @GetMapping("/feign/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return myFeignService.sayHi(name);
    }

}
