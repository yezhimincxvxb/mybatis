package com.yzm.type_handler;

import com.yzm.type_handler.entity.User;
import com.yzm.type_handler.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TypeHandlerApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }

}
