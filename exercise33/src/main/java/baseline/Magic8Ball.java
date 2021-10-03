/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Magic8Ball{
    // Instantiate new Random object (for selection of random answer).
    static final Random randNum = new Random();
    // Instantiate new Scanner object.

    public List<String> constructList(){
        // This method constructs the Array List and future-proofs the method.
        List<String> answers = new ArrayList<>();
        // Adding Strings to the list in this way allows for future addition of list items.
        answers.add("Yes.");
        answers.add("No.");
        answers.add("Maybe.");
        answers.add("Ask again later.");
        return answers;
    }

    private String randAnswerSelector(){
        // Call constructList method.
        List<String> answers = this.constructList();
        // Selects a random answer from a list of answers, and returns that answer as a String.
        int randomIndex = randNum.nextInt(3);
        return switch (randomIndex) {
            case 0 -> answers.get(0);
            case 1 -> answers.get(1);
            case 2 -> answers.get(2);
            case 3 -> answers.get(3);
            default -> "Error";
        };
    }

    public String promptReturn(){
        // Return whatever value is returned by the randAnswerSelector to Solution33.
        return randAnswerSelector();
    }
}
