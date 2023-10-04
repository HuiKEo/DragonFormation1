package com.it.service.impl;

import com.it.mapper.MenuMapper;
import com.it.mapper.RoleMapper;
import com.it.mapper.UserMapper;
import com.it.pojo.Menu;
import com.it.pojo.MenuExample;
import com.it.pojo.Role;
import com.it.pojo.User;
import com.it.pojo.vo.MenuVo;
import com.it.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.*;

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
    public List<MenuVo> getAuditMenu() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userMapper.queryUserByName(userDetails.getUsername());
        //查询用户所具有的角色
        List<Role> roleList = roleMapper.queryRoleByUserId(user.getId());

        ArrayList<Integer> roleMenuIds = new ArrayList<>();

        ArrayList<MenuVo> menuVoList = new ArrayList<>();
        //查询角色对应的权限
        for (Role role : roleList) {
            //查询一级菜单
            List<Menu> menuLevel1List = menuMapper.queryMenuByRoleId(role.getId());
            for (Menu menu : menuLevel1List) {
                MenuVo menuVo = new MenuVo();

                ArrayList<MenuVo> menuVoList1 = new ArrayList<>();
                //查询二级菜单
                List<Menu> menuLevel2List = menuMapper.queryMenuLevel2ByParentId(role.getId(),menu.getId());
                for (Menu menu2 : menuLevel2List) {
                    MenuVo menuVo1 = new MenuVo();
                    menuVo1.setMenu(menu2);
                    if(!roleMenuIds.contains(menu2.getId())){
                        menuVoList1.add(menuVo1);
                        roleMenuIds.add(menu2.getId());
                    }
                }

                menuVo.setMenu(menu);
                menuVo.setMenuList(menuVoList1);
                if(!roleMenuIds.contains(menu.getId())){
                    menuVoList.add(menuVo);
                    roleMenuIds.add(menu.getId());
                }
            }
        }
        return menuVoList;
    }

    @Override
    public Map<String, Object> queryRoleMenu(Integer roleId) {

        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria criteria = menuExample.createCriteria();
        criteria.andTypeEqualTo(2);
        List<Menu> allMenuList = menuMapper.selectByExample(menuExample);
        List<Menu> roleMenuList = menuMapper.queryMenuLevel2ByRoleId(roleId);
        HashMap<String, Object> menuMap = new HashMap<>();
        menuMap.put("allMenu",allMenuList);
        menuMap.put("roleMenu",roleMenuList);

        return menuMap;
    }

    @Override
    public List<Menu> queryAllMenu() {
        return menuMapper.selectByExample(null);
    }
}
