package com.zty.springcloud.controller;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zty.springcloud.pojo.HandDepartments;
import com.zty.springcloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @HystrixCommand(fallbackMethod = "hystrixadd")
    @GetMapping("/dept/add")
    public boolean add(HandDepartments handDepartments){
        boolean temp;
        temp = departmentService.addDepartment(handDepartments);

        if (temp == false){
            throw new RuntimeException("添加失败！");
        }


        return temp;
    }
    @GetMapping("/dept/update")
    public  boolean update(HandDepartments handDepartments){
        return departmentService.updateDepartment(handDepartments);
    }

    public boolean hystrixadd(HandDepartments handDepartments){
        return false;
    }
}
