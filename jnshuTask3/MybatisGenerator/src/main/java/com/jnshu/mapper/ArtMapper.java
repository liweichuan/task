package com.jnshu.mapper;

import com.jnshu.model.Art;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArtMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Art record);

    int insertSelective(Art record);

    Art selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Art record);

    int updateByPrimaryKey(Art record);
}