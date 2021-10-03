package baseline;

import java.util.Scanner;

public class Solution26 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PaymentCalculator pay = new PaymentCalculator();

        // prompt user for the balance
        System.out.print("What is your balance? ");
        double balance = in.nextDouble();
        pay.setBalance(balance);

        // prompt user for APR as a percent
        // dailyRate = APR/365
        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = in.nextDouble();
        pay.setDailyRate(apr);

        // prompt user for monthly payments
        System.out.print("What is the monthly payment you can make? ");
        double payments = in.nextDouble();
        pay.setPayments(payments);

        // calculate months until paid off
        // print the number of months left until card is paid off
        System.out.println("It will take you "+pay.calculateMonthsUntilPaidOff()+" months to pay off this card");
    }
}
