package com.marionete.patterns.structural.adapter;

/**
 * Adapter provides objects with incompatible interfaces to interact with each other.
 */
public class SquarePegAdapter {

    private final SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public double getRadius() {
        // the square "radius" would be half of the width times the square root of 2
        return 0;
    }
}
