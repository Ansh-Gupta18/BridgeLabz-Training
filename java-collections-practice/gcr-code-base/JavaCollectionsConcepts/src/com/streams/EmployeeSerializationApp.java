package com.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSerializationApp {

    // Employee class (Serializable)
    static class Employee implements Serializable {

        private static final long serialVersionUID = 1L;

        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee [ID=" + id +
                    ", Name=" + name +
                    ", Department=" + department +
                    ", Salary=" + salary + "]";
        }
    }

    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {

        // Create employee list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Ansh", "IT", 55000));
        employeeList.add(new Employee(102, "Rahul", "HR", 45000));
        employeeList.add(new Employee(103, "Neha", "Finance", 60000));

        // Serialize
        serializeEmployees(employeeList);

        // Deserialize
        deserializeEmployees();
    }

    // Method to serialize employees
    private static void serializeEmployees(List<Employee> employees) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(employees);
            System.out.println("Employees saved successfully.");

        } catch (IOException e) {
            System.out.println("Serialization error.");
            e.printStackTrace();
        }
    }

    // Method to deserialize employees
    private static void deserializeEmployees() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            List<Employee> employees =
                    (List<Employee>) ois.readObject();

            System.out.println("\nRetrieved Employee Details:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("Deserialization error.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
            e.printStackTrace();
        }
    }
}
