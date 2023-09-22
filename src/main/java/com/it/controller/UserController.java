package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Chen
 * @Date 2023/9/22 9:29
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/list")
    public String queryAllUsers(){

        return "user_list";
    }

}
