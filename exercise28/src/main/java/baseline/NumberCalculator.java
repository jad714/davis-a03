/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class NumberCalculator{

    public int[] takePassInput(String[] values){
        // Takes array of user inputs from main solution class and parses them to int in array.
        int[] numArray = {0,0,0,0,0};
        // Iterating until "numsToAdd.length" instead of a hard-coded value "future-proofs" this program.
        for(int i=0;i<values.length;i++){
            numArray[i] = Integer.parseInt(values[i]);
        }
        return numArray;
    }

    public int calcInput(int[] numsToAdd) {
        // Takes in an array of integers and adds its members. Returns the result.
        int result = 0;
        for (int i = 0; i < numsToAdd.length; i++) {
            result += numsToAdd[i];
        }
        return result;
    }
}
