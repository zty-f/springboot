package com.zty.springcloud.service;

import com.zty.springcloud.pojo.HandDepartments;
import com.zty.springcloud.pojo.HandEmployees;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER" ,fallbackFactory = DepartmentClientServiceFallBackFactory.class)
public interface DepartmentClientService {

    @GetMapping("dept/add")
     boolean addDepartment(HandDepartments handDepartments);
    @GetMapping("dept/update")
     boolean updateDepartment(HandDepartments handDepartments);
}
