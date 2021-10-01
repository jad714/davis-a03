/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class CreateEmployee{

    private String ruleFName(String input){
        String outputString="";
        // Temporarily remove spaces from string and ensure string is not empty.
        // Convert to char array to check for the next two tests.
        String noSpaceInput = input.replace(" ","");
        // Ensure string does not contain special characters.
        // Ensure string does not contain numbers.
        boolean flag = false;
        for(int i=0;i<noSpaceInput.length();i++){
            if(!Character.isAlphabetic(noSpaceInput.charAt(i)))
                flag = true;
        }
        // If numbers or characters exist in the string, concat the error message.
        if(flag){
            outputString = outputString.concat("The first name must not contain numbers or special characters.\n");
        }
        // Ensure string has at least two characters.
        if(noSpaceInput.length()<2)
           outputString = outputString.concat("The first name must be at least 2 characters long.\n");
        // Ensure the string is not empty.
        if(noSpaceInput.equals(""))
            return "The first name must be filled in.\n";
        // Return string according to rules.
        return outputString;
    }

    private String ruleLName(String input){
        /*NOTE: If it were not a constraint, I would combine the name validators.*/
        String outputString="";
        // Temporarily remove spaces from string and ensure string is not empty.
        // Convert to char array to check for the next two tests.
        String noSpaceInput = input.replace(" ","");
        // Ensure string does not contain special characters.
        // Ensure string does not contain numbers.
        boolean flag = false;
        for(int i=0;i<noSpaceInput.length();i++){
            if(!Character.isAlphabetic(noSpaceInput.charAt(i)))
                flag = true;
        }
        if(flag){
            outputString = outputString.concat("The last name must not contain numbers or special characters.\n");
        }
        // Ensure string has at least two characters.
        if(noSpaceInput.length()<2)
            outputString = outputString.concat("The last name must be at least 2 characters long.\n");
        // Ensure the string is not empty
        if(noSpaceInput.equals(""))
            return "The last name must be filled in.\n";
        // Return string according to rules.
        return outputString;
    }

    private String ruleEmpID(String input){
        String outputString = "The employee ID must be in the format of AA-1234.\n";
        // If the string is empty, return outputString.
        if(input.length()==0)
            return outputString;
        // Ensure the first two characters are letters.
        if(!Character.isAlphabetic(input.charAt(0)) || !Character.isAlphabetic(input.charAt(1)))
            return outputString;
        // Ensure charAt(2) is invariably a hyphen.
        if(input.charAt(2)!='-')
            return outputString;
        // Ensure charAt(3) to charAt(6) are all numbers.
        for(int i=3;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i)))
                return outputString;
        }
        // Return string according to rules.
        return "";
    }

    private String ruleZip(String input){
        // Try to parse int and return empty string.
        try{
            Integer.parseInt(input);
            if(input.length()==5)
                return"";
            else
                return "The zipcode must be a 5 digit number.\n";
        }// Catch unable. Return appropriate string.
        catch(NumberFormatException e){
            return "The zipcode must be a 5 digit number.\n";
        }
    }

    public String validateInput(String[] inputs){
        String outputString = "";
        // Run all rule checks.
        // Create series of concatenations for outputString according to inputs in Array.
        outputString = outputString.concat(this.ruleFName(inputs[0]));
        outputString = outputString.concat(this.ruleLName(inputs[1]));
        outputString = outputString.concat(this.ruleEmpID(inputs[3]));
        outputString = outputString.concat(this.ruleZip(inputs[2]));
        // If nothing was added to the string, return no errors found.
        if(outputString.equals(""))
            return "There were no errors found.\n";
        // Return appropriate String.
        return outputString;
    }



}
