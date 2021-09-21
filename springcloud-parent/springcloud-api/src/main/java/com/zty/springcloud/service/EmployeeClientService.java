package com.zty.springcloud.service;

import com.zty.springcloud.pojo.HandEmployees;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER")
public interface EmployeeClientService {

    @GetMapping("/epy/add")
     boolean addEmployee(HandEmployees handEmployees);
    @GetMapping("epy/update")
     boolean updateEmployee(HandEmployees handEmployees);
    @GetMapping("epy/all")
     List<HandEmployees> queryAll();
}
