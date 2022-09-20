package com.marionete.patterns.behavioural.chain;

public interface Handler {

    void setNext(Handler h);
    String handle(String request);

}
