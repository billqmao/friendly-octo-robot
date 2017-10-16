
/**
 * Name: Bill Mao
 * 
 * Date: 9/5/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Hello World Program
 * 
 * Description: This is the first program I have made in Java, and it is designed to print "Hello World!" to the terminal.
 * 
 * Difficulties: I encountered no difficulties creating this program.
 * 
 * What I Learned: I leared how to print text strings to the terminal in Java, how to put comments in Java,
 * and the basic structure of most Java programs.
 */

import java.util.*;
import java.io.*;

public class minWage
{
    public static void main(String args[])
    {
        //Four variables are first decalred so that they can be used outside of the scope of the loops.
        int workers = 0; //Amount of workers that need to be paid
        final int HOURLYWAGE = 8; //Hourly wage of the employees, decalred as a final as it will stay constant
        int totalWage = 0;
        int hours = 0;
        for( workers = 3; workers <= 8; workers++)
        {
            System.out.println("Wages for " + workers + " employees\n");
            for(hours = 10; hours <= 40; hours += 10)
            {
               totalWage = HOURLYWAGE * workers * hours;
               System.out.println("For " + hours + " hours worked, the wages are " + totalWage + " dollars");
            }
            System.out.println("\n");
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
