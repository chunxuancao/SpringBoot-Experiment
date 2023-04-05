package com.springboot.demo.database.domain;

import javax.persistence.*;

@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    private String uname;
    private String PASSWORD;
    private String uemail;
    private String introduction;

    public Integer getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getUemail() {
        return uemail;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPASSWORD(String pASSWORD) {
        this.PASSWORD = pASSWORD;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    // 省略toString()方法
    @Override
    public String toString() {
        return "Comment{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", uemail='" + uemail + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }
}
