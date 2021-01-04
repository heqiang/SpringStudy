package com.hq.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Personal {
    @Autowired
    private Dog dog;
    @Autowired
    @Qualifier(value = "2")
    private Cat cat;
    private String name;

    public Personal() {
    }

    public Personal(Dog dog, Cat cat,String name) {
        this.dog = dog;
        this.cat = cat;
        this.name = name;
    }
    public Dog getDog() {
        return dog;
    }

    public Cat getCat() {
        return cat;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Personal{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
