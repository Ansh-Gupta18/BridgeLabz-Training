package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

// Processes exam result CSV files
public class ResultProcessor {

    // Regex: RollNo,Name,Subject,Marks
    private static final Pattern LINE_PATTERN =
            Pattern.compile("\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}");

    // Reads and validates CSV file
    public static <T> List<ExamRecord<T>> readResults(
            String filePath, T examType)
            throws InvalidResultFormatException {

        List<ExamRecord<T>> records = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Skip header
                if (line.startsWith("RollNo")) continue;

                // Validate format using regex
                if (!LINE_PATTERN.matcher(line).matches()) {
                    throw new InvalidResultFormatException(
                            "Invalid format: " + line);
                }

                String[] parts = line.split(",");

                int marks = Integer.parseInt(parts[3]);

                // Validate marks range
                if (marks < 0 || marks > 100) {
                    throw new InvalidResultFormatException(
                            "Invalid marks: " + line);
                }

                records.add(new ExamRecord<>(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        parts[2],
                        marks,
                        examType
                ));
            }

        } catch (IOException e) {
            System.out.println("File read error: " + e.getMessage());
        }

        return records;
    }

    // Groups marks by subject
    public static Map<String, List<Integer>> groupBySubject(
            List<ExamRecord<String>> records) {

        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        for (ExamRecord<?> record : records) {
            subjectMarks
                    .computeIfAbsent(record.getSubject(),
                            k -> new ArrayList<>())
                    .add(record.getMarks());
        }

        return subjectMarks;
    }

    // Finds top scorer per subject
    public static Map<String, Integer> topScorers(
            Map<String, List<Integer>> subjectMarks) {

        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, List<Integer>> entry : subjectMarks.entrySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Comparator.reverseOrder());

            pq.addAll(entry.getValue());

            result.put(entry.getKey(), pq.peek());
        }

        return result;
    }
}
