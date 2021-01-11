package com.hq.mapper;

import com.hq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlsession;

    public void setSqlsession(SqlSessionTemplate sqlsession) {
        this.sqlsession = sqlsession;
    }

    @Override
    public List<User> userList() {
        UserMapper  userMapper =   sqlsession.getMapper(UserMapper.class);

        return  userMapper.userList();

    }

    @Override
    public int addUser(User user) {
        UserMapper  userMapper =   sqlsession.getMapper(UserMapper.class);
        userMapper.deleteUser(6);
        return userMapper.addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        UserMapper  userMapper =   sqlsession.getMapper(UserMapper.class);
        return userMapper.deleteUser(id);

    }



}
