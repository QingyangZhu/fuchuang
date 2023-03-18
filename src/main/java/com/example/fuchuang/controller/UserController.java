package com.example.fuchuang.controller;


import com.example.fuchuang.mapper.UserMapper;
import com.example.fuchuang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;

@Controller
@ResponseBody

public class UserController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/user")
    public List<User> userMapper(Model m){
        List<User> users = userMapper.findAll();
        m.addAttribute("user",users);
        System.out.println(users);
        return users;
    }
    @RequestMapping("/index")
    public String index() {

        return "index";
    }


}