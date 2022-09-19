package com.marionete.patterns.creational.factory.transports;

public class Plane implements Transport {

    @Override
    public String type() {
        return "Plane";
    }

    @Override
    public String surface() {
        return "Air";
    }

}
