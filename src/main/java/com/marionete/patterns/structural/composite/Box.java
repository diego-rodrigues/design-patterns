package com.marionete.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box implements OrderPackage {

    private List<OrderPackage> elements;

    public Box() {
        elements = new ArrayList<>();
    }

    public void addPackageElement(OrderPackage orderPackage) {
        if (!elements.contains(orderPackage) && this != orderPackage)
            elements.add(orderPackage);
    }

    public void removePackageElement(OrderPackage orderPackage) {
        if (elements.contains(orderPackage))
            elements.remove(orderPackage);
    }

    @Override
    public int price() {
        return elements.stream()
                .map(e -> e.price())
                .reduce(1, (a,b) -> a+b);
    }

    @Override
    public String description() {
        return elements.stream()
                .map(e -> e.description())
                .collect(Collectors.joining(", ", "box [", "]"));
    }
}
