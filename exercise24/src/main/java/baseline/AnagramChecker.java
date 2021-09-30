/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class AnagramChecker {
    AnagramChecker(){
        System.out.println("Welcome to the amazing Anagram Checker!");
    }

    public char[] inputModifier(String input){
        // Converts input from Solution24 to lowercase char array with spaces removed.
        return input.toLowerCase().replace(" ","").toCharArray();
    }

    public boolean isAnagram(String string1, String string2){
        // Sends strings to inputModifier to convert to char arrays in lowercase without spaces.
        char[] array1 = this.inputModifier(string1);
        char[] array2 = this.inputModifier(string2);
        // Compares char arrays char by char after first comparing length. If length is the same, if the count of same chars is equal to total length, return true. Else return false.
        int same = 0;
        if(array1.length!=array2.length) return false;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]==array2[j]) same++;
            }
        }
        return (same==array1.length);
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
