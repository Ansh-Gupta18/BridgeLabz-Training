package com.examresultuploader;

//Thrown when CSV format or marks are invalid
public class InvalidResultFormatException extends Exception {

 public InvalidResultFormatException(String message) {
     super(message);
 }
}
