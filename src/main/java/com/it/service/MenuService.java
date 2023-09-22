package com.it.service;

import com.it.pojo.Menu;

import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/14 22:28
 */
public interface MenuService {
    /**
     * 获取用户对应权限
     * @return
     */
    List<Menu> getAuditMenu();
}
