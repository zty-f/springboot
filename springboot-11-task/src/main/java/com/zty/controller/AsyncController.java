/**
 * @program: springboot-11-task
 * @ClassName AsyncController
 * @description:
 * @author: zty
 * @create: 2021-08-05 19:27
 * @Version 1.0
 **/
package com.zty.controller;

import com.zty.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    @Autowired
    AsyncService asyncService;
    @RequestMapping("/hello")
    public String hello(){
        asyncService.hello();//停止三秒
        return "OK";
    }

}
