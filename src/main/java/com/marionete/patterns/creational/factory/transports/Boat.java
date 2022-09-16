package com.marionete.patterns.creational.factory.transports;

public class Boat implements Transport {

    @Override
    public String type() {
        return "Boat";
    }

    @Override
    public String surface() {
        return "Sea";
    }

}
