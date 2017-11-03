
/**
 * Name: Bill Mao
 *
 * Date: 11/1//2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 230h (egg mystery)
 *
 * Description: This program is designed to find how many combinations of three dice add up to 9 or 10.
 * The program first begins by initializing all variables needed in the program so that they can be used outside of the scope of the loops if needed.
 * A series of three nested loops then iterate through all 216 possible permutations of the three dice.
 * For each iteration, a variable signifying the amount of possible permutations of dice that lead to a sum of 9 is incremented if the sum of the dice is nine.
 * This also happens for a sum of 10.
 * Once all 216 permutations have been summed, the nested loops terminate, and the amount of permutations with a sum of nine and ten are printed.
 *
 * Difficulties: I originally was unsure of what loop to choose, but I settled on the for loop since there was a definite beginning and end...,
 * and the for loop used the least amount of lines and was the most readable. 
 *
 * What I Learned: I got some more practice with nested loops and decision making using if statements.
 */

import java.util.*;
import java.io.*;

public class eggCount
{
    public static void main(String args[])
    {
        int eggs = 1;
        boolean outerFlag = true;
        boolean innerFlag = true;
        int divisor = 2;
        int remainder = 1;
        while(eggs <= 500 && outerFlag == true)
        {
            while(innerFlag == true && divisor <= 7)
            {
                if((eggs % divisor) == remainder)
                {
                    outerFlag = false;
                }
                else
                {
                    innerFlag = true;
                }
                
            }
            eggs++;
            remainder = 1;
            divisor = 2;
        }
        System.out.println(eggs-1);
    }
}
//Output:
//There are 25 possible ways to get nine
//There are 27 possible ways to get ten






