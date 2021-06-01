package com.yzm.base_2.service;

import com.yzm.base_2.entity.User;
import com.yzm.base_2.entity.vo.UserVo;
import com.yzm.base_2.service.base.BaseService;

import java.util.List;

public interface UserService extends BaseService<User, UserVo> {

    List<User> findAll();

    List<User> getByCondition(String column, Object value);
}
