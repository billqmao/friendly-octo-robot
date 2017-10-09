
/**
 * Write a description of class summingNum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * Difficulties: I had some trouble getting the average to find the amount of numbers listed, but I eventually realised that you...
 * had to add one to the end minus start to account for the starting number
 */

import java.util.*;
import java.io.*;

public class summingNum{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        System.out.println("Enter Starting Value:");
        int start = kbInput.nextInt();
        System.out.println("Enter Ending Value:");
        int end = kbInput.nextInt();
        int sum = start;
        int count = start;
        System.out.println("\n" + start);
        do
        {
            count++;
            sum += count;
            System.out.println(count);
        }
        while(count < end);
        double average = sum / (double) (end - start + 1);
        double averageRound = (int) (average * 100 + .5) / 100.0;
        System.out.println("Sum of the numbers " + start + ".." + end + " is  "+ sum);
        System.out.println("The average of the numbers " + start + ".." + end + " is " + averageRound);
    }
}

//Output:
//Enter Starting Value:
//5
//Enter Ending Value:
//8
//
//5
//6
//7
//8
//Sum of the numbers 5..8 is  26
//The average of the numbers 5..8 is 6.5
