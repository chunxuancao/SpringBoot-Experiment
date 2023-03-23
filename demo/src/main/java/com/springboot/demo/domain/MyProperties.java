package com.springboot.demo.domain;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  //指定当前类为配置类，也可以使用@component注解代替
@PropertySource("classpath:test.properties")  //指定自定义配置文件位置和名称
@EnableConfigurationProperties(MyProperties.class) //开启对应配置类的属性注入功能，使用@Component注解时无须该注解，这里是配合@Configuration注解使用
@ConfigurationProperties(prefix = "test")  //指定配置文件注入属性前缀
public class MyProperties {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

