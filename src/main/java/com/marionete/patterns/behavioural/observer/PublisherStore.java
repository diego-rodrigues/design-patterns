package com.marionete.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherStore {

    private List<Subscriber> subscribers;
    private int ps5Price;

    public PublisherStore() {
        subscribers = new ArrayList<>();
        outOfStock();
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void outOfStock() {
        changePrice(99999);
    }

    public void changePrice(int newPrice) {
        this.ps5Price = newPrice;
        notifySubscribers();
    }

    public void notifySubscribers() {
        subscribers.forEach(s -> s.update(ps5Price));
    }
}
