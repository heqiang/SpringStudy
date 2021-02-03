package com.hq.demo01;

public class Client {
    public static void main(String[] args) {
        //房东租房子
        Host host = new Host();
        //代理帮房东租房子,但是中介会有一些附属操作
        Proxy proxy = new Proxy(host);
        //不面对房东 直接找房东租房
        proxy.rent();
    }
}
