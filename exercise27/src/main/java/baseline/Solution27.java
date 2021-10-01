/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution27{
    static final Scanner userInput = new Scanner(System.in);

    private String scanInput(){
        return userInput.nextLine();
    }

    public static void main(String[] args){
        // Instantiate new object of CreateEmployee Class.
        CreateEmployee employee = new CreateEmployee();
        // Instantiate new object of Solution27 Class.
        Solution27 executor = new Solution27();
        /* NOTE: I wanted to solve this a bit differently, using constructors more in line
        with OOP, but it would violate the constraints, sadly, and it greatly complicates testing. */
        // Prompt and scan for inputs.
        String[] inputs = {"", "", "", ""};
        System.out.print("Enter the first name: ");
        inputs[0] = executor.scanInput();
        System.out.print("Enter the last name: ");
        inputs[1] = executor.scanInput();
        System.out.print("Enter the ZIP code: ");
        inputs[2] = executor.scanInput();
        System.out.print("Enter the employee ID: ");
        inputs[3] = executor.scanInput();
        System.out.print(employee.validateInput(inputs));
    }
}
