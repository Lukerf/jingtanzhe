package com.yxg.jingtanzhe.service;
import com.yxg.jingtanzhe.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDao;

    @Override
    public User selectUserByusername(String username){
        return userDao.selectUserByusername(username);
    }
}
