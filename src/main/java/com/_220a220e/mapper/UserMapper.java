package com._220a220e.mapper;

import com._220a220e.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Garrosh
 * @date 2018/5/25
 */
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);
    int insert(User record);
    User selectByPrimaryKey(Integer id);
    List<User> selectAll();
    int updateByPrimaryKey(User record);
}
