/**
 * Name: Bill Mao
 *
 * Date: 10/3/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 122b (hourly pay)
 *
 * Description: This program is designed to calculate the pay a person earns at $4 per hour in a 40 hour workweek.
 * The program firsts starts by printing the header of the table containing Hours and Pay, and initializes the pay variable.
 * It then executes a for loops that repeats 40 times for each hour worked.
 * In the loop, the pay for the cumulative amount of hours is calculated and is printed along with the number of hours worked.
 *
 * Difficulties: I originally had some trouble choosing which numbers to use in the loops that...
 * would start at hour one and end at hour forty.
 *
 * What I Learned: I got some more practice with formatting text in Java, the for loop, and mathematical operations.
 */

import java.util.*;
import java.io.*;

public class hourlyPay
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        System.out.println("Hours" + "\t" + "Pay"); //Prints ot the Hours and Pay part of the table.
        int pay; //Initializes the pay variable
        for(int hours = 1; hours <= 40; hours++) //Loops the function 40 times for each hour worked
        {
            //Calculates and prints the pay for each hour cumulatively at $4 per hour.
            pay = hours * 4;
            System.out.println(" " + hours + "\t " + pay);
        }
    }
}

//Output:
//Note: The formatting was changed when copying from the terminal...,
//so this output may appear to be formatted incorrectly.
//Hours    Pay
// 1     4
// 2     8
// 3     12
// 4     16
// 5     20
// 6     24
// 7     28
// 8     32
// 9     36
// 10     40
// 11     44
// 12     48
// 13     52
// 14     56
// 15     60
// 16     64
// 17     68
// 18     72
// 19     76
// 20     80
// 21     84
// 22     88
// 23     92
// 24     96
// 25     100
// 26     104
// 27     108
// 28     112
// 29     116
// 30     120
// 31     124
// 32     128
// 33     132
// 34     136
// 35     140
// 36     144
// 37     148
// 38     152
// 39     156
// 40     160




