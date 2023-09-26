package com.it.service.impl;

import com.it.service.RoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @Author Chen
 * @Date 2023/9/25 10:06
 */
//指定当前测试类在Spring的测试环境中执行此时就可以通过注入的方式直接获取IOC容器中bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:application.xml")
public class RoleServiceImplTest {

    @Autowired
    private RoleService roleService;

    @Test
    public void queryAll() {
        System.out.println(roleService.queryAll(1));
    }
}