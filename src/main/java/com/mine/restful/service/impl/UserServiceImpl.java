package com.mine.restful.service.impl;

import com.mine.restful.entity.SysUser;
import com.mine.restful.mapper.SysUsersMapper;
import com.mine.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private SysUsersMapper userMapper;

    @Override
    public List<SysUser> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public SysUser findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public void insert(SysUser user) {
        userMapper.insert(user);
    }

    @Override
    public void update(SysUser user) {
        userMapper.update(user);
    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }
}