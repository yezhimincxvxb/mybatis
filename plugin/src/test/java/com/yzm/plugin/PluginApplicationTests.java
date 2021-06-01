package com.yzm.plugin;

import com.yzm.plugin.entity.Page;
import com.yzm.plugin.entity.User;
import com.yzm.plugin.entity.UserVo;
import com.yzm.plugin.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PluginApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void page() {
        UserVo vo = new UserVo();
        Page<User> page = new Page<>();
        page.setNowPage(3);
        page.setPageShow(2);
        vo.setPage(page);
        Page<User> pages = userService.page(vo);
        System.out.println("显示数：" + pages.getPageShow());
        System.out.println("当前页：" + pages.getNowPage());
        System.out.println("总页数：" + pages.getTotalPage());
        System.out.println("总记录：" + pages.getTotalCount());
        pages.getResult().forEach(System.out::println);
    }

    @Test
    void page2() {
        Page<User> page = new Page<>();
        page.setNowPage(3);
        page.setPageShow(2);
        Page<User> pages = userService.page2(page);
        System.out.println("显示数：" + pages.getPageShow());
        System.out.println("当前页：" + pages.getNowPage());
        System.out.println("总页数：" + pages.getTotalPage());
        System.out.println("总记录：" + pages.getTotalCount());
        pages.getResult().forEach(System.out::println);
    }

}
