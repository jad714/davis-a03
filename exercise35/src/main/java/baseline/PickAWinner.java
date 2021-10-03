/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

import java.util.List;
import java.util.Random;

public class PickAWinner{
    // Instantiate new Random object.
    static final Random randomGen = new Random();

    public String randomWinner(List<String> names){
        // Randomly picks a number for the winning index.
        int winner = randomGen.nextInt(names.size());
        return names.get(winner);
    }
}
