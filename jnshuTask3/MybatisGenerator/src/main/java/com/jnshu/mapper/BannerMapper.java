package com.jnshu.mapper;

import com.jnshu.model.Banner;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BannerMapper {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Banner record);

    boolean insertSelective(Banner record);

    Banner selectByPrimaryKey(Long id);

    List<Banner> selectByCondition();

    boolean updateByPrimaryKeySelective(Banner record);

    int updateStatus(Banner record);
}