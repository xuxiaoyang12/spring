package com.mxiaixy.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Mxia on 2017/1/9.
 */
@Component//加入bean管理
@Aspect//声明是通知类
public class AopAspectZhujie {
    //添加一个切入点方法  可以是空的什么都不写

    @Pointcut("execution(* com.mxiaixy..*.*(..))")//添加切入点包
    public void pointCut(){};

    @Before("pointCut()")//声明是什么通知 并基于那个切入点
    public void beforeAdvice(){
        System.out.println("前置通知`````");
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
