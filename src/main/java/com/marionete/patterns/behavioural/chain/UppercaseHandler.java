package com.marionete.patterns.behavioural.chain;

public class UppercaseHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public String handle(String request) {
        if (null == request) return "";
        if (request.length() > 0) {

            // change the request to all uppercase letters
            String processedRequest = request;

            if (null != next)
                return next.handle(processedRequest);
            else return processedRequest;
        } else return "";
    }
}
