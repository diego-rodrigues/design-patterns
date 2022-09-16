package com.marionete.patterns.creational.factory.types;

import com.marionete.patterns.creational.factory.transports.Transport;
import com.marionete.patterns.creational.factory.transports.Truck;

public class TruckFactory implements LogisticsFactory {

    @Override
    public Transport create() {
        return new Truck();
    }

}
