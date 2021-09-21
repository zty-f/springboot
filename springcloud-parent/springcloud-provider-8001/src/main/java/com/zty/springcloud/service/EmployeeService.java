package com.zty.springcloud.service;

import com.zty.springcloud.pojo.HandEmployees;

import java.util.List;

public interface EmployeeService {
     /** 添加员工信息 */
     boolean addEmployee(HandEmployees handEmployees);

     boolean updateEmployee(HandEmployees handEmployees);

     List<HandEmployees> queryAll();
}
