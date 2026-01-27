package com.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

// Step 1: Define @CacheResult annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

// Step 2: Create a class with an expensive method
class ExpensiveService {

    @CacheResult
    public long fibonacci(int n) {
        System.out.println("Computing fibonacci(" + n + ")...");
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long normalMethod(int n) {
        System.out.println("Normal method executed for " + n);
        return n * 2;
    }
}

// Step 3: Cache executor to handle caching automatically
class CacheExecutor {

    private final Object target;
    private final Map<String, Object> cache = new HashMap<>();

    public CacheExecutor(Object target) {
        this.target = target;
    }

    public Object invoke(String methodName, Object... args) throws Exception {
        Method method = null;
        for (Method m : target.getClass().getDeclaredMethods()) {
            if (m.getName().equals(methodName)) {
                method = m;
                break;
            }
        }

        if (method == null) throw new NoSuchMethodException(methodName);

        // Generate cache key based on method name + arguments
        StringBuilder keyBuilder = new StringBuilder(methodName);
        for (Object arg : args) {
            keyBuilder.append("_").append(arg);
        }
        String key = keyBuilder.toString();

        // Check if method is annotated with @CacheResult
        if (method.isAnnotationPresent(CacheResult.class)) {
            if (cache.containsKey(key)) {
                System.out.println("Returning cached result for " + key);
                return cache.get(key);
            } else {
                Object result = method.invoke(target, args);
                cache.put(key, result);
                return result;
            }
        } else {
            // Not cached, just invoke
            return method.invoke(target, args);
        }
    }
}

// Step 4: Test caching system
public class CacheResultTest {
    public static void main(String[] args) throws Exception {

        ExpensiveService service = new ExpensiveService();
        CacheExecutor executor = new CacheExecutor(service);

        System.out.println("First call: " + executor.invoke("fibonacci", 10));
        System.out.println("Second call: " + executor.invoke("fibonacci", 10)); // cached
        System.out.println("Call normalMethod: " + executor.invoke("normalMethod", 5));
        System.out.println("Second call normalMethod: " + executor.invoke("normalMethod", 5)); // not cached
    }
}

