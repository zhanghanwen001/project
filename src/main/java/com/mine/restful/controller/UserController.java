package com.mine.restful.controller;

import com.mine.restful.entity.SysUser;
import com.mine.restful.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
// 配置默认统一前缀路径
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<SysUser> getAllUsers() {
        ArrayList<SysUser> list = new ArrayList<>();
        list.add(new SysUser());
        return list;
//        return userService.findAll();
    }

    @GetMapping("/{id}")
    public SysUser getUserById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @PostMapping
    public void createUser(@RequestBody SysUser user) {
        userService.insert(user);
    }

    @PutMapping("/{id}")
    public void updateUser(@PathVariable Integer id, @RequestBody SysUser user) {
        user.setId(id);
        userService.update(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteById(id);
    }
}