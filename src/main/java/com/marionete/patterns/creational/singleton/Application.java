package com.marionete.patterns.creational.singleton;

public class Application {

    public static void main(String[] args) {
        DatabaseInstance connection = DatabaseInstance.getInstance();
        System.out.println("Status: " + connection.getConnectionStatus());

        connection.closeConnection();
        System.out.println("Status: " + connection.getConnectionStatus());

    }
}
