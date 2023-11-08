package methods;

import java.util.Scanner;

public class InstantCreditCheckReturn {
    public static void main(String args[]){
        // Get Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double actualSalary = scanner.nextDouble();

        System.out.println("Enter your credit score: ");
        int actualCreditScore = scanner.nextInt();
        scanner.close();

        // Check if User is Qualified
        boolean qualified = isUserQualified(actualCreditScore, actualSalary);
        notifyUser(qualified);
    }
    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congratulations!. You are approved.");
        }
        else {
            System.out.println("Sorry, we are not ready for you. Declined.");
        }
    }
}
