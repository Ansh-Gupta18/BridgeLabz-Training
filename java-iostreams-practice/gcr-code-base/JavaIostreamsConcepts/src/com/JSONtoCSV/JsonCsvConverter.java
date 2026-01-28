package com.JSONtoCSV;


import java.io.*;
import java.util.*;

public class JsonCsvConverter {

    // JSON ➜ CSV
    public static void jsonToCsv(String jsonFile, String csvFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(jsonFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));

        bw.write("id,name,age,marks");
        bw.newLine();

        String line;
        int id = 0, age = 0, marks = 0;
        String name = "";

        while ((line = br.readLine()) != null) {
            line = line.trim();

            if (line.contains("\"id\""))
                id = Integer.parseInt(line.replaceAll("\\D+", ""));
            else if (line.contains("\"name\""))
                name = line.split(":")[1].replace("\"", "").replace(",", "").trim();
            else if (line.contains("\"age\""))
                age = Integer.parseInt(line.replaceAll("\\D+", ""));
            else if (line.contains("\"marks\"")) {
                marks = Integer.parseInt(line.replaceAll("\\D+", ""));
                bw.write(id + "," + name + "," + age + "," + marks);
                bw.newLine();
            }
        }

        br.close();
        bw.close();
        System.out.println("JSON to CSV conversion completed");
    }

    // CSV ➜ JSON
    public static void csvToJson(String csvFile, String jsonFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile));

        String line;
        br.readLine(); // skip header

        bw.write("[\n");
        boolean first = true;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (!first) bw.write(",\n");
            first = false;

            bw.write("  {\n");
            bw.write("    \"id\": " + data[0] + ",\n");
            bw.write("    \"name\": \"" + data[1] + "\",\n");
            bw.write("    \"age\": " + data[2] + ",\n");
            bw.write("    \"marks\": " + data[3] + "\n");
            bw.write("  }");
        }

        bw.write("\n]");
        br.close();
        bw.close();
        System.out.println("CSV to JSON conversion completed");
    }

    public static void main(String[] args) throws IOException {
        jsonToCsv("C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\JSONtoCSV\\students.json", "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\JSONtoCSV\\students.csv");
        csvToJson("C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\JSONtoCSV\\students.csv", "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-iostreams-practice\\gcr-code-base\\JavaIostreamsConcepts\\src\\com\\JSONtoCSV\\students_output.json");
    }
}
