/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class GuessTheNumber{
    // Instantiate new Scanner object.
    // Declare instance field for difficulty.
    public GuessTheNumber(int difficulty) {
        // Prompt for difficulty level.
        // Initialize instance field to value of "difficulty".
    }
        public int getRandNum(int d){
            // Returns a random number according to difficulty level chosen by user.
        }

        private int guessLoop(int randResult, int d){
            // Calls getRandNum with appropriate difficulty level.
            // Prompts for and validates user guesses, responds accordingly and increments guess counter in loop.
            // Once correct answer is given, returns -1 to indicate to Solution32 that a result has been determined.
        }

        public String checkGuess(int randResult, int guess){
            // Compares guess to randResult and returns the appropriate output statement to guessLoop.
        }
}
