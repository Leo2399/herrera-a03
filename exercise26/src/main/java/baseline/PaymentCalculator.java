package baseline;

public class PaymentCalculator {
   private int months;
   private int apr;
   private int balance;
   private int payments;
   public int dailyRate = apr/365;

 public void setCalculate(int b, int p, int apr){
     // set balance
     // set payments
     // set apr
 }

 public int calculateMonthsUntilPaidOff(){
     // months = -(1/30) * log(1 + balance/payments * (1 - (1 + dailyRate)^30)) / log(1 + dailyRate)
     // return months
 }

}
