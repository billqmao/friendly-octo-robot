
/**
 * Name: Bill Mao
 *
 * Date: 11/1//2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 209b (throwing three dice)
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

public class diceCount
{
    public static void main(String args[])
    {
        //Variables needed outside of the scope of the loop are first initialized
        int dice1 = 1; //Value of the first dice
        int dice2 = 1; //Value of the second dice
        int dice3 = 1; //Value of the third dice
        int countNine = 0; //How many times the dice add up to a value of nine
        int countTen = 0; //How many times the dice add up to a value of ten
        for(dice1 = 1; dice1 <= 6; dice1++)
        {
            //First outermost for loop cycles through all possible values of the first dice (1-6)
            for(dice2 = 1; dice2 <= 6; dice2++)
            {
                //Second for loop cycles through all possible values of the second dice for all values of the first dice
                for(dice3 = 1; dice3 <= 6; dice3++)
                {
                    //Final for loop cycles through all possible values of the third dice based on the values of the previous two dice
                    //Ex: 1,1,1; 1,1,2;...1,2,1...
                    if((dice1 + dice2 + dice3) == 9)
                    {
                        //If the dice add up to nine, the countNine variable is incremented
                        countNine++;
                    }
                    if((dice1 + dice2 + dice3) == 10)
                    {
                        //If the dice add up to ten, the countTen variable is incremented
                        countTen++;
                    }
                }
            }
        }
        //Prints how many 9's and 10's there are
        System.out.println("There are " + countNine + " possible ways to get nine \nThere are " + countTen + " possible ways to get ten");
    }
}
//Output:
//There are 25 possible ways to get nine
//There are 27 possible ways to get ten






