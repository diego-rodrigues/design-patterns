package com.marionete.patterns.behavioural.chain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HandlerTest {

    static Handler uppercaseHandler, cutHandler5, cutHandler3;

    @BeforeEach
    void init() {
        uppercaseHandler = new UppercaseHandler();
        cutHandler5 = new CutHandler(5);
        cutHandler3 = new CutHandler(3);
    }

    @Test
    void testUppercaseHandler() {
        String input = "qwerty";
        String expected = "QWERTY";
        Assertions.assertEquals(expected, uppercaseHandler.handle(input));
    }

    @Test
    void testUppercaseHandlerWithNullInput() {
        String input = null;
        String expected = "";
        Assertions.assertEquals(expected, uppercaseHandler.handle(input));
    }

    @Test
    void testCutHandler() {
        String input = "qwerty";
        String expected = "rty";
        Assertions.assertEquals(expected, cutHandler3.handle(input));
    }

    @Test
    void testCutHandlerSmallInput() {
        String input = "ty";
        String expected = "";
        Assertions.assertEquals(expected, cutHandler3.handle(input));
    }

    @Test
    void testCutHandlerNullInput() {
        String input = null;
        String expected = "";
        Assertions.assertEquals(expected, cutHandler3.handle(input));
    }

    @Test
    void testChainOfHandlers() {
        String input = "qwertyuiop";
        String expected = "OP";

        cutHandler3.setNext(uppercaseHandler);
        uppercaseHandler.setNext(cutHandler5);
        Assertions.assertEquals(expected,cutHandler3.handle(input));
    }

    @Test
    void testChallenge() {
        String input = "qwerty";
        String expected = "QWERTYQWERTY";

        uppercaseHandler.setNext(new DoubleHandler());

        Assertions.assertEquals(expected,uppercaseHandler.handle(input));
    }
}
