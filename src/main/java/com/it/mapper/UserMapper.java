package com.it.mapper;

import com.it.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Select("SELECT * FROM user WHERE username = #{username}")
    User getUserByUsername(String userName);

}
