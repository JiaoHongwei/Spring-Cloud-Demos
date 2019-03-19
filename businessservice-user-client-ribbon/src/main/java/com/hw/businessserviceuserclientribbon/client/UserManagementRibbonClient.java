package com.hw.businessserviceuserclientribbon.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 17:55
 * @Version 1.0
 */
@RestController
public class UserManagementRibbonClient {

    private final
    RestTemplate restTemplate;

    @Autowired
    public UserManagementRibbonClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("client")
    @HystrixCommand(fallbackMethod = "hiError")
    public String getInfo(@RequestParam String name) {
        return this.restTemplate.getForObject("http://businessservice-user/user/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}
