package com.streams;

import java.io.*;

public class StudentDataStreamExample {

    private static final String FILE_NAME = "student.dat";

    public static void main(String[] args) {

        // Writing student data
        writeStudentData();

        // Reading student data
        readStudentData();
    }

    // Method to write primitive data using DataOutputStream
    private static void writeStudentData() {
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(FILE_NAME))) {

            int rollNumber = 101;
            String name = "Ansh Gupta";
            double gpa = 8.75;

            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing student data.");
            e.printStackTrace();
        }
    }

    // Method to read primitive data using DataInputStream
    private static void readStudentData() {
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(FILE_NAME))) {

            int rollNumber = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Details:");
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading student data.");
            e.printStackTrace();
        }
    }
}
