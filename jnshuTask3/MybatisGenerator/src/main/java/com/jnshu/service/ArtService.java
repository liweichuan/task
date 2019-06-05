package com.jnshu.service;

import com.jnshu.model.Art;

public interface ArtService {
    int deleteByPrimaryKey(Long id);

    int insert(Art record);

    int insertSelective(Art record);

    Art selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Art record);

    int updateByPrimaryKey(Art record);
}
