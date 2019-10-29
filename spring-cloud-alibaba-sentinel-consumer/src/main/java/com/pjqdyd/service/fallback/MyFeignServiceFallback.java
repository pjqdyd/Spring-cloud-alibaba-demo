package com.pjqdyd.service.fallback;

import com.pjqdyd.service.MyFeignService;
import org.springframework.stereotype.Component;

/**   
 * @Description:  [MyFeign接口熔断后的回调]
 * @Author:       pjqdyd
 * @Version:      [v1.0.0]
 */

@Component
public class MyFeignServiceFallback implements MyFeignService {

    @Override
    public String sayHi(String name) {
        return name + "sayHi 失败 已熔断";
    }
}
