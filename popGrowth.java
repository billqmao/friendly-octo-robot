/**
 * Name: Bill Mao
 *
 * Date: 10/11/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 162b (Population Growth)
 *
 * Description: This program is designed to calculate the sum, number of test scores, and average from a .dat file containing test scores.
 * Any variables needed outside of the scope of a specific loop are declared first.
 * The program then creates a scanner object that reads from the ini.dat file containing the test scores.
 * If the Java VM throws a FileNotFoundException, the program will catch that...
 * , and tell the user that they need to put the ini.dat file in the same folder as the program.
 * The program then prints the Scores table header.
 * A while loop then iterates until no more data is left in the .dat file.
 * In the loop, the individual test scores, which are integers, are retrieved by the fileInput scanner object,...
 * printed, added to the sum of the integers variable, and a count variable that stores the amount of integers in the file is incremented.
 * The average of all the integers is then calculated and rounded to two decimal places.
 * The results of the calculation are then printed for the user to see.
 *
 * Difficulties: I had some difficulty finding how to iterate the loop until no more integers were left, but I managed to find the .hasNext method by looking at the provided examples.
 *
 * What I Learned: I learned how get integers from files on the computer, learned how to catch exceptions in Java, and how to iterate a loop as long as more objects/data is available.
 * I also got some more practice with the while loop.
 */

import java.util.*;
import java.io.*;

public class popGrowth{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Please enter in Westwalia's growth rate as a percentage");
        double growth = kbInput.nextDouble();
        double multiplier = growth * .01 + 1;
        int population = 236;
        int year = 2010;
        if(growth <= 0)
        {
            System.out.println("Please enter a valid growth rate");
            System.out.println("The program will now exit");
            System.exit(0);
        }
        System.out.println("--------Growth Rate " + growth + "% annually--------");
        System.out.println("Years  Population (in Millions)");
        while(population < 472)
        {
            year++;
            population = (int) (Math.pow(population, multiplier) +.5);
            System.out.println(year + "           " + population);
        }
        System.out.println("The population will double by " + year);
    }
}
//Output:
//Please enter in Westwalia's growth rate as a percentage
//1.7
//--------Growth Rate 1.7% annually--------
//Years  Population (in Millions)
//2011           259
//2012           285
//2013           314
//2014           346
//2015           382
//2016           423
//2017           469
//2018           521
//The population will double by 2018
//
//Please enter in Westwalia's growth rate as a percentage
//.5
//--------Growth Rate 0.5% annually--------
//Years  Population (in Millions)
//2011           243
//2012           250
//2013           257
//2014           264
//2015           271
//2016           279
//2017           287
//2018           295
//2019           304
//2020           313
//2021           322
//2022           331
//2023           341
//2024           351
//2025           361
//2026           372
//2027           383
//2028           395
//2029           407
//2030           419
//2031           432
//2032           445
//2033           459
//2034           473
//The population will double by 2034
//
//Please enter in Westwalia's growth rate as a percentage
//2.1
//--------Growth Rate 2.1% annually--------
//Years  Population (in Millions)
//2011           265
//2012           298
//2013           336
//2014           380
//2015           430
//2016           488
//The population will double by 2016



