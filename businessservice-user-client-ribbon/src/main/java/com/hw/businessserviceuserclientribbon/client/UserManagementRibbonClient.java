package com.hw.businessserviceuserclientribbon.client;

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
    public String getInfo(@RequestParam String name) {
        return this.restTemplate.getForObject("http://businessservice-user/api/hi?name=" + name, String.class);
    }
}
