package com.marionete.patterns.behavioural.state.states;

public class ApprovedState extends State {

    public ApprovedState(Document d) {
        super(d);
    }

    @Override
    public void review(boolean isApproved) {
        System.out.println("There is no need to review this document. It is already approved.");
    }

    @Override
    public void publish() {
        System.out.println("Document is published.");
        // it should go to published state
    }

    @Override
    public String name() {
        return "approved";
    }
}
