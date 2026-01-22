package com.exceptionhandling;

public class ExceptionPropagationExample {

    static void method1() {
        // This will cause ArithmeticException
        int result = 10 / 0;
    }

    static void method2() {
        // Exception propagates to this method
        method1();
    }

    public static void main(String[] args) {

        try {
            // Exception propagates here
            method2();

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
