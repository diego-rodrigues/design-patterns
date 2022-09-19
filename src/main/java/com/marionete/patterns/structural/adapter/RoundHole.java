package com.marionete.patterns.structural.adapter;

public class RoundHole {

    private final double radius;

    public RoundHole(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(double radius) {
        // something fits the hole if it's radius if less or equal than the hole's radius.
        return this.radius >= radius;
    }
}
