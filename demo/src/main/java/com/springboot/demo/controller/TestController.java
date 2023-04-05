package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 文件管理控制类
 */
@Controller
public class TestController {
    // 向文件上传页面跳转
    @GetMapping("/Data")
    public String toUpload() {
        return "Data";
    }

}
