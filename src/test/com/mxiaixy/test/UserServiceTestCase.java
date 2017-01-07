package com.mxiaixy.test;

import com.mxiaixy.service.UserService;
import com.mxiaixy.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mxia on 2017/1/7.
 */
public class UserServiceTestCase {

    @Test
    public void userService(){
        //读取配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean管理类
        UserServiceImpl userService =
                (UserServiceImpl) applicationContext.getBean("userServiceImpl");

        userService.update();
        userService.save();
        System.out.println(userService.name);

    }
    @Test
    public void  userServiceImpl(){
        //构造方法注入演示
        //读取配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean管理类
        UserServiceImpl userService =
                (UserServiceImpl) applicationContext.getBean("userService");

        userService.update();
        userService.save();

    }
}
