package baseline;

import java.util.Random;
import java.util.Scanner;

public class Solution33 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //store the strings in an array
        String Magic8[] = {"Yes", "No", "Maybe", "Ask again later"};

        //make a random number generator equal to the number of strings in the array
        Random roll = new Random();

        //ask the question
        System.out.println("What is your question? ");
        String question = in.nextLine();

        //display random answer
        System.out.println(Magic8[roll.nextInt(Magic8.length)]);
    }
}
