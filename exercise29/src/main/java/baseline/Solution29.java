package baseline;

import java.util.Scanner;

public class Solution29 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int years;
        boolean status = false;
        while(true){
            try{
                //ask for rate of return
                System.out.print("What is the rate of return? ");
                String r = in.nextLine();
                
                years = 72/Integer.parseInt(r);

                //print the amount of years to double your investment
                System.out.println("It will take "+years+ " years to double your initial investment.");
                status = true;
            }

            //if r is 0 or if r is not a number
            //r is invalid, ask for rate of return again
            catch (NumberFormatException | ArithmeticException e){
                System.out.println("Sorry. That's not a valid input.");
            }
            if(status){
                break;
            }
        }
    }
}
