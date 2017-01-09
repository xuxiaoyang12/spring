package com.mxiaixy.test;

import com.mxiaixy.dao.impl.UserDaoImpl;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.beancontext.BeanContext;

/**
 * Created by Mxia on 2017/1/7.
 */
public class UserDaoTestCase {

    @Test
    public void userDao(){
        //读取配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取Bean管理中的类
        //1.可以使用接口接收也可以使用类接收 多态
        UserDaoImpl userDaoImpl =
                applicationContext.getBean("userDaoImpl",UserDaoImpl.class);

        UserDaoImpl userDaoImpl2 =
                applicationContext.getBean("userDaoImpl",UserDaoImpl.class);

        //判断对象什么时间被创建 通过看构造方法什么时间被调用


        //判段创建对象是否单例
        System.out.println(userDaoImpl==userDaoImpl2);
        //调用userdaoImpl中的方法
       // userDaoImpl.update();


    }
}
