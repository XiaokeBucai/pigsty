package com._220a220e.service;

import com._220a220e.entity.User;
import com._220a220e.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(User user) {
        Date now = new Date();
        user.setCreateDate(now);
        userMapper.insert(user);
    }

}
