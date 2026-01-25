package com.reflection;

import java.lang.reflect.Field;

//Sample POJO class
class Student2 {

 int id;
 String name;
 double marks;

 public Student2(int id, String name, double marks) {
     this.id = id;
     this.name = name;
     this.marks = marks;
 }
}

public class JsonReflectionDemo {

 // Method to convert object to JSON-like string
 public static String toJson(Object obj) {
     if (obj == null) return "null";

     StringBuilder json = new StringBuilder();
     Class<?> clazz = obj.getClass();

     json.append("{");

     Field[] fields = clazz.getDeclaredFields();
     for (int i = 0; i < fields.length; i++) {
         Field field = fields[i];
         field.setAccessible(true);

         try {
             json.append("\"").append(field.getName()).append("\": ");

             Object value = field.get(obj);

             if (value instanceof String) {
                 json.append("\"").append(value).append("\"");
             } else {
                 json.append(value);
             }

             if (i < fields.length - 1) {
                 json.append(", ");
             }

         } catch (IllegalAccessException e) {
             e.printStackTrace();
         }
     }

     json.append("}");
     return json.toString();
 }

 public static void main(String[] args) {

     Student2 student = new Student2(101, "Ansh", 90.5);

     String json = toJson(student);
     System.out.println(json);
 }
}

