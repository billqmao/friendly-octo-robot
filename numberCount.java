/**
 * Name: Bill Mao
 *
 * Date: 11/16/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 209a (counting numbers)
 *
 * Description: This program is designed to sort and count numbers from a .dat file named p209a.dat.
 * The program first starts by initializing a scanner object and having it import the file
 * If the file is not found, and error message is printed and the program exits.
 * Once the file has been found and imported, Variables needed later in the program are initialized
 * The program reads the numbers in the file integer by integer in a loop.
 * For each number, the total count of numbers is updated, and a counter indicating whether the number is less than 500 or greater than or equal to 500 is incremented.
 * Once all the numbers have been read,the loop is terminated.
 * The total number of integers in the file, the amount of integers less than 500 in the file, and the amount of integers greater than or equal to 500 are finally printed.
 *
 * Difficulties: I originally did not implement the try..catch statement into my code, but I realised that the code would not compile as it would leave...
 * an unhandled FileNotFoundException.
 *
 * What I Learned: I got some more practice with reading external files, decision trees with if statements, and loops.
 */

import java.util.*;
import java.io.*;

public class numberCount
{
    public static void main(String args[])
    {
        //Variables needed later in the program are first initialized for clarity
        Scanner readFile = null; //Scanner is first initialized in order to prepare to read the .dat file
        try
        {
            //Scanner object attempts to read the p209.dat file
            readFile = new Scanner (new File("p209a.dat"));
        }
        catch (FileNotFoundException e)
        {
            //If it is not found, an error message is printed and the program exits.
            System.out.println ("File not found!");
            System.exit (0);
        }
        int number = 0; //Current integer that is being read by the scanner class
        int total = 0; //Count of how many integer are in the file
        int less500 = 0; //Count how many integer in the file are less than 500
        int greater500 = 0; //Count of how many integer in the file are greater than or equal to 500
        while(readFile.hasNext() == true) //Loop reads numbers while there are still number left
        {
            number = readFile.nextInt(); //An integer is read from the .dat file
            total++; //The total integer count is then incremented
            if(number >= 500)
            {
                //The greater than 500 count is incremented by 1 if the integer is greater than or equal to 500
                greater500++;
            }
            else if (number < 500)
            {
                //The less than 500 count is incremented by 1 if the integer is less than 500
                less500++;
            }
        }
        //Prints greater than 500 and less than 500 counts along with the total amount of integers in the file.
        System.out.println("The number of numbers less than 500 is " + less500);
        System.out.println("The number of numbers greater than or equal to 500 is " + greater500);
        System.out.println("The total number of numbers is " + total);
    }   
}
//Output:
//The number of numbers less than 500 is 192
//The number of numbers greater than or equal to 500 is 208
//The total number of numbers is 400