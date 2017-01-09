package com.mxiaixy.dao.impl;

import com.mxiaixy.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by Mxia on 2017/1/7.
 */
@Repository
public class UserDaoImpl implements UserDao {
    public UserDaoImpl(){
        System.out.println("userDaoImpl被创建le");
    }

    public void save() {

        System.out.println("userDao.save....");
    }

    public void update() {

        System.out.println("userDao.update...");
    }
}
