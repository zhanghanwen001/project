package com.mine.restful.service;

import com.mine.restful.entity.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> findAll();

    SysUser findById(Integer id);

    void insert(SysUser user);

    void update(SysUser user);

    void deleteById(Integer id);
}