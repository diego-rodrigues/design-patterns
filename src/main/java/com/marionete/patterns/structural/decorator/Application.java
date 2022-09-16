package com.marionete.patterns.structural.decorator;

public class Application {

    public static void main(String[] args) {
        Warrior w1 = new WarriorImpl();
        System.out.println(w1.equip());

        Warrior w2 = new Sword(new WarriorImpl());
        System.out.println(w2.equip());

        Warrior w3 = new Shield(new WarriorImpl());
        System.out.println(w3.equip());

        Warrior w4 = new Sword(new Shield(new WarriorImpl()));
        System.out.println(w4.equip());
    }
}
