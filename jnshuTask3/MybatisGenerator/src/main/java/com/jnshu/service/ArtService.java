package com.jnshu.service;

import com.jnshu.model.Art;

import java.util.List;

public interface ArtService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Art record);

    boolean insertSelective(Art record);

    Art selectByPrimaryKey(Long id);

    List<Art> selectByCondition();

    boolean updateByPrimaryKeySelective(Art record);

    int updateStatus(Art record);
}
