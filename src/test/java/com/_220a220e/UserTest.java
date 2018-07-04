package com._220a220e;

import com._220a220e.entity.User;
import com._220a220e.service.UserService;
import com._220a220e.util.PasswordHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Garrosh
 * @date 2018/6/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        PasswordHelper.encryptPassword(user);

        userService.insert(user);
    }
}
