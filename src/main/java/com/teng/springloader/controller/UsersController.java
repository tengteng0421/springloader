package com.teng.springloader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsersController {
    @RequestMapping("/show")
    public String showPage(){
        System.out.println("show next page........init");
        return "index";
    }
}
