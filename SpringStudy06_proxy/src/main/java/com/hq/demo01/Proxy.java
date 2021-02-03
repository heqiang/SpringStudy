package com.hq.demo01;

public class Proxy implements Rent {

    private Host host;

    public Proxy() {
    }

    ;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
    }

    //    收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    //   签合同
    public void hetong() {
        System.out.println("收中介费");
    }


}
