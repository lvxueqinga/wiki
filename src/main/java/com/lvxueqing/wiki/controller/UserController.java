package com.lvxueqing.wiki.controller;


import com.lvxueqing.wiki.domain.User;
import com.lvxueqing.wiki.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Resource
    private UserService userService;



    @GetMapping("/list1")
    public List<User> list(){
        return userService.list();
    }



}
