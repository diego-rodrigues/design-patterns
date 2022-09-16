package com.marionete.patterns.creational.builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void testCreateBlankCar() {
        final Car car = Car.builder()
                .simpleCar().build();
        final String expected = "This is a black Blank - 1970 with 2 doors.";
        Assertions.assertEquals(expected, car.description());
    }

    @Test
    void testCreateBasicCar() {
        final Car car = Car.builder()
                .simpleCar()
                .fromYear(2000)
                .withColor("blue")
                .fromModel("Ford")
                .withDoors(4)
                .build();
        final String expected = "This is a blue Ford - 2000 with 4 doors.";
        Assertions.assertEquals(expected, car.description());
    }

    @Test
    void testCreateLuxuryCar() {
        final Car car = Car.builder()
                .allInCar()
                .fromYear(2020)
                .withColor("red")
                .fromModel("Ferrari")
                .withDoors(2)
                .build();
        final String expected = "This is a red Ferrari - 2020 with 2 doors. It has GPS. " +
                "It has radio. It has air conditioning.";
        Assertions.assertEquals(expected, car.description());
    }

    @Test
    void testUpgradeCar() {
        Car car = Car.builder()
                .simpleCar()
                .fromModel("Ford")
                .build();
        String expected = "This is a black Ford - 1970 with 2 doors.";
        Assertions.assertEquals(expected, car.description());

        // modify car

        expected = "This is a blue Ford - 2000 with 4 doors. It has air conditioning.";
        Assertions.assertEquals(expected, car.description());
    }
}
