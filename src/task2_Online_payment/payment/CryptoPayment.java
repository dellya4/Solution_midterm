package task2_Online_payment.payment;

import task2_Online_payment.factoryMethods.PaymentMethod;

public class CryptoPayment implements PaymentMethod { // Crypto class
    private String status;

    public CryptoPayment() { // Create constructor
        this.status = "Pending"; // Give a status
    }

    @Override
    public boolean processPayment(double amount) { // Check transactions
        System.out.println("Processing Crypto Payment...");
        if (amount < 1000 || amount > 100000000) {
            System.out.println("Crypto limit exceeded!");
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
        return "Crypto";
    }

    public static class CryptoFactory { // Create object
        public static PaymentMethod createCryptoPayment(){
            return new CryptoPayment();
        }
    }
}
