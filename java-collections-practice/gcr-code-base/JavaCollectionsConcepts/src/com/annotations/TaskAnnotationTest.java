package com.annotations;
import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define custom annotation
@Retention(RetentionPolicy.RUNTIME)  // available at runtime for reflection
@Target(ElementType.METHOD)          // can be applied to methods
@interface TaskInfo {
    String priority();
    String assignedTo();
}

// Step 2: Apply annotation to a method
class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ansh")
    public void completeTask() {
        System.out.println("Task is being completed...");
    }

    @TaskInfo(priority = "Low", assignedTo = "Ravi")
    public void reviewTask() {
        System.out.println("Task is under review...");
    }
}

// Step 3: Retrieve annotation using Reflection
public class TaskAnnotationTest {
    public static void main(String[] args) throws Exception {
        TaskManager tm = new TaskManager();

        // Get all methods of TaskManager
        Method[] methods = TaskManager.class.getDeclaredMethods();

        for (Method method : methods) {
            // Check if @TaskInfo is present
            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo info = method.getAnnotation(TaskInfo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + info.priority());
                System.out.println("Assigned To: " + info.assignedTo());
                System.out.println();
            }
        }
    }
}

