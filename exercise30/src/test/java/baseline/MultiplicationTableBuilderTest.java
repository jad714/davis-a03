/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableBuilderTest {

    @Test
    void multiplierTest(){
        // Test that for any given x and y value, the proper array is returned.
        MultiplicationTableBuilder multiplicationTest = new MultiplicationTableBuilder();
        assertEquals(55, multiplicationTest.multiplyValues(5,11));
    }
}