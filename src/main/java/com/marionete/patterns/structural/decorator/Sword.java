package com.marionete.patterns.structural.decorator;

public class Sword extends WarriorDecorator {

    public Sword(Warrior warrior) {
        super(warrior);
    }

    @Override
    public String equip() {
        return super.equip() + "";
    }
}
