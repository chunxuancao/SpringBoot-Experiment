package com.springboot.demo.controller;

import com.springboot.demo.domain.Comment;
import com.springboot.demo.service.ApiCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // 窄化请求路径
public class ApiCommentController {
    @Autowired
    private ApiCommentService apiCommentService;

    @GetMapping("/get/{id}")
    public Comment findById(@PathVariable("id") int comment_id) {
        Comment comment = apiCommentService.findById(comment_id);
        return comment;
    }

    @GetMapping("/update/{id}/{author}")
    public Comment updateComment(@PathVariable("id") int id, @PathVariable("author") String author) {
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(id);
        System.out.println(author);
        System.out.println("+++++++++++++++++++++++++++");
        Comment comment = apiCommentService.findById(id);
        System.out.println(comment);
        comment.setAuthor(author);
        System.out.println(comment);
        int i = apiCommentService.updateComment(comment);
        Comment updateComment = apiCommentService.findById(id);
        return updateComment;
    }

    @GetMapping("/delete/{id}")
    public void deleteComment(@PathVariable("id") int comment_id) {
        apiCommentService.deleteComment(comment_id);
    }
}
