package com.hq.mapper;

import com.hq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlsession1;

    public void setSqlsession1(SqlSessionTemplate sqlsession) {
        this.sqlsession1 = sqlsession;
    }

    @Override
    public List<User> userList() {
        UserMapper  userMapper =   sqlsession1.getMapper(UserMapper.class);

        return  userMapper.userList();

    }

    @Override
    public int addUser(User user) {
        UserMapper  userMapper =   sqlsession1.getMapper(UserMapper.class);
        userMapper.deleteUser(7);
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper  userMapper =   sqlsession1.getMapper(UserMapper.class);
        return userMapper.deleteUser(id);

    }



}
