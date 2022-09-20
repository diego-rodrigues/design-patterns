package com.marionete.patterns.behavioural.chain;

public class CutHandler implements Handler {

    private Handler next;
    private int cutNumber;

    public CutHandler(int cutNumber) {
        this.cutNumber = cutNumber;
    }


    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public String handle(String request) {
        if (null == request) return "";
        if (request.length() > cutNumber) {

            // change the request by cutting of the first characters
            String processedRequest = request.substring(cutNumber);

            if (null != next)
                return next.handle(processedRequest);
            else return processedRequest;
        } else return "";
    }
}
