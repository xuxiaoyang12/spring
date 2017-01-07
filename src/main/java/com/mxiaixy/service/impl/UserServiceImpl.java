package com.mxiaixy.service.impl;

import com.mxiaixy.dao.UserDao;
import com.mxiaixy.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Mxia on 2017/1/7.
 */
public class UserServiceImpl implements UserService{
    private UserDao userDao;
    //构造方法注入
    public UserServiceImpl(UserDao userDao){
        this.userDao = userDao;
    }
    //添加一个无参数的构造方法
    public UserServiceImpl(){};
    //各种基本数据类型的set注入方式
    public String name;
    private Integer age;
    private List<String> list;
    private Set<Double> set;
    private Map<String,Object> map;
    public Properties properties;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<Double> set) {
        this.set = set;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserDao(UserDao userDao){
        this.userDao= userDao;
    }



    public void save() {
        System.out.println("userService save...");
    }

    public void update() {
        System.out.println("userService update...");
    }
}
