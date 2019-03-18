package com.hw.businessserviceuserclientfeign.hystrix;

import com.hw.businessserviceuserclientfeign.service.UserManagementFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Description Feign Hystrix fallback 指定类 需要实现原接口，并注入到Ioc容器中 ，重写远程方法
 * @Author hw
 * @Date 2019/3/18 17:46
 * @Version 1.0
 */
@Component
public class UserManagementFeignClientHystrixImpl implements UserManagementFeignClient {
    @Override
    public String getInfo(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
