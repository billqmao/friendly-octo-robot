/**
 * Name: Bill Mao
 *
 * Date: 10/31/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 215c (don’t fence me in)
 *
 * Description: This program is designed to calculate the maximum area of fence possible with 100 yards of fencing.
 * The program first begins by initializing four variable that will be used to find the maximum area possible.
 * A for loop then executes that checks for areas with a fence length of 1-49 yards
 * In the loop, the width and then  area are calculated first.
 * In an if statement, the area is then compared to the previous area, and if the previous area is larger than the current area, it indicates that the maximum area has been reached.
 * The previous area and its dimensions are then printed for the user to see.
 * The if statement then breaks and the loop ends.
 *
 * Difficulties: I originally did not include a break in the if statement, as I expected multiple fence dimensions to give me the maximum height.
 * I then implemented the break after seeing that only one answer gives the maximum height and any other values are incorrect.
 *
 * What I Learned: I got some more practice with loops, the if statement, and the break statement in Java.
 */

import java.util.*;
import java.io.*;

public class fencing
{
    public static void main(String args[])
    {
        //Variables used in the program are first initialized outside of the loop
        int length = 0; //Length of one side of the fence in yards
        int width = 0; //Width of the side of the fence opposite the neighbor's
        int area = 0; //Area of the fence in yards
        int previousArea = 0; //Area of the fence with length - 1; used to find the maximum area
        System.out.println("With 100 yards of fencing material:");
        for(length = 1; length <= 49; length++)
        {
            //For loop iterates through the side lengths 1-49 to find the greatest area
            //After a length of 49, there is not enough fencing to continue
            previousArea = area; //Previous area is set to the old area
            width = 100 - (2 * length); //Width is calculated
            area = length * width; //New Area is calculated
            if(length >= 2 && previousArea > area)
            {
                //Prints the maximum area of 100 yards of fencing used to create a pen
                //Maximum area is reached when the new area is smaller than the previous area
                //The statement only starts checking at length 2 or greater since there is no previous area to compare at length 1
                System.out.println("A rectangle with a length of " + (length - 1) + " yards and a width of " +
                (width + 2) + " yards produces the maximum area of " + previousArea + " square yards.");
                break; //Terminates the program once the maximum area was found
            }

        }
    }
}
//Output:
//With 100 yards of fencing material:
//A rectangle with a length of 25 yards and a width of 50 yards produces the maximum area of 1250 square yards.



