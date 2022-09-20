package com.marionete.patterns.behavioural.strategy;

public class Context {

    private Strategy strategy;

    void setStrategy(Strategy s) {
        strategy = s;
    }

    int runStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
