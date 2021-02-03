package com.hq.service;

import com.hq.pojo.MysqlUserDao;
import com.hq.pojo.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(MysqlUserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
