package baseline;

public class PaymentCalculator {

   public double months = 0;
   private double balance;
   private double payments;
   private double dailyRate;

 public void setBalance(double b){
     // set balance
     this.balance = b;
 }

 public void setPayments(double p){
     // set monthly payments
     this.payments = p;
 }

 public void setDailyRate(double apr){
     // set daily rate
     this.dailyRate = (apr/100)/365;
 }

 public int calculateMonthsUntilPaidOff(){

     //months = -(1/30) * log(1 + balance/payments * (1 - (1 + dailyRate)^30)) / log(1 + dailyRate)
     months = Math.ceil(-(1/30.0) * Math.log(1 + balance/payments * (1 - Math.pow(1 + dailyRate, 30))) / Math.log(1 + dailyRate));

     // return months
     return (int) months;
 }

}
