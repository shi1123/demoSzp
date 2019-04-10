package com.example.demo.controller;

import com.example.demo.model.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("userInfo")
public class UserInfoController {
    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello Stringboot";
    }

    @RequestMapping("/selectById")
    public UserInfo selectById(Integer id){
        return userInfoService.selectById(id);
    }
}

