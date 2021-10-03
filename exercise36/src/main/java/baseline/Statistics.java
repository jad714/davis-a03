/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.List;

public class Statistics{

    public double calcAverage(List<Integer> numbers){
        // Calculate and return the average.
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / (double)numbers.size();
    }

    public int findMin(List<Integer> numbers){
        // Loop to find min and return it.
        int minimum = numbers.get(0);
        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i)<minimum)
                minimum = numbers.get(i);
        }
        return minimum;
    }

    public int findMax(List<Integer> numbers){
        // Loop to find max and return it.
        int maximum = numbers.get(0);
        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i)>maximum)
                maximum = numbers.get(i);
        }
        return maximum;
    }

    public double calcStDev(List<Integer> numbers, double average){
        // Calculate the standard deviation and return it.
        int sumNumerator = 0;
        for (Integer number : numbers) {
            sumNumerator += Math.pow(number - average, 2);
        }
        return Math.sqrt(sumNumerator/(double)numbers.size());
    }
}
