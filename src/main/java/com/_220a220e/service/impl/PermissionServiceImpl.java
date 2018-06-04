package com._220a220e.service.impl;

import com._220a220e.entity.Permission;
import com._220a220e.mapper.PermissionMapper;
import com._220a220e.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> findByUserId(Integer userId) {
        return permissionMapper.selectAll();
    }
}
