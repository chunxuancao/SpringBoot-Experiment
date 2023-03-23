package com.springboot.demo.domain;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component //用于将当前注入属性值的Person类作为Bean注入Spring容器中,只有这样它才能被@ConfigurationProperties注解赋值
//将配置文件中以person开头的属性通过setter方法注入该类中
public class Student {
    @Value("${person.id}")
    private  int id;         //id
    @Value("${person.name}")
    private  String name;    //名称
    private List hobby;      //爱好
    private String[] family; //家庭成员
    private Map map;
    private  Pet pet;        //宠物
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hobby=" + hobby +
                ", family=" + Arrays.toString(family) +
                ", map=" + map +
                ", pet=" + pet +
                '}';
    }

}



