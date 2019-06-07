package com.jnshu.ServiceImpl;

import com.jnshu.mapper.FirstMapper;
import com.jnshu.model.First;
import com.jnshu.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirstServiceImpl implements FirstService {
    @Autowired
    private FirstMapper firstMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return firstMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(First record) {
        return firstMapper.insert(record);
    }

    @Override
    public boolean insertSelective(First record) {
        return firstMapper.insertSelective(record);
    }

    @Override
    public First selectByPrimaryKey(Long id) {
        return firstMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<First> selectByCondition() {
        return firstMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(First record) {
        return firstMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateStatus(First record) {
        return firstMapper.updateStatus(record);
    }
}
