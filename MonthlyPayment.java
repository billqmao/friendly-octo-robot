import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/25/17
 * School: East Chapel Hill High School
 * Program: Program 58i (monthly payment)
 * Description: This program is designed to ask the user for a baseball player's name, adn three statistics related to baseball:...
 * the times at bat, number of hits, and number of walks for the player.
 * It then takes these statistics and calculates the batting average and on base percentage.
 * The batting average and on base percentage are then rounded to three decimal points, and are printed for the user to see.
 * Difficulties: When I created this program, I first rounded incorrectly by adding .05 instead of .5.
 * What I Learned: In this exercise, I got some more practice with casting variables and getting user input with the scanner class.
 * I also better understand how the rounding calculation works now.
 */

public class MonthlyPayment
{
    public static void main(String args[])
    {
        Scanner keyboardInput = new Scanner(System.in); //Creating the scanner object in order to use it
        //Asks for the Player's name, waits for input, and then stores it as one string
        System.out.println("The amount you wish to borrow is:_");
        double amtBorrowed = keyboardInput.nextDouble();
        //Asks for statistic related to batting average, waits for input, and then stores that variable as an integer
        System.out.println("The loan rate you can get as a percentage:_");
        double intRate = .01 * keyboardInput.nextDouble();
        //
        System.out.println("The number of years you will take to pay off the loan:_");
        int yearsPaying = keyboardInput.nextInt();
        //
        int monthsPaying = yearsPaying * 12;
        double monthlyInt = Math.pow(((intRate / 12) + 1), monthsPaying);
        double payMonth =  amtBorrowed * (monthlyInt / 12) * (monthlyInt / (monthlyInt - 1));
        double totalPay =  payMonth * monthsPaying;
        double intPaid = totalPay - amtBorrowed;
        //Rounds the on base percentage and batting average to the thousandths place
        double payMonthRound = (int) (payMonth * 100 + .5) / 100.0;
        double totalPayRound = (int) (totalPay * 100 + .5) / 100.0;
        double intPaidRound = (int) (intPaid * 100 +.5) / 100.0;
        //Prints the results of the calculations
        System.out.println("My monthly payments will be $" + payMonthRound);
        System.out.println("Total interest paid is $" + intPaidRound );
        System.out.println("Total amount paid is $" + totalPayRound);
    }
}

//Example output of a player named John Doe with 100 times at bat, 20 hits, and five walks
//Enter Player's Name:_
//John Doe
//Enter Number of Times at bat:_
//100
//Enter Number of Hits:_
//20
//Enter Number of Walks:_
//5
//John Doe has a batting average of 0.211 and an On Base Percentage of 0.25


