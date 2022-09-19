package com.marionete.patterns.structural.decorator;

public class WarriorDecorator implements Warrior {

    private final Warrior warrior;

    public WarriorDecorator(Warrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public String equip() {
        return warrior.equip();
    }
}
