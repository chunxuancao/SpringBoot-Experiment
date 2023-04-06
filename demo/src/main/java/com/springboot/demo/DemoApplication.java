package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
@EnableCaching
@SpringBootApplication
@ServletComponentScan

public class DemoApplication {
	// TODO: 运行前请进行重新加载maven项目
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
