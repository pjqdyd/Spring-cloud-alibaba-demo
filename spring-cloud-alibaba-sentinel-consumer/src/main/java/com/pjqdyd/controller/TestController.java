package com.pjqdyd.controller;

import com.pjqdyd.service.MyFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**   
 * @Description:  [测试Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class TestController {

    @Resource
    private MyFeignService myFeignService;

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return myFeignService.sayHi(name);
    }

}
