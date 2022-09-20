package com.marionete.patterns.behavioural.chain;

/**
 * This pattern allows passing a request through a chain of classes.
 */
public class Application {

    public static void main(String[] args) {
        String input = "qwertyhgdfAXCVBHGF";

        CutHandler ch1 = new CutHandler(1);
        CutHandler ch2 = new CutHandler(2);
        CutHandler ch3 = new CutHandler(3);
        UppercaseHandler upHandler = new UppercaseHandler();

        // creating chain
        ch1.setNext(ch2);
        ch2.setNext(upHandler);
        upHandler.setNext(ch3);

        System.out.println("Processing " + input);
        System.out.println(ch1.handle(input));
    }
}
