package com.hq.demo02;

public class Client {
    public static void main(String[] args) {
        //一个真实的角色都需要一个代理角色
       UserServiceImpl userService =  new UserServiceImpl();

       UserServiceProxy userServiceProxy =new UserServiceProxy();
       userServiceProxy.setUserServiceimpl(userService);
       userServiceProxy.add();


    }
}
