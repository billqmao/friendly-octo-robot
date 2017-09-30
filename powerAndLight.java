import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/27/17
 * School: East Chapel Hill High School
 * Program: Program 93a (CompSci Power and Light)
 * Description: This program is designed to calculate the monthly electrical bill for the user.
 * The constants used in the calculation are first stored as final variables
 * The program then prompts the user for their KWH usage, and stores this as an integer
 * The base power cost, surcharge, and tax are then calculated.
 * These three values are then rounded to two decimal places, and are used to calculate the total rounded amount and the final rounded amount
 * The five values are then printed for the user in the format of an electrical bill.
 * Difficulties: I had to shift the total amount and late amount calculations due to rounding differences in the problem and my program
 * What I Learned: I got some more practice with input in Java using the scanner class, formatting printed strings,...
 * casting in Java, and the use of final variables.
 */
public class powerAndLight
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        //All constants/fixed costs stored as finals
        final double POWERCOST = .0475;
        final double TAX = .03;
        final double SURCHARGE = .1;
        final double LATEPAY = 1.04;
        System.out.println("Enter KWH used:_"); //Asks user for KWH used and stores it as an integer
        int kwHours = kbInput.nextInt();
        //The base cost of power, surcharge, tax, and late cost are calculated
        double baseAmt = kwHours * POWERCOST;
        double surchAmt = baseAmt * SURCHARGE;
        double taxAmt = baseAmt * TAX;
        //All values above rounded to the nearest cent/2nd decimal place, and the rounded total amount is both calculated and rounded
        double baseAmtRound = (int) (100 * baseAmt + .5) / 100.0;
        double surchAmtRound = (int) (100 * surchAmt + .5) / 100.0;
        double taxAmtRound = (int) (100 * taxAmt + .5) / 100.0;
        double totalAmtRound = baseAmtRound + surchAmtRound + taxAmtRound;
        double lateAmtRound = (int) (100 * (totalAmtRound * LATEPAY) + .5) / 100.0;
        //The values are printed in a format similar to an electric bill
        System.out.println("             C O M P S C I  Electric            ");
        System.out.println("------------------------------------------------");
        System.out.println("Kilowatts Used  " + kwHours + "  @  $0.0475     ");
        System.out.println("------------------------------------------------");
        System.out.println("Base Charge                            $" + baseAmtRound);
        System.out.println("Surcharge                              $" + surchAmtRound);
        System.out.println("City Tax                               $" + taxAmtRound);
        System.out.println(" ");
        System.out.println("                                       ___________\n");
        System.out.println("Pay This Amount                        $" + totalAmtRound + "\n");
        System.out.println("After May 20th Pay                     $" + lateAmtRound);

    }
}

//Output:
//Enter KWH used:_
//993
//             C O M P S C I  Electric            
//------------------------------------------------
//Kilowatts Used  993  @  $0.0475     
//------------------------------------------------
//Base Charge                            $47.17
//Surcharge                              $4.72
//City Tax                               $1.42
//
//                                       ___________
//
//Pay This Amount                        $53.31
//
//After May 20th Pay                     $55.44



