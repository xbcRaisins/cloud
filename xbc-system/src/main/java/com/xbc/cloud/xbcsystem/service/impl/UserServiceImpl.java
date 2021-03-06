package com.xbc.cloud.xbcsystem.service.impl;

import com.xbc.cloud.xbcsystem.dao.UserDao;
import com.xbc.cloud.xbcsystem.entity.User;
import com.xbc.cloud.xbcsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 *
 * @author weizeng
 * @date 2019/4/30 16:38
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
