/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCalculatorTest{

    @Test
    void takePassInputTest(){
        // Tests method with passed test values (String array).
        NumberCalculator numCalcTest = new NumberCalculator();
        String[] testArrayInput = {"1","0","1","0","1"};
        int[] testArrayOutput = {1,0,1,0,1};
        assertArrayEquals(testArrayOutput, numCalcTest.takePassInput(testArrayInput));
    }

    @Test
    void calcInputTest(){
        // Tests method with passed test values (int array).
        NumberCalculator numCalcTest = new NumberCalculator();
        int[] testArrayInput = {1,0,1,0,1};
        int testResult = 3;
        assertEquals(testResult, numCalcTest.calcInput(testArrayInput));
    }
}