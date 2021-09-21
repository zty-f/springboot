package com.zty.springcloud.service;

import com.zty.springcloud.dao.DepartmentMapper;
import com.zty.springcloud.pojo.HandDepartments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public boolean addDepartment(HandDepartments handDepartments) {
        return departmentMapper.addDepartment(handDepartments);
    }

    @Override
    public boolean updateDepartment(HandDepartments handDepartments) {
        return departmentMapper.updateDepartment(handDepartments);
    }
}
