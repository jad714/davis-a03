/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution29{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        // Instantiate new RateOfReturn object.
        RateOfReturn howManyYears = new RateOfReturn();
        // Scan for input for rate of return.
        System.out.print("What is the rate of return? ");
        String input = userInput.nextLine();
        // Call inputValidator, send it the rate of return.
        double rate = howManyYears.inputValidator(input);
        double years = howManyYears.yearsToReturn(rate);
        // Print the result of yearsToReturn (one decimal place makes sense).
        System.out.printf("It will take %.1f years to double your initial investment.", years);
    }
}
