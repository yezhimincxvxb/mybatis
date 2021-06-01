package com.yzm.plugin.mapper;

import com.yzm.plugin.entity.Page;
import com.yzm.plugin.entity.User;
import com.yzm.plugin.entity.UserVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> page(UserVo userVo);

    List<User> page2(Page<User> page);
}
