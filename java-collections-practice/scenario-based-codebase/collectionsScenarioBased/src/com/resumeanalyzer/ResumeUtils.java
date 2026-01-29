package com.resumeanalyzer;

//File Name: ResumeUtils.java
import java.io.*;
import java.nio.file.Path;
import java.util.regex.*;

public class ResumeUtils {

 public static final Pattern EMAIL_PATTERN = Pattern.compile("\\b[\\w.-]+@[\\w.-]+\\.\\w{2,}\\b");
 public static final Pattern PHONE_PATTERN = Pattern.compile("\\b\\d{10}\\b"); // 10-digit phone

 // Read file content
 public static String readFile(Path path) throws IOException {
     StringBuilder sb = new StringBuilder();
     try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
         String line;
         while ((line = br.readLine()) != null) sb.append(line).append("\n");
     }
     return sb.toString();
 }

 // Extract first match of regex
 public static String extractRegex(String text, Pattern pattern) {
     Matcher matcher = pattern.matcher(text);
     if (matcher.find()) return matcher.group();
     return null;
 }

 // Count keywords
 public static int countKeywordMatches(String text, String[] keywords) {
     int count = 0;
     for (String keyword : keywords) {
         Matcher matcher = Pattern.compile("\\b" + keyword + "\\b", Pattern.CASE_INSENSITIVE).matcher(text);
         while (matcher.find()) count++;
     }
     return count;
 }

 // Extract name from filename
 public static String extractNameFromFile(String fileName) {
     return fileName.replaceAll("\\.[^.]+$", ""); // remove extension
 }
}
