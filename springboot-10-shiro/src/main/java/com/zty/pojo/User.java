/**
 * @program: springboot-10-shiro
 * @ClassName: User
 * @description:
 * @author: zty
 * @create: 2021-07-22 19:33
 **/
package com.zty.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
    private String perms;
}