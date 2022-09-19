package com.marionete.patterns.creational.factory.types;

import com.marionete.patterns.creational.factory.transports.Transport;
import com.marionete.patterns.creational.factory.transports.Plane;

public class PlaneFactory implements LogisticsFactory {

    @Override
    public Transport create() {
        return new Plane();
    }

}
