package com.hq.demo02;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userServiceimpl;

    public void setUserServiceimpl(UserServiceImpl userServiceimpl) {
        this.userServiceimpl = userServiceimpl;
    }

    @Override
    public void add() {
        userServiceimpl.add();
    }

    @Override
    public void delete() {
        userServiceimpl.delete();
    }

    @Override
    public void updata() {
        userServiceimpl.updata();
    }

    @Override
    public void select() {
        userServiceimpl.select();
    }
}
