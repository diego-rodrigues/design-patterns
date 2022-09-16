package com.marionete.patterns.behavioural.state;

import com.marionete.patterns.behavioural.state.states.Document;

public class Application {

    public static void main(String[] args) {
        Document d = new Document(0);

        System.out.println(d.status());

        d.review(true);
        System.out.println(d.status());

        d.publish();
        System.out.println(d.status());

        d.review(true);
        System.out.println(d.status());

        d.review(true);
        System.out.println(d.status());

        d.publish();
        System.out.println(d.status());
    }
}
