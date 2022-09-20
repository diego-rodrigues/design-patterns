package com.marionete.patterns.creational.builder;

/**
 * Allows creating complex objects step-by-step.
 */
public class Application {

    public static void main(String[] args) {
        Car simpleCar = Car.builder()
                .simpleCar()
                .fromModel("Ford")
                .withColor("white")
                .fromYear(2000)
                .withDoors(4)
                .build();

        System.out.println(simpleCar.description());

        simpleCar = simpleCar.toBuilder()
                .withGps(true)
                .withRadio(true)
                .build();

        System.out.println(simpleCar.description());

        Car luxuryCar = Car.builder()
                .allInCar()
                .fromModel("Ferrari")
                .withColor("red")
                .fromYear(2023)
                .build();

        System.out.println(luxuryCar.description());
    }
}
