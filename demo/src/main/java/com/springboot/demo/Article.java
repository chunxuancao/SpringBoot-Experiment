package com.springboot.demo;

import java.util.List;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private List<Comment> commentList;
    //省略属性getter和setter方法
    public List<Comment> getCommentList() {
        return commentList;
    }
    public Integer getId() {
        return id;
    }
    public String getContent() {
        return content;
    }
    public String getTitle() {
        return title;
    }
    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //省略toString()方法
    @Override
    public String toString() {
        return "Article{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", commentList='" + commentList + '\'' +
                '}';
    }
 }

