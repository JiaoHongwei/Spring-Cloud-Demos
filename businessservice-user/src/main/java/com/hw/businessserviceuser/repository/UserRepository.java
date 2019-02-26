package com.hw.businessserviceuser.repository;

import com.hw.businessserviceuser.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description TODO
 * @Author hw
 * @Date 2019/2/26 16:25
 * @Version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
