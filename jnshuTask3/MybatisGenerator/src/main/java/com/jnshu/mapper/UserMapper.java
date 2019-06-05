package com.jnshu.mapper;

import com.jnshu.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}