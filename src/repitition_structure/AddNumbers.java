package repitition_structure;


/*
* DO WHILE LOOP
* use if need to run condition at least once. Condition is checked after the test
 */
import java.util.Scanner;
public class AddNumbers {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;

        do{

            System.out.println("Enter your first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter your last number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is " + sum);

            System.out.println("Would You like to Add again? Enter 1 for yes and 2 for no.");
            runAgain = scanner.nextInt();

        }while(runAgain == 1);

        scanner.close();
    }
}
