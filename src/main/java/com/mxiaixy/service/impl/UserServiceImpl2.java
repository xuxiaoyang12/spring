package com.mxiaixy.service.impl;

import com.mxiaixy.dao.UserDao;
import com.mxiaixy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mxia on 2017/1/9.
 */
@Service
public class UserServiceImpl2 implements UserService {
    //第一种方式直接在所需注入的类的头上添加@Autowised 就不需要写set方法了
    //@Autowired
    private UserDao userDao;

    //第二种是在所需注入类的set方法上加@Autowised
    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public void save() {
       // userDao.save();
        //测试是否每调用一次方法就会添加上通知类
        System.out.println("UserService......");
    }

    public void update() {


    }
}
