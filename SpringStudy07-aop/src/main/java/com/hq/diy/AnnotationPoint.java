package com.hq.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/*
* 通过注解的方式实现aop
*
* */
//表示这个类是一个切面
@Aspect
public class AnnotationPoint {
    @Before("execution(* com.hq.service.UserServiceImpl.*(..))")
    public  void  before(){
        System.out.println("========方法执行前");
    }
    @After("execution(* com.hq.service.UserServiceImpl.*(..))")
    public void  after(){
        System.out.println("========方法执行后");
    }
    @Around("execution(* com.hq.service.UserServiceImpl.*(..))")
    public  void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        //执行方法
        Object p = joinPoint.proceed();
        System.out.println("环绕后");
    }
}
