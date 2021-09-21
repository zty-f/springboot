package com.zty;

import com.zty.pojo.Dog;
import com.zty.pojo.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring02ConfigApplicationTests {

    @Autowired
    private People people;

    @Test
    void contextLoads() {
        System.out.println(people);
    }

}
