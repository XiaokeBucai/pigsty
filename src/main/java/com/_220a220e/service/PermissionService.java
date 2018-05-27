package com._220a220e.service;

import com._220a220e.entity.Permission;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
public interface PermissionService {

    List<Permission> findByUserId(Integer userId);
}
