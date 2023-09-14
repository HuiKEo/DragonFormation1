package com.it.controller;

import com.it.pojo.Menu;
import com.it.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/11 16:46
 */
@Controller
public class IndexController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String clientIndex(Model model){

        List<Menu> menuList  = menuService.getAuditMenu();
        model.addAttribute("menuList",menuList);

        return "client_index";
    }
}
