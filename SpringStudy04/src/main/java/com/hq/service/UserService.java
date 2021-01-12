package com.hq.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Value("1")
    private int id;
    @Value("jjj")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
