package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String name;
        ArrayList<String> storedName = new ArrayList<>();
        Random winner = new Random();

        //while string input is not empty
        do{
            System.out.print("Enter a name: ");
            name = in.nextLine();

            //input name and store into an array list
            storedName.add(name);

            //pick random name as the winner
            //display winner
            if(name.length()==0){
                System.out.println("The winner is..... "+storedName.get(winner.nextInt(storedName.size())));
            }
        }while(name.length()!=0);
    }
}
