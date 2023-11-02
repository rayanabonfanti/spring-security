package com.basicauth.mysql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/authentication")
@RestController
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "Authenticated Successfully!";
    }

}
