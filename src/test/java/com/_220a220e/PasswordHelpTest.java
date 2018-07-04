package com._220a220e;

import com._220a220e.entity.User;
import com._220a220e.util.PasswordHelper;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Garrosh
 * @date 2018/6/3
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PasswordHelpTest {

    @Test
    public void test() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        PasswordHelper.encryptPassword(user);

        String md5 = new Md5Hash("123456", user.getCredentialsSalt(), 2).toString();
        System.out.println(md5.equals(user.getPassword()));
    }
}
