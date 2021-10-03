/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsTest{
    // Declare and instantiate necessary class objects and instance fields for tests.
    static final Statistics statsTest = new Statistics();
    static final List<Integer> testArray = new ArrayList<>();
    // Initialize instance field.
    public StatisticsTest(){
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.add(4);
        testArray.add(5);
    }

    @Test
    void calcAverage(){
        // Test a list of integers and ensure average is correctly calculated.
        assertEquals(3.0, statsTest.calcAverage(testArray));
    }

    @Test
    void findMin(){
        // Make sure the returned result is the actual minimum of the list.
        assertEquals(1, statsTest.findMin(testArray));
    }

    @Test
    void findMax(){
        // Makes sure the returned result is the actual maximum of the list.
        assertEquals(5, statsTest.findMax(testArray));
    }

    @Test
    void calcStDev(){
        // Make sure the returned result is the actual standard deviation of the list (within delta).
        assertEquals(1.4142135623731, statsTest.calcStDev(testArray, 3.0),  .005);
    }
}