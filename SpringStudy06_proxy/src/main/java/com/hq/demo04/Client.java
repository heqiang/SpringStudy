package com.hq.demo04;

import com.hq.demo02.UserService;
import com.hq.demo02.UserServiceImpl;

public class Client {

    public static void main(String[] args) {
        //真实角色
        UserServiceImpl  userService = new UserServiceImpl();
        //代理角色
        ProxyHandler proxyHandler =  new  ProxyHandler();
        proxyHandler.setTarget(userService);
        UserService  userService1 = (UserService) proxyHandler.getProxy();
        userService1.select();
        userService1.updata();
        userService1.add();
        userService1.delete();
    }



}
