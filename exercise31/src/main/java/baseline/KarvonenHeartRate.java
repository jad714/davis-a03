/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class KarvonenHeartRate{
    // Declare both instance fields (resting pulse, age)
    int a;
    int rp;
    public KarvonenHeartRate(int restingPulse, int age){
        // Initialize all instance fields.
        a = age;
        rp = restingPulse;
    }

    public int calcTargetHeartRate(double intensity){
        // Return the result of the given formula for Target Heart Rate.
        return (int)((((220.00-a)-rp)*intensity)+rp);
    }
}