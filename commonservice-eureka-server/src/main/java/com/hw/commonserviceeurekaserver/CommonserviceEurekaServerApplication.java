package com.hw.commonserviceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * windows电脑，在c:/windows/systems/drivers/etc/hosts 修改。
 * linux系统通过vim /etc/hosts ,加上
 * 127.0.0.1 peer1
 * 127.0.0.1 peer2
 * @author hw
 */
@EnableEurekaServer
@SpringBootApplication
public class CommonserviceEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonserviceEurekaServerApplication.class, args);
    }

}
