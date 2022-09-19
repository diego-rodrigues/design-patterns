package com.marionete.patterns.behavioural.state.states;

public abstract class State {

    protected Document document;

    public State(Document d) {
        document = d;
    }

    abstract void review(boolean isApproved);

    abstract void publish();

    abstract String name();

}
