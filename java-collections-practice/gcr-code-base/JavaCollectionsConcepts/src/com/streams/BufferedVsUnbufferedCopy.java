package com.streams;

import java.io.*;

public class BufferedVsUnbufferedCopy {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String sourceFile = "largefile.dat";
        String unbufferedDest = "unbuffered_copy.dat";
        String bufferedDest = "buffered_copy.dat";

        copyUsingUnbufferedStreams(sourceFile, unbufferedDest);
        copyUsingBufferedStreams(sourceFile, bufferedDest);
    }

    // Unbuffered File Copy
    public static void copyUsingUnbufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in unbuffered copy.");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Unbuffered Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // Buffered File Copy
    public static void copyUsingBufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

        } catch (IOException e) {
            System.out.println("Error in buffered copy.");
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}

