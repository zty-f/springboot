package com.zty.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//Ribbon和Eureka整合以后，客户端可以直接调用，不用关心ip地址和端口号

@SpringBootApplication
@EnableEurekaClient  //客户端，可以请求服务
@EnableFeignClients(basePackages = {"com.zty.springcloud"})
public class Consumer_8081 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_8081.class,args);
    }

}
