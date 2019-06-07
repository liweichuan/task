package com.jnshu.service;

import com.jnshu.model.Studio;

import java.util.List;

public interface StudioService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Studio record);

    boolean insertSelective(Studio record);

    Studio selectByPrimaryKey(Long id);

    List<Studio> selectByCondition();

    boolean updateByPrimaryKeySelective(Studio record);

    int updateStatus(Studio record);
}
