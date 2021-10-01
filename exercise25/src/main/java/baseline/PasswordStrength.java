/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class PasswordStrength{

    public char[] processInput(String input){
        // Converts passed string to char array.
        input = input.replace(" ","");
        return input.toCharArray();
    }

    public int countCharTypes(char[] password, String type){
        // Counts the char types passed to it. Returns the count.  Will be called several times.
        int numCount = 0;
        int letterCount = 0;
        int specialCount = 0;
        for(int i=0;i<password.length;i++) {
            if (password[i] >= 'a' && password[i] <= 'z' || password[i] >= 'A' && password[i] <= 'Z') {
                letterCount++;
            } else if (password[i] >= '0' && password[i] <= '9') {
                numCount++;
            } else {
                specialCount++;
            }
        }
            // Begin return logic according to requested information.
            if(type.equals("numbers")) return numCount;
            else if(type.equals("letters")) return letterCount;
            else return specialCount;
    }

    public int countChar(char[] password){
        // Counts number of total chars.
        return password.length;
    }

    public String checkStrength(String password){
        // Sends password to several smaller methods to break the problem into its logical parts.
        // Convert incoming password to char[].
        char[] convertedPassword = this.processInput(password);
        // Password determining logic to follow.
        int numbers = countCharTypes(convertedPassword, "numbers");
        int letters = countCharTypes(convertedPassword, "letters");
        int specials = countCharTypes(convertedPassword, "specials");
        int charCount = countChar(convertedPassword);
        if(numbers>0 && letters==0 && specials==0 && charCount<8){
            return " very weak";
        }
        else if(letters>0 && numbers==0 && specials==0 && charCount<8){
            return " weak";
        }
        else if(letters>1 && numbers>=1 && specials==0 && charCount>=8){
            return " strong";
        }
        else if(letters>=1 && numbers>=1 && specials>=1 && charCount >=8){
            return " very strong";
        }
        else{
            return "n unknown";
        }
        // Returns a string to concatenate to output message of Solution25.
    }
}
