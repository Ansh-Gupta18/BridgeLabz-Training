package com.reflection;

import java.lang.reflect.Field;


public class AccessPrivateField {
	 private int age = 25;
    public static void main(String[] args) {
        try {
            // Create object of Person
            AccessPrivateField p = new AccessPrivateField();

            // Get Class object
            Class<?> cls = p.getClass();

            // Access private field
            Field field = cls.getDeclaredField("age");

            // Make private field accessible
            field.setAccessible(true);

            // Modify private field value
            field.set(p, 30);

            // Retrieve private field value
            int ageValue = (int) field.get(p);

            System.out.println("Modified Age: " + ageValue);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

