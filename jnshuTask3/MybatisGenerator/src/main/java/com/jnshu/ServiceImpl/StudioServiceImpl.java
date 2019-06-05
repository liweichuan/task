package com.jnshu.ServiceImpl;

import com.jnshu.mapper.StudioMapper;
import com.jnshu.model.Studio;
import com.jnshu.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudioServiceImpl implements StudioService {
    @Autowired
    private StudioMapper studioMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return studioMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Studio record) {
        return studioMapper.insert(record);
    }

    @Override
    public int insertSelective(Studio record) {
        return studioMapper.insertSelective(record);
    }

    @Override
    public Studio selectByPrimaryKey(Long id) {
        return studioMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Studio record) {
        return studioMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Studio record) {
        return studioMapper.updateByPrimaryKey(record);
    }
}
