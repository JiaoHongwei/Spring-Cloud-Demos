package com.hw.businessserviceuserclientfeign;

import com.hw.businessserviceuserclientfeign.service.UserManagementFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@EnableFeignClients
@RestController
@EnableHystrixDashboard
@EnableCircuitBreaker
@SpringBootApplication
public class BusinessserviceUserClientFeignApplication {

//    http://localhost:8091/actuator/hystrix.stream

//    localhost:8091/hystrix
    public static void main(String[] args) {
        SpringApplication.run(BusinessserviceUserClientFeignApplication.class, args);
    }

    /**
     * http://localhost:8091/feign?name=hw
     * 测试 Hystrix 的熔断
     */
    @Autowired
    private UserManagementFeignClient userManagementFeignClient;

    @RequestMapping("hi")
    public String getClient(@RequestParam String name) {
        return userManagementFeignClient.getInfo(name);
    }

}
