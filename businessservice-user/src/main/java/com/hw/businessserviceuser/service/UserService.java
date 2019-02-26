package com.hw.businessserviceuser.service;

import com.hw.businessserviceuser.domain.User;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 16:17
 * @Version 1.0
 */
public interface UserService {
    User getUser(String username, String password);

    User saveUser(User user);
}
