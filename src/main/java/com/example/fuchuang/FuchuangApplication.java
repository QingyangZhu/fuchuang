package com.example.fuchuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class FuchuangApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(FuchuangApplication.class, args);
        System.out.println("启动类完成启动");

    }
    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String index() {
        return "恭喜，您的springboot搭建完成！！！";
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(FuchuangApplication.class);
    }
}
