package com.hq.pojo;

public class OracleUserDaoImpl implements UserDao{
    @Override
    public void getDb() {
        System.out.println("oracle");
    }
}
