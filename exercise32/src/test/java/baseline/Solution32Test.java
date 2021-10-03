package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    @Test
    void playAgainTest(){
        // Verifies PlayAgain returns proper value given input.
        Solution32 executorTest = new Solution32();
        assertEquals(1, executorTest.playAgain("Y"));
        assertEquals(-1, executorTest.playAgain("N"));
    }
}