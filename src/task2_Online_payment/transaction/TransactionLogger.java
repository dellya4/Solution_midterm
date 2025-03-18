package task2_Online_payment.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionLogger {
    private static List<String> history = new ArrayList<String>(); // Create history list
    private static int transactionID = 1; // ID of transaction

    public static void logTransaction(String method, double amount, String status) { // Add to history
        history.add(transactionID++ + "\t" + method + "\t" + amount+ "₸ | Status: " + status );
    }

    public static void showHistory() { // Print history
        System.out.println("Transaction history:");
        for (String s : history) {
            System.out.println(s);
        }
        System.out.println();
    }
}
