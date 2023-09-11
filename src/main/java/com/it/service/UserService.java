package com.it.service;

import com.it.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {

    List<User> findAll();

    boolean validateUser(String username, String password);

    User getUser(String username);
}
