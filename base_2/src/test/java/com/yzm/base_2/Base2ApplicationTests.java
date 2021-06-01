package com.yzm.base_2;

import com.yzm.base_2.entity.Account;
import com.yzm.base_2.entity.User;
import com.yzm.base_2.service.AccountService;
import com.yzm.base_2.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Base2ApplicationTests {

    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;

    @Test
    void listUser() {
        List<User> users = userService.list();
        users.forEach(System.out::println);
    }

    @Test
    void listAccount() {
        List<Account> accounts = accountService.list();
        accounts.forEach(System.out::println);
    }

}
