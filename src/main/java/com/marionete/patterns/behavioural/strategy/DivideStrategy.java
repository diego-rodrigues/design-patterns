package com.marionete.patterns.behavioural.strategy;

public class DivideStrategy implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
