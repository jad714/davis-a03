/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution31{
    // Instantiate new object of the Scanner class.
    static final Scanner userInput = new Scanner(System.in);


    private String promptScanAgeInput(){
        System.out.print("What is your current age? ");
        // Return the String
        return userInput.nextLine();
    }

    private String promptScanRestingPulseInput(){
        System.out.print("What is your resting pulse? ");
        // Return the String
        return userInput.nextLine();
    }

    public boolean validateInput(String input){
        try{
            Integer.parseInt(input);
            return true;
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Input. Please provide an integer value.");
            return false;
        }
    }

    public int inputParseLoopAge(String input){
        // Traps input in a loop until the correct input is given.
        boolean flag = false;
        int count = 0;
        while(!flag)
        {
            if(count>0){
                input = this.promptScanAgeInput();
            }
            flag = this.validateInput(input);
            count++;
        }
        return Integer.parseInt(input);
    }

    public int inputParseLoopResting(String input){
        // Traps input in a loop until the correct input is given.
        boolean flag = false;
        int count = 0;
        while(!flag)
        {
            if(count>0){
                input = this.promptScanRestingPulseInput();
            }
            flag = this.validateInput(input);
            count++;
        }
        return Integer.parseInt(input);
    }

    private void formatTable(int intensity, int rate){
        String intensityFormatter = Integer.toString(intensity);
        intensityFormatter = intensityFormatter.concat("%");
        System.out.printf("%-13s|%4d bpm%n", intensityFormatter, rate);
    }

    public static void main(String[] args){
        // Instantiate new Solution31 object.
        Solution31 executor = new Solution31();
        // Call promptScanInput for each required value, and send it to the inputParseLoop method.
        String input = executor.promptScanAgeInput();
        int age = executor.inputParseLoopAge(input);
        input = executor.promptScanRestingPulseInput();
        int restingPulse = executor.inputParseLoopResting(input);
        // Instantiate new KarvonenHeartRate object, passing both scanned values to its constructor.
        KarvonenHeartRate heartRate = new KarvonenHeartRate(restingPulse, age);
        // Create a 2D array that stores heart rates vs.
        int rate;
        System.out.printf("Intensity    | Rate   %n");
        System.out.printf("-------------|--------%n");
        // This loop will perform the required calculations and send them to the method that will format the table.
        for(int i=55;i<96;i+=5){
            // Current percentage will be printed and used for calculations.
            // Calculate the target heart rate using the intensity. Divide i by 100 for pecentage as a decimal.
            rate = heartRate.calcTargetHeartRate(i/100.00);
            // Call the table format.
            executor.formatTable(i, rate);
        }
    }
}