/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Leonardo Herrera
 */

package baseline;

import java.util.Scanner;

public class Solution25 {

    private static final Scanner in = new Scanner(System.in);

    public static int passwordValidator(String Str){
        int strength=0;

        //Str is only numbers and Str.length < 8
        //"password is very weak"
        // strength =  25
        if(Str.matches("^[0-9].*") && Str.length() < 8){
            System.out.println("The password " +Str+ " is a very weak password.");
            strength = 25;
        }

        //Str is only letters and Str.length < 8
        //"password is weak"
        // strength =  50
        else if(Str.matches("^[A-Za-z].*") && Str.length() < 8){
            System.out.println("The password "+Str+ " is a weak password.");
            strength = 50;
        }

        //Str contains letters and at least one number && Str.length >= 8
        //"password is strong"
        // strength = 75
        else if(Str.matches(".*[A-Za-z0-9]") && Str.length()>=8){
            System.out.println("The password "+Str+" is a strong password.");
            strength = 75;
        }

        //Str contains letters, numbers, and special characters, and Str.length >= 8
        //"password is very strong"
        // strength = 100
        else if(Str.matches(".*[A-Za-z0-9!@#$%^&*]") && Str.length()>=8){
            System.out.println("The password " +Str+ " is a very strong password.");
            strength = 100;
        }

        //Str contains none of the above
        //"password is of unknown strength"
        // 0
        else{
            System.out.println("Password is of unknown strength");
        }

        //display password strength as numeric value
        System.out.println("Password strength : "+strength);
        return strength;
    }

    public static void main(String[] args) {
        //"Enter password"
        for(int i=0; i<=4; i++) {
            System.out.print("Enter password: ");
            String pass = in.nextLine();

            //call passwordValidator
            passwordValidator(pass);
        }
    }
}

