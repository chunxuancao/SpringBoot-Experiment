package com.springboot.demo.redis_related;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@RedisHash("persons")
public class Person {
    @Id
    private String id;
    @Indexed
    private String firstname;
    @Indexed
    private String lastname;
    private Address address;
    private List<Family> familyList;
    //省略getter和setter
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Address getAddress() {
        return address;
    }
    public List<Family> getFamilyList() {
        return familyList;
    }
    public String getId() {
        return id;
    }
    public String getLastname() {
        return lastname;
    }
    //省略有参和无参构造方法
    public Person(){}
    public Person(String id,String firstname,String lastname,Address address,List<Family> familyList){
        setFirstname(firstname);
        setAddress(address);
        setFamilyList(familyList);
        setId(id);
        setLastname(lastname);
    }
    public Person(String firstname,String lastname){
        setFirstname(firstname);
        setLastname(lastname);
    }
    //省略toString()方法
}
