package task2_Online_payment.decorator;

import task2_Online_payment.factoryMethods.PaymentMethod;

public class PayPalPayment implements PaymentMethod { // New PayPal
    private ExternalPayPalAPI externalPayPalAPI = new ExternalPayPalAPI(); // Take old object
    private String status;
    private String email;

    public PayPalPayment(String email) { // Create constructor
        status = "Pending"; // Give a status
        this.email = email; // Give email
    }

    @Override
    public boolean processPayment(double amount) { // Check transactions
        if (externalPayPalAPI.makePayment(email, amount)) {
            status = "Success";
            return true;
        } else {
            status = "Failed";
            return false;
        }
    }

    @Override
    public String getStatus() { // Get status of transaction
        return status;
    }

    @Override
    public String getName() { // Get name of method
        return "PayPal";
    }

    public static class PayPalFactory { // Create object
        public static PaymentMethod createPayPalPayment(String email) {
            return new PayPalPayment(email);
        }
    }
}