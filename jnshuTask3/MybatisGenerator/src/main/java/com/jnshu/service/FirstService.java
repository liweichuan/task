package com.jnshu.service;

import com.jnshu.model.First;

import java.util.List;

public interface FirstService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(First record);

    boolean insertSelective(First record);

    First selectByPrimaryKey(Long id);

    List<First> selectByCondition();

    boolean updateByPrimaryKeySelective(First record);

    int updateStatus(First record);
}
