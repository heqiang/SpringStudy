package com.hq.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog  implements AfterReturningAdvice {

    //resultvalue 返回值
    @Override
    public void afterReturning(Object resultvalue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"方法"+"--"+"返回的结果为:"+resultvalue);
    }
}
