package com.marionete.patterns.creational.prototype.shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int x, int y, int radius, String color) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle target) {
        super(target);
        if (target != null)
            this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle) || !super.equals(obj)) return false;
        Circle circleObj = (Circle) obj;
        return this.radius == circleObj.radius;
    }

    @Override
    public String description() {
        return String.format("It's a %s circle at (%d,%d) with radius equals to %d.", color, x, y, radius);
    }
}
