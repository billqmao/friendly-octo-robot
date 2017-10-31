
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

public class bulletSpeed
{
    public static void main(String args[])
    {
        //Variables needed outside of the scope of the loop are first initialized
        int seconds = 0; //Seconds the bullet has been in the air
        int height = 0; //Height of the bullet in feet
        int previousHeight = 0; //Previous height of the bullet before one second; used to find the greatest height
        for(seconds = 1; seconds <= 60; seconds++)
        {
            //For loop calculates bullet heights from the first second to the sixtieth
            previousHeight = height; //Sets the height before the new height calculation to the previous height
            height = (960 * seconds) - (int) (Math.pow(seconds, 2) * 16); //New bullet height is calculated
            if(height <= previousHeight)
            {
                break; //The if statement breaks the loop when the new height is less than the previous height,...
                //indicating that the maximum height has been reached
            }
        }
        //The maximum height (previousHeight) is printed along with the time it is reached (seconds-1)
        System.out.println("The maximum height reached by the bullet is " + previousHeight + " feet after " + (seconds - 1) + " seconds");    
    }
}
//Output:
//The maximum height reached by the bullet is 14400 feet after 30 seconds



