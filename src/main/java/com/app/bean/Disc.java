package com.app.bean;

public class Disc {
    enum Type{
        CD,
        DVD;
    }

    private Long id;

    private String singer;

    private String name;

    private Double price;

    private Type type;

}
