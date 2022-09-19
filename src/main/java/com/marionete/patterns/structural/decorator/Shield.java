package com.marionete.patterns.structural.decorator;

public class Shield extends WarriorDecorator {

    public Shield(Warrior warrior) {
        super(warrior);
    }

    @Override
    public String equip() {
        return "";
    }
}
