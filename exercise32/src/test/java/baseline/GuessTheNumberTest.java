/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessTheNumberTest {

    @Test
    void getRandNumTest(){
        // This test will ensure that, based on the difficulty, the random number generated will not exceed the expected maximum.
        GuessTheNumber guessGameTest = new GuessTheNumber();
        assertTrue(guessGameTest.getRandNum(1)<=10);
        assertTrue(guessGameTest.getRandNum(2)<=100);
        assertTrue(guessGameTest.getRandNum(3)<=1000);

    }

    @Test
    void checkGuessTest(){
        // This test will ensure that appropriate strings are returned according to different scenarios.
        GuessTheNumber guessGameTest = new GuessTheNumber();
        assertTrue(guessGameTest.checkGuess(10,10));
        assertFalse(guessGameTest.checkGuess(10,11));
    }

    @Test
    void validateInputTest(){
        // This test will ensure that valid input makes it all the way through the method.
        GuessTheNumber guessGameTest = new GuessTheNumber();
        assertEquals(10, guessGameTest.validateInput("10"));
    }
}