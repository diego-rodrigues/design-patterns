package com.marionete.patterns.creational.prototype.shapes;

public abstract class Shape {

    int x, y;
    String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape shape) {
        if (shape != null) {
            this.x = shape.x;
            this.y = shape.y;
            this.color = shape.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape) || !super.equals(obj)) return false;
        Shape shapeObj = (Shape) obj;
        return (this.color == shapeObj.color)
                && (this.x == shapeObj.x)
                && (this.y == shapeObj.y);
    }

    public abstract String description();
}
