package com.jnshu.service;

import com.jnshu.model.Second;

import java.util.List;

public interface SecondService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Second record);

    boolean insertSelective(Second record);

    Second selectByPrimaryKey(Long id);

    List<Second> selectByCondition();

    boolean updateByPrimaryKeySelective(Second record);

    int updateStatus(Second record);
}
