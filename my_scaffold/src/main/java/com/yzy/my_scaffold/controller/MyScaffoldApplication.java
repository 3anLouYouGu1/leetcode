package com.yzy.my_scaffold.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Configuration
@SpringBootApplication(scanBasePackages = "com.yzy.my_scaffold")
public class MyScaffoldApplication {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world！";
    }



    public static void main(String[] args) {
        SpringApplication.run(MyScaffoldApplication.class, args);
    }

}
