/**
 * Name: Bill Mao
 * Date: 10/2/17
 * School: East Chapel Hill High School
 * Program: Program 65a (International Date)
 * Description: This program takes a date in American format, and converts it to the ISO standard.
 * It then prints the ISO standard out.
 * Difficulties: I originally got confused as to where semicolons should be put in the for statement.
 * Once I looked over my notes and rewatched some of the videos, I managed to correct this error.
 * I also got the backslash and forward slash mixed up one for the \n.
 * What I Learned: I got some more practice with using the scanner class to get input.
 */
import java.util.*;
import java.io.*;

public class straightLine
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        for(int runNum = 1; runNum <= 4; runNum++)
        {
            System.out.println("Enter Price:");
            double price = kbInput.nextDouble();
            System.out.println("Enter Salvage Value:");
            double salvage = kbInput.nextDouble();
            System.out.println("Enter Estimated Life in Years:");
            int years = kbInput.nextInt();
            double depreciation = (price - salvage) / years;
            double depreciationRound = (int) (depreciation * 100 + .5) / 100.0;
            System.out.println("Annual Depreciation = " + depreciationRound + "\n");
        }
    }
}
