package com.marionete.patterns.behavioural.state.states;

public class ReviewState extends State {

    public ReviewState(Document d) {
        super(d);
    }

    @Override
    public void review(boolean isApproved) {
        if (isApproved) {
            System.out.println("Document is approved. It will be ready to be published.");
            document.changeState(new ApprovedState(document));
        } else {
            System.out.println("Document is not approved. It should be rewritten.");
            document.changeState(new DraftState(document));
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
