package com.marionete.patterns.behavioural.state.states;

public class DraftState extends State {

    public DraftState(Document d) {
        super(d);
    }

    @Override
    public void review(boolean isApproved) {
        System.out.println("Document is not yet ready to be reviewed");
    }

    @Override
    public void publish() {
        System.out.println("Document will be sent to be reviewed.");
        // it should go to review state
    }

    @Override
    public String name() {
        return "draft";
    }
}
