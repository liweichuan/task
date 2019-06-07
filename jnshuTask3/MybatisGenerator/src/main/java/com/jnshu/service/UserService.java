package com.jnshu.service;

import com.jnshu.model.User;

import java.util.List;

public interface UserService {
    boolean deleteByName(String name);

    boolean insert(User record);

    boolean insertSelective(User record);

    User selectByName(String name);

    List<User> selectByCondition();

    boolean updateByPrimaryKeySelective(User record);

    int updatePassword(User record);
}
