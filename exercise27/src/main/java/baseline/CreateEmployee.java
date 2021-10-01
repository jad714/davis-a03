/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

public class CreateEmployee{
    // Instantiate new Scanner class object.
    // Declare instance fields.
    public CreateEmployee(){
        // Prompt and scan for each input of employee data, and initialize them in instance fields.
    }

    private boolean ruleFName(String input){
        // Temporarily remove spaces from string and ensure string is not empty.
        // Convert to char array to check for the next two tests.
        // Ensure string does not contain special characters.
        // Ensure string does not contain numbers.
        // Esnure string has at least two characters.
        // Providing all tests pass, return true, else return false.
    }

    private boolean ruleLName(String input){
        /*NOTE: If it were not a constraint, I would combine the name validators.*/
        // Temporarily remove spaces from string and ensure string is not empty.
        // Convert to char array to check for the next two tests.
        // Ensure string does not contain special characters.
        // Ensure string does not contain numbers.
        // Ensure string has at least two characters.
        // Providing all tests pass, return true, else return false.
    }

    private boolean ruleEmpID(String input){
        // Convert immediately to char array.
        // Ensure array[0] to array[1] are both letters.
        // Ensure array[2] is invariably a hyphen.
        // Ensure array[3] to array[6] are all numbers.
        // Providing all tests pass, return true, else return false.
    }

    private boolean ruleZip(String input){
        // Try to parse int and return true.
        // Catch unable. Return false.
    }

    public String validateInput(String input){
        // Create if/else tree that determines concatenated string to return to Class that called CreateEmployee.
        // Return appropriate String.
    }



}
