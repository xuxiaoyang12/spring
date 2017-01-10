package com.mxiaixy.service.impl;

import com.mxiaixy.pojo.User;
import com.mxiaixy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Mxia on 2017/1/10.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setUsername("生死");
        user.setPassword("444");
        userService.save(user);
    }

    @Test
    public void findById() throws Exception {
        User user = userService.findById(4);
        System.out.println(user);

    }

}