package com.mxiaixy.proxy;

/**
 * 目标对象代理
 * 需要 实现接口
 * Created by Mxia on 2017/1/7.
 */
public class SubjectProxy  implements Subject {
    //获取目标对象
    private RealSubject realSubject = new RealSubject();

    //重写目标对象中的方法

    public void sayProxy(){
        //。。。添加需要添加的东西 比如事务 ...
        System.out.println("开启事务。。。");
        try {
            realSubject.sayProxy();
            System.out.println("提交事务。。。");
        }catch (Exception e){
            System.out.println("回滚事务。。。");
        }
    }

    public void save() {
        //。。。添加需要添加的东西 比如事务 ...
        System.out.println("开启事务。。。");
        try {
            realSubject.save();
            System.out.println("提交事务。。。");
        }catch (Exception e){
            System.out.println("回滚事务。。。");
        }
    }


}
