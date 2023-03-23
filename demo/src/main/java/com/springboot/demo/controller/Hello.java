package com.springboot.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class Hello {
    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }
}
