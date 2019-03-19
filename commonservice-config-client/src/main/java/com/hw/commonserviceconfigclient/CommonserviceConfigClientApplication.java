package com.hw.commonserviceconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring Cloud Config 配置中心客户端
 * 注意 git 上的配置文件名一定要是 客户端的 application name + dev，别乱写
 * <p>
 * * /{application}/{profile}[/{label}]
 * * /{application}-{profile}.yml
 * * /{label}/{application}-{profile}.yml
 * * /{application}-{profile}.properties
 * * /{label}/{application}-{profile}.properties
 *
 * @author hw
 */

@EnableEurekaClient
@SpringBootApplication
public class CommonserviceConfigClientApplication {
    // 忽略 配置文件找不到错误
    //    @Bean
//    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        configurer.setIgnoreUnresolvablePlaceholders(true);
//        return configurer;
//    }
    public static void main(String[] args) {
        SpringApplication.run(CommonserviceConfigClientApplication.class, args);
    }
}
