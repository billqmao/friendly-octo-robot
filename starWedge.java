
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

public class starWedge
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in);
        System.out.println("Enter the starting size: ");
        int stars = kbInput.nextInt();
        int column = 0;
        int row = 0;
        for(column = stars; column >= 1; column--)
        {
            for(row = column; row >= 1; row--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}