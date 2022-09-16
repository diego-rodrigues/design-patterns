package com.marionete.patterns.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DatabaseInstanceTest {

    static DatabaseInstance databaseInstance;

    @BeforeAll
    static void init() {
        databaseInstance = DatabaseInstance.getInstance();
    }

    @Test
    void testCreateDatabaseConnection() {
        databaseInstance = DatabaseInstance.getInstance();
        String expected = "Connected to the database.";
        Assertions.assertEquals(expected, databaseInstance.getConnectionStatus());
    }

    @Test
    void testCloseConnection() {
        databaseInstance.closeConnection();
        String expected = "Not connected to the database.";
        Assertions.assertEquals(expected, databaseInstance.getConnectionStatus());
    }

    @Test
    void testOneInstanceIsCreated() {
        DatabaseInstance databaseInstance2 = DatabaseInstance.getInstance();
        Assertions.assertEquals(databaseInstance, databaseInstance2);
    }
}
