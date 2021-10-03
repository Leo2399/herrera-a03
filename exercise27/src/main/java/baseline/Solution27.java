/*
*  UCF COP3330 Fall 2021 Assignment 3 Solutions
*  Copyright 2021 Leonardo Herrera
*/

package baseline;
import java.util.Scanner;

public class Solution27 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //prompt user for first name
        System.out.print("Enter the first name: ");
        String firstName = in.nextLine();

        //prompt user for last name
        System.out.print("Enter the last name: ");
        String lastName = in.nextLine();

        //prompt user for zip code
        System.out.print("Enter the ZIP code: ");
        String zip = in.nextLine();

        //prompt user for id code
        System.out.print("Enter the employee ID: ");
        String id = in.nextLine();

        //validate inputs
        validateInput(firstName, lastName,  id, zip);
    }

    public static boolean inputFirstName(String first){

        boolean status = true;

        //if first name < 2
        //first name is invalid
        if(first.length()<2){
            System.out.println("The first name must be at least 2 characters long.");
            status = false;
        }

        //else if first name is empty
        //first name is invalid
        if(first.length()==0){
            System.out.println("The first name must be filled in.");
            status = false;
        }

        //otherwise, first name is valid
        return status;
    }

    public static boolean inputLastName(String last){

        boolean status = true;
        //if last name < 2
        //last name is invalid
        if(last.length()<2){
            System.out.println("The last name must be at least 2 characters long.");
            status = false;
        }

        //else if last name is empty
        //last name is invalid
        if(last.length()==0){
            System.out.println("The last name must be filled in.");
            status = false;
        }

        //otherwise, last name is valid
        return status;

    }

    public static boolean inputID(String Id){

        //if the ID is in AA-1234 format
        //Id is valid
        if(Id.matches("^[a-zA-Z]{2}[-][0-9]{4}.*")){
            return true;
        }

        //otherwise, Id is valid
        else{
            System.out.println("The employee must be in the format of AA-1234");
            return false;
        }
    }

    public static boolean inputZipCode(String zip){
        //if zip is a number and is a 5-digit number
        //zip is valid
        if(zip.matches("^[0-9].*") && zip.length()==5){
            return true;
        }

        //otherwise, zip is valid
        else{
            System.out.println("The zipcode must be a 5 digit number");
            return false;
        }
    }

    public static boolean validateInput(String first, String last, String id, String zip){
        boolean status = false;

        //check to make sure that all the validation rules are true
        boolean firstname = inputFirstName(first);
        boolean lastname = inputLastName(last);
        boolean empId = inputID(id);
        boolean zipcheck = inputZipCode(zip);

        if(firstname && lastname && empId && zipcheck){
            //print "no errors" if they are all valid
            System.out.println("There were no errors found.");
            status = true;
        }
        return status;
    }
}
