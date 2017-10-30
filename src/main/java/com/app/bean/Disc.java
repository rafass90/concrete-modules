package com.app.bean;

public class Disc implements IProduct {

    public Double getValue () {
        return value;
    }

    public enum Type {
        CD,
        DVD, OUTROS;
    }

    private Long id;

    private String singer;

    private String name;

    private Double value;

    private Type type;

    public Disc (String singer, String name, Double value, Type type) {
        this.singer = singer;
        this.name = name;
        this.value = value;
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

    public Type getType () {
        return type;
    }

    public String toString(){
        return "\nID: " + getId () + " " + getType () + "\n " + getSinger () + " " + getName () + "\n Price: $" + getValue () + "\n";
    }
}