package com.bachan.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 方式二（@ConfigurationProperties+@EnableConfigurationProperties）
 */
//@ConfigurationProperties(prefix = "stu")
public class Student1 {
    private String name;
    private Integer age;

    public Student1(){}

    public Student1(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
