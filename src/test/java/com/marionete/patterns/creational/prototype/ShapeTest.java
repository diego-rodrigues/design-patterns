package com.marionete.patterns.creational.prototype;

import com.marionete.patterns.creational.prototype.shapes.Circle;
import com.marionete.patterns.creational.prototype.shapes.Shape;
import com.marionete.patterns.creational.prototype.shapes.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeTest {

    final Shape c = new Circle(10, 2, 5, "white");
    final Shape s = new Square(3, 4, 5, "red");

    Shape star;

    @Test
    void testCreateCircle() {
        Assertions.assertEquals("It's a white circle at (10,2) with radius equals to 5.", c.description());
    }

    @Test
    void testCloneCircle() {
        final Circle clone = (Circle)c.clone();
        Assertions.assertEquals("It's a white circle at (10,2) with radius equals to 5.", clone.description());
    }

    @Test
    void testCreateSquare() {
        Assertions.assertEquals("It's a red square at (3,4) with width equals to 5.", s.description());
    }

    @Test
    void testCloneSquare() {
        final Square clone = (Square)s.clone();
        Assertions.assertEquals("It's a red square at (3,4) with width equals to 5.", clone.description());
    }

    @Test
    void testCreateStar() {
        Assertions.assertEquals("It's a 5-pointed yellow star at (7,-1).", star.description());
    }

    @Test
    void testCloneStar() {
        final Shape clone = star.clone();
        Assertions.assertEquals("It's a 5-pointed yellow star at (7,-1).", clone.description());
    }

}
