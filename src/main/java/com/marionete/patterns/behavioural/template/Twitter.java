package com.marionete.patterns.behavioural.template;

public class Twitter extends SocialNetworkTemplate {

    private final int MAX_CHARACTERS = 15;
    @Override
    boolean performLogIn(String username, String password) {
        if ((null == username) || (null == password)) {
            System.out.println("Username/password can't be null.");
            return false;
        }

        username = username.replace(" ", "_");
        System.out.println("Logged in as " + username);
        return true;
    }

    @Override
    boolean performLogOut() {
        if (isLoggedIn) {
            System.out.println(username + " is logging out.");
            return true;
        } else return false;
    }

    @Override
    boolean sendMessage(byte[] message) {
        if (null != message) {
            String strMessage = new String(message);
            if (strMessage.length() > MAX_CHARACTERS) {
                System.out.println("A tweet can't have at most " + MAX_CHARACTERS + " characters.");
                return false;
            }
            currentPost = strMessage;
            System.out.println("Tweet: " + strMessage);
            return true;
        } else return false;
    }
}
