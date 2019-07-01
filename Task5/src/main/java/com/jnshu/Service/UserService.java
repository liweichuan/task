package com.jnshu.Service;

import com.jnshu.Entity.User;

public interface UserService {
    //注册
    long register(User user);
    //登录 就是一个比对用户信息的过程，比对成功就登录成功，比对失败就是登录失败
    User checkLogin(String userName,String passWord);

    User findById(long id);
}
