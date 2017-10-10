/**
 * Name: Bill Mao
 *
 * Date: 10/9/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 152d (summing some numbers)
 *
 * Description: This program is designed to find the integers between two numbers, its sum, and the average of those numbers.
 * It begins by asking for the user to provide the start and ending number, and stores those values.
 * It then starts the calculation by setting the sum to the starting value and printing the starting value, as the loop does not include this value.
 * It also initializes a count value that is set to and used in lieu of the starting value in the loop calculation...
 * in order to preserve the original starting value for future calculations
 * The loop then prints out the numbers between the two numbers given and adds them to the sum for each loop iteration.
 * The average of the numbers is then calculated and rounded.
 * The starting and ending numbers, sum and rounded average are then printed for the user to see.
 *
 * Difficulties: I had some trouble getting the average to find the amount of numbers listed, but I eventually realised that you...
 * had to add one to the end minus start to account for the starting number
 *
 * What I Learned: I learned how to use the do while loop, and I got some more practice with casting and mathematical operations in Java.
 */

import java.util.*;
import java.io.*;

public class smallFac{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        int number = 0;
        int product = 1;
        boolean anothernum = true;
        String yesNo = "Yes";
        String yesNoLower = "yes";
        do{
            System.out.println("Enter a number:_");
            number = kbInput.nextInt();
            for(int count = number; count > 0; count--)
            {
                product = product * count;
            }
            System.out.println("The value of " + number + "! is " + product);
            System.out.println("Would you like to calculate another number?");
            yesNo = kbInput.next();
            yesNoLower = yesNo.toLowerCase();
            if( yesNoLower == "yes")
            {
                anothernum = true;
            } else {
                anothernum = false;
            } 
        }
        while(anothernum == true);
        System.out.println("End Factorial Processing");
    }
}
