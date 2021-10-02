/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class RateOfReturn{
    // Instantiate new object of the Scanner class.
    static final Scanner userInput = new Scanner(System.in);

    public double inputValidator(String r){
        // Accepts the string from the Solution29 class's Scanner and returns a double.
        // Trap the input validation in a loop and don't let it out until a valid result is achieved.
        double result = 0;
        boolean flag = true;
        // Test initial value for success. If it fails, send to loop.
        while(r.equals("0")){
            System.out.println("Sorry. That's not a valid input.");
            System.out.print("What is the rate of return? ");
            r = userInput.nextLine();
        }
        // Try inital input for success. If it fails, send to loop.
        try{
            result = Double.parseDouble(r);
            if(result==0)
                flag = false;
        }
        catch(NumberFormatException ex){
            flag = false;
            while(r.equals("0")){
                // Failure prompt and rescan input.
                System.out.println("Sorry. That's not a valid input.");
                System.out.print("What is the rate of return? ");
                r = userInput.nextLine();
            }
        }
        while(!flag){
            // Try next input for success. If it fails, trap it.
            try{
                result = Double.parseDouble(r);
                flag = true;
            }
            catch(NumberFormatException e){
                System.out.println("Sorry. That's not a valid input.");
                System.out.print("What is the rate of return? ");
                r = userInput.nextLine();
                while(r.equals("0")){
                    System.out.println("Sorry. That's not a valid input.");
                    System.out.print("What is the rate of return? ");
                    r = userInput.nextLine();
                }
            }
        }
        return result;
    }

    public double yearsToReturn(double r){
        // Accepts the rate of return and returns double.
        return 72.0/r;
    }
}
