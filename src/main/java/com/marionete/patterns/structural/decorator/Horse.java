package com.marionete.patterns.structural.decorator;

public class Horse extends WarriorDecorator {

    public Horse(Warrior warrior) {
        super(warrior);
    }

    @Override
    public String equip() {
        return super.equip() + " with a horse";
    }
}
