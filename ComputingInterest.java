import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/22/17
 * School: East Chapel Hill High School
 * Program: Program 58h (computing interest)
 * Description: This program is designed to calculate the amount of interest gained in a bank account.
 * It first ask the user for four details related to compound interest:..
 * the starting amount, or principal, the interest rate, the amount of times the interest is compounded per year, and the number of days the money is in the account
 * It then takes these values and uses the compound interest formula to calculate the money present in the account after interest
 * The money after interest is then subtracted from the starting value to find the amount of money gained.
 * The money after interest and the money gained are then  printed for the user to see.
 * Difficulties: When I created this program, I forgot to add 1 to the interest rate divided by number of times compounded per year
 * I also got the final amount of money and the money gained mixed up.
 * What I Learned: In this exercise, I got some more practice with casting variables and getting user input with the scanner class.
 * I also learned how to better format mathematical operations in Java by doing the most nested calculations first.
 */

public class ComputingInterest
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in); //Creating the scanner object in order to use it
        //Asks for the principal and stores it as an integer
        System.out.println("Enter Amount Saved:_");
        int principal = keyboardInput.nextInt();
        //Asks for interest rate, converts it to a decimal, and stores it as a double
        System.out.println("Enter Interest rate:_");
        double intRate = .01 * keyboardInput.nextDouble();
        //Asks for number of times compounded per year and number of days at interest and stores them as integers
        System.out.println("Enter Number of times compounded per year:_");
        int compoundsPerYear = keyboardInput.nextInt();
        System.out.println("Enter Number of days at interest:_");
        int daysCompounded = keyboardInput.nextInt();
        //Calculates final account balance after interest using compoud interest formula
        double finalMoney = principal * (Math.pow((1+(intRate / compoundsPerYear)), ((compoundsPerYear * daysCompounded) / 365)));
        //Calculates amount of money gained by subtracting the principal from the final amount of money'
        double moneyGained = finalMoney - principal;
        //Rounds the final amount of money and the money gained to two decimal places
        double finalRounded = (int) (finalMoney * 100 + .5) / 100.0;
        double gainedRounded = (int) (moneyGained * 100 + .5) / 100.0;
        //Prints the results of the calculations
        System.out.println("\nThe interest earned is " + gainedRounded + " The total amount in savings is now " + finalRounded);
    }
}

/*
 * Enter Amount Saved:_
 * 5000
 * Enter Interest rate:_
 * 811.5
 * Enter Number of times compounded per year:_
 * 365
 * Enter Number of days at interest:_
 * 900
 * The interest earned is 1638.96 The total amount in savings is now 6638.96
 *
 * Enter Amount Saved:_
 * 10000
 * Enter Interest rate:_
 * 16.5
 * Enter Number of times compounded per year:_
 * 365
 * Enter Number of days at interest:_
 * 90
 *
 * The interest earned is 415.14 The total amount in savings is now 10415.14
 *
 * Enter Amount Saved:_
 * 1500
 * Enter Interest rate:_
 * 8.5
 * Enter Number of times compounded per year:_
 * 365
 * Enter Number of days at interest:_
 * 365
 *
 * The interest earned is 133.06 The total amount in savings is now 1633.06
 */


