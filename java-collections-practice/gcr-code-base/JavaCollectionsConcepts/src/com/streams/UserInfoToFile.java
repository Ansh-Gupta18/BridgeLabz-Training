package com.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoToFile {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading user input
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            // Writing data to file
            FileWriter writer = new FileWriter("user_info.txt");

            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");

            writer.close();

            System.out.println("\nData saved successfully to user_info.txt");

        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing data.");
            e.printStackTrace();
        }
    }
}

