package com.it.service.impl;

import com.it.mapper.MenuMapper;
import com.it.mapper.RoleMapper;
import com.it.mapper.UserMapper;
import com.it.pojo.Menu;
import com.it.pojo.Role;
import com.it.pojo.User;
import com.it.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/14 22:28
 */

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> getAuditMenu() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userMapper.queryUserByName(userDetails.getUsername());
        List<Role> roleList = roleMapper.queryRoleByUserId(user.getId());

        ArrayList<Menu> menus = new ArrayList<>();
        HashSet<Menu> set = new HashSet<>();
        for (Role role : roleList) {
            set.addAll(menuMapper.queryMenuByRoleId(role.getId()));
            menus.clear();
            menus.addAll(set);
        }
        return menus;
    }
}