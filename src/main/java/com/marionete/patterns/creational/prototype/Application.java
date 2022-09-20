package com.marionete.patterns.creational.prototype;

import com.marionete.patterns.creational.prototype.shapes.Circle;
import com.marionete.patterns.creational.prototype.shapes.Shape;
import com.marionete.patterns.creational.prototype.shapes.Square;

import java.util.ArrayList;
import java.util.List;

/**
 * Allows copying objects without coupling their logic.
 */
public class Application {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        final Circle c = new Circle(0, 0, 5, "white");
        shapes.add(c);

        final Square s = new Square(5, 5, 10, "black");
        shapes.add(s);

        shapes.add(c.clone());
        shapes.add(s.clone());

        shapes.forEach(shape -> System.out.println(shape.description()));
    }
}
