package com._220a220e.service.impl;

import com._220a220e.entity.User;
import com._220a220e.mapper.UserMapper;
import com._220a220e.service.UserService;
import com._220a220e.util.PasswordHelper;
import com._220a220e.util.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User user) {
        user.setStatus(StatusEnum.ACTIVE.toString());
        user.setCreateDate(new Date());
        userMapper.insert(user);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.selectByUsername(username, StatusEnum.ACTIVE.toString());
    }

    @Override
    public void update(User user) {
        user.setUpdateDate(new Date());
        userMapper.updateByPrimaryKey(user);
    }

    @Override
    public void delete(Integer id) {
        User user = new User();
        user.setId(id);
        user.setStatus(StatusEnum.DELETED.toString());
        update(user);
    }

    @Override
    public void saveRegisterUser(User user) {
        PasswordHelper.encryptPassword(user);
        this.insert(user);
    }

}
