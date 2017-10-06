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

public class functionChart
{
    public static void main(String args[])
    {
        //Loops the function 40 times for each hour worked
        for(int even = 0; even <= 50; even += 2)
        {
            int column2 = even +1;
            int column3 = 2 * even;
            int column4 = (int) Math.pow(even, 2);
            System.out.println(EasyFormat.format(even, 0) + EasyFormat.format(column2, 12) + EasyFormat.format(column3, 12) + EasyFormat.format(column4, 12) + "\n");
            if(even > 56)
            {
                break;
            }
        }
    }
}
