package com.reflection;

import java.lang.reflect.Constructor;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        try {
            // Get Class object of same class
            Class<Student> clazz = Student.class;

            // Get constructor
            Constructor<Student> constructor =
                    clazz.getConstructor(String.class, int.class);

            // Create object dynamically (NO new keyword)
            Student student = constructor.newInstance("Ansh", 21);

            student.display();

        } catch (NoSuchMethodException e) {
            System.out.println("Constructor not found");
        } catch (InstantiationException e) {
            System.out.println("Cannot create object");
        } catch (IllegalAccessException e) {
            System.out.println("Constructor not accessible");
        } catch (java.lang.reflect.InvocationTargetException e) {
            System.out.println("Constructor threw an exception");
        }
    }
}
