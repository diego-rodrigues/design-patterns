package com.marionete.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<ClientSubscriber> clients = new ArrayList<>();
        clients.add(new ClientSubscriber("a", 100));
        clients.add(new ClientSubscriber("b", 125));
        clients.add(new ClientSubscriber("c", 150));
        clients.add(new ClientSubscriber("d", 175));
        clients.add(new ClientSubscriber("e", 200));

        PublisherStore store = new PublisherStore();
        clients.forEach(c -> store.subscribe(c));

        store.changePrice(50);
        clients.forEach(c -> System.out.println(c.toString()));
        System.out.println("---------------");

        store.changePrice(180);
        clients.forEach(c -> System.out.println(c.toString()));
        System.out.println("---------------");

        store.unsubscribe(clients.get(3));
        store.unsubscribe(clients.get(0));

        store.changePrice(99);
        clients.forEach(c -> System.out.println(c.toString()));
        System.out.println("---------------");

    }
}
