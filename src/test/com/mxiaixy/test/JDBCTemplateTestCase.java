package com.mxiaixy.test;

import com.mxiaixy.dao.UserDao;
import com.mxiaixy.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;
import java.util.List;

/**
 * Created by Mxia on 2017/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JDBCTemplateTestCase {

    @Autowired
    private UserDao userDao;//注入UserDao到此类

    @Test
    public void save(){
        User user = new User();
        user.setUsername("小梦梦");
        user.setPassword("521521");
        userDao.save(user);

    }
    @Test
    public void findById(){
        User user = userDao.findById(3);
        System.out.println(user);
    }
    @Test
    public void update(){

        User user = userDao.findById(4);
        user.setUsername("萧炎");
        user.setPassword("66666");
        userDao.update(user);
    }

    @Test
    public void del(){
        userDao.del(5);
    }
    @Test
    public void findAll(){
        List<User> userList = userDao.findAll();
        for(User user : userList){
            System.out.println(user);
        }
    }
    @Test
    public void count(){
        Long result = userDao.count();
        System.out.println(result);
    }
}
