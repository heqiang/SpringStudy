package com.hq.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import javax.annotation.Resource;

public class Personal {
    @Resource
    private Dog dog;
    @Resource
    private Cat cat;
    @Nullable
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

//    public void setDog2(Dog dog) {
//        this.dog = dog;
//    }
//
//    public void setCat1(Cat cat) {
//        this.cat = cat;
//    }
//
    public void setName(String name) {
        this.name = name;
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
