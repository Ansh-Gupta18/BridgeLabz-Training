package com.regex;

public class IPAddressValidator {

    // Method to validate IPv4 address
    public static boolean isValidIPv4(String ip) {

        // Regex for 0–255
        String regex =
                "^(" +
                "(25[0-5]|" +      // 250–255
                "2[0-4][0-9]|" +   // 200–249
                "1[0-9]{2}|" +     // 100–199
                "[1-9]?[0-9])" +   // 0–99
                "\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";

        return ip.matches(regex);
    }

    public static void main(String[] args) {

        String[] testIPs = {
                "192.168.1.1",
                "255.255.255.255",
                "0.0.0.0",
                "256.1.1.1",
                "192.168.1",
                "192.168.01.1"
        };

        for (String ip : testIPs) {
            System.out.println(ip + " → " +
                    (isValidIPv4(ip) ? "Valid" : "Invalid"));
        }
    }
}
