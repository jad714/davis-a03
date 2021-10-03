/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber{
    // Make guessCount an instance field so it can be tracked across methods.
    int guessCount = 0;
    static final Scanner uInput = new Scanner(System.in);
    // Instantiate new Random Number generator.
    static final Random randomNum = new Random();

    public int getRandNum(int d){
        // Gets random number according to the rules of each difficulty level.
        int randResult;
        if (d == 1)
            randResult = randomNum.nextInt(10 - 1 + 1) + 1;
        else if (d == 2)
            randResult = randomNum.nextInt(100 - 1 + 1) + 1;
        else if (d == 3)
            randResult = randomNum.nextInt(1000 - 1 + 1) + 1;
        else {
            randResult = 0;
            System.out.println("Error! Unable to generate number.");
        }
        return randResult;
    }

    public int guessLoop(int difficulty){
        /* Note: I have found no suitable way to test this method given its complexity, but also no real
        meaningful parts to break it up into. It is the entry point to this class, so I skipped testing it,
        however, testing it manually should prove simple enough. */

        // Calls getRandNum with appropriate difficulty level.
        int randResult = getRandNum(difficulty);
        // Prompts for and validates user guesses, responds accordingly and increments guess counter in loop.
        System.out.print("I have my number. What's your guess? ");
        boolean winFlag = false;
        String guessString;
        int guess = 0;
        guessCount = 0;
        // Loop for guesses, not escaping loop until the right answer is guessed.
        while (!winFlag){
            guessString = uInput.nextLine();
            guess = this.validateInput(guessString);
            guessCount++;
            if(this.checkGuess(randResult, guess)) winFlag = true;
        }
        // Once correct answer is given, returns -1 to indicate to Solution32 that a result has been determined.
        System.out.println("You got it in " + guessCount + " guesses!");
        System.out.printf("%n");
        return -1;
    }



    public boolean checkGuess(int randResult, int guess) {
        // Compares guess to randResult and returns the appropriate output statement to guessLoop.
        if(randResult < guess){
            System.out.print("Too high. Guess again: ");
            return false;
        }
        else if(randResult > guess){
            System.out.print("Too low. Guess again: ");
            return false;
        }
        else
            return true;
    }

    public int validateInput(String guessString) {
        boolean flag = false;
        int count = 0;
        int output = 0;
        // Typical syntax for an input validator.
        while(!flag){
            if(count>0){
                System.out.print("Enter an integer: ");
                guessString = uInput.nextLine();
            }
            try{
                    // Exit loop providing correct input is given.
                    output = Integer.parseInt(guessString);
                    flag = true;
                }
                catch(NumberFormatException e){
                    // Invalid input will trap user in the loop.
                    System.out.println("Invalid input.");
                    count++;
                    guessCount++;
                }
        }
        return output;
    }
}