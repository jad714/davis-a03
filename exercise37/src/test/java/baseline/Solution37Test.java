/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test{
    // Instantiate new Solution37 object.
    Solution37 executorTest = new Solution37();

    @Test
    void validateInput(){
        // Test that input is validated correctly.
        assertEquals(10, executorTest.validateInput("10"));
    }
}