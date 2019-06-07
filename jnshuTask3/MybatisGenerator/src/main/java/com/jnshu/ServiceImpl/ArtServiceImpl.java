package com.jnshu.ServiceImpl;

import com.jnshu.mapper.ArtMapper;
import com.jnshu.model.Art;
import com.jnshu.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtServiceImpl implements ArtService {
    @Autowired
    private ArtMapper artMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return artMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Art record) {
        return artMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Art record) {
        return artMapper.insertSelective(record);
    }

    @Override
    public Art selectByPrimaryKey(Long id) {
        return artMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Art> selectByCondition() {
        return artMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(Art record) {
        return artMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateStatus(Art record) {
        return artMapper.updateStatus(record);
    }
}
