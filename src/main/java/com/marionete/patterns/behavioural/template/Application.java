package com.marionete.patterns.behavioural.template;

/**
 * Allows creating default algorithms, but subclasses can override specific steps of
 * the algorithm without changing its structure.
 */
public class Application {

    public static void main(String[] args) {
        String networkName = "Facebook";
        SocialNetworkTemplate network;

        if (networkName.compareTo("Facebook") == 0)
            network = new Facebook();
        else network = new Twitter();

        network.logIn("mynameis@facebook.com", "pass123");
        network.post("Hello, world!");
        System.out.println("Current post is: " + network.getCurrentPost());
    }
}
