/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution26{
    static final Scanner userInput = new Scanner(System.in);

   private String scanInput(){
        // Scan user input, return string.
        String input;
        while(true){
            // Loop to validate numeric input
            input = userInput.nextLine();
            if(this.validateInput(input)) break;
        }
        return input;
        /* This method will not be tested because any functions it contains
        outside of the standard scan functionality are passed to validate input.
        Since it depends on user input, it cannot be effectively tested. */
    }

    public boolean validateInput(String input){
        try{
            double value = Double.parseDouble(input);
            if(value<=0){
                System.out.print("Invalid input. Numbers must be greater than zero. Try again: ");
                return false;
            }
            return true;
        }catch(NumberFormatException e){
            System.out.print("Invalid input. Must be numeric. Try again: ");
            return false;
        }
    }

    public double processMonetaryInput(String input){
        // Convert input to double.
        double preOutput = Double.parseDouble(input);
        // Cast double to round method of Math API.
        while(preOutput<0){

        }
        // Ensure that output is rounded to two decimal places for storage.
        return Math.round(preOutput*100.0)/100.0;
    }

    public static void main(String[] args){
        Solution26 executor = new Solution26();
        // Declare all variables.
        String input;
        int n;
        double i;
        double b;
        double p;
        // Scan for input.
        System.out.print("What is your balance? ");
        input = executor.scanInput();
        b = executor.processMonetaryInput(input);
        System.out.print("What is the APR on the card (as a percent)? ");
        input = executor.scanInput();
        executor.validateInput(input);
        // Math here is to match the format required for the formula.
        i = (Double.parseDouble(input)/100.00)/365.00;
        System.out.print("What monthly payment can you make? ");
        input = executor.scanInput();
        executor.validateInput(input);
        p = executor.processMonetaryInput(input);
        // Pass all variables to a calculator that returns the number of months.
        PaymentCalculator howManyMonths = new PaymentCalculator(i, b, p);
        n = howManyMonths.calculateMonthsUntilPaidOff();
        // Return the result in an output statement.
        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}
