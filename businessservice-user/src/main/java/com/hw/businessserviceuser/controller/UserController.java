package com.hw.businessserviceuser.controller;

import com.hw.businessserviceuser.domain.User;
import com.hw.businessserviceuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 16:18
 * @Version 1.0
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录获取用户信息
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @PostMapping("auth")
    public ResponseEntity auth(@RequestParam String username, @RequestParam String password) {
        User user = userService.getUser(username, password);
        return ResponseEntity.ok(user);
    }

    @PostMapping("user")
    public ResponseEntity user() {
        User user = new User();
        Random random = new Random();
        int num = random.nextInt(10);
        String name = "hongwei_" + num;
        user.setUsername(name);
        user.setPassword(name);
        user.setEmail(name + "@qq.com");
        user.setSex(num % 2 == 0 ? "男" : "女");
        user.setPhone("123456789" + num);
        user = userService.saveUser(user);
        return ResponseEntity.ok(user);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    public String home(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }


}
