package com.springboot.demo.redis_related;

import org.springframework.data.redis.core.index.Indexed;

public class Family {
    @Indexed
    private String type;
    @Indexed
    private String username;
    //省略getter和setter
    public void setType(String type) {
        this.type = type;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getType() {
        return type;
    }
    public String getUsername() {
        return username;
    }

    //省略有参和无参构造方法
    public Family(){}
    public Family(String type, String username){
        setType(type);
        setUsername(username);
    }
    //省略toString()方法
}
