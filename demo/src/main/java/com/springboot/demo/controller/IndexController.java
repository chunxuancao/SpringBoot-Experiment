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

    @GetMapping("/Article_Management")
    public String Article_ManagementPage(Model model) {

        return "index/Article_Management";
    }

    @GetMapping("/Email")
    public String EmailPage(Model model) {

        return "index/Email";
    }

    @GetMapping("/DataBase")
    public String DataBasePage(Model model) {

        return "index/DataBase";
    }

    @GetMapping("/Git_Project")
    public String Git_ProjectPage(Model model) {

        return "index/Git_Project";
    }

    @GetMapping("/Visualization")
    public String VisualizationPage(Model model) {

        return "index/Visualization";
    }

    @GetMapping("/User_Settings")
    public String User_SettingsPage(Model model) {

        return "index/User_Settings";
    }

    @GetMapping("/Website_Introduction")
    public String Website_IntroductionPage(Model model) {

        return "index/Website_Introduction";
    }
}
