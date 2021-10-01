/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution26Test{

    @Test
    void validateInputTest(){
        Solution26 executorTest = new Solution26();
        // Check to make sure no negative, zero, or non-numeric value gets through.
        assertEquals(false, executorTest.validateInput("asdf"));
        assertEquals(false, executorTest.validateInput("0"));
        assertEquals(true, executorTest.validateInput("1234"));
    }

    @Test
    void processMonetaryInputTest(){
        Solution26 executorTest = new Solution26();
        // Ensure that this function returns monetary information in the proper format.
        assertEquals(26.14, executorTest.processMonetaryInput("26.141"));
    }
}