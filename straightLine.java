/**
 * Name: Bill Mao
 * 
 * Date: 10/2/17
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Program 108b (straight line)
 * 
 * Description: This program is designed to calculate the annual depreciation of a car 4 times.
 * A for loop is first set up to repeat the calculation 4 times, and the run number is printed for the user to see each time.
 * The calculation begins by asking the user 3 variables needed to find the depreciation:...
 * The price of the car, the salvage value, and the estimated life in years.
 * These values are then stored and used to find the annual depreciation.
 * The annual depreciation is then rounded to two decimal places, and is printed for the user to see.
 * 
 * Difficulties: I originally got confused as to where semicolons should be put in the for statement.
 * Once I looked over my notes and rewatched some of the videos, I managed to correct this error.
 * I also got the backslash and forward slash mixed up one for the \n.
 * 
 * What I Learned: I learned how to use the for loop in this exercise. 
 * I also got some more practice with casting, mathematical operations, and the scanner class.
 */

import java.util.*;
import java.io.*;

public class straightLine
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input

        for(int runNum = 1; runNum <= 4; runNum++) //Repeats the code 4 times
        {
            //Asks user for price of the car, salvage value, and estimated life and stores them
            //Also prints the run number out
            System.out.println("Run#" + runNum);
            System.out.println("Enter Price:");
            double price = kbInput.nextDouble();
            System.out.println("Enter Salvage Value:");
            double salvage = kbInput.nextDouble();
            System.out.println("Enter Estimated Life in Years:");
            int years = kbInput.nextInt();
            //Calculates the annual depreciation using the three values, and rounds it to the hundredths place
            double depreciation = (price - salvage) / years;
            double depreciationRound = (int) (depreciation * 100 + .5) / 100.0;
            //Prints the results of the calculation
            System.out.println("Annual Depreciation = " + depreciationRound + "\n");
        }
    }
}

//Output:
//Run#1
//Enter Price:
//250
//Enter Salvage Value:
//35
//Enter Estimated Life in Years:
//8
//Annual Depreciation = 26.88
//
//Run#2
//Enter Price:
//2425
//Enter Salvage Value:
//470
//Enter Estimated Life in Years:
//6
//Annual Depreciation = 325.83
//
//Run#3
//Enter Price:
//1162
//Enter Salvage Value:
//625
//Enter Estimated Life in Years:
//5
//Annual Depreciation = 107.4
//
//Run#4
//Enter Price:
//9654.33
//Enter Salvage Value:
//100
//Enter Estimated Life in Years:
//12
//Annual Depreciation = 796.19