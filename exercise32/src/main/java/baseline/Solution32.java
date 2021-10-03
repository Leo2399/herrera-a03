package baseline;

import java.util.Scanner;

public class Solution32 {
    private static Scanner in = new Scanner(System.in);
    public static String tooLow = "Too low. Guess again: ";
    public static String tooHigh = "Too high. Guess again: ";

    public static void main(String[] args) {

        String playAgain = "Y";

        //"Let's play the Guess the number game!"
        System.out.println("Let's play the Guess the number game!");
        while(playAgain.matches("^[Yy].*")) {
            //ask user for difficulty
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int choice = in.nextInt();

            switch (choice) {

                //if choice is 1, guess from 1-10
                case 1:
                    easy();
                    break;

                //if choice is 2, guess from 1-100
                case 2:
                    medium();
                    break;

                //if choice is 3, guess from 1-1000
                case 3:
                    hard();
                    break;
            }

            //ask if you want to play again
            System.out.print("Do you wish to play again?(Y/N) ");
            playAgain = in.next();

            if(playAgain.matches("^[Nn].*")){
                break;
            }
        }
    }

    public static void easy(){
        //guess from 1-10
        int randNum = (int) (Math.random()*10 + 1);
        int guess=0;
        int totalGuesses=0;

        System.out.print("I have my number. What's your guess? ");

        while (guess!=randNum){
            guess = in.nextInt();
            totalGuesses++;

            //if too low guess again
            if(guess<randNum){
                System.out.print(tooLow);
            }

            //if too high guess again
            else if(guess>randNum){
                System.out.print(tooHigh);
            }

            //if guessed right return number of guesses
            else if(guess==randNum){
                System.out.println("Congrats! You got it in "+totalGuesses+" guesses.");
            }
        }
    }

    public static void medium(){

        //guess from 1-100
        int randNum = (int) (Math.random()*100 + 1);
        int guess = 0;
        int totalGuesses = 0;

        System.out.print("I have my number. What's your guess: ");
        while(guess!=randNum){
            guess = in.nextInt();
            totalGuesses++;

            //if too low guess again
            if(guess<randNum){
                System.out.print(tooLow);
            }

            //if too high guess again
            else if(guess>randNum){
                System.out.print(tooHigh);
            }

            //if guessed right return number of guesses
            else if(guess==randNum){
                System.out.println("Congrats! You got in "+totalGuesses+" guesses.");
            }
        }
    }

    public static void hard(){
        int randNum = (int) (Math.random()*1000 + 1);
        int guess = 0;
        int totalGuesses = 0;

        //guess from 1-1000
        System.out.print("I have my number. What's your guess: ");

        while(guess!=randNum){
            guess = in.nextInt();
            totalGuesses++;

            //if too low guess again
            if(guess<randNum){
                System.out.print(tooLow);
            }

            //if too high guess again
            else if(guess>randNum){
                System.out.print(tooHigh);
            }

            //if guessed right return number of guesses
            else if(guess==randNum){
                System.out.println("Congrats! You got it in "+totalGuesses+" guesses.");
            }
        }
    }
}
