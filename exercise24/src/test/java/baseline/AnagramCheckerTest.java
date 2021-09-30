/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void inputModifierTest(){
        AnagramChecker processAnagramTest = new AnagramChecker();
        char[] testCharArr = {'a','b','c','d'};
        char[] testCharArrNum = {'1','6','4','1'};
        // Test to ensure a spaced, capitalized number can be successfully converted to a clean array.
        assertEquals(true, Arrays.equals(processAnagramTest.inputModifier("A B CD"),testCharArr));
        // Test to ensure if the user enters a number, it does not break the program.
        assertEquals(true, Arrays.equals(processAnagramTest.inputModifier("1 6 4 1"), testCharArrNum));
    }

    @Test
    void isAnagramTest(){
        AnagramChecker processAnagramTest = new AnagramChecker();
        assertEquals(true, processAnagramTest.isAnagram("note", "T o N e"));
        assertEquals(false, processAnagramTest.isAnagram("note", "box"));
    }

    @Test
    void outputModifierTest(){
        AnagramChecker processAnagramTest = new AnagramChecker();
        assertEquals("are anagrams.", processAnagramTest.outputModifier(true));
        assertEquals("are not anagrams.", processAnagramTest.outputModifier(false));
    }
}