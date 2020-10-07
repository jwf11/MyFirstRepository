package com.myproj.domain;


public class User {
    private String name;
    private int age;
    private int id;
    private float money;

    public User(){

    }
    public User(String name, int age, float money){
        this.name = name;
        this.age = age;
        this.money = money;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }
}
