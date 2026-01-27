package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Step 1: Define class-level annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)  // applicable to methods
@interface RoleAllowed {
    String value();  // role required to access
}

// Step 2: Define a service with role-restricted methods
class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully.");
    }

    @RoleAllowed("ADMIN")
    public void accessReports() {
        System.out.println("Accessing admin reports...");
    }

    public void viewDashboard() {
        System.out.println("Dashboard viewed by any user.");
    }
}

// Step 3: Simulate role-based access
class UserContext {
    private String role;

    public UserContext(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

// Step 4: Test role-based access using reflection
public class RoleBasedAccessTest {
    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        // Simulate users
        UserContext adminUser = new UserContext("ADMIN");
        UserContext normalUser = new UserContext("USER");

        // Test access
        invokeMethodWithRole(service, "deleteUser", adminUser);   // Allowed
        invokeMethodWithRole(service, "deleteUser", normalUser);  // Denied
        invokeMethodWithRole(service, "viewDashboard", normalUser); // Allowed (no restriction)
    }

    // Helper method to check role and invoke method
    public static void invokeMethodWithRole(Object obj, String methodName, UserContext user) throws Exception {
        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed ra = method.getAnnotation(RoleAllowed.class);
            if (ra.value().equals(user.getRole())) {
                method.invoke(obj);
            } else {
                System.out.println("Access Denied! User role '" + user.getRole() + "' cannot access " + methodName);
            }
        } else {
            // No restriction, allow execution
            method.invoke(obj);
        }
    }
}

