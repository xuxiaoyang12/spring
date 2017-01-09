package com.mxiaixy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理模式模板
 * Created by Mxia on 2017/1/8.
 */
public class SubjectInvocationHandler implements InvocationHandler {
    private Object target;
    public SubjectInvocationHandler(Object target){
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            if("save".equals(method.getName())){
                System.out.println("before---");
                Object result = method.invoke(target,args);//代表目标对象方法的执行
                System.out.println("after-----");
                return result;
            }else{
                return method .invoke(target,args);
            }
    }
}
