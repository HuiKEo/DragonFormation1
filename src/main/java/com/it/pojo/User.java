package com.it.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
    private Integer position;
    private Date createTime;

}
