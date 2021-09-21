package com.zty.springcloud.dao;

import com.zty.springcloud.pojo.HandEmployees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
     boolean addEmployee(HandEmployees handEmployees);

     boolean updateEmployee(HandEmployees handEmployees);

     List<HandEmployees> queryAll();
}
