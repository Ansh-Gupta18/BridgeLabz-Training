package com.reflection;

import java.lang.reflect.Method;

//Sample class whose methods will be timed
class Calculate{

 public int add(int a, int b) {
     return a + b;
 }

 public void slowOperation() {
     try {
         Thread.sleep(500); // simulate delay
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
 }
}

 class MethodTimingDemo {

 // Method to measure execution time dynamically
 public static Object measureTime(
         Object obj,
         String methodName,
         Class<?>[] paramTypes,
         Object[] args) {

     try {
         Class<?> clazz = obj.getClass();
         Method method = clazz.getMethod(methodName, paramTypes);

         long startTime = System.nanoTime(); // start time

         Object result = method.invoke(obj, args); // invoke method

         long endTime = System.nanoTime(); // end time

         System.out.println("Method '" + methodName + "' executed in "
                 + (endTime - startTime) + " ns");

         return result;

     } catch (Exception e) {
         throw new RuntimeException("Method timing failed", e);
     }
 }

 public static void main(String[] args) {

     Calculate calc = new Calculate();

     // Measure add()
     measureTime(
             calc,
             "add",
             new Class[]{int.class, int.class},
             new Object[]{5, 10}
     );

     // Measure slowOperation()
     measureTime(
             calc,
             "slowOperation",
             new Class[]{},
             new Object[]{}
     );
 }
}
