package com.marionete.patterns.creational.singleton;

public class DatabaseInstance {

    private static DatabaseInstance instance;
    private String connectionStatus;

    private DatabaseInstance() {
        openConnection();
    }

    public static DatabaseInstance getInstance() {
        // if the instance is null, create a new one, if it exists, return the existing instance
        if (null == instance)
            instance = new DatabaseInstance();

        return instance;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void openConnection() {
        connectionStatus = "Connected to the database.";
    }

    public void closeConnection() {
        connectionStatus = "Not connected to the database.";
    }


}
