package com.example.fuchuang.controller;


import com.example.fuchuang.mapper.UserMapper;
import com.example.fuchuang.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller


public class UserController {
    @Resource
    UserMapper userMapper;
    @ResponseBody
    @RequestMapping("/user")
    public String userMapper(Model m){
        List<User> users = userMapper.findAll();
        m.addAttribute("user",users);
        System.out.println(users);
        return "user";//注意：此处在页面显示的是user表中的原始json数据并非jsp页面
    }

    @ResponseBody
    @RequestMapping("/usertext")
    public List<User> userlist(Model m){
        List<User> users = userMapper.findAll();
        m.addAttribute("user",users);
        System.out.println(users);
        return users;//注意：此处在页面显示的是user表中的原始json数据并非jsp页面
    }
    @RequestMapping("/index")
    public String index() {

        return "index";
    }


}