package com.hq.mapper;

import com.hq.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    //我们使用的所有操作，都是用sqlsession来执行，现在都是用SqlSessionTemplate执行
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }



    @Override
    public List<User> userList() {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return  userMapper.userList();
    }

    @Override
    public int deleteUser(int uid) {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.deleteUser(uid);
    }
}
