
/**
 * Name: Bill Mao
 *
 * Date: 10/16/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 166d (still below minimum wage)
 *
 * Description: This program is designed to calculate the total wages 3 to 8 workers would earn from 10 to 40 hours.
 * It begins by declaring any variables that may be used outside of the scope of the loops.
 * The first outer for loop then executes, and it increments the workers variable from 3 to 8, as per the instructions.
 * It also prints out the amount of workers per iteration.
 * The inner for loop then increments the hours variable from 10 to 40 in blocks of 10 hours.
 * Inside each iteration, the total pay that the employer owes is calculated and printed along with the hours.
 * Once the two loops finish running, the program terminates.
 *
 * Difficulties: I changed some of the variable names around to avoid confusion between them.
 *
 * What I Learned: I got some more practice with nested loops, for loops, and mathematical operations in Java.
 */

import java.util.*;
import java.io.*;

public class minWage
{
    public static void main(String args[])
    {
        //Four variables are first decalred so that they can be used outside of the scope of the loops.
        int workers = 0; //Amount of workers that need to be paid
        int hourlyWage = 8; //Hourly wage of the employees, declared as a final as it will stay constant
        int totalPay = 0; //Total amount of money that the employer has to pay to its workers
        int hours = 0; //Hours worked for all employees
        for(workers = 3; workers <= 8; workers++)
        {
            //The first for loop increments the workers from 3 to 8...
            //,and prints out the number of workers for each loop iteration
            System.out.println("Wages for " + workers + " employees\n");
            for(hours = 10; hours <= 40; hours += 10)
            {
                //The second for loop calculates the total pay from the amount of workers, the hourly wage, and the amount of hours worked four times
                //It increments from 10 hours to 40 hours per every 10 hours
                totalPay = hourlyWage * workers * hours;
                System.out.println("For " + hours + " hours worked, the wages are " + totalPay + " dollars");
            }
            System.out.println("\n"); //New line for formatting reasons
        }
    }
}

//Output:
//Wages for 3 employees
//
//For 10 hours worked, the wages are 240 dollars
//For 20 hours worked, the wages are 480 dollars
//For 30 hours worked, the wages are 720 dollars
//For 40 hours worked, the wages are 960 dollars
//
//
//Wages for 4 employees
//
//For 10 hours worked, the wages are 320 dollars
//For 20 hours worked, the wages are 640 dollars
//For 30 hours worked, the wages are 960 dollars
//For 40 hours worked, the wages are 1280 dollars
//
//
//Wages for 5 employees
//
//For 10 hours worked, the wages are 400 dollars
//For 20 hours worked, the wages are 800 dollars
//For 30 hours worked, the wages are 1200 dollars
//For 40 hours worked, the wages are 1600 dollars
//
//
//Wages for 6 employees
//
//For 10 hours worked, the wages are 480 dollars
//For 20 hours worked, the wages are 960 dollars
//For 30 hours worked, the wages are 1440 dollars
//For 40 hours worked, the wages are 1920 dollars
//
//
//Wages for 7 employees
//
//For 10 hours worked, the wages are 560 dollars
//For 20 hours worked, the wages are 1120 dollars
//For 30 hours worked, the wages are 1680 dollars
//For 40 hours worked, the wages are 2240 dollars
//
//
//Wages for 8 employees

//For 10 hours worked, the wages are 640 dollars
//For 20 hours worked, the wages are 1280 dollars
//For 30 hours worked, the wages are 1920 dollars
//For 40 hours worked, the wages are 2560 dollars



