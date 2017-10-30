package com.app.bean;

public class Consumer{

    private Long id;

    private String name;

    private int age;

    public Consumer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

}
