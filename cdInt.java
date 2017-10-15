/**
 * Name: Bill Mao
 *
 * Date: 10/13/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 162i (CD's that don't play music)
 *
 * Description: This program calculates the yearly interest gained on a CD and the final CD worth.
 * The program first creates a Scanner class in order to get user input, and then asks for the initial CD worth.
 * This is stored along with other variables used inside a later loop for scope reasons.
 * A for loop then executes five times simulating the five years that the CD compounds for
 * In the loop, the yearly rate is asked in each iteration.
 * It is then used to calculate the interest earned, its rounded value, and the new worth of the CD.
 * The interest earned rounded is printed for the user to see for each iteration.
 * Once the loop finishes, the final CD worth is rounded, and printed for the user to see.
 *
 * Difficulties: I got some of the variables mixed up with each other due to their similar naming, and changed their names around in order to better differentiate them.
 *
 * What I Learned: I got some more practice with for loops, mathematical calculations, and the scope of loops.
 */

import java.util.*;
import java.io.*;

public class cdInt
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object to use it for user input
        System.out.println("Enter initial investment:"); //Asks user for initial investment
        //All variables used inside the for loop are then stored for scope reasons
        double investment = kbInput.nextInt(); //Initial CD worth
        double interest = 0; //Interest earned per year
        double yearRate = 0; //Yearly interest rate
        double intRound = 0; //Interest earned rounded
        for(int year = 1; year <= 5; year++) //Loop executes five times for the five years of interest
        {
            System.out.println("Enter rate for year " + year + " :"); //Yearly rate is asked for first
            yearRate = .01 * kbInput.nextDouble(); //...and then stored
            interest = investment * yearRate; //The interest earned is then calculated
            investment = interest + investment; //Followed by the new CD worth after interest
            intRound = (int) (interest * 100.0 +.5) / 100.0; //The interest earned is then rounded to two decimal places
            System.out.println("You earned $" + intRound + " interest.\n"); //The rounded interest rate is printed for the user to see for each five years
        }
        double investRound = (int) (investment * 100.0 +.5) / 100.0; //The final CD worth is rounded rounded to two decimal places
        System.out.println("Your CD is now worth $" + investRound); //and then printed for the user to see
    }
}
//Output:
//Enter initial investment:
//2500
//Enter rate for year 1 :
//5
//You earned $125.0 interest.
//
//Enter rate for year 2 :
//3
//You earned $78.75 interest.
//
//Enter rate for year 3 :
//8
//You earned $216.3 interest.
//
//Enter rate for year 4 :
//7
//You earned $204.4 interest.
//
//Enter rate for year 5 :
//9
//You earned $281.2 interest.
//
//Your CD is now worth $3405.65



