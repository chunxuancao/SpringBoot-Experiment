package com.springboot.demo.redis_related;

import org.springframework.data.redis.core.index.Indexed;

public class Address {
    @Indexed
    private String city;
    @Indexed
    private String country;

    // 省略getter和setter
    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    // 省略有参和无参构造方法
    public Address() {
    }

    public Address(String city, String country) {
        setCity(city);
        setCountry(country);
    }
    // 省略toString()方法
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
