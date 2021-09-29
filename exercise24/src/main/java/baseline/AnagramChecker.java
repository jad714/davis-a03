/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Arrays;

public class AnagramChecker {
    AnagramChecker(){
        System.out.println("Welcome to the amazing Anagram Checker!");
    }

    public char[] inputModifier(String input){
        // Converts input from Solution24 to lowercase char array with spaces removed.
        return input.toLowerCase().replace(" ","").toCharArray();
    }

    public void sortArray(char[] array) {
        // Sorts char arrays in preparation for comparison.
        Arrays.sort(array);
    }

    public boolean isAnagram(String string1, String string2){
        // Sends strings to inputModifier to convert to char arrays in lowercase without spaces.
        char[] array1 = this.inputModifier(string1);
        char[] array2 = this.inputModifier(string2);
        // Sends char arrays to sortArray to prepare them for comparison.
        this.sortArray(array1);
        this.sortArray(array2);
        // Compares sorted arrays for equality and returns boolean true/false.
        return(Arrays.equals(array1, array2));
    }

    public String outputModifier(boolean decider){
        String output;
        // If the two strings are anagram of each other, choose corresponding output statement.
        if(decider){
            output = "are anagrams.";
        }
        else{
            output = "are not anagrams.";
        }
        return output;
    }
}
