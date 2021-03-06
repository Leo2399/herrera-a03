/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner  in = new Scanner(System.in);

    public static boolean isAnagram(String Str1, String Str2){

        //boolean status = true;

        char arr1[] = Str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char arr2[] = Str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        // check both strings for same characters
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // return true if they are equal
        if(Arrays.equals(arr1, arr2)){
            System.out.println("\""+ Str1+"\"" + " and " + "\""+Str2+"\"" + " are anagrams.");
            return true;
        }
        else{
            System.out.println("\""+Str1+"\""+" and "+"\""+Str2+"\""+" are not anagrams");
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        // prompt user for both strings
        System.out.println("Enter the first string: ");
        String first = in.nextLine();

        System.out.println("Enter the second string: ");
        String second = in.nextLine();

        // call isAnagram function
        isAnagram(first, second);
    }
}
