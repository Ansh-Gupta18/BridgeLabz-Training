package com.reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

// POJO class
class Student1 {

    int id;
    String name;
    double marks;

    public Student1() {
    }

    @Override
    public String toString() {
        return "Student1{id=" + id + ", name=" + name + ", marks=" + marks + "}";
    }
}

public class ObjectMapperDemo {

    public static Object toObject(Class<?> clazz, Map<String, Object> map) {
        try {
            Object obj = clazz.getConstructor().newInstance();

            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);

                if (map.containsKey(field.getName())) {
                    field.set(obj, map.get(field.getName()));
                }
            }
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("id", 101);
        data.put("name", "Ansh");
        data.put("marks", 88.5);

        // ✅ USE Student1
        Student1 student = (Student1) toObject(Student1.class, data);
        System.out.println(student);
    }
}
