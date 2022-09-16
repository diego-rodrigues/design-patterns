package com.marionete.patterns.creational.factory.transports;

public class Truck implements Transport {

    @Override
    public String type() {
        return "Truck";
    }

    @Override
    public String surface() {
        return "Road";
    }
}
