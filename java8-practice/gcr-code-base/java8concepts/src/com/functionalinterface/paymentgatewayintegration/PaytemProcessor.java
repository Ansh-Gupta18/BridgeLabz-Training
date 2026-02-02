package com.functionalinterface.paymentgatewayintegration;

class PaytemProcessor implements PaymentProcessor {

    public void pay(double amount) {
        System.out.println("Paytm payment: ₹" + amount);
    }
}
