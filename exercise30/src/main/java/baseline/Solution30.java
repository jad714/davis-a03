/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class Solution30{

    public static void main(String[] args){
        // Create new instance of MultiplicationTableBuilder.
        MultiplicationTableBuilder multiplier = new MultiplicationTableBuilder();
        // Declare 2D array for the table and initialize.
        int[][] table = new int[12][12];
        // Create a nested for loop for retrieving results from MultiplicationTableBuilder and displays them appropriately.
        for(int i=0;i<12;i++){
            for(int j=0;j<12;j++){
                table[i][j] = multiplier.multiplyValues((i+1), (j+1));
                // The result of this coupled with the printed %n escape character in the next output is a formatted matrix.
                System.out.printf("%5d", table[i][j]);
            }
            System.out.printf("%n");
        }
    }
}
