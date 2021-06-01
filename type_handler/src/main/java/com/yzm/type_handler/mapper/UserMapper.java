package com.yzm.type_handler.mapper;

import com.yzm.type_handler.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    boolean save(User user);

    List<User> list();
}
