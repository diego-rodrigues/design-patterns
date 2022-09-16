package com.marionete.patterns.creational.factory.transports;

/**
 * The Factory expects products to be the same type, hence we define an interface
 * so different classes can have the same structure.
 */
public interface Transport {

    String type();

    String surface();

}
