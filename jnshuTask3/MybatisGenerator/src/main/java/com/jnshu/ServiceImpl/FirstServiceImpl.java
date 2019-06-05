package com.jnshu.ServiceImpl;

import com.jnshu.mapper.FirstMapper;
import com.jnshu.model.First;
import com.jnshu.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    @Autowired
    private FirstMapper firstMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return firstMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(First record) {
        return firstMapper.insert(record);
    }

    @Override
    public int insertSelective(First record) {
        return firstMapper.insertSelective(record);
    }

    @Override
    public First selectByPrimaryKey(Long id) {
        return firstMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(First record) {
        return firstMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(First record) {
        return firstMapper.updateByPrimaryKey(record);
    }
}
