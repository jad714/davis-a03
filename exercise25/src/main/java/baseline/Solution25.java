package baseline;

import java.util.Scanner;

public class Solution25 {
    // Instantiate new Scanner object
    static final Scanner userInput = new Scanner(System.in);

    private String scanInput(){
        System.out.print("Please enter a password: ");
        return userInput.nextLine();
    }

    public static void main(String[] args){
        // Instantiate new Solution25 object.
        Solution25 executor = new Solution25();
        // Instantiate new PasswordStrength object.
        PasswordStrength passwordChecker = new PasswordStrength();
        // Scan input from user.
        String password = executor.scanInput();
        String output = passwordChecker.checkStrength(password);
        // Call password strength method therein in order to determine password strength (pass input string). Store result string.
        // Print appropriate output string.
        System.out.println("\'" + password + "\'" + " is a" + output + " password.");
    }
}
