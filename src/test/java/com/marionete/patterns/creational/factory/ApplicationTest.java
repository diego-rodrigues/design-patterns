package com.marionete.patterns.creational.factory;

import com.marionete.patterns.creational.factory.types.BoatFactory;
import com.marionete.patterns.creational.factory.types.TruckFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApplicationTest {

    static Application app;

    @Test
    void testAppForBoats() {
        app = new Application(new BoatFactory());
        String expected = "I am a Boat and I transport by Sea";
        Assertions.assertEquals(expected, app.startTransport());
    }

    @Test
    void testAppForTrucks() {
        app = new Application(new TruckFactory());
        String expected = "I am a Truck and I transport by Road";
        Assertions.assertEquals(expected, app.startTransport());
    }

    @Test
    void testAppForPlanes() {
        String expected = "I am a Plane and I transport by Air";
        Assertions.assertEquals(expected, app.startTransport());
    }
}
