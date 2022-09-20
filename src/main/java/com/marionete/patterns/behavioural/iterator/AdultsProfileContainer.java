package com.marionete.patterns.behavioural.iterator;

import java.util.List;

public class AdultsProfileContainer implements Container {

    final List<Profile> profiles;

    public AdultsProfileContainer(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @Override
    public Iterator getIterator() {
        return new ProfileIterator();
    }

    private class ProfileIterator implements Iterator {

        private int index = 0;
        private int next = -1;

        @Override
        public Profile getNext() {
            // if the collection has next element, increment the index and return the next element
            // otherwise, return null
            return null;
        }

        @Override
        public boolean hasNext() {
            int nextIndex = index;
            while (nextIndex < profiles.size()) {
                if (profiles.get(nextIndex).age >= 18) {
                    next = nextIndex;
                    return true;
                } else nextIndex++;
            }
            next = -1;
            return false;
        }

        @Override
        public void reset() {
            index = 0;
        }
    }
}
