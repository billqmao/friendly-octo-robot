
/**
 * Name: Bill Mao
 *
 * Date: 11/3/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 230h (egg mystery)
 *
 * Description: This program is designed to find how many eggs are in a basket based on statements provided in the instructions,
 * Variables used in the program are first declared in the top of the program.
 * Two nested while loops then execute.
 * The innermost loop is designed to check the first six statements provided in the instructions (amount of eggs divided by 2 has remainder 1.... to a divisor of 6)
 * The outermost loop increments the eggs variable and resets the values in the inner loop to check the new eggs value again...,
 * and also performs the final check of dividing the eggs value to 7 and seeing if the remainder is zero.
 * If a value of the amount of eggs in a basket passes all checks, it is printed for the user to see.
 *
 * Difficulties: I originally had some difficulty getting the booleans to work correctly since I wanted the initial values to both be true or false for..
 * both booleans, but I eventually had to switch the boolean for the first six due to how the while loop checks the conditions.
 *
 * What I Learned: I got some more practice with decision making using if statements and nested loops in Java.
 */

import java.util.*;
import java.io.*;

public class eggCount
{
    public static void main(String args[])
    {
        //Variables used in the program are first initialized for clarity purposes
        int eggs = 0; //Number of eggs in the basket
        boolean allChecks = false; //Boolean that becomes true if all conditions in the instructions are met; automatically assumed to be false
        boolean firstSix = true; //Boolean that is true if the eggs in the basket pass the first six checks (divisors 2-6 inclusive); automatically assumed to be true
        int divisor = 2; //Divisor of the eggs; used to check if the conditions in the instructions are met
        int remainder = 1; //Remainder of the conditions
        while(eggs <= 500 && allChecks == false)
        {
            //Outermost while loop controls the inner loop and checks the last statement in the instructions\
            //An upper limit of 500 for the eggs variable is set using this loop in order to prevent an infinite loop
            eggs++; //Increases the eggs variable by one to check a new eggs in the basket value
            //Resets the remainder to one, divisor to two, and the firstSix boolean to their original states to perform the first six checks again
            remainder = 1;
            divisor = 2;
            firstSix = true;
            while(firstSix == true && divisor <= 6)
            {
                //First while loop checks if the remainders of the first six division operations specified in the instructions match
                //If they do not, the if statement declares the firstSix boolean false and a new eggs value is checked
                if((eggs % divisor) != remainder)
                {
                    firstSix = false;
                }
                //Increments of the divisor and remainder variable to check a new remainder statement from 2-6
                divisor++;
                remainder++;
            }
            if(firstSix == true && (eggs % 7) == 0)
            {
                //If the eggs pass the first six checks, this for loop executes the final check
                //If all checks passes as per the instructions, the outer loop terminates, and the amount of eggs in the basket is printed
                allChecks = true;
            }
        }
        System.out.println("The basket contains " + eggs + " eggs.");
    }
}
//Output:
//The basket contains 119 eggs.





