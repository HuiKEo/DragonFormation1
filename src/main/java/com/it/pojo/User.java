package com.it.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {
    private Integer id;

    private String username;

    private String realname;

    private String password;

    private String idnumber;

    private String phone;

    private Integer status;

    private Integer auditStatus;

    private Integer driverId;

    private Integer enterpriseId;

    private Integer dispositionId;

    private Date createTime;

    private Integer isdeleted;

    private List<Role> roles;

}