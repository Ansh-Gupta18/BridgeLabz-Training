package com.examresultuploader;

import java.util.*;

//Main application
public class ExamResultUploaderApp {

 public static void main(String[] args) {

     try {
         // Read results for Final exam
         List<ExamRecord<String>> records =
                 ResultProcessor.readResults(
                         "results.csv", "Final");

         // Group by subject
         Map<String, List<Integer>> subjectMarks =
                 ResultProcessor.groupBySubject(records);

         // Find top scorers
         Map<String, Integer> toppers =
                 ResultProcessor.topScorers(subjectMarks);

         System.out.println("--- Top Scorers ---");
         toppers.forEach((subject, marks) ->
                 System.out.println(subject + " → " + marks));

     } catch (InvalidResultFormatException e) {
         System.out.println("ERROR: " + e.getMessage());
     }
 }
}
