/*
 * @Author: “chunxuancao” “cao18373503328@outlook.com”
 * @Date: 2023-03-23 08:54:48
 * @LastEditors: “chunxuancao” “cao18373503328@outlook.com”
 * @LastEditTime: 2023-03-23 08:59:49
 * @FilePath: \SpringBoot\demo\src\main\java\com\springboot\demo\domain\Article.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package com.springboot.demo.domain;

import java.util.List;

public class Article {
    private Integer id;
    private String title;
    private String content;
    private List<Comment> commentList;

    // 省略属性getter和setter方法
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

    // 省略toString()方法
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
