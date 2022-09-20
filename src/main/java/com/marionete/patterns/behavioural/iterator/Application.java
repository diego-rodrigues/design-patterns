package com.marionete.patterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Allows traversing a collection without exposing its representation.
 */
public class Application {

    public static void main(String[] args) {
        List<Profile> peopleList = new ArrayList<>();

        peopleList.add(new Profile("AAAA", 5));
        peopleList.add(new Profile("BBBB", 25));
        peopleList.add(new Profile("CCCC", 18));
        peopleList.add(new Profile("DDDD", 42));
        peopleList.add(new Profile("EEEE", 1));

        System.out.println("All people:");
        ProfileContainer profileContainer = new ProfileContainer(peopleList);
        for (Iterator it = profileContainer.getIterator(); it.hasNext(); ) {
            System.out.println(it.getNext());
        }

        System.out.println("Just the adults:");
        AdultsProfileContainer adultsProfileContainer = new AdultsProfileContainer(peopleList);
        for (Iterator it = adultsProfileContainer.getIterator(); it.hasNext(); ) {
            System.out.println(it.getNext());
        }
    }
}
