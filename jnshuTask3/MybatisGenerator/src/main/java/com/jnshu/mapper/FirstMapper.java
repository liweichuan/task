package com.jnshu.mapper;

import com.jnshu.model.First;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FirstMapper {
    int deleteByPrimaryKey(Long id);

    int insert(First record);

    int insertSelective(First record);

    First selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(First record);

    int updateByPrimaryKey(First record);
}