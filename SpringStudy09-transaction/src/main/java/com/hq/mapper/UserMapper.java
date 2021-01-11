package com.hq.mapper;

import com.hq.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> userList();
    int addUser(User user);

    int deleteUser(@Param("uid") int id);
}
