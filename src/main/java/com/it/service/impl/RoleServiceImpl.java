package com.it.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it.mapper.RoleMapper;
import com.it.mapper.RoleMenuMapper;
import com.it.pojo.Role;
import com.it.pojo.RoleExample;
import com.it.pojo.RoleMenu;
import com.it.pojo.RoleMenuExample;
import com.it.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    @Autowired
    private RoleMenuMapper roleMenuMapper;

    @Override
    public PageInfo<Role> queryAll(Integer pageNo) {

        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andIsdeletedEqualTo(1);
        PageHelper.startPage(pageNo,PAGE_SIZE);
        List<Role> roleList = roleMapper.selectByExample(roleExample);

        return new PageInfo<>(roleList,NAVIGATE_PAGES);

    }

    @Override
    public void deleteRole(Integer id) {
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void authorized(Integer roleId, Integer[] ids) {
        //删除对应的全部权限
        RoleMenuExample roleMenuExample = new RoleMenuExample();
        RoleMenuExample.Criteria criteria = roleMenuExample.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRoleId(roleId);
        roleMenu.setIsdeleted(0);
        roleMenuMapper.updateByExampleSelective(roleMenu,roleMenuExample);

        //添加权限
        for (Integer menuId : ids) {
            roleMenuMapper.insertSelective(new RoleMenu(roleId,menuId));
        }
    }
}
