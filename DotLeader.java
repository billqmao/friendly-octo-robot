/**
 * Name: Bill Mao
 *
 * Date: 11/27/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 500e (dot leader)
 *
 * Description: This program is designed to find and print a title and page number in a hypothetical table of contents,...
 * with the title and page number separated by periods and all characters in the header adding up to 50.
 * The program first initializes any variables needed later in the program for clarity purposes.
 * The program then asks the user for the page number and title.
 * The length of the title and page number are then found, and the amount of dots needed is then calculated by subtracting the length of the two...
 * statements from 50.
 * An if...else statement then verifies if the amount of dots that need to printed makes sense
 * If it does, the title is the first printed.
 * A while loop then executes that prints all the dots needed.
 * The program finally prints the page number and terminates.
 *
 * Difficulties: I originally set the dots to print to x-0 (dots < 0), but change it to print from x-1 (dots <= 0) after I realized that an extra dot was being printed.
 *
 * What I Learned: I learned how to use methods in Java, and I got some more practice with loops and if decision trees.
 */

import java.util.*;
import java.io.*;

public class DotLeader
{
    public static void main(String args[])
    {
        //Variables used later in the program are first initialized/instantiated for clarity purposes
        String title = ""; //Title of the section
        int dots = 0; //Amount of dots needed to be printed in order to reach 50 characters
        String pageNumber = ""; //Page number of the section, stored as a string to access string methods
        int tableLength = 0; //Length of the title and page number in the table of contents
        Scanner kbInput = new Scanner(System.in); //Scanner for user input
        //Asks user for page number and title of the section and assigns their values the the previously initialized variables.
        System.out.println("Enter the Page number: ");
        pageNumber = kbInput.nextLine();
        System.out.println("Enter the title: ");
        title = kbInput.nextLine();
        //Finds how many characters the title and page numbers are
        tableLength = pageNumber.length() + title.length();
        //Subtracts the length of the title and page numbers from 50 to find the amount of dots needed
        dots = 50 - tableLength;
        //If statement prints an error message if the number of dots needed is 0 or below
        //Otherwise, the statement with the dots needed is printed
        if(dots <= 0)
        {
            System.out.println("Please enter a shorter title or page number.");
        }
        else
        {
            System.out.print("\n" + title); //Title is first printed, line break is printed for formatting reasons
            while(dots >= 1)
            {
                //While loop then prints the amount of dots needed
                System.out.print(".");
                dots--;
            }
            System.out.print(pageNumber); //The page number is the printed
        }
    }
}
//Output:
//Enter the Page number:
//5
//Enter the title:
//An Introduction to Java
//
//An Introduction to Java..........................5
//
//
//Enter the Page number:
//27
//Enter the title:
//Simple Data Types
//
//Simple Data Types...............................27
//
//
//Enter the Page number:
//45
//Enter the title:
//Object Oriented Programming
//
//Object Oriented Programming.....................45