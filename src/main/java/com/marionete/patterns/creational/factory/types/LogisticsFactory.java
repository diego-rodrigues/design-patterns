package com.marionete.patterns.creational.factory.types;

import com.marionete.patterns.creational.factory.transports.Transport;

/**
 * A factory interface defines all methods the specific factories should implement.
 * This interface will be the one used by the main application.
 */
public interface LogisticsFactory {

    Transport create();

}
