package com.zty.mapper;

import com.zty.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的Mapper类
@Mapper
@Repository
public interface UserMapper {
    List<User>  selectUser();

    User queryUserById(int id);

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);
}
