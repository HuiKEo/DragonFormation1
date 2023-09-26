package com.it.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.mapper.RoleMapper;
import com.it.mapper.UserMapper;
import com.it.pojo.Role;
import com.it.pojo.RoleExample;
import com.it.pojo.User;
import com.it.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static com.it.utils.ObjectConstants.NAVIGATE_PAGES;
import static com.it.utils.ObjectConstants.PAGE_SIZE;

/**
 * @Author Chen
 * @Date 2023/9/14 22:24
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public PageInfo<Role> queryAll(Integer pageNo) {

        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andIsdeletedEqualTo(1);
        PageHelper.startPage(pageNo,PAGE_SIZE);
        List<Role> roleList = roleMapper.selectByExample(roleExample);

        return new PageInfo<>(roleList,NAVIGATE_PAGES);

    }
}
