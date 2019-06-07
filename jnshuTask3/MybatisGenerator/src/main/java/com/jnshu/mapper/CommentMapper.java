package com.jnshu.mapper;

import com.jnshu.model.Comment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Comment record);

    boolean insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    List<Comment> selectByCondition();

    boolean updateByPrimaryKeySelective(Comment record);

    int updateStatus(Comment record);
}