package baseline;

import java.util.Scanner;

public class Solution31 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        boolean status = false;
        String age = "";
        String HR = "";

        //use try and catch loop to make sure you can't continue without a number
        while (true) {
            try {

                //ask for age
                System.out.print("Enter age: ");
                age = in.nextLine();

                //ask for heart rate
                System.out.print("Enter resting heart rate: ");
                HR = in.nextLine();

                //print age and heart rate
                System.out.println("Resting Pulse: " + HR + "\t" + "Age: " + age);

                //set up table headers
                System.out.println("Intensity | Rate");
                System.out.println("-------------------");

                status = true;
            }
            catch (ArithmeticException|NumberFormatException e){
                System.out.println("Invalid inputs. Please enter numbers for age and heart rate.");
            }
            if(status){

                //call heartRate(age, heartrate)
                heartRate(Integer.parseInt(age), Integer.parseInt(HR));
                break;
            }
        }
    }

    public static void heartRate(int age, int restHR){
        int intensity = 0;
        //heart rate <= 95
        for(intensity=55; intensity<=95; intensity+=5){
             int targetHR = (((220 - age) - restHR) * intensity/100) + restHR;
            System.out.println(intensity+"% \t | \t"+targetHR+" bpm");
        }
        //targetHR = (((220 - age) - restingHR) * intensity) + restingHR
        //intensity incremented by 5
    }

    }

