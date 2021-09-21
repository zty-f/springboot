/**
 * @program: springboot-10-shiro
 * @ClassName: UserServiceImpl
 * @description:
 * @author: zty
 * @create: 2021-07-22 19:39
 **/
package com.zty.service;

import com.zty.mapper.UserMapper;
import com.zty.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User queryUserByName(String name) {
        return userMapper.queryUserByName(name);
    }
}

