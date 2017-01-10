package com.mxiaixy.service.impl;

import com.mxiaixy.mapper.UserMapper;
import com.mxiaixy.pojo.User;
import com.mxiaixy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mxia on 2017/1/10.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    public void save(User user) {
        System.out.println("hahah  userServiceImpl...");
        userMapper.save(user);
    }

    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
