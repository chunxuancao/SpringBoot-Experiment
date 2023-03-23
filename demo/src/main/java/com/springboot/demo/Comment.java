package com.springboot.demo;

public class Comment {
    private Integer id;
    private String content;
    private String author;
    private Integer aId;

    // 省略属性getter和setter方法
    public Integer getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public Integer getaId() {
        return aId;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    // 省略toString()方法
    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", aId='" + aId + '\'' +
                '}';
    }
}
