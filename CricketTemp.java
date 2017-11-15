
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

public class CricketTemp
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in);
        int chirps = 0;
        double fahrenheit = 0;
        double celcius = 0;
        System.out.println("Enter Cricket Chirps/Min:");
        chirps = kbInput.nextInt();
        fahrenheit = (chirps + 40) / 4;
        celcius = (fahrenheit - 32) * (5 / 9);
        System.out.println("Fahrenheit = " + fahrenheit);
        System.out.println("Celcius = " + celcius);
        

    } 
}

