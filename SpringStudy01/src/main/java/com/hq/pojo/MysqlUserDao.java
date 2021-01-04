package com.hq.pojo;

public class MysqlUserDao implements  UserDao {

    @Override
    public void getDb() {
        System.out.println("mysql");
    }


}
