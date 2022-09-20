package com.marionete.patterns.behavioural.observer;

public interface Subscriber {

    void update(int priceContext);
    void priceLimit(int limit);
}
