/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution38{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public int[] filterEvenNumbers(int[] oldArray){
        List<Integer> savedEvens = new ArrayList<>();
        // Copies any even number to newArray.
        for (int k : oldArray) {
            if (k % 2 == 0) {
                savedEvens.add(k);
            }
        }
        int[] newArray = new int[savedEvens.size()];
        for(int j=0;j<savedEvens.size();j++){
            newArray[j] = savedEvens.get(j);
        }
        return newArray;
    }

    public int[] parseInput(String[] inputs){
        // Ensures input is appropriate. Re-scans if not. Returns int array.
        while(true){
            int[] convertedInputs = new int[inputs.length];
            try {
                for (int i = 0; i < inputs.length; i++) {
                    convertedInputs[i] = Integer.parseInt(inputs[i]);
                }
                return convertedInputs;
            }
            catch(NumberFormatException e){
                System.out.print("Invalid format. Please enter integers separated by spaces: ");
                String input = userInput.nextLine();
                inputs = input.split(" ");
            }
        }
    }

    public static void main(String[] args){
        // Instantiate new Solution38 object.
        Solution38 executor = new Solution38();
        // Prompt user for appropriate input.
        System.out.print("Enter a list of numbers, separated by spaces: ");
        // Scan input.
        String input = userInput.nextLine();
        String[] inputs = input.split(" ");
        // Pass input to parser and store the int array.
        int[] numArray = executor.parseInput(inputs);
        // Pass int array to filter and print the resulting array.
        int[] filteredArray = executor.filterEvenNumbers(numArray);
        // Print the even numbers.
        System.out.print("The even numbers are ");
        for(int i=0;i<filteredArray.length;i++){
            if(i==filteredArray.length-1){
                System.out.printf("%d.%n", filteredArray[i]);
            }
            else{
                System.out.printf("%d ", filteredArray[i]);
            }
        }
    }
}
