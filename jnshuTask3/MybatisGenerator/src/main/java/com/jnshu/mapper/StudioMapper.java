package com.jnshu.mapper;

import com.jnshu.model.Studio;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudioMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Studio record);

    int insertSelective(Studio record);

    Studio selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Studio record);

    int updateByPrimaryKey(Studio record);
}