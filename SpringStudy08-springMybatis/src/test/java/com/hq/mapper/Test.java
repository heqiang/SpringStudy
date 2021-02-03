package com.hq.mapper;

import com.hq.pojo.User;
import com.hq.utils.DbUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapperImpl2", UserMapper.class);
        List<User> userList = userMapper.userList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
