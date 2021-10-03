package baseline;

import java.util.Scanner;

public class Solution28 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int total=0;

        for (int i = 1; i<=5; i++){
         // ask user to enter number
            System.out.print("Enter a number: ");
            num = in.nextInt();
            // add up all the numbers
            total+=num;
        }
        System.out.println("The total is "+total);
    }
}
