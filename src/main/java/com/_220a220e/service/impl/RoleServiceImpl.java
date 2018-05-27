package com._220a220e.service.impl;

import com._220a220e.entity.Role;
import com._220a220e.mapper.RoleMapper;
import com._220a220e.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> findByUserId(Integer userId) {
        return roleMapper.selectByUserId(userId);
    }
}
