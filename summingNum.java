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

public class summingNum{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        //Stores the starting value the user supplies
        System.out.println("Enter Starting Value:");
        int start = kbInput.nextInt();
        //Stores the ending value the user supplies
        System.out.println("Enter Ending Value:");
        int end = kbInput.nextInt();
        //The sum of the integers is first set to the starting value as the loop increments first, and would not include the starting value
        int sum = start;
        //The count of the numbers, a separate variable, is used in the loop in order to use the unmodified starting variable later
        int count = start;
        //The starting variable is printed outside the loop as the loop increments first
        System.out.println("\n" + start);
        do
        {
            //The loop adds together all the values in between the starting and ending variables,,,
            //and prints them all out
            count++; //Increments first, then adds
            sum += count;
            System.out.println(count);
        }
        while(count < end); //Once the count is same as the ending number, it stops
        //The average of the numbers from the start to end is then calculated and rounded
        double average = sum / (double) (end - start + 1);
        double averageRound = (int) (average * 100 + .5) / 100.0;
        //The sum, average, starting, and ending numbers are then printed for the user to see.
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
//
//Enter Starting Value:
//2
//Enter Ending Value:
//9
//
//2
//3
//4
//5
//6
//7
//8
//9
//Sum of the numbers 2..9 is  44
//The average of the numbers 2..9 is 5.5
//
//Enter Starting Value:
//1
//Enter Ending Value:
//7
//
//1
//2
//3
//4
//5
//6
//7
//Sum of the numbers 1..7 is  28
//The average of the numbers 1..7 is 4.0
//
//Enter Starting Value:
//4
//Enter Ending Value:
//12
//
//4
//5
//6
//7
//8
//9
//10
//11
//12
//Sum of the numbers 4..12 is  72
//The average of the numbers 4..12 is 8.0
//
//Enter Starting Value:
//23
//Enter Ending Value:
//28
//
//23
//24
//25
//26
//27
//28
//Sum of the numbers 23..28 is  153
//The average of the numbers 23..28 is 25.5




