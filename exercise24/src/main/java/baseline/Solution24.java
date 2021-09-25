package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner  in = new Scanner(System.in);

    static void isAnagram(String Str1, String Str2){

        boolean status = true;

        // if the lengths the strings don't match, return false
        if(Str1.length() != Str2.length()){
             status  = false;
        }
        char arr1[] = Str1.toCharArray();
        char arr2[] = Str2.toCharArray();

        // check both strings for same characters
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        status = Arrays.equals(arr1, arr2);

        // return true if they are equal
        if(status){
            System.out.println("\""+ Str1+"\"" + " and " + "\""+Str2+"\"" + " are anagrams.");
        }
        else{
            System.out.println(Str1+" and "+Str2+" are not anagrams");
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
