package com.jnshu.ServiceImpl;

import com.jnshu.mapper.ArtMapper;
import com.jnshu.model.Art;
import com.jnshu.service.ArtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtServiceImpl implements ArtService {
    @Autowired
    private ArtMapper artMapper;

    //实现删除
    @Override
    public int deleteByPrimaryKey(Long id) {
        return artMapper.deleteByPrimaryKey(id);
    }

    //实现插入
    @Override
    public int insert(Art record) {
        return artMapper.insert(record);
    }

    //实现条件性的插入
    @Override
    public int insertSelective(Art record) {
        return artMapper.insertSelective(record);
    }

    //条件性的查询
    @Override
    public Art selectByPrimaryKey(Long id) {
        return artMapper.selectByPrimaryKey(id);
    }

    //条件性的依靠id更新
    @Override
    public int updateByPrimaryKeySelective(Art record) {
        return artMapper.updateByPrimaryKeySelective(record);
    }

    //依靠id更新
    @Override
    public int updateByPrimaryKey(Art record) {
        return artMapper.updateByPrimaryKey(record);
    }
}
