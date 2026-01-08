package com.linearandbinarysearch;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ISRWrite {

    public static void main(String[] args) {

        String filePath = "output.txt"; // File to write user input

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(filePath, true)) { // 'true' for append mode

            System.out.println("Enter text (type 'exit' to quit):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + System.lineSeparator()); // Write input to file with newline
            }

            System.out.println("User input has been written to " + filePath);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
