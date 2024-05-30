package myPackage;

import java.text.DecimalFormat;

public class LoanInterestCalculator {
    public static void main(String[] args) {
        // Given data
        double loanAmount = 35000;  // Principal
        double annualRate = 0.079;  // Annual interest rate (7.9%)
        double monthlyRate = annualRate / 12;
        double monthlyPayment = 717;
        int numberOfPayments = 62;

        double remainingBalance = loanAmount;
        double totalInterest = 0;

        for (int i = 1; i <= numberOfPayments; i++) {
            double interest = remainingBalance * monthlyRate;  // Interest for this payment
            double principal = monthlyPayment - interest;  // Principal reduction

            // Update the total interest paid
            totalInterest += interest;

            // Update the remaining balance
            remainingBalance -= principal;

            // Print the details for each payment (optional, for verification purposes)
            System.out.printf("Payment #%d: Interest = %.2f, Principal = %.2f, Remaining Balance = %.2f%n",
                              i, interest, principal, remainingBalance);
        }

        // Output the total interest paid
        System.out.printf("Total Interest Paid over %d months: %.2f%n", numberOfPayments, totalInterest);
    }
}

