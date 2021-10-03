package baseline;

public class Solution30 {

    public static void main(String[] args) {
        //for loop for the columns
        for(int i=1; i<=12; i++){
            //for loop for the rows
            for(int j=1; j<=12; j++){
                //print the table
                System.out.print((i*j+"\t"));
            }
            System.out.println();
        }
    }
}
