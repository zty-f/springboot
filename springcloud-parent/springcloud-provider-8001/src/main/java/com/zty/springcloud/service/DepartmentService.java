package com.zty.springcloud.service;

import com.zty.springcloud.pojo.HandDepartments;

public interface DepartmentService {
     boolean addDepartment(HandDepartments handDepartments);

     boolean updateDepartment(HandDepartments handDepartments);
}
