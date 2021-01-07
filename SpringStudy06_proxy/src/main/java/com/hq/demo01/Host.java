package com.hq.demo01;

public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要来出租房子");
    }
}
