package com.marionete.patterns.structural.adapter;

public class SquarePeg {

    private final int width, height;

    public SquarePeg(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
}
