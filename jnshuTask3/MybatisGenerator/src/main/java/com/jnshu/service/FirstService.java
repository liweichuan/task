package com.jnshu.service;

import com.jnshu.model.First;

public interface FirstService {
    int deleteByPrimaryKey(Long id);

    int insert(First record);

    int insertSelective(First record);

    First selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(First record);

    int updateByPrimaryKey(First record);
}
