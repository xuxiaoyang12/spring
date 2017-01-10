package com.mxiaixy.service;

import com.mxiaixy.pojo.User;

/**
 * Created by Mxia on 2017/1/7.
 */
public interface UserService {

        void save(User user);
        User findById(Integer id);

}
