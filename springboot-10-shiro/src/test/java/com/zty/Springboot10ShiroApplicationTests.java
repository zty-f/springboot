package com.zty;

import com.zty.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot10ShiroApplicationTests {

    @Autowired
    UserService userService;
    @Test
    void contextLoads() {
        System.out.println(userService.queryUserByName("zty"));
    }

}
