package com.hw.businessserviceuserclientfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description Feign 声明式调用
 *                Feign默认集成了Ribbon，并和Eureka结合，默认实现了负载均衡的效果。
 * @Author hw
 * @Date 2019/3/18 17:08
 * @Version 1.0
 */
@FeignClient(value = "businessservice-user")
public interface UserManagementFeignClient {

    @RequestMapping("/api/hi")
    String getInfo(@RequestParam(value = "name") String name);
}
