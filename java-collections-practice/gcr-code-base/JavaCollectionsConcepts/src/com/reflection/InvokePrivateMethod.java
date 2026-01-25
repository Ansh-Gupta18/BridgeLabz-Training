package com.reflection;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {

    public static void main(String[] args) {
        try {
            // Create object
            Calculator calc = new Calculator();

            // Get Class object
            Class<?> cls = calc.getClass();

            // Access private method
            Method method = cls.getDeclaredMethod("multiply", int.class, int.class);

            // Make private method accessible
            method.setAccessible(true);

            // Invoke private method
            int result = (int) method.invoke(calc, 5, 4);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
