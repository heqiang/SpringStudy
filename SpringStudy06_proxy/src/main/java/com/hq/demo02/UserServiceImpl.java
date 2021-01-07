package com.hq.demo02;

public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("新增了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void updata() {
        System.out.println("更新了一个用户");
    }

    @Override
    public void select() {
        System.out.println("查找了一个用户");
    }
}
