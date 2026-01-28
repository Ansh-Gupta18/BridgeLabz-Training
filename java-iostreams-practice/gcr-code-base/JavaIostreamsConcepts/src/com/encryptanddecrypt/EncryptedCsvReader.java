package com.encryptanddecrypt;


import java.io.BufferedReader;
import java.io.FileReader;

public class EncryptedCsvReader {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));
        String line;

        br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String id = data[0];
            String name = data[1];
            String email = CryptoUtil.decrypt(data[2]);
            String salary = CryptoUtil.decrypt(data[3]);

            System.out.println(
                "ID: " + id +
                ", Name: " + name +
                ", Email: " + email +
                ", Salary: " + salary
            );
        }
        br.close();
    }
}

