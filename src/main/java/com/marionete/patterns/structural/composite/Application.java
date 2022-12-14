package com.marionete.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite pattern allows structure the objects as tree models.
 */
public class Application {

    public static void main(String[] args) {
//        box
//        - box
//          - phone
//          - box
//            - ball
//            - mug

        Box box1 = new Box();
        box1.addPackageElement(new Product("ball", 5));
        box1.addPackageElement(new Product("mug", 7));

        Box box2 = new Box();
        box2.addPackageElement(new Product("phone", 40));
        box2.addPackageElement(box1);

        Box christmasBox = new Box();
        christmasBox.addPackageElement(box2);

        System.out.println("Christmas box price is: " + christmasBox.price());
        System.out.println("Christmas box content is: " + christmasBox.description());

        List<OrderItem> items = new ArrayList<>();
        items.add(christmasBox);
        items.add(new Product("tv", 100));

        System.out.println("Price of all items: " + items.stream().map(OrderItem::price).reduce(0, (a,b) -> a + b));
    }
}
