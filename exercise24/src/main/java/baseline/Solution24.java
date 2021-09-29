/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution24 {
    // Instantiate new Scanner object (static and final).
    static final Scanner userInput = new Scanner(System.in);

   private String scanInput(){
        // Stores user input to string (return value) for storage in variable.
       return userInput.nextLine();
    }

    public static void main(String[] args){
        Solution24 executor = new Solution24();
        // Instantiate new AnagramChecker object and define String variables.
        AnagramChecker processAnagram = new AnagramChecker();
        System.out.print("Enter the first string: ");
        String string1 = executor.scanInput();
        System.out.print("Enter the second string: ");
        String string2 = executor.scanInput();
        // Call AnagramCalculator's methods in order of appearance to solve problem.
        boolean isAnagram = processAnagram.isAnagram(string1, string2);
        String output = processAnagram.outputModifier(isAnagram);
        System.out.println("\"" + string1 + "\" and \"" + string2 + "\" " + output);
   }
}
