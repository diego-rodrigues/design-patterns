package com.marionete.patterns.behavioural.iterator;

public class Profile {

    public final String name;
    public final int age;

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " is " + age + "-years old.";
    }
}
