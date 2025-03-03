package com.mine.restful.dao;

import com.mine.restful.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();
    User findById(Long id);
    void insert(User user);
    void update(User user);
    void deleteById(Long id);
}