package objects;

public class HomeCalculatorWithMethods {

    public static void main(String[] args){
        Rectangle kitchen = new Rectangle(300, 400);
        Rectangle bathroom = new Rectangle(300, 400);
        double area = calculateTotalArea(kitchen, bathroom);
        System.out.println("The total area is: " + area);
    }

    // create a method to return the area
    public static double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
