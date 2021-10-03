/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Scanner;

public class Solution32{
    // Instantiate new Scanner object.
    static final Scanner userInput = new Scanner(System.in);

    public int playAgain(String input){
        int result = 0;
        boolean flagRestart = false;
        // The method returns a value that helps decide whether the user will play again.
        // This requires a correct answer to the previous test AS WELL AS the decision to play again, as a failsafe.
        while(!flagRestart){
            if(input.equals("Y")){
                result = 1;
                flagRestart = true;
            }
            else if(input.equals("N")){
                result = -1;
                System.out.println("Thanks for playing! Bye!");
                break;
            }
            else{
                System.out.println("I didn't understand your input.");
                System.out.print("Please type \"Y\" or \"N\": ");
                input = userInput.nextLine().toUpperCase();
            }
        }
        // Returns result that will help determine if user will play again.
        return result;
    }

    public static void main(String[] args){
        // Instantiate new Solution32 Object
        Solution32 executor = new Solution32();
        // Instantiate new GuessTheNumber object, prompt for difficulty.
        int decider1 = 1;
        int decider2 = 1;
        GuessTheNumber guessGame = new GuessTheNumber();
        while(decider1==1 || decider2==1){
            boolean flag = false;
            int difficulty = 0;
            int count = 0;
            System.out.printf("Let's play guess the number!%n%n");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            while(!flag){
                if(count>0){
                    System.out.print("Enter an integer (1, 2, or 3): ");
                }
                try{
                    // Exit loop providing correct input is given.
                    difficulty = Integer.parseInt(userInput.nextLine());
                    if(difficulty<1 || difficulty>3) continue;
                    flag = true;
                }
                catch(NumberFormatException e){
                    // Invalid input will trap user in the loop.
                    System.out.println("Invalid input.");
                    count++;
                }
            }
            decider1 = guessGame.guessLoop(difficulty);
            // Ask if user would like to play again. If not, goodbye.
            System.out.print("Do you wish to play again (Y/N)? ");
            String input = userInput.nextLine().toUpperCase();
            decider2 = executor.playAgain(input);
        }
    }
}
