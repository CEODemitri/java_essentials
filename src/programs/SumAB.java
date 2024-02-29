package programs;

import java.util.Scanner;
public class SumAB {
    public static void main(String[] args) {
//  i have no immediate idea of where to start. haven't coded in java in months. save me.
        Scanner scanner = new Scanner(System.in);

        // use a do while loop to execute at least once
        int sumMore = 1;
        do{
            //how big can double be?
            System.out.println("First Number: ");
            double firstNum = scanner.nextDouble();

            System.out.println("Second Number: ");
            double secondNum = scanner.nextDouble();

            double total = firstNum + secondNum;
            System.out.println("Total : " + total);

            System.out.println("Sum More Numbers? 1 for No, 0 for yes");
            sumMore = scanner.nextInt();
        } while (sumMore == 0);

        scanner.close();
    }
}

// add a way to deny alpha input, only numbers
