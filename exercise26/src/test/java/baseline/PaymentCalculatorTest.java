/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOffTest(){
        // Test mathematical formula to ensure the right information is returned.
        PaymentCalculator monthsToPaidTest = new PaymentCalculator(0.00068493, 100.00, 25.00);
        assertEquals(5.00, monthsToPaidTest.calculateMonthsUntilPaidOff());
    }
}