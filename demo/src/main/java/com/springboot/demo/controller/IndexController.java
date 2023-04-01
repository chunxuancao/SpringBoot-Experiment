package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String IndexPage(Model model) {

        return "index";
    }
}
