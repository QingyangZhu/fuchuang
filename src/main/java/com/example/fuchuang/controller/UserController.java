package com.example.fuchuang.controller;


/*import com.example.fuchuang.mapper.UserMapper;
//import com.example.fuchuang.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;*/

import com.example.fuchuang.entity.User;
import com.example.fuchuang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
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
        return "userVIEW";//注意：此处在页面只能返回一个字符串，即是说在页面上显示user
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

        return "index";//此处返回静态页面index，内容为hello，朱清杨
    }


}*/

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
