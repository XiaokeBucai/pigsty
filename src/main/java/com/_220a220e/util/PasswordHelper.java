package com._220a220e.util;

import com._220a220e.entity.User;
import org.apache.shiro.crypto.RandomNumberGenerator;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author Garrosh
 * @date 2018/6/2
 */
public class PasswordHelper {

    public static void encryptPassword(User user) {
        RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
        user.setSalt(randomNumberGenerator.nextBytes().toHex());

        String algorithmName = "MD5";
        int hashIterations = 2;

        String newPassword = new SimpleHash(
                // 加密算法
                algorithmName,
                // 密码
                user.getPassword(),
                // salt盐 username + salt
                ByteSource.Util.bytes(user.getCredentialsSalt()),
                // 迭代次数
                hashIterations
        ).toHex();

        user.setPassword(newPassword);
    }
}
