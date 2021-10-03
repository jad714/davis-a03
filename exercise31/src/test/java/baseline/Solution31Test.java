/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test{
    @Test
    void validateInputTest(){
        Solution31 executorTest = new Solution31();
        // This test will pass if an incorrect type value returns "false" and a correct one returns "true."
        assertTrue(executorTest.validateInput("1"));
        assertFalse(executorTest.validateInput("0.5"));
    }

    @Test
    void inputParseLoopAgeTest(){
        Solution31 executorTest = new Solution31();
        // This test will pass if an integer value makes it through (this method will endlessly loop otherwise).
        assertEquals(15, executorTest.inputParseLoopAge("15"));
    }

    @Test
    void inputParseLoopRestingTest(){
        Solution31 executorTest = new Solution31();
        // This test will pass if an integer value makes it through (this method will endlessly loop otherwise).
        assertEquals(15, executorTest.inputParseLoopResting("15"));
    }
}