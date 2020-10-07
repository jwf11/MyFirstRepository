package com.myproj.ui;

import com.myproj.service.UserService;
import com.myproj.service.impl.UserServiceImpl;

import javax.annotation.Resource;

public class Client {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.findAll();
    }
}
