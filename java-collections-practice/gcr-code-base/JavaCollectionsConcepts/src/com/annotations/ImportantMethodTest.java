package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime for reflection
@Target(ElementType.METHOD)          // applicable to methods
@interface ImportantMethod {
    String level() default "HIGH";   // optional parameter with default value
}

// Step 2: Apply annotation to methods
class ProjectTasks {

    @ImportantMethod
    public void deployApp() {
        System.out.println("Deploying the application...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void codeReview() {
        System.out.println("Reviewing code...");
    }

    public void routineTask() {
        System.out.println("Performing routine task...");
    }
}

// Step 3: Retrieve annotated methods using reflection
public class ImportantMethodTest {
    public static void main(String[] args) throws Exception {

        Method[] methods = ProjectTasks.class.getDeclaredMethods();

        System.out.println("Annotated Methods:");

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);
                System.out.println("- Method: " + method.getName() + ", Level: " + im.level());
            }
        }
    }
}
