package repitition_structure;

import java.util.Scanner;

/*
* WHILE LOOP
* Condition Controlled, Pretest, Excecution
 */

public class GrossPayInputValidator {

    public static void main(String[] args){

        // Initialize the known variables
        int payRate = 15;
        int maxHours = 40;

        // Get input for unknown variables
        System.out.println("How many hours did employee work this cycle?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        // Validate input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry, Hours must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        // Calculate gross pay
        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: $" + gross);
    }
}
