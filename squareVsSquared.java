/**
 * Name: Bill Mao
 *
 * Date: 10/5/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 122a (square vs squared)
 *
 * Description: This program is designed to calculate the pay a person earns at $4 per hour in a 40 hour workweek.
 * The program firsts starts by printing the header of the table containing Hours and Pay, and initializes the pay variable.
 * It then executes a for loops that repeats 40 times for each hour worked.
 * In the loop, the pay for the cumulative amount of hours is calculated and is printed along with the number of hours worked.
 *
 * Difficulties: I had some trouble formatting the square root values to be spaced correctly and to also print to four decimal places.
 *
 * What I Learned: I got some more practice with formatting text in Java, the for loop, and mathematical operations.
 */

import java.util.*;
import java.io.*;

public class squareVsSquared
{
    public static void main(String args[])
    {
        System.out.println("Hours\t" + "Square\t" + "Square Root"); //Prints ot the Hours and Pay part of the table.
        //Loops the function 40 times for each hour worked
        for(int num = 1; num <= 40; num++)
        {
            int numsquared = (int) Math.pow(num, 2);
            double numsquarert = Math.sqrt(num);
            System.out.println(num + " \t" + numsquared + "\t   " + EasyFormat.format(numsquarert, 0, 4));
        }
    }
}
