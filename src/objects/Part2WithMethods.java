package objects;

import java.util.Scanner;

public class Part2WithMethods {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Rectangle attic = getRoom();
        Rectangle basement = getRoom();

        double area = calculateTotalArea(attic, basement);
        System.out.println("The total area is: " + area);

        scanner.close();
    }

    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter width of your room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }
}

//output returns area of both rooms together
