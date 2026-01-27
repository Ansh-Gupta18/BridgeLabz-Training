package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define @Todo annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime
@Target(ElementType.METHOD)          // applicable to methods
@interface Todo {
    String task();                     // description of the task
    String assignedTo();               // developer responsible
    String priority() default "MEDIUM"; // default priority
}

// Step 2: Apply @Todo annotation to multiple methods
class ProjectFeatures {

    @Todo(task = "Implement login functionality", assignedTo = "Ansh", priority = "HIGH")
    public void loginFeature() {
        System.out.println("Login feature is under development...");
    }

    @Todo(task = "Add payment gateway", assignedTo = "Ravi")
    public void paymentFeature() {
        System.out.println("Payment feature is pending...");
    }

    public void completedFeature() {
        System.out.println("This feature is already completed.");
    }
}

// Step 3: Retrieve and print all @Todo annotations
public class TodoAnnotationTest {
    public static void main(String[] args) throws Exception {

        Method[] methods = ProjectFeatures.class.getDeclaredMethods();

        System.out.println("Pending Tasks:");

        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo todo = method.getAnnotation(Todo.class);
                System.out.println("- Method: " + method.getName());
                System.out.println("  Task: " + todo.task());
                System.out.println("  Assigned To: " + todo.assignedTo());
                System.out.println("  Priority: " + todo.priority());
                System.out.println();
            }
        }
    }
}
