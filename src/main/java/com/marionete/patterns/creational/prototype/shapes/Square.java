package com.marionete.patterns.creational.prototype.shapes;

public class Square extends Shape {

    public int width;

    public Square(int x, int y, int width, String color) {
        super(x, y, color);
        this.width = width;
    }

    public Square(Square target) {
        super(target);
        if (target != null) {
            this.width = target.width;
        }
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square) || !super.equals(obj)) return false;
        Square squareObj = (Square) obj;
        return this.width == squareObj.width;
    }

    @Override
    public String description() {
        return String.format("It's a %s square at (%d,%d) with width equals to %d.", color, x, y, width);
    }
}
