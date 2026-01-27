package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

// Simulated DatabaseConnection class
class DatabaseConnection {
    private boolean connected = false;

    void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    boolean isConnected() {
        return connected;
    }
}

// JUnit Test Class
class DatabaseConnectionTest {

    DatabaseConnection db;

    // Runs before each test
    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    // Runs after each test
    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnectionIsEstablished() {
        assertTrue(db.isConnected(), "Connection should be established before test");
    }

    @Test
    void testConnectionAfterDisconnect() {
        db.disconnect();
        assertFalse(db.isConnected(), "Connection should be closed after disconnect");
    }
}

