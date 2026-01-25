package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

// 1️⃣ Custom Inject Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {
}

// 2️⃣ Dependency class
class Service {
    public void serve() {
        System.out.println("Service is serving...");
    }
}

// 3️⃣ Client class (Dependency will be injected)
class Client {

    @Inject
    private Service service;

    public void doWork() {
        service.serve();
    }
}

// 4️⃣ Simple DI Container
class DIContainer {

    public static <T> T createObject(Class<T> clazz) {
        try {
            // Create main object
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Scan fields
            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {

                    // Create dependency object
                    Class<?> fieldType = field.getType();
                    Object dependency = fieldType.getDeclaredConstructor().newInstance();

                    // Inject dependency
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Dependency Injection failed", e);
        }
    }
}

// 5️⃣ Main class
public class SimpleDIDemo {

    public static void main(String[] args) {

        // Create object with dependencies injected
        Client client = DIContainer.createObject(Client.class);

        // Use injected dependency
        client.doWork();
    }
}
