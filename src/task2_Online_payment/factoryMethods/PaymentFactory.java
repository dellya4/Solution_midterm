package task2_Online_payment.factoryMethods;

import task2_Online_payment.adapter.PayPalPayment;
import task2_Online_payment.payment.*;

public class PaymentFactory { // Class for factory method
    public static PaymentMethod getPaymentMethod(int paymentMethod, String date) {
        switch (paymentMethod) { // Create payment which we need
            case 1:
                return CreditCardPayment.CreditCardFactory.createCreditCardPayment();
            case 2:
                return PayPalPayment.PayPalFactory.createPayPalPayment(date);
            case 3:
                return CryptoPayment.CryptoFactory.createCryptoPayment();
            default:
                throw new IllegalArgumentException("Invalid Payment Method");
        }
    }
}
