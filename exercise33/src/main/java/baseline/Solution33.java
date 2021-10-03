/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution33 {
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        // Instantiate new Magic8Ball object.
        Magic8Ball magicEight = new Magic8Ball();
        // Call first Magic8Ball method after a prompt for input.
        // Prompts user for their question and calls randAnswerSelector for a random answer. Returns String.
        System.out.print("What's your question? ");
        // The below value will be ignored.
        userInput.nextLine();
        String answer = magicEight.promptReturn();
        // Print the response!
        System.out.println(answer);
    }
}
