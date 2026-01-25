package com.reflection;

import java.lang.reflect.Field;

public class Configuration {

    // Private static field
    private static String API_KEY = "OLD_KEY";

    public static void main(String[] args) {
        try {
            // Get Class object
            Class<?> cls = Configuration.class;

            // Get private static field
            Field field = cls.getDeclaredField("API_KEY");

            // Allow access to private field
            field.setAccessible(true);

            // Modify static field (object = null)
            field.set(null, "NEW_SECRET_API_KEY");

            // Retrieve and print updated value
            String value = (String) field.get(null);
            System.out.println("Updated API_KEY: " + value);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
