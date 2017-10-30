
/**
 * Name: Bill Mao
 * 
 * Date: 9/5/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Hello World Program
 * 
 * Description: This is the first program I have made in Java, and it is designed to print "Hello World!" to the terminal.
 * 
 * Difficulties: I encountered no difficulties creating this program.
 * 
 * What I Learned: I leared how to print text strings to the terminal in Java, how to put comments in Java,
 * and the basic structure of most Java programs.
 */

import java.util.*;
import java.io.*;

public class bulletSpeed
{
    public static void main(String args[])
    {
        //Variables needed outside of the scope of the loop are first initialized
        int seconds = 0; //Seconds the bullet has been in the air
        int height = 0; //Height of the bullet
        int previousHeight = 0; //Previous height of the bullet before one second; used to find the greatest height
        for(seconds = 1; seconds <= 60; seconds++)
        {
            //For loop calculates bullet heights from the first second to the sixtieth
            previousHeight = height; //Sets the height before the new height calcualtion to the previous height
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
