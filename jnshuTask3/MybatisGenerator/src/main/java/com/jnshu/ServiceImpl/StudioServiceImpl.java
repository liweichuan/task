package com.jnshu.ServiceImpl;

import com.jnshu.mapper.StudioMapper;
import com.jnshu.model.Studio;
import com.jnshu.service.StudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudioServiceImpl implements StudioService {
    @Autowired
    private StudioMapper studioMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return studioMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Studio record) {
        return studioMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Studio record) {
        return studioMapper.insertSelective(record);
    }

    @Override
    public Studio selectByPrimaryKey(Long id) {
        return studioMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Studio> selectByCondition() {
        return studioMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(Studio record) {
        return studioMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateStatus(Studio record) {
        return studioMapper.updateStatus(record);
    }
}
