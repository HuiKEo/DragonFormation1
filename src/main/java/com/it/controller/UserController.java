package com.it.controller;


import com.it.pojo.User;
import com.it.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Data
@Controller
public class UserController {

    @Autowired
    public UserService userService;

//    @GetMapping("main")
//    public String findAll(HttpServletRequest request){
//        List<User> list =this.userService.findAll();
//        request.setAttribute("list",list);
//        return "login";
//    }

    @RequestMapping(value = "index",method = RequestMethod.POST)
    public String index(@RequestParam("username") String username,
                        @RequestParam("password") String password,HttpServletRequest request){
        if (userService.validateUser(username,password)){
            User user = this.userService.getUser(username);
            System.out.println(user);
            System.out.println(user);
            System.out.println(user);
            request.getSession().setAttribute("list",user);
            return "home";
        }else {
            return "login";
        }
    }
}
