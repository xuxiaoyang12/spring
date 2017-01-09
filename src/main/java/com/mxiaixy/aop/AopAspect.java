package com.mxiaixy.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 通知类  ： AopAspect
 * Created by Mxia on 2017/1/9.
 */

public class AopAspect {

    public void beforeAdvice(){
        System.out.println("前置通知");
    }
    public void afterAdvice(){
        System.out.println("后置通知");
    }
    public void exceptionAdvice(){
        System.out.println("异常通知");
    }
    public void finallyAdvice(){
        System.out.println("最终通知");
    }
    public void aroundAdvice(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("前置通知");
            Object object = joinPoint.proceed();//执行目标对象中的方法
            System.out.println("后置通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知");
        }finally{
            System.out.println("最终通知");
        }

    }


}
