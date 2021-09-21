/**
 * @description:
 * @author: zty
 * @create: 2021-07-22 19:39
 **/
package com.zty.service;

import com.zty.pojo.User;

public interface UserService {

    public User queryUserByName(String name);
}