package com.hq.diy;

public class DiyPointCut {

    public  void  after(){
        System.out.println("==执行方法之前==");
    }
    public  void  before(){
        System.out.println("==执行方法之后==");
    }
}
