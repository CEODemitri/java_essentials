package decision_structures;

import java.util.Scanner;
public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch(grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Cool Job";
                break;
            case "C":
                message = "You are pushing the limit now";
                break;
            case "D":
                message = "Poor Job";
                break;
            case "F":
                message = "Terrible. Terrible";
                break;
            default:
                message = "Invalid grade.";
                break;
        }
    }
}
