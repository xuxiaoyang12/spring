package com.mxiaixy.test;

import com.mxiaixy.proxy.*;
import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * Created by Mxia on 2017/1/7.
 */
public class ProxyTestCase {
    @Test
    public void proxy(){
        Subject subject = new SubjectProxy();
        subject.save();
        subject.sayProxy();


    }

    @Test
    public void jdkProxy(){

        RealSubject realSubject = new RealSubject();//获取目标对象
        //获取代理模板对象
        SubjectInvocationHandler subjectInvocationHandler = new SubjectInvocationHandler(realSubject);
        Subject subject = (Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),subjectInvocationHandler);
        subject.save();
        subject.sayProxy();

    }
    @Test
    public void cglibProxy(){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new TargetMethodInterceptor());
        enhancer.setSuperclass(target.class);

        target target = (com.mxiaixy.proxy.target) enhancer.create();//父类指向子类对象
        target.save();
        target.sayHello();
    }
}
