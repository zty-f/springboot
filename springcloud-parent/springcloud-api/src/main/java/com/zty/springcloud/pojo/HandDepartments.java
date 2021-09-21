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
public class HandDepartments implements Serializable {

  private long departmentId;
  private String departmentCode;
  private String departmentName;
  private long managerId;
  private long locationId;

}
