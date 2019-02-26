package com.hw.businessserviceuser.service.impl;

import com.hw.businessserviceuser.domain.User;
import com.hw.businessserviceuser.repository.UserRepository;
import com.hw.businessserviceuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 16:18
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUser(String username, String password) {
        return userRepository.findByUsernameAndPassword(username, password);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
