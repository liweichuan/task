package com.jnshu.mapper;

import com.jnshu.model.Second;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecondMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Second record);

    int insertSelective(Second record);

    Second selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Second record);

    int updateByPrimaryKey(Second record);
}