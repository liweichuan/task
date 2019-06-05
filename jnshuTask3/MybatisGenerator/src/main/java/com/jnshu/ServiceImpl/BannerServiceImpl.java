package com.jnshu.ServiceImpl;

import com.jnshu.mapper.BannerMapper;
import com.jnshu.model.Banner;
import com.jnshu.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {
    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public boolean deleteByPrimaryKey(Long id) {
        return bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Banner record) {
        return bannerMapper.insert(record);
    }

    @Override
    public boolean insertSelective(Banner record) {
        return bannerMapper.insertSelective(record);
    }

    @Override
    public Banner selectByPrimaryKey(Long id) {
        return bannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Banner> selectByCondition() {
        return bannerMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(Banner record) {
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateStatus(Banner record) {
        return bannerMapper.updateStatus(record);
    }
}
