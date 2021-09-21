package com.zty.springcloud.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
// 链式写法
/*
链式写法
Dept dept=new Dept();
dept.setDeptNo(11).setDname('zzz').setDb_source('001');
 */
public class HandEmployees implements Serializable{

  private Long employeeId;
  private String employeeNum;
  private String firstName;
  private String lastName;
  private String sex;
  private String phoneNum;
  private String email;
  private java.sql.Timestamp hireDate;
  private long departmentId;
  private String statusCode;
  private HandJobs handJobs;
  private String location;
  private HandDepartments handDepartments;
}
