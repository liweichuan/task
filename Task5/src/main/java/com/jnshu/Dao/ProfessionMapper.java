package com.jnshu.Dao;

import com.jnshu.Entity.Profession;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ProfessionMapper {
    //展示职业信息
    List<Profession> getListProfession();
}
