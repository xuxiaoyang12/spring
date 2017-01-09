package com.mxiaixy.proxy;



import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Map;

/**
 * Created by Mxia on 2017/1/8.
 */
public class TargetMethodInterceptor implements MethodInterceptor {


    public Object intercept(Object target, Method method,
                            Object[] params, MethodProxy methodProxy) throws Throwable {

        System.out.println("---before---");
        Object result = methodProxy.invokeSuper(target,params);//目标对象方法执行
        System.out.println("--after--");
        return result;
    }
}
