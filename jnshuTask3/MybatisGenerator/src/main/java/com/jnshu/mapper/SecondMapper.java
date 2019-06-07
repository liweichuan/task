package com.jnshu.mapper;

import com.jnshu.model.Second;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SecondMapper {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Second record);

    boolean insertSelective(Second record);

    Second selectByPrimaryKey(Long id);

    List<Second> selectByCondition();

    boolean updateByPrimaryKeySelective(Second record);

    int updateStatus(Second record);
}