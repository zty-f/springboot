package com.zty.springcloud.controller;
import com.zty.springcloud.pojo.HandEmployees;
import com.zty.springcloud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/epy/add")
    public boolean addEmployee(HandEmployees handEmployees) {
        return employeeService.addEmployee(handEmployees);
    }
    @GetMapping("epy/update")
    public boolean updateEmployee(HandEmployees handEmployees){
        return employeeService.updateEmployee(handEmployees);
    }
    @GetMapping("epy/all")
    public List<HandEmployees> queryAll(){
        return employeeService.queryAll();
    }
}

