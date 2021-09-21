package com.zty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int id;  //部门id
    private String departmentName;  //部门名字
}
