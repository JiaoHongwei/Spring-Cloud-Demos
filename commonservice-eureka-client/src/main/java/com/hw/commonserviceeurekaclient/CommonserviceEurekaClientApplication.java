package com.hw.commonserviceeurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CommonserviceEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonserviceEurekaClientApplication.class, args);
    }

}
