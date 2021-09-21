package com.zty.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","<h1>Hello</h1>");
        map.put("users", Arrays.asList("zty","fmj"));
        //classpath:/templates/test.html
        return "test";
    }

}