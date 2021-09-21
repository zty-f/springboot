package com.zty.springcloud.service;


import com.zty.springcloud.pojo.HandDepartments;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

//服务降级
@Component
public class DepartmentClientServiceFallBackFactory implements FallbackFactory {
    @Override
    public DepartmentClientService create(Throwable throwable) {
        return new DepartmentClientService() {

            @Override
            public boolean addDepartment(HandDepartments handDepartments) {
                System.out.println("该服务已经关闭！");
                return false;
            }

            @Override
            public boolean updateDepartment(HandDepartments handDepartments) {
                System.out.println("该服务已经关闭！");
                return false;
            }
        };
    }
}