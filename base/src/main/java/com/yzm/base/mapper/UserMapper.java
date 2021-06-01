package com.yzm.base.mapper;

import com.yzm.base.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUserById(Integer id);

    User getUserById(Integer id);

    List<User> listUser();
}
