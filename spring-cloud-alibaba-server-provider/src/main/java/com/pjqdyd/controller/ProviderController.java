package com.pjqdyd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [服务提供者Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class ProviderController {

    @GetMapping("/sayHi/{name}")
    public String sayHi(@PathVariable("name") String name){
        return "Hello from " + name;
    }

}
