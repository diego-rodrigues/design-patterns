package com.marionete.patterns.creational.factory.types;

import com.marionete.patterns.creational.factory.transports.Boat;
import com.marionete.patterns.creational.factory.transports.Transport;

public class BoatFactory implements LogisticsFactory {

    @Override
    public Transport create() {
        return new Boat();
    }

}
