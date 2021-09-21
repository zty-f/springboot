package com.zty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//开启异步注解功能
@EnableAsync
@SpringBootApplication
@EnableScheduling//开启定时功能的注解
public class Springboot11TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot11TaskApplication.class, args);
    }

}
