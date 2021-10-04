/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class PasswordGenerator{
    // Instantiate new Random object.
    static final Random randomNumber = new Random();
    // Declare instance fields for each list.
    List<Character> characters = new ArrayList<>();
    public PasswordGenerator() {
        // Initialize each instance field.
        for (char i = 33; i <= 126; i++) {
            characters.add(i);
        }
    }

    public int randomNumberGenerator(int min, int max){
        // Returns a random value used to index random letters, numbers, and special characters.
        return randomNumber.nextInt(max - min)+ min;
    }

    public String passwordConstructor(int numCount, int letterCount, int specialCount, int length){
        // Using the random integer passed, the user choices, and the lists, construct a password using user input. Return it.
        String password = "";
        // Start with numbers.
        for(int i=0;i<numCount;i++){
           password = password.concat(Character.toString(this.randomNumberGenerator(48,57)));
        }
        // On to letters.
        for(int j=0;j<letterCount;j++){
            password = password.concat(Character.toString(this.randomNumberGenerator(97, 122)));
        }
        // Finally special characters.
        for(int k=0;k<specialCount;k++){
            password = password.concat(Character.toString(this.randomNumberGenerator(33, 47)));
        }
        if(length != password.length()) return "Error.";
        return password;
    }
}
