package com.marionete.patterns.structural.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BoxTest {

    static Box box;
    static Product mug, phone;

    @BeforeEach
    void init() {
        box = new Box();
        mug = new Product("mug", 7);
        phone = new Product("phone", 40);
    }

    @Test
    void testSingleBoxPrice() {
        Assertions.assertEquals(1, box.price());
        Assertions.assertEquals("box []", box.description());
    }

    @Test
    void testCreateBoxWithProduct() {
        box.addPackageElement(phone);
        Assertions.assertEquals(41, box.price());
        Assertions.assertEquals("box [phone]", box.description());
    }

    @Test
    void testCreateBoxWithMultipleProducts() {
        box.addPackageElement(phone);
        box.addPackageElement(mug);
        Assertions.assertEquals(48, box.price());
        Assertions.assertEquals("box [phone, mug]", box.description());
    }

    @Test
    void testCreateBoxWithMultipleProductsAndAnotherBox() {
        Box box2 = new Box();

        box.addPackageElement(phone);
        box.addPackageElement(mug);

        box.addPackageElement(box2);
        Assertions.assertEquals(49, box.price());
        Assertions.assertEquals("box [phone, mug, box []]", box.description());
    }

    @Test
    void testCantAddRecursiveBox() {
        box.addPackageElement(box);
        Assertions.assertEquals(1, box.price());
        Assertions.assertEquals("box []", box.description());
    }

    @Test
    void testRemoveContent() {

        box.addPackageElement(phone);
        box.addPackageElement(mug);
        Assertions.assertEquals(48, box.price());

        box.removePackageElement(mug);
        Assertions.assertEquals(41, box.price());
    }
}
