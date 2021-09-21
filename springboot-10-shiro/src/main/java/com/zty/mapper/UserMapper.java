/**
 * @description:
 * @author: zty
 * @create: 2021-07-22 19:37
 **/
package com.zty.mapper;

import com.zty.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
    public User queryUserByName(String name);
}
