import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/25/17
 * School: East Chapel Hill High School
 * Program: Program 58i (monthly payment)
 * Description: This program is designed to first store three details from a car loan:...
 * the amount borrowed, the interest rate, and the amount of years it will take to pay that loan.
 * The program then takes these values and finds the monthly payment for the car, the total amount paid to the bank, and the amount of interest paid.
 * It then prints these results for the user to see.
 * Difficulties: I split the monthly payment calculation into two parts in order to make it more readable,...
 * as I tried to do it in one line of code, but was confused by all of the parentheses.
 * I also mixed up two variables leading to a calculation error.
 * What I Learned: In this exercise, I got some more practice with casting variables and using the scanner object for user input
 * I also got some practice with rounding and the Math class.
 */

public class MonthlyPayment
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in); //Creating the scanner object in order to use it
        //Asks for the principal of the loan, waits, and then stores the response as a 64 bit floating point
        System.out.println("The amount you wish to borrow is:_");
        double amtBorrowed = keyboardInput.nextDouble();
        //Asks for the interest rate as a percentage, converts it to a decimal, and stores it as a double precision floating point
        System.out.println("The loan rate you can get as a percentage:_");
        double intRate = .01 * keyboardInput.nextDouble();
        //Asks for the number of years the loan will take to pay off and stores it as an integer
        System.out.println("The number of years you will take to pay off the loan:_");
        int yearsPaying = keyboardInput.nextInt();
        //The amount of year that it will take to pay off the debt is first converted to months
        int monthsPaying = yearsPaying * 12;
        // The monthly interest rate is then calculated
        double monthlyInt = Math.pow(((intRate / 12) + 1), monthsPaying);
        //It is then used to calculate the monthly payment for the car
        double payMonth =  amtBorrowed * (intRate / 12) * (monthlyInt / (monthlyInt - 1));
        //The monthly payment is then used to calculate the total payment, which is the  used to find the amount of interest paid
        double totalPay =  payMonth * monthsPaying;
        double intPaid = totalPay - amtBorrowed;
        //The Monthly payment, total payment, and interest paid are then rounded to two decimal places
        double payMonthRound = (int) (payMonth * 100 + .5) / 100.0;
        double totalPayRound = (int) (totalPay * 100 + .5) / 100.0;
        double intPaidRound = (int) (intPaid * 100 +.5) / 100.0;
        //All three rounded values are then printed for the user to see
        System.out.println("My monthly payments will be $" + payMonthRound);
        System.out.println("Total interest paid is $" + intPaidRound );
        System.out.println("Total amount paid is $" + totalPayRound);
    }
}

//Example output with the three scenarios in the document
/*
 * The amount you wish to borrow is:_
 * 7500
 * The loan rate you can get as a percentage:_
 * 14.5
 * The number of years you will take to pay off the loan:_
 * 3
 * My monthly payments will be $258.16
 * Total interest paid is $1793.66
 * Total amount paid is $9293.66
 *
 * The amount you wish to borrow is:_
 * 7500
 * The loan rate you can get as a percentage:_
 * 14.5
 * The number of years you will take to pay off the loan:_
 * 4
 * My monthly payments will be $206.83
 * Total interest paid is $2428.06
 * Total amount paid is $9928.06
 *
 * The amount you wish to borrow is:_
 * 7500
 * The loan rate you can get as a percentage:_
 * 7.5
 * The number of years you will take to pay off the loan:_
 * 3
 * My monthly payments will be $233.3
 * Total interest paid is $898.68
 * Total amount paid is $8398.68
 */


