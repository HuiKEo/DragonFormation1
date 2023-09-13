package com.it.pojo;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String idnumber;
    private String phone;
    private Integer status;
    private String createtime;

    private List<Role> roles;
}