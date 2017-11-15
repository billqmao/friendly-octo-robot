
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

public class Tester
{
    public static void main(String args[])
    {
        int x = 0;
        int y = 0;
        for(x = 1; x <= 250; x++)
        {
            if (x < 100)
            {
                if (x > 200)
                    y = 1000;
                else
                    y = 2000;
            }
            else
            {
                if ( x < 50)
                    y = 3000;
                else
                    y = 2000;
            }
            System.out.println(y);
        }
        

    } 
}

