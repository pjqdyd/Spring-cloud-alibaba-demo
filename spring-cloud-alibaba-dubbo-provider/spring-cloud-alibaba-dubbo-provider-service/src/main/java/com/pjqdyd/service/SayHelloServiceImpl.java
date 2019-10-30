package com.pjqdyd.service;

import com.pjqdyd.api.SayHelloService;
import org.apache.dubbo.config.annotation.Service;

/**   
 * @Description:  [dubbo接口服务实现类]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */
@Service(version = "1.0.0")
public class SayHelloServiceImpl implements SayHelloService {

    @Override
    public String sayHi(String name) {
        return "Hello From Dubbo " + name;
    }
}
