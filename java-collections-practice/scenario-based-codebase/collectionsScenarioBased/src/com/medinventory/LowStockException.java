package com.medinventory;

//Thrown when item quantity is critically low
public class LowStockException extends Exception {

 public LowStockException(String message) {
     super(message);
 }
}
