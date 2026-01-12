 package com.callcenter;

 import java.util.*;

 public class CallCenter {

     // Normal customer queue
     private Queue<Customer> normalQueue = new LinkedList<>();

     // VIP customer priority queue
     private PriorityQueue<Customer> vipQueue =
             new PriorityQueue<>((c1, c2) -> c1.getCustomerId() - c2.getCustomerId());

     // HashMap to track call count
     private HashMap<Integer, Integer> callCountMap = new HashMap<>();

     // Add incoming call
     public void receiveCall(Customer customer) {

         // Update call count
         callCountMap.put(customer.getCustomerId(),
                 callCountMap.getOrDefault(customer.getCustomerId(), 0) + 1);

         // Add to appropriate queue
         if (customer.isVIP()) {
             vipQueue.add(customer);
             System.out.println(customer.getName() + " (VIP) added to VIP queue");
         } else {
             normalQueue.add(customer);
             System.out.println(customer.getName() + " added to normal queue");
         }
     }

     // Process next call
     public void handleCall() {
         Customer customer;

         if (!vipQueue.isEmpty()) {
             customer = vipQueue.poll();
             System.out.println("Handling VIP customer: " + customer.getName());
         } else if (!normalQueue.isEmpty()) {
             customer = normalQueue.poll();
             System.out.println("Handling customer: " + customer.getName());
         } else {
             System.out.println("No calls in queue");
         }
     }

     // Display call count
     public void showCallHistory() {
         System.out.println("\nCustomer Call Count:");
         for (Map.Entry<Integer, Integer> entry : callCountMap.entrySet()) {
             System.out.println("Customer ID " + entry.getKey() +
                     " called " + entry.getValue() + " times");
         }
     }
 }
