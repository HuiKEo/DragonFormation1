package com.it.service;

import com.it.pojo.Menu;
import com.it.pojo.vo.MenuVo;

import java.util.List;
import java.util.Map;

/**
 * @Author Chen
 * @Date 2023/9/14 22:28
 */
public interface MenuService {
    /**
     * 获取用户对应权限
     * @return
     */
    List<MenuVo> getAuditMenu();

    /**
     * 获取对应角色的权限
     * @param roleId
     * @return
     */
    Map<String, Object> queryRoleMenu(Integer roleId);

    /**
     * 查询全部权限
     * @return
     */
    List<Menu> queryAllMenu();
}
