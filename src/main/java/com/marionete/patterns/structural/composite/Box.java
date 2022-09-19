package com.marionete.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box implements OrderItem {

    private List<OrderItem> elements;

    public Box() {
        elements = new ArrayList<>();
    }

    public void addPackageElement(OrderItem orderItem) {
        // adds the item only if the item is not in the box yet, and it is not the box itself
        if ((null != orderItem) && (!elements.contains(orderItem)) && (this != orderItem))
            elements.add(orderItem);
    }

    public void removePackageElement(OrderItem orderItem) {
        if (elements.contains(orderItem))
            elements.remove(orderItem);
    }

    @Override
    public int price() {
        // price should be the value of all items in the box plus the price of the box itself (1)
        return elements.stream().map(OrderItem::price).reduce(1, (a, b) -> a + b);
    }

    @Override
    public String description() {
        return elements.stream()
                .map(e -> e.description())
                .collect(Collectors.joining(", ", "box [", "]"));
    }
}
