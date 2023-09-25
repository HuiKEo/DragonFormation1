package com.it.service.impl;

import com.it.mapper.RoleMapper;
import com.it.mapper.UserMapper;
import com.it.pojo.Role;
import com.it.pojo.User;
import com.it.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Chen
 * @Date 2023/9/9 17:57
 */
@Service("loginUserService")
public class LoginUserServiceImpl implements LoginUserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userMapper.queryUserByName(username);
        List<Role> roleList = roleMapper.queryRoleByUserId(user.getId());
        user.setRoles(roleList);

        //处理自己的用户对象封装成UserDetails
        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(),
                user.getStatus() == 1,
                true,
                true,
                true,
                getAuthority(user.getRoles()));
    }

    List<SimpleGrantedAuthority> getAuthority(List<Role> roles){
        ArrayList<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_"+role.getRolename()));
        }
        return list;
    }

}
