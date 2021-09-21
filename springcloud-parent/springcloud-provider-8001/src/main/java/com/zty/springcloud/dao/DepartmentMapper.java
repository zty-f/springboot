package com.zty.springcloud.dao;
import com.zty.springcloud.pojo.HandDepartments;
import com.zty.springcloud.pojo.HandEmployees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface DepartmentMapper {
     boolean addDepartment(HandDepartments handDepartments);

     boolean updateDepartment(HandDepartments handDepartments);
}
