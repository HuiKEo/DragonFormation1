package com.it.service;

import com.github.pagehelper.PageInfo;
import com.it.pojo.Role;

import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/14 22:23
 */
public interface RoleService {

    /**
     * 查询全部 分页
     * @return
     */
    PageInfo<Role> queryAll(Integer pageNo);
}
