package com.reflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 1️⃣ Interface
interface Greeting {
    void sayHello(String name);
}

// 2️⃣ Real implementation
class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}

// 3️⃣ Invocation Handler (Proxy Logic)
class LoggingHandler implements InvocationHandler {

    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 🔹 Logging before method execution
        System.out.println("Calling method: " + method.getName());

        // 🔹 Call actual method
        return method.invoke(target, args);
    }
}

// 4️⃣ Main class
public class LoggingProxyDemo {

    public static void main(String[] args) {

        Greeting realObject = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxyObject = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class[]{Greeting.class},
                new LoggingHandler(realObject)
        );

        // Method call intercepted
        proxyObject.sayHello("Ansh");
    }
}
