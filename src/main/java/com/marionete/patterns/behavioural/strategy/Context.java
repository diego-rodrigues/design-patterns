package com.marionete.patterns.behavioural.strategy;

public class Context {

    private Strategy strategy;

    void setStrategy(Strategy s) {
        // the strategy becomes a property in the context object
    }

    int runStrategy(int a, int b) {
        // the strategy is executed using the arguments
        return 0;
    }
}
