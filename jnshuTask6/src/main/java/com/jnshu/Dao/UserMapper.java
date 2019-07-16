package com.jnshu.Dao;

import com.jnshu.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //注册
    long addUser(User user);
    //登录 就是一个比对用户信息的过程，比对成功就登录成功，比对失败就是登录失败
    User findUserByName(String userName);

    User findUserById(long id);
}
