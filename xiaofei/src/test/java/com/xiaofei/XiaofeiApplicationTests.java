package com.xiaofei;

import com.xiaofei.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XiaofeiApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        userService.hello();
    }

}
