package com.hw.businessserviceuserclientribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class BusinessserviceUserClientRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessserviceUserClientRibbonApplication.class, args);
    }

    /**
     * @LoadBalanced 注解声明开启 负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
