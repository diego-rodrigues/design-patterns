package com.marionete.patterns.behavioural.state.states;

public class ReviewState extends State {

    public ReviewState(Document d) {
        super(d);
    }

    @Override
    public void review(boolean isApproved) {
        // if document is approved, it should go to approved state, if not, it should go back to draft state.
        if (isApproved) {
            System.out.println("Document is approved. It will be ready to be published.");
        } else {
            System.out.println("Document is not approved. It should be rewritten.");
        }
    }

    @Override
    public void publish() {
        System.out.println("Document can't be published until it is reviewed.");
    }

    @Override
    public String name() {
        return "review";
    }
}
