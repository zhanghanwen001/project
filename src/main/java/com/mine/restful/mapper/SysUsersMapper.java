package com.mine.restful.mapper;

import com.mine.restful.entity.SysUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysUsersMapper {

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll();

    void insert(SysUser sysUsers);

    void update(SysUser sysUsers);

    void deleteById(Integer id);

}