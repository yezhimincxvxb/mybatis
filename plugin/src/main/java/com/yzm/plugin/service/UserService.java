package com.yzm.plugin.service;

import com.yzm.plugin.entity.Page;
import com.yzm.plugin.entity.User;
import com.yzm.plugin.entity.UserVo;

public interface UserService {
    Page<User> page(UserVo userVo);

    Page<User> page2(Page<User> page);
}
