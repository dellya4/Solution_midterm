package task2_Online_payment.factoryMethods;

public interface PaymentMethod { // Interface for factory methods

    public boolean processPayment(double amount);
    public String getStatus();
    public String getName();
}
