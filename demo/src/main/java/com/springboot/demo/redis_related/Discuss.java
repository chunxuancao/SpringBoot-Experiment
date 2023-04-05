package com.springboot.demo.redis_related;

import javax.persistence.*;

@Entity(name = "t_comment")
public class Discuss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String author;
    private String content;
    @Column(name = "a_id")
    private Integer aId;
    //省略getXXX()和setXXX()
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public Integer getId() {
        return id;
    }
    public Integer getaId() {
        return aId;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setaId(Integer aId) {
        this.aId = aId;
    }
    @Override
    public String toString() {
        return "Discuss{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aId='" + aId + '\'' +
                '}';
    }
}
