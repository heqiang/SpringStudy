package com.hq.demo03;

public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理角色:现在没有
        ProxyHandler proxyHandler = new ProxyHandler();
        //通过代理角色
        proxyHandler.setRent(host);
        Rent rent = (Rent) proxyHandler.getProxy();
        rent.rent();

    }
}
