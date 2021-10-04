/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test{
    // Instantiate new Solution38 test object.
    static final Solution38 executorTest = new Solution38();

    @Test
    void filterEvenNumbersTest(){
        // Test that the related method can return a filtered array.
        int[] testArray = {1, 2, 3, 4, 5};
        int[] filteredTestArray = {2, 4};
        assertArrayEquals(filteredTestArray, executorTest.filterEvenNumbers(testArray));
    }

    @Test
    void parseInputTest(){
        // Ensure good input makes it through.
        int[] testArray = {1, 2, 3, 4, 5};
        String[] testStringArray = {"1","2","3","4","5"};
        assertArrayEquals(testArray, executorTest.parseInput(testStringArray));
    }
}