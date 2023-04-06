package com.springboot.demo.database.controller;

//编写Web访问层，实现查询、更新、删除控制

import com.springboot.demo.database.domain.Article;
import com.springboot.demo.database.service.ArticleService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

//步骤1：加入组合注解@RestController，相当于@Controller+@ResponseBody两个注解的结合
//@Controller 表明了这个类是一个控制器类。注入服务
//@ResponseBody 表示方法的返回值直接以指定的格式写入Http response body中，而不是解析为跳转路径
@Controller
public class ArticleController {
    // 步骤2：使用@Autowired对commentService进行标注,让 spring 完成 bean 自动装配的工作
    @Autowired
    private ArticleService articleService;

    /*
     * 步骤3：实现查询控制
     */
    @GetMapping("/get/{aid}") // 这里的id为路径访问传递过来的值
    public Article findByAid(@PathVariable("aid") Integer aid) {// @PathVariable*是spring3.0的一个新功能:接收请求路径中占位符的值
        Article article = articleService.findByAid(aid);
        return article;
    }

    /*
     * 实现更新操作,需要接收两个参数
     */
    @GetMapping("/update/{aid}/{content}")
    public Article updateArticle(@PathVariable("aid") int aid, @PathVariable("content") String content) {
        Article article = articleService.findByAid(aid);
        article.setContent(content);
        articleService.updateArticle(article);
        Article updateComment = articleService.findByAid(aid);
        return updateComment;
    }

    /*
     * 实现删除操作，需要接收id参数
     */
    @GetMapping("/delete/{aid}")
    public void deleteById(@PathVariable("aid") Integer aid) {
        articleService.deleteArticle(aid);
    }

    // 这里我们进行添加article数据的操作
    @PostMapping(value = "/addArticle/Acticle")
    public String addArticle(@RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("uid") Integer uid) {
        articleService.addArticle(title, content, uid);
        return "redirect:/Article_Management";
    }

}
