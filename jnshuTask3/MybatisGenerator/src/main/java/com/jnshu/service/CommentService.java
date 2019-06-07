package com.jnshu.service;

import com.jnshu.model.Comment;

import java.util.List;

public interface CommentService {
    boolean deleteByPrimaryKey(Long id);

    boolean insert(Comment record);

    boolean insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    List<Comment> selectByCondition();

    boolean updateByPrimaryKeySelective(Comment record);

    int updateStatus(Comment record);
}
