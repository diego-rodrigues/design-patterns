package com.marionete.patterns.creational.prototype.shapes;

public class Star extends Shape {

    private int points;

    public Star(int x, int y, int points, String color) {
        super(x, y, color);
        this.points = points;
    }

    public Star(Star target) {
        super(target);
        if (target != null)
            this.points = target.points;
    }

    @Override
    public Shape clone() {
        return new Star(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Star) || !super.equals(obj)) return false;
        Star circleObj = (Star) obj;
        return this.points == circleObj.points;
    }

    @Override
    public String description() {
        return String.format("It's a %d-pointed %s star at (%d,%d).", points, color, x, y);
    }
}
