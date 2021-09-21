package com.zty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫码包下面的Mapper接口
//@MapperScan("com.zty.mapper")
public class Springboot06MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06MybatisApplication.class, args);
    }

}
