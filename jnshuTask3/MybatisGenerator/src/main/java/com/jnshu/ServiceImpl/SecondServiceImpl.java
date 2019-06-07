package com.jnshu.ServiceImpl;

import com.jnshu.mapper.SecondMapper;
import com.jnshu.model.Second;
import com.jnshu.service.SecondService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondServiceImpl implements SecondService {
    @Autowired
    private SecondMapper secondMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return secondMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Second record) {
        return secondMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Second record) {
        return secondMapper.insertSelective(record);
    }

    @Override
    public Second selectByPrimaryKey(Long id) {
        return secondMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Second> selectByCondition() {
        return secondMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(Second record) {
        return secondMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateStatus(Second record) {
        return secondMapper.updateStatus(record);
    }
}
