package com.marionete.patterns.behavioural.observer;

public class ClientSubscriber implements Subscriber {

    private int priceLimit = 0;
    private boolean interested = false;
    private String name;

    public ClientSubscriber(String name, int limit) {
        this.name = name;
        priceLimit(limit);
    }

    @Override
    public void priceLimit(int limit) {
        priceLimit = limit;
    }

    @Override
    public void update(int priceContext) {
        interested = priceContext <= priceLimit;
    }

    public boolean isInterested() {
        return interested;
    }

    @Override
    public String toString() {
        return isInterested()
                ? "client " + name + " is interested."
                : "client " + name + " is not interested.";
    }
}
