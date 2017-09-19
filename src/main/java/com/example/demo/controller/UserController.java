package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

/**
 * Created by huangpenglong on 2017/9/19.
 */

@RestController
@RequestMapping("/hibernate")
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping("getUserById")
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

    @RequestMapping("saveUser")
    public boolean saveUser() {
        userService.saveUser();
        return true;
    }
}
