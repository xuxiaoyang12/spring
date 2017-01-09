package com.mxiaixy.dao;

import com.mxiaixy.pojo.User;

import java.util.List;

/**
 * userdao接口
 * Created by Mxia on 2017/1/7.
 */
public interface UserDao {

    void save(User user);
    void update(User user);
    void del(Integer id);
    User findById(Integer id);
    List<User> findAll();
    Long count();


}
