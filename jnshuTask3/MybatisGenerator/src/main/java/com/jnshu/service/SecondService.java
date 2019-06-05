package com.jnshu.service;

import com.jnshu.model.Second;

public interface SecondService {
    int deleteByPrimaryKey(Long id);

    int insert(Second record);

    int insertSelective(Second record);

    Second selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Second record);

    int updateByPrimaryKey(Second record);
}
