package com.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileProcessorTest {

    // -----------------------------
    // FileProcessor methods
    // -----------------------------
    void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    String readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString();
        }
    }

    boolean fileExists(String filename) {
        return new File(filename).exists();
    }

    // -----------------------------
    // JUnit Test Cases
    // -----------------------------
    @Test
    void testWriteAndReadFile() throws IOException {
        String filename = "testfile.txt";
        String content = "Hello, JUnit!";
        
        // Write content
        writeToFile(filename, content);
        
        // Check file exists
        assertTrue(fileExists(filename), "File should exist after writing");

        // Read content
        String readContent = readFromFile(filename);
        assertEquals(content, readContent, "Content read should match content written");

        // Cleanup
        Files.deleteIfExists(Path.of(filename));
    }

    @Test
    void testReadNonExistentFile() {
        String filename = "nonexistentfile.txt";
        assertThrows(IOException.class, () -> readFromFile(filename),
                "Reading a non-existent file should throw IOException");
    }
}
