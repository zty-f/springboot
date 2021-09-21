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
public class HandJobs implements Serializable{

  private long jobId;
  private String jobCode;
  private String jobName;
  private long primaryFlag;
  private long enabledFlag;
  private long employeeId;

}
