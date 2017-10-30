package com.app.bean;

import java.time.LocalDate;
import java.util.List;

public class Sale {

    private Long id;

    private Long consumerId;

    private List<IProduct> products;

    private Double value;

    private LocalDate date;

    public Sale(Long consumerId, List<IProduct> products){
        this.consumerId = consumerId;
        this.products = products;
        calculateValue();
        insertDate();
    }

    private void insertDate () {
        date = LocalDate.now ();
    }

    private void calculateValue () {
        value = products.stream ().mapToDouble (p -> p.getValue ()).sum ();
    }

    public Long getId () {
        return id;
    }

    public void setId (Long id) {
        this.id = id;
    }

    public Long getConsumerId () {
        return consumerId;
    }

    public void setConsumerId (Long consumerId) {
        this.consumerId = consumerId;
    }

    public List<IProduct> getProducts () {
        return products;
    }

    public void setProducts (List<IProduct> products) {
        this.products = products;
    }

    public LocalDate getDate () {
        return date;
    }

    public void setDate (LocalDate date) {
        this.date = date;
    }

    public Double getValue () {
        return value;
    }

    public void setValue (Double value) {
        this.value = value;
    }

    public String toString(){
        return "Cliente: " + getConsumerId ()
                + "\n Valo da venda: $" +  getValue ();
    }
}
