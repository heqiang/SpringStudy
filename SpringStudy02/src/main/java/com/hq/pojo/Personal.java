package com.hq.pojo;

public class Personal {
    private Dog dog;
    private Cat cat;
    private String name;

    public Personal() {
    }

    public Personal(Dog dog, Cat cat, String name) {
        this.dog = dog;
        this.cat = cat;
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
