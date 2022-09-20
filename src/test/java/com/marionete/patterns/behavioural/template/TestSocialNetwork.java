package com.marionete.patterns.behavioural.template;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestSocialNetwork {

    static SocialNetworkTemplate networkFb, networkTt;
    static final String user = "test@facebook.com";
    static final String pass = "pass";
    static final String post = "Hello, this is a test.";

    @BeforeAll
    static void init() {
        networkFb = new Facebook();
        networkTt = new Twitter();

        networkFb.logIn(user, pass);
        networkTt.logIn(user, pass);
    }

    @Test
    void testPostFacebook() {
        Assertions.assertTrue(networkFb.post(post));
        Assertions.assertEquals(post, networkFb.getCurrentPost());
    }

    @Test
    void testPostTwitter() {
        Assertions.assertFalse(networkTt.post(post));
        Assertions.assertEquals("", networkTt.getCurrentPost());
    }
}
