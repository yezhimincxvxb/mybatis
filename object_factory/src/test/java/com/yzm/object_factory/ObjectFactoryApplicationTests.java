package com.yzm.object_factory;

import com.yzm.object_factory.entity.User;
import com.yzm.object_factory.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ObjectFactoryApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }

}
