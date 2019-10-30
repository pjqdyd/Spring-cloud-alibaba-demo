package com.pjqdyd.controller;

import com.pjqdyd.api.SayHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [Dubbo 测试Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class TestController {

    @Reference(version = "1.0.0")
    private SayHelloService sayHelloService;

    /**
     * 测试dubbo远程调用方法
     * @param name
     * @return
     */
    @GetMapping("/dubbo/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return sayHelloService.sayHi(name);
    }

}
