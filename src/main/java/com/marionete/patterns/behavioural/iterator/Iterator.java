package com.marionete.patterns.behavioural.iterator;

public interface Iterator {

    Profile getNext();
    boolean hasNext();
    void reset();

}
