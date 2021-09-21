package com.zty.springcloud.service;

import com.zty.springcloud.dao.EmployeeMapper;
import com.zty.springcloud.pojo.HandEmployees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public boolean addEmployee(HandEmployees handEmployees) {
        return employeeMapper.addEmployee(handEmployees);
    }

    @Override
    public boolean updateEmployee(HandEmployees handEmployees) {
        return employeeMapper.updateEmployee(handEmployees);
    }

    @Override
    public List<HandEmployees> queryAll() {
        return employeeMapper.queryAll();
    }
}
