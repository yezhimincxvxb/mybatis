package com.yzm.base.service;

import com.yzm.base.entity.User;

import java.util.List;

public interface UserService {

    boolean saveUser(User user);

    boolean updateUser(User user);

    boolean deleteUserById(Integer id);

    User getUserById(Integer id);

    List<User> listUser();

}
