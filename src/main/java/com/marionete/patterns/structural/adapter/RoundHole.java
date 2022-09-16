package com.marionete.patterns.structural.adapter;

public class RoundHole {

    private final int radius;

    public RoundHole(int r) {
        this.radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(int radius) {
        return radius <= this.radius;
    }
}
