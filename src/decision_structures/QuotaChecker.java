package decision_structures;

import java.util.Scanner;
/*
* if-else Statement
* All salespeople are expected 10 sales per week
* success = congratulatory message
* fail = short this many sales
*/

public class QuotaChecker {
    public static void main(String[] args){

        // initialize known values
        int quota = 10;

        // get unknown
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for the bonus earners
        if(sales >= quota){
            System.out.println("Congrats, You met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("didnt make quota. short " + salesShort + " sales short");
        }
    }
}
