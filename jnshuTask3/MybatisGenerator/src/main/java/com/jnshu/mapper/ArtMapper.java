package com.jnshu.mapper;

import com.jnshu.model.Art;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArtMapper {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Art record);

    boolean insertSelective(Art record);

    Art selectByPrimaryKey(Long id);

    List<Art> selectByCondition();

    boolean updateByPrimaryKeySelective(Art record);

    int updateStatus(Art record);
}