package com.marionete.patterns.behavioural.template;

public class Facebook extends SocialNetworkTemplate {

    @Override
    boolean performLogIn(String username, String password) {
        if ((null == username) || (null == password)) {
            System.out.println("Username/password can't be null.");
            return false;
        }

        if (!username.contains("@facebook.com")) {
            System.out.println("This is not a facebook account.");
            return false;
        }

        return true;
    }

    @Override
    boolean performLogOut() {
        if (isLoggedIn) {
            System.out.println("Facebook says goodbye!");
            return true;
        } else return false;
    }

    @Override
    boolean sendMessage(byte[] message) {
        if (null != message) {
            currentPost = new String(message);
            System.out.println("New post: " + currentPost);
            return true;
        } else return false;
    }
}
