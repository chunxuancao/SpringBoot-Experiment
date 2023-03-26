package com.springboot.demo.controller;

//编写Web访问层，实现查询、更新、删除控制

import com.springboot.demo.domain.Comment;
import com.springboot.demo.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//步骤1：加入组合注解@RestController，相当于@Controller+@ResponseBody两个注解的结合
//@Controller 表明了这个类是一个控制器类。注入服务
//@ResponseBody 表示方法的返回值直接以指定的格式写入Http response body中，而不是解析为跳转路径
@RestController
public class CommentController {
    // 步骤2：使用@Autowired对commentService进行标注,让 spring 完成 bean 自动装配的工作
    @Autowired
    private CommentService commentService;

    /*
     * 步骤3：实现查询控制
     */

    @GetMapping("/get/{id}") // 这里的id为路径访问传递过来的值
    public Comment findById(@PathVariable("id") Integer id) {// @PathVariable*是spring3.0的一个新功能:接收请求路径中占位符的值
        Comment comment = commentService.findById(id);
        return comment;
    }

    /*
     * 步骤4：实现更新操作,需要接收两个参数
     */
    @GetMapping("/update/{id}/{author}")
    public Comment updateComment(@PathVariable("id") int id, @PathVariable("author") String author) {
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(id);
        System.out.println(author);
        System.out.println("+++++++++++++++++++++++++++");
        Comment comment = commentService.findById(id);
        System.out.println(comment);
        comment.setAuthor(author);
        System.out.println(comment);
        int i = commentService.updateComment(comment);
        Comment updateComment = commentService.findById(id);
        return updateComment;
    }

    /*
     * 步骤4：实现删除操作，需要接收id参数
     */
    @GetMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        commentService.deleteComment(id);
    }
}
