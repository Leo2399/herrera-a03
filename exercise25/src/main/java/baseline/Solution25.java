/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Leonardo Herrera
 */

package baseline;

import java.util.Scanner;

public class Solution25 {

    private static final Scanner in = new Scanner(System.in);

    public static void passwordValidator(String Str){
        //Str is only numbers and Str.length < 8
        //"password is very weak"
        // strength =  25

        //Str is only letters and Str.length < 8
        //"password is weak"
        // strength =  50

        //Str contains letter snd at least one number && Str.length >= 8
        //"password is strong"
        // strength = 75

        //Str contains letters, numbers, and special characters, and Str.length >= 8
        //"password is very strong"
        // strength = 100

        //Str contains none of the above
        //"password is of unknown strength"
        // 0

        //display password strength as numeric value
    }

    public static void main(String[] args) {
        //"Enter password"
        //call passwordValidator

    }
}

