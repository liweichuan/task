package com.jnshu.service;

import com.jnshu.model.Studio;

public interface StudioService {
    int deleteByPrimaryKey(Long id);

    int insert(Studio record);

    int insertSelective(Studio record);

    Studio selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);
}
