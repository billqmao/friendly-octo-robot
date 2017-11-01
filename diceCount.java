
/**
 * Name: Bill Mao
 *
 * Date: 10/30/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 215b (faster than a speeding bullet)
 *
 * Description: This program is designed to calculate the maximum height of a bullet fired with a muzzle velocity of 960 feet per second
 * The program first begins by declaring three variables that will be used outside of the scope of the loops,
 * These are the seconds elapsed, the height of the bullet, and the height of the bullet 1 second before the current time.
 * A for loop then iterates through the first to sixtieth second the bullet is in the air.
 * The loop first stores the current height to the previous height, and then calculates the new height for the new time.
 * An if statement then executes that terminates the loop is the previous height is larger than or equal to the new height,,,,
 * indicating that the apex has been reached.
 * The program then finally prints out the time the bullet reached the maximum time and the bullet height.
 *
 * Difficulties: I first set the program to iterate for seconds 0-60 inclusive, but I realized that this arrangement would not work since...
 * there is no bullet height that corresponds to -1 seconds for the previous height.
 *
 * What I Learned: I learned how to implement decision making in programs using the if statement and the break statement.
 */

import java.util.*;
import java.io.*;

public class diceCount
{
    public static void main(String args[])
    {
        //Variables needed outside of the scope of the loop are first initialized
        int dice1 = 1; //Seconds the bullet has been in the air
        int dice2 = 1; //Height of the bullet in feet
        int dice3 = 1; //Previous height of the bullet before one second; used to find the greatest height
        int countNine = 0;
        int countTen = 0;
        for(dice1 = 1; dice1 <= 6; dice1++)
        {
            for(dice2 = 1; dice2 <= 6; dice2++)
            {
                for(dice3 = 1; dice3 <= 6; dice3++)
                {
                    if((dice1 + dice2 + dice3) == 9)
                    {
                        countNine++;
                    }
                    if((dice1 + dice2 + dice3) == 10)
                    {
                        countTen++;
                    }
                }
            }
        }
        System.out.println("There are " + countNine + " possible ways to get nine \nThere are " + countTen + " possible ways to get ten");
    }
}
//Output:
//The maximum height reached by the bullet is 14400 feet after 30 seconds



