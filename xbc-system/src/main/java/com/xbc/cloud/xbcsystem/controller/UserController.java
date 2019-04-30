package com.xbc.cloud.xbcsystem.controller;

import com.xbc.cloud.xbcsystem.entity.User;
import com.xbc.cloud.xbcsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/30 16:36
 */
@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

}