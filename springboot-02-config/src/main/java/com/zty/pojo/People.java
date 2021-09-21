package com.zty.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;

//通过properties来进行属性注入，配合使用
//@PropertySource(value = "classpath:person.properties")
//@Value("${name}")


    @Component //注册bean到容器中
    @ConfigurationProperties(prefix = "people")
    //@Validated//数据校验
    public class People {
        //@Email(message = "邮箱格式不对！")
        private String name;
        private Integer age;
        private Boolean happy;
        private Date birth;
        private Map<String,Object> maps;
        private List<Object> lists;
        private Dog dog;

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", happy=" + happy +
                    ", birth=" + birth +
                    ", maps=" + maps +
                    ", lists=" + lists +
                    ", dog=" + dog +
                    '}';
        }

        public People() {
        }

        public People(String name, Integer age, Boolean happy, Date birth, Map<String, Object> maps, List<Object> lists, Dog dog) {
            this.name = name;
            this.age = age;
            this.happy = happy;
            this.birth = birth;
            this.maps = maps;
            this.lists = lists;
            this.dog = dog;
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

        public Boolean getHappy() {
            return happy;
        }

        public void setHappy(Boolean happy) {
            this.happy = happy;
        }

        public Date getBirth() {
            return birth;
        }

        public void setBirth(Date birth) {
            this.birth = birth;
        }

        public Map<String, Object> getMaps() {
            return maps;
        }

        public void setMaps(Map<String, Object> maps) {
            this.maps = maps;
        }

        public List<Object> getLists() {
            return lists;
        }

        public void setLists(List<Object> lists) {
            this.lists = lists;
        }

        public Dog getDog() {
            return dog;
        }

        public void setDog(Dog dog) {
            this.dog = dog;
        }

        //有参无参构造、get、set方法、toString()方法
    }
