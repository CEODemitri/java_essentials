package challenges;

import java.util.Scanner;

public class FillBlanks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

//    ask for fav season of year
        System.out.println("What is your favorite Season");
        String season = scanner.next();

        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        System.out.println("Enter a Number");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("On a(n) " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of Lemonade.");
    }

}
