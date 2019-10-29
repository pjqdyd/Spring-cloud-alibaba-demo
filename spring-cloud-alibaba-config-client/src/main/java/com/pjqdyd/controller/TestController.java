package com.pjqdyd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**   
 * @Description:  [测试Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RefreshScope
@RestController
public class TestController {

    @Value("${user.admin}")
    private String admin;

    @GetMapping("/config/admin")
    public String getAdmin(){
        return admin;
    }

}
