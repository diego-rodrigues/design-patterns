package com.marionete.patterns.creational.factory;

import com.marionete.patterns.creational.factory.transports.Transport;
import com.marionete.patterns.creational.factory.types.BoatFactory;
import com.marionete.patterns.creational.factory.types.LogisticsFactory;
import com.marionete.patterns.creational.factory.types.TruckFactory;

/**
 * The application has all the business logic. It only uses the interfaces, so it doesn't need to worry
 * about individual types of inherited classes.
 */
public class Application {

    private Transport transport;

    public Application(LogisticsFactory logisticsFactory) {
        transport = logisticsFactory.create();
    }

    public String startTransport() {
        return String.format("I am a %s and I transport by %s", transport.type(), transport.surface());
    }

    public static void main(String[] args) {
        final boolean transportByWater = false;
        final Application app = transportByWater
                ? new Application(new BoatFactory())
                : new Application(new TruckFactory());

        System.out.println(app.startTransport());
    }
}
