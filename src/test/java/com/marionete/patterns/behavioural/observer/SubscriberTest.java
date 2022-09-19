package com.marionete.patterns.behavioural.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SubscriberTest {

    static List<ClientSubscriber> clients;
    static PublisherStore store;

    @BeforeEach
    void init() {
        clients = new ArrayList<>();
        clients.add(new ClientSubscriber("a", 100));
        clients.add(new ClientSubscriber("b", 125));
        clients.add(new ClientSubscriber("c", 150));
        clients.add(new ClientSubscriber("d", 175));
        clients.add(new ClientSubscriber("e", 200));

        store = new PublisherStore();
        clients.forEach(c -> store.subscribe(c));
    }

    @Test
    void testChangePriceAllInterested() {
        store.changePrice(50);
        clients.forEach(c -> Assertions.assertTrue(c.isInterested()));
    }

    @Test
    void testChangePriceSomeInterested() {
        store.changePrice(180);
        Assertions.assertFalse(clients.get(0).isInterested());
        Assertions.assertFalse(clients.get(1).isInterested());
        Assertions.assertFalse(clients.get(2).isInterested());
        Assertions.assertFalse(clients.get(3).isInterested());
        Assertions.assertTrue(clients.get(4).isInterested());
    }

    @Test
    void testChangePriceUnsubscribersMissOpportunity() {
        store.unsubscribe(clients.get(3));
        store.unsubscribe(clients.get(0));

        store.changePrice(99);
        Assertions.assertFalse(clients.get(0).isInterested());
        Assertions.assertTrue(clients.get(1).isInterested());
        Assertions.assertTrue(clients.get(2).isInterested());
        Assertions.assertFalse(clients.get(3).isInterested());
        Assertions.assertTrue(clients.get(4).isInterested());
    }
}
