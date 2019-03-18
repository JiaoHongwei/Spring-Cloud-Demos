package com.hw.businessserviceuserclientfeign;

import com.hw.businessserviceuserclientfeign.service.UserManagementFeignClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessserviceUserClientFeignApplicationTests {

    @Autowired
    private UserManagementFeignClient userManagement;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testFeignClient() {
        String info = userManagement.getInfo("Feign 调用");
        System.out.println(info);
    }

}
