package review;

import java.util.Scanner;

/*
* To begin, first i create a new package? as snake case
* Then a new class as pascal case
*
* Do While Loop
* Run code at least once
* ex. a game menu for a game. (research) Why would a menu need to be showed more than once
* RETROSPECT: After copying this code and reading along, I realize why insert in a game...
* start over and PLAY AGAIN.
* Sleepy atm, bitte.
*/
public class RepititionStructure {

    public static void main(String args[]){
//        Start with what we know
        Scanner scanner = new Scanner(System.in);

        int runAgain = 0;

//      place menu inside loop to run once

        do{
            System.out.println("Enter your first number");
            double number1 = scanner.nextDouble();

            System.out.println("Enter your last number");
            double number2 = scanner.nextDouble();

            double sum = number1 + number2;
            System.out.println("The sum is " + sum);

            System.out.println("Add Again? 1 for yes. 2 for no.");
            runAgain = scanner.nextInt();

//      run code then check condition
        }while(runAgain == 1);

//      always close the scanner, always
        scanner.close();
    }
}
