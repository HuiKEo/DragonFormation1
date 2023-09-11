package com.it.service.impl;

import com.it.mapper.UserMapper;
import com.it.pojo.User;
import com.it.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return this.userMapper.findAll();
    }

    @Override
    public boolean validateUser(String username, String password) {
        User user = userMapper.getUserByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public User getUser(String username) {
        return this.userMapper.getUserByUsername(username);
    }
}
