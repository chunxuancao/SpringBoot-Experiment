package com.springboot.demo.database.domain;

import java.sql.Date;
import javax.persistence.*;

@Entity(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid;
    private String title;
    private String content;
    private Date create_time;
    private Date update_time;
    /*
     * @JoinColumn：配置外键
     * name：外键字段名称
     * referencedColumnName：参数的主表的主键的字段名称
     */

    @Column(name = "uid")
    private Integer uid;
    // 省略属性getter和setter方法

    public Date getCreate_time() {
        return create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    // 省略toString()方法
    @Override
    public String toString() {
        return "Article{" +
                "aid='" + aid + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", uid='" + uid + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                '}';
    }
}
