package com.jnshu.mapper;

import com.jnshu.model.First;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FirstMapper {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(First record);

    boolean insertSelective(First record);

    First selectByPrimaryKey(Long id);

    List<First> selectByCondition();

    boolean updateByPrimaryKeySelective(First record);

    int updateStatus(First record);
}