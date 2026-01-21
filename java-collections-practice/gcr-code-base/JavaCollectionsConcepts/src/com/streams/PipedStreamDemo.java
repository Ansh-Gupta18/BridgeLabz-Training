package com.streams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStreamDemo {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedInputStream pis = new PipedInputStream();
            PipedOutputStream pos = new PipedOutputStream(pis);

            // Writer thread
            Thread writerThread = new Thread(() -> {
                try {
                    String message = "Hello from Writer Thread!";
                    pos.write(message.getBytes());
                    pos.close(); // important to signal end of data
                } catch (IOException e) {
                    System.out.println("Writer error.");
                    e.printStackTrace();
                }
            });

            // Reader thread
            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    while ((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                } catch (IOException e) {
                    System.out.println("Reader error.");
                    e.printStackTrace();
                }
            });

            // Start threads
            writerThread.start();
            readerThread.start();

            // Ensure proper synchronization
            writerThread.join();
            readerThread.join();

            System.out.println("\nData transfer completed.");

        } catch (IOException | InterruptedException e) {
            System.out.println("Error in piped stream communication.");
            e.printStackTrace();
        }
    }
}

