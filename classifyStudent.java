
/**
 * Name: Bill Mao
 * 
 * Date: 11/14/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Program 213c (if then student classifier)
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

public class classifyStudent
{
    public static void main(String args[])
    {
        String repeat = "yes";
        int studentID = 0;
        int gradeCode = 0;
        int credits = 0;
        Scanner kbInput = new Scanner(System.in);
        do
        {
            System.out.println("Enter Student Number :");
            studentID = kbInput.nextInt();
            System.out.println("Enter Credits:");
            credits = kbInput.nextInt();
            if(credits >= 0 && credits < 30)
            {
                System.out.println("Grade level code = 1");
            }
            else if(credits >= 30 && credits < 70)
            {
                System.out.println("Grade level code = 2");
            }
            else if(credits >= 70 && credits < 90)
            {
                System.out.println("Grade level code = 3");
            }
            else if(credits >= 90)
            {
                System.out.println("Grade level code = 4");
            }
            else
            {
                System.out.println("Please enter a positive integer for the number of credits.");
            }
            System.out.println("Do you wish to find another student? (yes/no)");
            repeat = kbInput.next();
        }
        while(repeat.equalsIgnoreCase("yes"));
    } 
}

