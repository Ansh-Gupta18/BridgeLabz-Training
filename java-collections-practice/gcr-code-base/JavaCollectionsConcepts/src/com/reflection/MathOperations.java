package com.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperations {

    // Public methods
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter method name (add / subtract / multiply): ");
            String methodName = sc.nextLine();

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // ✅ Correct way to get Class object
            Class<?> cls = MathOperations.class;

            // Create object dynamically
            Object obj = cls.getDeclaredConstructor().newInstance();

            // Get method dynamically
            Method method = cls.getMethod(methodName, int.class, int.class);

            // Invoke method dynamically
            Object result = method.invoke(obj, a, b);

            System.out.println("Result = " + result);

            sc.close();
        } catch (NoSuchMethodException e) {
            System.out.println(" Method not found!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
