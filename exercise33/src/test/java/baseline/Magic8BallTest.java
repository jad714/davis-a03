/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest{

    public boolean testPromptValidator(){
        // This method will help promptReturnTest determine if it worked properly.
        Magic8Ball magicEightTest = new Magic8Ball();
        return switch (magicEightTest.promptReturn()) {
            case "Yes." -> true;
            case "No." -> true;
            case "Maybe." -> true;
            case "Ask again later." -> true;
            default -> false;
        };
    }

    @Test
    void constructListTest(){
        // This test ensures all added values have been correctly indexed to the list.
        Magic8Ball magicEightTest = new Magic8Ball();
        assertEquals("Yes.", magicEightTest.constructList().get(0));
        assertEquals("No.", magicEightTest.constructList().get(1));
        assertEquals("Maybe.", magicEightTest.constructList().get(2));
        assertEquals("Ask again later.", magicEightTest.constructList().get(3));
    }

    @Test
    void promptReturnTest(){
        // This test will have the effect of also testing the private method.
        // This test is run in a loop in order to ensure random results do not produce errors (to a reasonable degree of certainty).
        for(int i=0;i<100;i++){
            assertTrue(this.testPromptValidator());
        }
        // This test has the effect of testing every other method in the Magic8Ball class,
        // as each needs to be functional in order for this to return any of the strings in the above method.
    }
}