/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {

    @Test
    void processInput(){
        String testPassword = "1!aSd **";
        char[] testConvertedPassword = {'1','!','a','S','d','*','*'};
        PasswordStrength passwordCheckerTest = new PasswordStrength();
        assertEquals(true, Arrays.equals(testConvertedPassword,passwordCheckerTest.processInput(testPassword)));
    }

    @Test
    void countCharTypesTest(){
        PasswordStrength passwordCheckerTest = new PasswordStrength();
        char[] testPassword1 = {'1','1','1','1'};
        char[] testPassword2 = {'1','a','S','!','d','!','&','0'};
        char[] testPassword3 = {'a', '1', '`', '<'};
        char[] space = {' '};
        assertEquals(4, passwordCheckerTest.countCharTypes(testPassword1, "numbers"));
        assertEquals(0, passwordCheckerTest.countCharTypes(testPassword1, "letters"));
        assertEquals(0, passwordCheckerTest.countCharTypes(testPassword1, "specials"));
        assertEquals(3, passwordCheckerTest.countCharTypes(testPassword2, "specials"));
        assertEquals(1, passwordCheckerTest.countCharTypes(testPassword3, "letters"));
        assertEquals(1, passwordCheckerTest.countCharTypes(space, "specials"));
        }


    @Test
    void countCharTest(){
        PasswordStrength passwordCheckerTest = new PasswordStrength();
        char[] testPassword1 = {'1','1','1','1'};
        char[] testPassword2 = {'1','a','S','!','d','!','&','0'};
        char[] testPassword3 = {'a', '1', '`', '<'};
        assertEquals(4, passwordCheckerTest.countChar(testPassword1));
        assertEquals(8, passwordCheckerTest.countChar(testPassword2));
        assertEquals(4, passwordCheckerTest.countChar(testPassword3));
    }

    @Test
    void checkStrength(){
        PasswordStrength passwordCheckerTest = new PasswordStrength();
        String testPassword1 = "1111";
        String testPassword2 = "abcd";
        String testPassword3 = "a1bcdefgh";
        String testPassword4 = "a1!bcdef";
        String testPassword5 = " ";
        assertEquals(" very weak", passwordCheckerTest.checkStrength(testPassword1));
        assertEquals(" weak", passwordCheckerTest.checkStrength(testPassword2));
        assertEquals(" strong", passwordCheckerTest.checkStrength(testPassword3));
        assertEquals(" very strong", passwordCheckerTest.checkStrength(testPassword4));
        assertEquals("n unknown", passwordCheckerTest.checkStrength(testPassword5));
    }
}