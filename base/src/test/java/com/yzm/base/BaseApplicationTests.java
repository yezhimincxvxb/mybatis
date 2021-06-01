package com.yzm.base;

import com.yzm.base.entity.User;
import com.yzm.base.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BaseApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void saveUser() {
        User user = new User();
        user.setRealName("aaa");
        user.setUsername("aaa");
        user.setPassword("aaa");
        System.out.println(user);
        System.out.println(userService.saveUser(user));
        System.out.println(user);
    }

    @Test
    void updateUser() {
        User user = new User();
        user.setId(12);
        user.setUsername("bbb");
        System.out.println(userService.updateUser(user));
    }

    @Test
    void deleteUserById() {
        System.out.println(userService.deleteUserById(1));
    }

    @Test
    void getUserById() {
        System.out.println(userService.getUserById(1));
    }

    @Test
    void listUser() {
        List<User> users = userService.listUser();
        users.forEach(System.out::println);
    }

}
