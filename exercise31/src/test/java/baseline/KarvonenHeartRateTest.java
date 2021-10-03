/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {

    @Test
    void calcTargetHeartRateTest(){
        // Ensures given passed values for instance fields, the correct Target Heart Rate is calculated.
        KarvonenHeartRate heartRateTest = new KarvonenHeartRate(65,22);
        assertEquals(138, heartRateTest.calcTargetHeartRate(0.55));
    }
}