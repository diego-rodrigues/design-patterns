package com.marionete.patterns.behavioural.template;

public abstract class SocialNetworkTemplate {

    public String username, password;
    protected String currentPost;
    boolean isLoggedIn;

    public SocialNetworkTemplate() {}

    public boolean post(String message) {
        if (!isLoggedIn) {
            System.out.println("User not logged in.");
            return false;
        } else {
            return sendMessage(message.getBytes());
        }
    }

    public boolean logIn(String username, String password) {
        isLoggedIn = performLogIn(username, password);
        if (isLoggedIn) {
            this.username = username;
            this.password = password;
        }
        return isLoggedIn;
    }

    public boolean logOut() {
        isLoggedIn = performLogOut();
        return isLoggedIn;
    }

    public String getCurrentPost() {
        if ((null != currentPost) && (isLoggedIn))
            return currentPost;
        else return "";
    }

    abstract boolean performLogIn(String username, String password);
    abstract boolean performLogOut();
    abstract boolean sendMessage(byte[] message);
}
