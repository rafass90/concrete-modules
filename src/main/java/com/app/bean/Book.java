package com.app.bean;

public class Book implements IProduct{

    private Long id;

    private String name;

    private int pages;

    private Double price;

    public Book(String name, int pages, Double price){
        this.name = name;
        this.pages = pages;
        this.price = price;
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

    public int getPages () {
        return pages;
    }

    public Double getValue () {
        return price;
    }
}
