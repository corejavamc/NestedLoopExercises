/*
 * This program will compute the future values if one is to save $100 per month with
 * an interest rate of 5%, 5.5%, or 6% per year for 3 years.
 */

import java.text.NumberFormat;
        import java.text.NumberFormat;
        import java.util.Scanner;

public class FutureValues {
    public static void main(String args[]) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        double futureValue = 0.0, monthlyInterest;
        int months, monthly = 100;
        String row = "Year         5%          5.5%          6.0%";
        System.out.println(row);

        for (int year = 1; year <= 3; year++) {
            row = year + "\t\t";
            months = 12 * year;

            for (double rate = 5.0; rate <= 6.0; rate += 0.5) {
                monthlyInterest = rate / 12 / 100;
                futureValue = 0.0;
                for (int i = 1; i <= months; i++) {
                    futureValue = (futureValue + monthly) * (1 + monthlyInterest);
                }

                row = row + currency.format(futureValue) + "     ";

            }
            System.out.println(row);
        }

    }
}
