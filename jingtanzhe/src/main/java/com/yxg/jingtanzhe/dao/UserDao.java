package com.yxg.jingtanzhe.dao;

import com.yxg.jingtanzhe.entity.User;

public interface UserDao {
    User queryUserByUsername(String username);
    int insertUser(User user);
    int updateUser(User user);
}
