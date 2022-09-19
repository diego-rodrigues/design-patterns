package com.marionete.patterns.behavioural.mediator.air;

public interface Mediator {

    boolean notify(Plane sender, String event);
    void register(Plane plane);
}
