package com.zty.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //注册bean到容器中
public class Dog {
    @Value("fmj")
    private String name;
    @Value("3")
    private Integer age;

    public Dog( ) {

    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //有参无参构造、get、set方法、toString()方法
}