package com._220a220e.mapper;

import com._220a220e.entity.Permission;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/26
 */
public interface PermissionMapper {
    int insert(Permission record);

    List<Permission> selectAll();
}
