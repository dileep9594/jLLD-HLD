package lld.strategy;


// 1. childs are having same code but parent is not having that functionality/code then we should use strategy pattern

class PaymentProcessor {
    public void processPayment(String paymentMethod, double amount) {
        if (paymentMethod.equals("creditCard")) {
            // Process credit card payment
            System.out.println("Processing credit card payment: $" + amount);
        } else if (paymentMethod.equals("paypal")) {
            // Process PayPal payment
            System.out.println("Processing PayPal payment: $" + amount);
        } else if (paymentMethod.equals("cash")) {
            // Process cash payment
            System.out.println("Accepting cash payment: $" + amount);
        } else {
            System.out.println("Invalid payment method");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment("creditCard", 50.0);
        processor.processPayment("paypal", 30.0);
        processor.processPayment("cash", 20.0);
    }
}
