package com.zty.springcloud.controller;

import com.zty.springcloud.pojo.HandEmployees;
import com.zty.springcloud.service.EmployeeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EpyConsumerController {

    @Autowired
    private EmployeeClientService employeeClientService;
    @GetMapping("/consumer/epy/add")
    public boolean addEmployee(HandEmployees handEmployees){
        return  employeeClientService.addEmployee(handEmployees);
    }
    @GetMapping("/consumer/epy/update")
    public boolean updateEmployee(HandEmployees handEmployees){
        return employeeClientService.updateEmployee(handEmployees);
    }
    @GetMapping("/consumer/epy/all")
    public List<HandEmployees> queryAll(){
        return employeeClientService.queryAll();
    }
}
