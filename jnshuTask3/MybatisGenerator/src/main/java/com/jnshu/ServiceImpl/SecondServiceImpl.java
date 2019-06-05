package com.jnshu.ServiceImpl;

import com.jnshu.mapper.SecondMapper;
import com.jnshu.model.Second;
import com.jnshu.service.SecondService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper secondMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return secondMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Second record) {
        return secondMapper.insert(record);
    }

    @Override
    public int insertSelective(Second record) {
        return secondMapper.insertSelective(record);
    }

    @Override
    public Second selectByPrimaryKey(Long id) {
        return secondMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Second record) {
        return secondMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Second record) {
        return secondMapper.updateByPrimaryKey(record);
    }
}
