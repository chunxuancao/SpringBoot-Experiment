package com.springboot.demo.database.controller.ArticleController;

//编写Web访问层，实现查询、更新、删除控制

import com.springboot.demo.database.service.ArticleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//步骤1：加入组合注解@RestController，相当于@Controller+@ResponseBody两个注解的结合
//@Controller 表明了这个类是一个控制器类。注入服务
//@ResponseBody 表示方法的返回值直接以指定的格式写入Http response body中，而不是解析为跳转路径
@Controller
public class BlogAriticleController {
    // 步骤2：使用@Autowired对commentService进行标注,让 spring 完成 bean 自动装配的工作
    @Autowired
    private ArticleService articleService;

    // 这里我们进行添加article数据的操作，在博客写作那写入发布的功能，并重定位到Article_Management
    @PostMapping(value = "/addArticle/Acticle")
    public String addArticle(@RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("uid") Integer uid) {
        articleService.addArticle(title, content, uid);
        return "redirect:/Article_Management";
    }

    // 实现表格的功能，文章管理
    
    
}
