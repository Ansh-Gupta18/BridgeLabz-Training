package com.callcenter;

public class Main {
    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();

        Customer c1 = new Customer(101, "Rahul", false);
        Customer c2 = new Customer(102, "Anita", true);
        Customer c3 = new Customer(103, "Vikas", false);
        Customer c4 = new Customer(102, "Anita", true);

        callCenter.receiveCall(c1);
        callCenter.receiveCall(c2);
        callCenter.receiveCall(c3);
        callCenter.receiveCall(c4);

        callCenter.handleCall();
        callCenter.handleCall();
        callCenter.handleCall();

        callCenter.showCallHistory();
    }
}
