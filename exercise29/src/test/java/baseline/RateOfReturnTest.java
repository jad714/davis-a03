/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateOfReturnTest {

    @Test
    void inputValidatorTest(){
        // Since bad values will never escape, assertEquals should only be used with correct values.
        RateOfReturn howManyYearsTest = new RateOfReturn();
        assertEquals(5.0, howManyYearsTest.inputValidator("5"));
    }

    @Test
    void yearsToReturnTest(){
        // Ensure correct arithmetic is done by this method.
        RateOfReturn howManyYearsTest = new RateOfReturn();
        assertEquals(14.4, howManyYearsTest.yearsToReturn(5));
    }
}