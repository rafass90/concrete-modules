package com.app.bean;

public class Book implements IProduct{

    private Long id;

    private String name;

    private int pages;

    private Double price;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getPages () {
        return pages;
    }

    public void setPages (int pages) {
        this.pages = pages;
    }

    public Double getValue () {
        return price;
    }
}
