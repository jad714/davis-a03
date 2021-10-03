/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution36{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public int tryParseInt(String value){
        // Try to parse the int values. If unable, trap user in loop.
        while(true){
            try{
                return Integer.parseInt(value);
            }
            catch(NumberFormatException e){
                System.out.print("Invalid input. Please enter an integer: ");
                value = userInput.nextLine();
            }
        }
    }

    private void printArray(List<Integer> numbers){
        // Prints the initially scanned list.
        System.out.print("Numbers: ");
        for(int i=0;i<numbers.size();i++){
            if(i<numbers.size()-1)
                System.out.printf("%d, ", numbers.get(i));
            else
                System.out.printf("%d%n", numbers.get(i));
        }
    }

    private void printResults(double average, int minimum, int maximum, double stDev){
        System.out.printf("The average is %.1f%nThe minimum is %d%nThe maximum is %d%nThe standard deviation is %.2f%n", average, minimum, maximum, stDev);
    }

    public static void main(String[] args){
        // Instantiate new Solution36 object.
        Solution36 executor = new Solution36();
        // Instantiate new Statistics object.
        Statistics stats = new Statistics();
        // Declare new Integer list.
        List<Integer> numbers = new ArrayList<>();
        // Store inputs in an integer array prompted in a loop until the "done" string is typed.
        int count = 0;
        while(true){
            System.out.print("Enter a number: ");
            String scannedInput = userInput.nextLine();
            if(scannedInput.equalsIgnoreCase("done")){
                executor.printArray(numbers);
                break;
            }
            numbers.add(executor.tryParseInt(scannedInput));
            count++;
        }
        // Store all mathematical results (in appropriate types).
        double average = stats.calcAverage(numbers);
        int minimum = stats.findMin(numbers);
        int maximum = stats.findMax(numbers);
        double stDev = stats.calcStDev(numbers, average);
        // Print all mathematical results (in appropriate types).
        executor.printResults(average, minimum, maximum, stDev);
    }
}
