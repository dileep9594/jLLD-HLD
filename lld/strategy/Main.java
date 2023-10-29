package lld.strategy;
import lld.strategy.CashPayment;


public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCardProcessor = new PaymentProcessor(new CreditCardPayment());
        PaymentProcessor paypalProcessor = new PaymentProcessor(new PayPalPayment());
        PaymentProcessor cashProcessor = new PaymentProcessor(new CashPayment());

        creditCardProcessor.processPayment(50.0);
        paypalProcessor.processPayment(30.0);
        cashProcessor.processPayment(20.0);
    }
}