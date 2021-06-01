package com.yzm.object_factory.service.impl;

import com.yzm.object_factory.entity.User;
import com.yzm.object_factory.mapper.UserMapper;
import com.yzm.object_factory.service.UserService;
import lombok.experimental.Accessors;
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
