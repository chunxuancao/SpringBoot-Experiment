package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String IndexPage(Model model) {

        return "index/index";
    }

    @GetMapping("/BlogWrite")
    public String BlogWritePage(Model model) {

        return "index/BlogWrite";
    }

    @GetMapping("/test")
    public String TestPage(Model model) {

        return "index/test";
    }
}
