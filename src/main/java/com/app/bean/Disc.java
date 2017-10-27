package com.app.bean;

public class Disc implements IProduct{

    public Double getValue () {
        return price;
    }

    enum Type{
        CD,
        DVD;
    }

    private Long id;

    private String singer;

    private String name;

    private Double price;

    private Type type;

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public String getSinger () {
        return singer;
    }

    public void setSinger (String singer) {
        this.singer = singer;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getPrice () {
        return price;
    }

    public void setPrice (Double price) {
        this.price = price;
    }

    public Type getType () {
        return type;
    }

    public void setType (Type type) {
        this.type = type;
    }
}
