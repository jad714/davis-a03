/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution28{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        // Instantiate new NumberCalculator object.
        NumberCalculator numCalc = new NumberCalculator();
        String[] values = {"","","","",""};
        for(int i=0;i<5;i++){
            boolean flag = false;
            while(!flag){
                // Prompt and scan user input.
                System.out.print("Enter a number: ");
                values[i] = userInput.nextLine();
                // Make sure input is integer
                try{
                    Integer.parseInt(values[i]);
                    flag = true;
                }
                catch(NumberFormatException e){
                    System.out.println("Input MUST be an integer. Try again");
                }
            }
        }
        // Call the takePassInput method of NumberCalculator.
        int[] arrayOfInts = numCalc.takePassInput(values);
        int result = numCalc.calcInput(arrayOfInts);
        // Print the return value of NumberCalculator.
        System.out.println("The total is " + result +".");
    }
}
