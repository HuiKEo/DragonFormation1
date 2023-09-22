package com.it.controller;

import com.it.pojo.Menu;
import com.it.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/11 16:46
 */
@RestController
public class IndexController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/getMenu",method = RequestMethod.GET)
    public List<Menu> getMenu(){
        return menuService.getAuditMenu();
    }
}
