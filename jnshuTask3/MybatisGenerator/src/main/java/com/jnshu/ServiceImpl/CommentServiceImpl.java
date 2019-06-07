package com.jnshu.ServiceImpl;

import com.jnshu.mapper.CommentMapper;
import com.jnshu.model.Comment;
import com.jnshu.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return commentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Comment record) {
        return commentMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Comment record) {
        return commentMapper.insertSelective(record);
    }

    @Override
    public Comment selectByPrimaryKey(Long id) {
        return commentMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Comment> selectByCondition() {
        return commentMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(Comment record) {
        return commentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateStatus(Comment record) {
        return commentMapper.updateStatus(record);
    }
}
