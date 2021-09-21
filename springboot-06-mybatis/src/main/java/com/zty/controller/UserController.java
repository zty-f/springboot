package com.zty.controller;

import com.zty.mapper.UserMapper;
import com.zty.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/select")
    public List<User> selectUser(){
        List<User> userList=userMapper.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }


}
