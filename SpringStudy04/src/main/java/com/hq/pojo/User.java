package com.hq.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//@Component 组件 等价于<bean id="user" class="com.hq.pojo.User"/>
@Component
public class User {
    //相当于   <property name="name" value="hq"/>
//    @Value("hq")
    private String name;

    public String getName() {
        return name;
    }

    @Value("hq")
    public void setName(String name) {
        this.name = name;
    }

}
