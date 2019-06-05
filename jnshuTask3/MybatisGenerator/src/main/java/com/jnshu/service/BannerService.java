package com.jnshu.service;

import com.jnshu.model.Banner;

import java.util.List;

public interface BannerService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Banner record);

    boolean insertSelective(Banner record);

    Banner selectByPrimaryKey(Long id);

    List<Banner> selectByCondition();

    boolean updateByPrimaryKeySelective(Banner record);

    int updateStatus(Banner record);
}
