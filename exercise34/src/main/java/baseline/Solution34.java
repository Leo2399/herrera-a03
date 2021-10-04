package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> employee = new ArrayList();
        System.out.println("There are 5 employees");
        //store 5 names in an array list
        employee.add("John Smith");
        employee.add("Jackie Johnson");
        employee.add("Chris Johnson");
        employee.add("Amanda Cullen");
        employee.add("Jeremy Goodwin");
        System.out.println(employee);

        //ask which name to remove
        System.out.print("Enter an employee name to remove: ");
        String delete = in.nextLine();

        //removeName
        employee.remove(delete);

        //display list again with remaining names
        System.out.println("There are 4 employees");
        System.out.println(employee);
    }
}
