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
Dept dept = new Dept();
dept.setDeptNo(11).setDname('zzz').setDb_source('001');
 */
public abstract class HandLocations implements Serializable{

  private long locationId;
  private String country;
  private String province;
  private String city;
  private String address;

}
