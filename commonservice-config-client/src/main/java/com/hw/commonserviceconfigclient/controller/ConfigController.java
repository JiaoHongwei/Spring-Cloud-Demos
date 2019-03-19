package com.hw.commonserviceconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 *  配置文件修改自动刷新
 *  1、添加rabbitmq
 *  2、添加注解 @RefreshScope
 *  3、修改git 配置文件上传
 *  4、post 访问 http://localhost:8882/actuator/bus-refresh
 *  5、刷新页面 http://localhost:8882/user
 * @Author hw
 * @Date 2019/3/19 17:43
 * @Version 1.0
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${user.username}")
    String username;
    @Value("${user.password}")
    String password;
    @Value("${foo}")
    String foo;


//    http://localhost:8882/user

    @RequestMapping(value = "/user")
    public String hi() {
        return username + "\n" + password + "\n" + foo;
    }

}
