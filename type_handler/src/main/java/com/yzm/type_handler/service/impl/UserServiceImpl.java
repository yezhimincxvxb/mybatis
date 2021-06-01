package com.yzm.type_handler.service.impl;

import com.yzm.type_handler.entity.User;
import com.yzm.type_handler.mapper.UserMapper;
import com.yzm.type_handler.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
