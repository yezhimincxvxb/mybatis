package com.yzm.base_2.service.impl;

import com.yzm.base_2.entity.User;
import com.yzm.base_2.entity.vo.UserVo;
import com.yzm.base_2.mapper.UserMapper;
import com.yzm.base_2.service.UserService;
import com.yzm.base_2.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserVo> implements UserService {

    private UserMapper userMapper = null;

    @Autowired
    private void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
        super.setMapper(userMapper);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public List<User> getByCondition(String column, Object value) {
        return userMapper.getByCondition(column, value);
    }

}
