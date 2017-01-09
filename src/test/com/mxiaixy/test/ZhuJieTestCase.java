package com.mxiaixy.test;

import com.mxiaixy.service.UserService;
import com.mxiaixy.service.impl.UserServiceImpl;
import com.mxiaixy.service.impl.UserServiceImpl2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Mxia on 2017/1/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ZhuJieTestCase{


    @Test
    public void zhujie(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userServiceImpl2");

        userService.save();
        userService.update();
    }
    @Autowired
    private UserService userService;
    @Test
    public void user(){
        userService.update();
        userService.save();


    }
}
