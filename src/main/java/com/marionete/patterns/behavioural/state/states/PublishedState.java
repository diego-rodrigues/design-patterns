package com.marionete.patterns.behavioural.state.states;

public class PublishedState extends State {

    public PublishedState(Document d) {
        super(d);
    }

    @Override
    void review(boolean isApproved) {
        System.out.println("Document was already reviewed.");
    }

    @Override
    void publish() {
        System.out.println("Document is already published.");
    }

    @Override
    String name() {
        return "published";
    }
}
