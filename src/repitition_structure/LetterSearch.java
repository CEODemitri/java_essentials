package repitition_structure;

import java.util.Scanner;
/*
* BREAK STATEMENT
* Search a string to determine if contains letter 'A'.
 */

public class LetterSearch {

    public static void main(String[] args){
        // Get Text
        System.out.println("Enter your text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search for letter A
        for(int i=0; i<text.length(); i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
    }
}
