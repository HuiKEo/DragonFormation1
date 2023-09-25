package com.it.controller;

import com.github.pagehelper.PageInfo;
import com.it.pojo.Role;
import com.it.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/25 9:41
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询所有角色 分页
     * @param model
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String queryAll(@RequestParam(value = "pageNo",defaultValue = "1",required = false) Integer pageNo,
                                       Model model){

        PageInfo<Role> rolePageInfo = roleService.queryAll(pageNo);
        model.addAttribute("rolePageInfo",rolePageInfo);
        return "role_list";
    }

}
