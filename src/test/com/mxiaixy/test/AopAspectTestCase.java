package com.mxiaixy.test;

import com.mxiaixy.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mxia on 2017/1/9.
 */
public class AopAspectTestCase {

    @Test
    public void aspect(){
        //读取配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取对象
        UserDao userDao = (UserDao) applicationContext.getBean("userDaoImpl");
        userDao.update();
        userDao.save();
    }

}
