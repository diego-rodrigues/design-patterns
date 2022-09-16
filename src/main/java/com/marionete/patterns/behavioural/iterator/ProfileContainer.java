package com.marionete.patterns.behavioural.iterator;

import java.util.List;

public class ProfileContainer implements Container {

    final List<Profile> profiles;

    public ProfileContainer(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public Iterator getIterator() {
        return new ProfileIterator();
    }

    private class ProfileIterator implements Iterator {

        private int index = 0;

        @Override
        public Profile getNext() {
            if (hasNext())
                return profiles.get(index++);
            else return null;
        }

        @Override
        public boolean hasNext() {
            return index < profiles.size();
        }

        @Override
        public void reset() {
            index = 0;
        }
    }
}
