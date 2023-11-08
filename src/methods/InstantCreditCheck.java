package methods;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String args[]){
        // Get Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        // Check if User is Qualified
        isUserQualified(actualCreditScore, actualSalary);
    }
    public static void isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            System.out.println("Congratulations! You are approved!");
        }
        else {
            System.out.println("Sorry, no bueno. You have been declined.");
        }
    }
}
