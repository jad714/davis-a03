/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Solution37{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public int validateInput(String input){
        // Validate user input by trying to parse as int and catching exceptions. Also ensure <=52 (max letters). Return int.
        int number;
        while(true){
            try{
                    number = Integer.parseInt(input);
                    if(number>=14){
                        System.out.print("Invalid input! Number must be less than 14: ");
                        input = userInput.nextLine();
                    }
                    else{
                        return number;
                    }
            }
            catch(NumberFormatException e){
                System.out.print("Invalid input! Must be an integer: ");
                input = userInput.nextLine();
            }
        }
    }

    public static void main(String[] args){
        // Instantiate new PasswordGenerator object.
        PasswordGenerator generatePassword = new PasswordGenerator();
        // Instantiate new Solution37 object.
        Solution37 executor = new Solution37();
        // Scan for input piece by piece
        System.out.print("What's the minimum length? ");
        // Send each bit of input to a validateInput function
        String input = userInput.nextLine();
        int length = executor.validateInput(input);
        System.out.print("How many special characters? ");
        input = userInput.nextLine();
        int specialCount = executor.validateInput(input);
        System.out.print("How many numbers? ");
        input = userInput.nextLine();
        int numberCount = executor.validateInput(input);
        // Rule: There must be at least as many letters as numbers and special characters combined.
        int letterCount = numberCount + specialCount;
        String password = generatePassword.passwordConstructor(numberCount, letterCount, specialCount, length);
        System.out.println("Your password is " + password);
    }
}
