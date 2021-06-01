package com.yzm.object_factory.mapper;

import com.yzm.object_factory.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> list();
}
