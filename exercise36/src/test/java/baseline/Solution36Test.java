/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test{
    static final Solution36 executorTest = new Solution36();

    @Test
    void tryParseInt(){
        // Ensure that a string that is an integer is correctly parsed to int type.
        assertEquals(10, executorTest.tryParseInt("10"));
    }
}