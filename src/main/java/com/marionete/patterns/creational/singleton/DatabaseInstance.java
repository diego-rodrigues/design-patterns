package com.marionete.patterns.creational.singleton;

import javax.xml.crypto.Data;

public class DatabaseInstance {

    private static DatabaseInstance instance;
    private String connectionStatus;

    private DatabaseInstance() {
        openConnection();
    }

    public static DatabaseInstance getInstance() {
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
