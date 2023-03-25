package com.springboot.demo.domain;

import java.io.Serializable;

import javax.persistence.*;

//步骤2：添加@Entity注解，指定Comment类与数据库中哪张表映射
@Entity(name = "t_comment")
public class Comment implements Serializable {
    // 步骤1：创建与数据库对应的属性
    @Id // 表明映射对应的主键id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 设置主键自增策略
    private Integer id;
    private String content;
    private String author;
    @Column(name = "a_id") // 因为名称不一样，指定aId映射的表字段名为a_id"，如果 一致，可以不用此注解。
    private Integer aId;

    // 步骤3：按Alt+Insert键，选择所有变量生成相关的Getter and Setter方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }
    // 步骤4：按Alt+Insert键，选择所有变量生成相关的toString()方法

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aId=" + aId +
                '}';
    }
}
