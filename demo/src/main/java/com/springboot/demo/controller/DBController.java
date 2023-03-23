package com.springboot.demo.controller;

import com.springboot.demo.config.DBConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBController {
    @Autowired
    private DBConnector dbConnector;
    @GetMapping("/showDB")
    public String showDB(){
        dbConnector.configure();
        return "showDB";
    }
}

