package com.marionete.patterns.structural.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarriorTest {

    @Test
    void testEquipWarrior() {
        Warrior w1 = new WarriorImpl();
        Assertions.assertEquals("Warrior equipped with armor", w1.equip());
    }

    @Test
    void testEquipWarriorWithSword() {
        Warrior w2 = new Sword(new WarriorImpl());
        Assertions.assertEquals("Warrior equipped with armor with a sword", w2.equip());
    }

    @Test
    void testEquipWarriorWithShield() {
        Warrior w3 = new Shield(new WarriorImpl());
        Assertions.assertEquals("Warrior equipped with armor with a shield", w3.equip());
    }

    @Test
    void testEquipWarriorWithSwordAndShield() {
        Warrior w4 = new Sword(new Shield(new WarriorImpl()));
        Assertions.assertEquals("Warrior equipped with armor with a shield with a sword", w4.equip());
    }

    @Test
    void testEquipWarriorWithSwordAndShieldAndAHorse() {
        Warrior w5 = new Sword(new Horse(new Shield(new WarriorImpl())));
        Assertions.assertEquals("Warrior equipped with armor with a shield with a horse with a sword", w5.equip());
    }
}
