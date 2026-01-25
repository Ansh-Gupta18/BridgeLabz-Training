package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

// Apply annotation to class
@Author(name = "Author Name")
public class AuthorDemo {

    public static void main(String[] args) {

        // Get Class object
        Class<AuthorDemo> cls = AuthorDemo.class;

        // Check if annotation is present
        if (cls.isAnnotationPresent(Author.class)) {

            // Retrieve annotation
            Author author = cls.getAnnotation(Author.class);

            // Display annotation value
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("Author annotation not found");
        }
    }
}
