package com.jnshu.mapper;

import com.jnshu.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    boolean deleteByName(String name);

    boolean insert(User record);

    boolean insertSelective(User record);

    User selectByName(String name);

    List<User> selectByCondition();

    boolean updateByPrimaryKeySelective(User record);

    int updatePassword(User record);
}