package com.hw.commonserviceconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config Server 配置中心服务端
 * @author hw
 */
@SpringBootApplication
@EnableConfigServer
public class CommonserviceConfigServerApplication {

    /**
     * http://localhost:8881/foo/dev
     *
     * http请求地址和资源文件映射如下:
     *
     * /{application}/{profile}[/{label}]
     * /{application}-{profile}.yml
     * /{label}/{application}-{profile}.yml
     * /{application}-{profile}.properties
     * /{label}/{application}-{profile}.properties
     * --------------------
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(CommonserviceConfigServerApplication.class, args);
    }

}
