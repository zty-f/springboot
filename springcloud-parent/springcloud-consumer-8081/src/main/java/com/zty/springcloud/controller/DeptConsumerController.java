package com.zty.springcloud.controller;

import com.zty.springcloud.pojo.HandDepartments;
import com.zty.springcloud.service.DepartmentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptConsumerController {

    @Autowired
    private DepartmentClientService departmentClientService;

    @GetMapping("/consumer/dept/add")
    public boolean addDepartment(HandDepartments handDepartments){
        return departmentClientService.addDepartment(handDepartments);
    }
    @GetMapping("/consumer/dept/update")
    public boolean updateDepartment(HandDepartments handDepartments){
        return departmentClientService.updateDepartment(handDepartments);
    }


}
