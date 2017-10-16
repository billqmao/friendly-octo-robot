/**
 * Name: Bill Mao
 *
 * Date: 10/12/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 162b (Population Growth)
 *
 * Description: This program is designed to calculate when Westwalia's population will double based on a constant growth rate.
 * The program first asks for and stores the growth rate of Westwalia.
 * It then initializes three variables, the year, the multiplier used to calculate the population growth, and the year.
 * An if statement then executes and terminates the program if the growth rate is 0 or negative.
 * The two headers of the year and population are then printed.
 * A while loop then runs until the population doubles.
 * In the while loop, the next year's population is calculated along with the year, and is printed for the user to see.
 * Once the population doubles, the year when it doubles is printed for the user to see.
 * 
 * Difficulties: I originally did population to the power of the multiplier instead of multiplying the two together.
 *
 * What I Learned: I got some more practice with the while loop, mathematical operations in Java, and casting.
 */

import java.util.*;
import java.io.*;

public class popGrowth{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to get user input
        //Asks user for Westwalia's growth rate and stores it as a double
        System.out.println("Please enter in Westwalia's growth rate as a percentage"); 
        double growth = kbInput.nextDouble();
        //The next three variables are declared so that they may be used outside of the scope of the loop
        double multiplier = growth * .01 + 1; //Derived from the growth to use in the exponential population calculation
        int population = 236; //Population of Westwalia
        int year = 2010; //Starting year
        if(growth <= 0) //If the growth rate the user entered is nonsensical (ie zero), the program will terminate.
        {
            System.out.println("Please enter a valid growth rate"); 
            System.out.println("The program will now exit");
            System.exit(0);
        }
        //First two headers of the table are printed
        System.out.println("--------Growth Rate " + growth + "% annually--------");
        System.out.println("Years  Population (in Millions)"); 
        while(population < 472) //Loop runs until population doubles
        {
            year++; //The year variable in incremented first
            population = (int) (population * multiplier + .5); //The population growth for the year is then calculated and rounded to the nearest whole number
            System.out.println(year + "           " + population); //The year and new population are then printed
        }
        System.out.println("The population will double by " + year); //Prints out when the population will double
    }
}
//Output:
//Please enter in Westwalia's growth rate as a percentage
//5.9
//--------Growth Rate 5.9% annually--------
//Years  Population (in Millions)
//2011           250
//2012           265
//2013           281
//2014           298
//2015           316
//2016           335
//2017           355
//2018           376
//2019           398
//2020           421
//2021           446
//2022           472
//The population will double by 2022
//
//Please enter in Westwalia's growth rate as a percentage
//4.6
//--------Growth Rate 4.6% annually--------
//Years  Population (in Millions)
//2011           247
//2012           258
//2013           270
//2014           282
//2015           295
//2016           309
//2017           323
//2018           338
//2019           354
//2020           370
//2021           387
//2022           405
//2023           424
//2024           444
//2025           464
//2026           485
//The population will double by 2026
//
//Please enter in Westwalia's growth rate as a percentage
//8.9
//--------Growth Rate 8.9% annually--------
//Years  Population (in Millions)
//2011           257
//2012           280
//2013           305
//2014           332
//2015           362
//2016           394
//2018           467
//2019           509
//The population will double by 2019






