package com.it.controller;

import com.github.pagehelper.PageInfo;
import com.it.pojo.Role;
import com.it.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteRole(@PathVariable("id") Integer id){
        roleService.deleteRole(id);
        return "redirect:/role/list";
    }

    @RequestMapping(value = "/authorized",method = RequestMethod.POST)
    @ResponseBody
    public String authorized(@RequestParam("roleId") Integer roleId,
                             @RequestParam("ids[]") Integer[] ids){
        roleService.authorized(roleId,ids);
        return "授权成功";
    }
}
