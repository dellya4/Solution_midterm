package task2_Online_payment.decorator;

public class ExternalPayPalAPI { // Old PayPal
    public boolean makePayment(String email, double amount) {
        System.out.println("Connecting to PayPal API...");
        return !email.isEmpty() && amount >= 500 && amount <= 5000000; // Check of condition
    }
}
