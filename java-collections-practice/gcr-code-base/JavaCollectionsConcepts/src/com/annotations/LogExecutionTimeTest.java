package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define the annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime
@Target(ElementType.METHOD)          // applicable to methods
@interface LogExecutionTime {}

// Step 2: Apply annotation to methods
class PerformanceTasks {

    @LogExecutionTime
    public void computeNumbers() {
        long sum = 0;
        for (int i = 1; i <= 1_000_000; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    @LogExecutionTime
    public void processStrings() {
        String result = "";
        for (int i = 0; i < 100_000; i++) {
            result += "x"; // intentionally slow
        }
        System.out.println("String length: " + result.length());
    }

    public void normalMethod() {
        System.out.println("This method is not timed.");
    }
}

// Step 3: Execute methods and measure time using reflection
public class LogExecutionTimeTest {
    public static void main(String[] args) throws Exception {

        PerformanceTasks tasks = new PerformanceTasks();
        Method[] methods = PerformanceTasks.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println("Executing: " + method.getName());
                long start = System.nanoTime();

                method.invoke(tasks);  // execute method

                long end = System.nanoTime();
                long duration = end - start;
                System.out.println("Execution time: " + duration + " ns\n");
            }
        }
    }
}
