package com.hq.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//等会儿用这个类自动生成代理类
public class ProxyHandler implements InvocationHandler {

//被代理的接口
    private  Rent rent;

    public void setRent(Rent rent){
        this.rent=rent;
    }

    //生成得到代理类 修改rent就行
    public  Object getProxy(){
       return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
//处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
       //动态代理的本质就是使用反射机制实现
        return method.invoke(rent,args);
    }

    public  void  seeHouse(){
        System.out.println("看房子");
    }



}
