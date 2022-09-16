package com.marionete.patterns.behavioural.state.states;

public class Document {

    private State currentState;
    private int id;

    public Document(int id) {
        currentState = new DraftState(this);
    }

    public String status() {
        return ">> Document " + id + " is in " + currentState.name() + " state.";
    }

    public void review(boolean isApproved) {
        currentState.review(isApproved);
    }

    public void publish() {
        currentState.publish();
    }

    protected void changeState(State newState) {
        currentState = newState;
    }
}
