package com.streams;

import java.io.*;
import java.util.Arrays;

public class ImageByteArrayStreamExample {

    public static void main(String[] args) {

        String sourceImage = "input.jpg";   // original image
        String copiedImage = "output.jpg";  // copied image

        try {
            // Convert image to byte array
            byte[] imageBytes = imageToByteArray(sourceImage);

            // Write byte array back to image
            byteArrayToImage(imageBytes, copiedImage);

            // Verify both images
            boolean same = compareFiles(sourceImage, copiedImage);

            System.out.println("Image copied successfully.");
            System.out.println("Images identical: " + same);

        } catch (IOException e) {
            System.out.println("Error handling image files.");
            e.printStackTrace();
        }
    }

    // Read image and convert to byte array
    private static byte[] imageToByteArray(String fileName) throws IOException {

        try (FileInputStream fis = new FileInputStream(fileName);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    // Write byte array to image file
    private static void byteArrayToImage(byte[] data, String fileName) throws IOException {

        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             FileOutputStream fos = new FileOutputStream(fileName)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Compare two files byte by byte
    private static boolean compareFiles(String file1, String file2) throws IOException {

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int b1, b2;
            while ((b1 = fis1.read()) != -1) {
                b2 = fis2.read();
                if (b1 != b2) {
                    return false;
                }
            }
            return fis2.read() == -1;
        }
    }
}
