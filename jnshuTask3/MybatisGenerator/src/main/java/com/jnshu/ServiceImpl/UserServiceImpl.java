package com.jnshu.ServiceImpl;

import com.jnshu.mapper.UserMapper;
import com.jnshu.model.User;
import com.jnshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean deleteByName(String name) {
        return userMapper.deleteByName(name);
    }

    @Override
    public boolean insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public boolean insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }

    @Override
    public List<User> selectByCondition() {
        return userMapper.selectByCondition();
    }

    @Override
    public boolean updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updatePassword(User record) {
        return userMapper.updatePassword(record);
    }
}
