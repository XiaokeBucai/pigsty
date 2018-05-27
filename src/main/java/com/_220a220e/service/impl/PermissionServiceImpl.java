package com._220a220e.service.impl;

import com._220a220e.entity.Permission;
import com._220a220e.service.PermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/27
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Override
    public List<Permission> findByUserId(Integer userId) {
        return null;
    }
}
