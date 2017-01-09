package com.mxiaixy.proxy;

/**
 * 目标对象
 * Created by Mxia on 2017/1/7.
 */
public class RealSubject implements Subject {
    public void sayProxy() {
        System.out.println("sayProxy.....");
    }

    public void save() {
        System.out.println("save......");

    }
}
