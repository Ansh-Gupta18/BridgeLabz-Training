package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define container annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Step 2: Define repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)   // link to container
@interface BugReport {
    String description();
}

// Step 3: Apply repeatable annotation multiple times
class SoftwareModule {

    @BugReport(description = "NullPointerException on line 45")
    @BugReport(description = "ArrayIndexOutOfBoundsException in input handling")
    public void processData() {
        System.out.println("Processing data...");
    }
}

// Step 4: Retrieve and print all bug reports using reflection
public class RepeatableAnnotationTest {
    public static void main(String[] args) throws Exception {

        Method method = SoftwareModule.class.getMethod("processData");

        // Get all BugReport annotations (repeatable)
        BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

        System.out.println("Bug Reports for method: " + method.getName());
        for (BugReport br : bugReports) {
            System.out.println("- " + br.description());
        }
    }
}
