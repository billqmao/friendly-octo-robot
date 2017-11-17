
/**
 * Name: Bill Mao
 * 
 * Date: 11/16/17
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Program 209a (counting numbers)
 * 
 * Description: This program is designed to find the cost of the items a customer orders.
 * The price per item varies based on how many items the customer orders.
 * The program first declares any variables needed later in the program.
 * It then aks the user for how many items they want to order.
 * An if-else decision tree then finds the price per item based on how many items the user input.
 * The total cost of the items is then found and rounded to two digits.
 * Finally, the price and total amount due are then printed.
 * 
 * Difficulties: I originally intended to use the switch Statement to do the decision making for the price,...
 * but I found that the range of quantities was better suited for the if else if statement due to its complexity.
 * 
 * What I Learned: I got some more practice with btaining user input in Java, deicision trees using if statements,...
 * and mathematical operations.
 */

import java.util.*;
import java.io.*;

public class numberCount
{
    public static void main(String args[])
    {
        //Variables needed later in the program are first initialized for clarity
        Scanner readFile = null;
        try 
        {
            readFile = new Scanner (new File("p209a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println ("File not found!");
            System.exit (0);
        }
        int number = 0; //Current number that is being read by the scanner class
        int total = 0; //Count of how many numbers are in the file
        int less500 = 0; //Count how many numbers in the file are less than 500
        int greater500 = 0; //Count of how many numbers in the file are greater than or equal to 500
        while(readFile.hasNext() == true)
        {
            number = readFile.nextInt();
            total++;
            if(number >= 500)
            {
                greater500++;
            }
            else if (number < 500)
            {
                less500++;
            }
        }
        System.out.println("The number of numbers less than 500 is " + less500);
        System.out.println("The number of numbers greater than or equal to 500 is " + greater500);
        System.out.println("The total number of numbers is " + total);
    }   
}
