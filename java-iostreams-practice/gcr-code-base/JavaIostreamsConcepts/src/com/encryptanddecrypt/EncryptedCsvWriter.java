package com.encryptanddecrypt;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class EncryptedCsvWriter {

    public static void main(String[] args) throws Exception {

        BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"));

        bw.write("ID,Name,Email,Salary");
        bw.newLine();

        bw.write("1,Ansh," +
                CryptoUtil.encrypt("ansh@gmail.com") + "," +
                CryptoUtil.encrypt("75000"));
        bw.newLine();

        bw.write("2,Rohit," +
                CryptoUtil.encrypt("rohit@gmail.com") + "," +
                CryptoUtil.encrypt("68000"));
        bw.newLine();

        bw.write("3,Neha," +
                CryptoUtil.encrypt("neha@gmail.com") + "," +
                CryptoUtil.encrypt("82000"));
        bw.newLine();

        bw.close();
        System.out.println("Encrypted CSV created successfully");
    }
}

