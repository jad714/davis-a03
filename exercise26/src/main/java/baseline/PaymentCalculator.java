/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Davis
 */

package baseline;

public class PaymentCalculator{
    private final double i;
    private final double b;
    private final double p;
    PaymentCalculator(double i, double b, double p){
        this.i = i;
        this.b = b;
        this.p = p;
    }
    public int calculateMonthsUntilPaidOff(){
        // Instantiate new Double object to determine if interest is higher than payments will allow.
        // Utitlizes provided mathematical formula to determine months until payoff, UP to the nearest whole integer.
        double preRound = (-(1.00/30.00)*(Math.log(1.00+(b/p)*(1.00-(Math.pow((1.00+i),30.00))))))/(Math.log(1.00+i));
        Double value = preRound;
        // If a NaN result is calculated, it indicates interest is accruing faster than payments are coming in.
        // Inform the user of this problem and exit.
        if(value.isNaN()){
            System.out.println("Your payments are not high enough to cover your accruing interest.");
            System.out.println("Try again and increase your payments.");
            System.exit(0);
        }
        return (int)Math.ceil(preRound);
    }
}
