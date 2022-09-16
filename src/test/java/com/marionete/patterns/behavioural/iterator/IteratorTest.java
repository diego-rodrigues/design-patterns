package com.marionete.patterns.behavioural.iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IteratorTest {

    static List<Profile> peopleList, childrenList, adultsList;
    static List<Profile> emptyList;

    @BeforeAll
    static void init() {
        emptyList = Collections.emptyList();
        peopleList = new ArrayList<>();
        childrenList = new ArrayList<>();
        adultsList = new ArrayList<>();

        childrenList.add(new Profile("AAAA", 5));
        childrenList.add(new Profile("EEEE", 1));
        childrenList.add(new Profile("FFFF", 8));
        adultsList.add(new Profile("BBBB", 25));
        adultsList.add(new Profile("CCCC", 18));
        adultsList.add(new Profile("DDDD", 42));

        peopleList.addAll(childrenList);
        peopleList.addAll(adultsList);
        Collections.shuffle(peopleList);

    }

    @Test
    void testProfileIteratorWithEmptyList() {
        Iterator iterator = new ProfileContainer(emptyList).getIterator();

        Assertions.assertNull(iterator.getNext());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testAdultsIteratorWithEmptyList() {
        Iterator iterator = new AdultsProfileContainer(emptyList).getIterator();

        Assertions.assertNull(iterator.getNext());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testAdultsIteratorWithNoAdults() {
        Iterator iterator = new AdultsProfileContainer(childrenList).getIterator();

        Assertions.assertNull(iterator.getNext());
        Assertions.assertFalse(iterator.hasNext());
    }

    @Test
    void testAdultsIterator() {
        Iterator iterator = new AdultsProfileContainer(peopleList).getIterator();

        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertNotNull(iterator.getNext());
        Assertions.assertNotNull(iterator.getNext());
        Assertions.assertNotNull(iterator.getNext());
        Assertions.assertNull(iterator.getNext());
        Assertions.assertFalse(iterator.hasNext());
    }


}
