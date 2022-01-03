package jianbin.mybatistest.controller;

import jianbin.mybatistest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("mysql")
    public String mysql() {
        return userService.getAll().toString();
    }
}
