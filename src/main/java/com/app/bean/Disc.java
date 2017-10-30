package com.app.bean;

public class Disc implements IProduct {

    public Double getValue () {
        return price;
    }

    public enum Type {
        CD,
        DVD;
    }

    private Long id;

    private String singer;

    private String name;

    private Double price;

    private Type type;

    public Disc (String singer, String name, Double price, Type type) {
        this.singer = singer;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getSinger () {
        return singer;
    }

    public String getName () {
        return name;
    }

    public Double getPrice () {
        return price;
    }

    public Type getType () {
        return type;
    }

}