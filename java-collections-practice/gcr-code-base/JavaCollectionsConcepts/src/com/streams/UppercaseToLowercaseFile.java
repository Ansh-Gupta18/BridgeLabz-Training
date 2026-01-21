package com.streams;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UppercaseToLowercaseFile {

    public static void main(String[] args) {

        String sourceFile = "input.txt";
        String destinationFile = "output.txt";

        Charset charset = StandardCharsets.UTF_8; // handle encoding issues

        try (
            BufferedReader reader =
                    new BufferedReader(new FileReader(sourceFile, charset));
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(destinationFile, charset))
        ) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted successfully (Uppercase → Lowercase).");

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("I/O error occurred.");
            e.printStackTrace();
        }
    }
}

