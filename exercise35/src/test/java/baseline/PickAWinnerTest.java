/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class PickAWinnerTest{
    // Instantiate new PickAWinnerTest object.
    static final PickAWinner winnerTest = new PickAWinner();
    // Create instance Field for testNames.
    static final List<String> testNames = new ArrayList<>();
    public PickAWinnerTest(){
        // Initialize testNames in the class constructor.
        testNames.add("Homer");
        testNames.add("Bart");
        testNames.add("Maggie");
        testNames.add("Lisa");
        testNames.add("Moe");
    }

    public boolean testNameValidator(){
        // This method will help promptReturnTest determine if it worked properly.
        return switch (winnerTest.randomWinner(testNames)) {
            case "Homer" -> true;
            case "Bart" -> true;
            case "Maggie" -> true;
            case "Lisa" -> true;
            case "Moe" -> true;
            default -> false;
        };
    }

    @Test
    void randomNumberGeneratorTest(){
        // Test output values in loop 1000 times to ensure the range of possible values is correct.
        for(int i=0;i<1000;i++){
            assertTrue(this.testNameValidator());
        }
    }
}