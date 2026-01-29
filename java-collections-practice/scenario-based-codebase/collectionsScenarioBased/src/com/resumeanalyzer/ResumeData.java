package com.resumeanalyzer;

//File Name: ResumeData.java
public class ResumeData {
 private String name;
 private String email;
 private String phone;
 private int keywordMatchCount;

 public ResumeData(String name, String email, String phone, int keywordMatchCount) {
     this.name = name;
     this.email = email;
     this.phone = phone;
     this.keywordMatchCount = keywordMatchCount;
 }

 public String getEmail() {
     return email;
 }

 public int getKeywordMatchCount() {
     return keywordMatchCount;
 }

 @Override
 public String toString() {
     return "Name: " + name + ", Email: " + email + ", Phone: " + phone + ", Keyword Matches: " + keywordMatchCount;
 }
}
