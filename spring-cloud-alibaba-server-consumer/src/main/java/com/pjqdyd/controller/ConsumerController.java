package com.pjqdyd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**   
 * @Description:  [消费者Controller层]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@RestController
public class ConsumerController {

    private final RestTemplate restTemplate;

    @Autowired
    public ConsumerController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("/sayHi/{name}")
    public String sayHello(@PathVariable("name") String name){
        return restTemplate.getForObject("http://spring-cloud-alibaba-server-provider/sayHi/" + name, String.class);
    }

}
