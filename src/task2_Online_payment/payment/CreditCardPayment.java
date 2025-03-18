package task2_Online_payment.payment;

import task2_Online_payment.factoryMethods.PaymentMethod;

public class CreditCardPayment implements PaymentMethod { // Credit card class
    private String status;

    public CreditCardPayment(){ // Create constructor
        this.status= "Pending"; // Give a status
    }

    @Override
    public boolean processPayment(double amount) { // Check transactions
        System.out.println("Processing Credit Card Payment...");
        if (amount < 100 || amount > 1000000) {
            System.out.println("Credit limit exceeded!");
            status = "Failed";
            return false;
        }
        status = "Success";
        return true;
    }

    @Override
    public String getStatus() { // Get status of transaction
        return status;
    }

    @Override
    public String getName() { // Get name of method
        return "Credit Card";
    }

    public static class CreditCardFactory { // Create object
        public static PaymentMethod createCreditCardPayment(){
            return new CreditCardPayment();
        }
    }
}
