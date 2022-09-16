package com.marionete.patterns.structural.composite;

public class Product implements OrderPackage {

    private final int price;
    private final String description;

    public Product(String description, int price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public String description() {
        return this.description;
    }
}
