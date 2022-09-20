package com.marionete.patterns.behavioural.chain;

import java.util.Locale;

public class DoubleHandler implements Handler {

    private Handler next;

    @Override
    public void setNext(Handler h) {
        this.next = h;
    }

    @Override
    public String handle(String request) {
        if (null == request) return "";
        if (request.length() > 0) {

            // change the request to duplicate the word
            String processedRequest = request + request;

            if (null != next)
                return next.handle(processedRequest);
            else return processedRequest;
        } else return "";
    }
}
