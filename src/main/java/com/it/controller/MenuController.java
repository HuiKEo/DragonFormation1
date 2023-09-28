package com.it.controller;

import com.it.pojo.Menu;
import com.it.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @Author Chen
 * @Date 2023/9/26 16:37
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Resource
    private MenuService menuService;

    @RequestMapping(value = "/queryRoleMenu/{roleId}",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> queryRoleMenu(@PathVariable("roleId") Integer roleId){
        return menuService.queryRoleMenu(roleId);
    }
}
