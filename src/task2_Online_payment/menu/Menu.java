package task2_Online_payment.menu;

import java.util.Scanner;
import task2_Online_payment.factoryMethods.*;
import task2_Online_payment.transaction.*;

public class Menu {
    private static final Scanner sc = new Scanner(System.in);

    public static void start() {
        boolean running = true;
        System.out.println("  Welcome to Payment Gateway!"); // Hello words
        while (running) {
            showMenu(); // Show all payment methods
            int choice = sc.nextInt();

            switch (choice) {
                case 1, 2, 3 -> processPayment(choice); // Create payment
                case 4 -> TransactionLogger.showHistory(); // Show history
                case 0 -> { // Finish
                    running = false;
                    System.out.println("Thank you for using Payment Gateway!");
                }
                default -> System.out.println("Invalid option. Please try again."); // Mistake
            }
        }
    }

    private static void showMenu() {
        System.out.println("""
                Select payment method:
                1. Credit Card
                2. PayPal
                3. Cryptocurrency
                4. Show Transaction History
                0. Exit""");
    }

    private static void processPayment(int methodChoice) {
        String extraData = "";
        if (methodChoice == 2) { // Give email to PayPal
            System.out.print("Enter PayPal email: ");
            extraData = sc.nextLine();
        }

        PaymentMethod method; // Create method
        try {
            method = PaymentFactory.getPaymentMethod(methodChoice, extraData);
        } catch (IllegalArgumentException e) { // Save to mistake
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("Enter payment amount (₸): "); // Add amount
        double amount = sc.nextDouble();

        boolean success = method.processPayment(amount); // Status of transaction
        TransactionLogger.logTransaction(method.getName(), amount, method.getStatus()); // Add to history

        if (success) {
            System.out.println("Payment Successful!");
        } else {
            System.out.println("Payment Failed!");
        }
    }
}
