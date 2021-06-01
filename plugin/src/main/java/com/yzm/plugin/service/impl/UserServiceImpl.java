package com.yzm.plugin.service.impl;

import com.yzm.plugin.entity.Page;
import com.yzm.plugin.entity.User;
import com.yzm.plugin.entity.UserVo;
import com.yzm.plugin.mapper.UserMapper;
import com.yzm.plugin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> page(UserVo userVo) {
        List<User> list = userMapper.page(userVo);
        return userVo.getPage().setResult(list);
    }

    @Override
    public Page<User> page2(Page<User> page) {
        return page.setResult(userMapper.page2(page));
    }
}
