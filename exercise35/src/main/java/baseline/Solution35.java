/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution35{
    // Instantiate new object of the Scanner class.
    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        // While user input is not blank, continue to accept names in a loop.
        List<String> names = new ArrayList<>();
        String scannedName;
        while(true){
            System.out.print("Enter a name: ");
            scannedName = userInput.nextLine();
            // Break once the input is blank.
            if(scannedName.equals(""))
                break;
            names.add(scannedName);
        }
        PickAWinner winnerSelect = new PickAWinner();
        // Pass the list of names to a method in the PickAWinner Class and print the returned name as the winner.
        String winner = winnerSelect.randomWinner(names);
        // Prints the winner.
        System.out.println("The winner is... " + winner + "!");
    }
}
