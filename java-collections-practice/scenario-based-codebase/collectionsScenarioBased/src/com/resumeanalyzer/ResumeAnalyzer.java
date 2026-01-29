package com.resumeanalyzer;

//File Name: ResumeAnalyzer.java
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class ResumeAnalyzer {

 private static final String[] KEYWORDS = {"Java", "Python", "Spring"};

 public static void main(String[] args) {
     String folderPath = "C:\\Users\\Anshg\\OneDrive\\Desktop\\java-programming-workspace\\java-collections-practice\\scenario-based-codebase\\collectionsScenarioBased\\src\\com\\resumeanalyzer\\resumes"; // folder containing resumes
     Map<String, ResumeData> candidates = new HashMap<>();

     try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(folderPath))) {
         for (Path filePath : stream) {
             if (!Files.isRegularFile(filePath)) continue;

             try {
                 String content = ResumeUtils.readFile(filePath);
                 String email = ResumeUtils.extractRegex(content, ResumeUtils.EMAIL_PATTERN);
                 String phone = ResumeUtils.extractRegex(content, ResumeUtils.PHONE_PATTERN);

                 if (email == null || phone == null) 
                     throw new IllegalArgumentException("Invalid Resume Format");

                 int keywordMatches = ResumeUtils.countKeywordMatches(content, KEYWORDS);
                 String name = ResumeUtils.extractNameFromFile(filePath.getFileName().toString());

                 ResumeData resume = new ResumeData(name, email, phone, keywordMatches);
                 candidates.put(email, resume);

             } catch (Exception e) {
                 System.out.println("Skipping file " + filePath.getFileName() + ": " + e.getMessage());
             }
         }

         // Sort resumes by keyword match count
         List<ResumeData> sortedList = new ArrayList<>(candidates.values());
         sortedList.sort((a, b) -> b.getKeywordMatchCount() - a.getKeywordMatchCount());

         // Display sorted candidates
         System.out.println("\nSorted Candidates:");
         sortedList.forEach(System.out::println);

     } catch (IOException e) {
         System.out.println("Error reading folder: " + e.getMessage());
     }
 }
}
