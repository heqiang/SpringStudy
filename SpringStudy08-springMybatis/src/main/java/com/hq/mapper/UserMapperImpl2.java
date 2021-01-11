package com.hq.mapper;

import com.hq.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//实现发方法二
public class UserMapperImpl2 extends SqlSessionDaoSupport implements  UserMapper{
    @Override
    public List<User> userList() {
        return getSqlSession().getMapper(UserMapper.class).userList();
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
