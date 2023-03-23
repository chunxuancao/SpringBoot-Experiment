package com.springboot.demo;

import com.springboot.demo.config.MyService;
import com.springboot.demo.domain.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    private Person person;
    @Autowired
    private Student student;
    @Autowired
    private MyProperties myProperties;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void studentTest() {
        System.out.println(student);
    }

    @Test
    public void myProperties() {
        System.out.println(myProperties);
    }

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void iocTest() {
        System.out.println(applicationContext.containsBean("myService"));
        System.out.println(applicationContext.getBean("myService"));
        MyService myService = (MyService) applicationContext.getBean("myService");
        System.out.println(myService);
    }

    @Value("${my.number.less.than.ten}")
    private String secret;

    @Test
    public void randomTestd() {
        System.out.println(secret);
    }

    @Value("${tom.description}")
    private String description;
    @Value("${app.description}")
    private String description2;

    @Test
    public void placeholderTest() {
        System.out.println(description);
        System.out.println(description2);
    }
}
