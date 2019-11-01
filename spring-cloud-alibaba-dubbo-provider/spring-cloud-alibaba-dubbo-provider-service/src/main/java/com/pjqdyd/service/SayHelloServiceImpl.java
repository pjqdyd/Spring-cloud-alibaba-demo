package com.pjqdyd.service;

import com.pjqdyd.api.SayHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**   
 * @Description:  [dubbo接口服务实现类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Service(version = "1.0.0")
public class SayHelloServiceImpl implements SayHelloService {


    @Value("${dubbo.protocol.port}")
    public String port;

    @Override
    public String sayHi(String name) {
        return "Hello From Dubbo " + port  + name;
    }
}
