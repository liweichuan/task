package com.jnshu.mapper;

import com.jnshu.model.Studio;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudioMapper {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Studio record);

    boolean insertSelective(Studio record);

    Studio selectByPrimaryKey(Long id);

    List<Studio> selectByCondition();

    boolean updateByPrimaryKeySelective(Studio record);

    int updateStatus(Studio record);
}