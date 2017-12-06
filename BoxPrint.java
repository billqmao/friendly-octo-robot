/**
 * Name: Bill Mao
 *
 * Date: 12/4/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 507a (thinking inside the box)
 *
 * Description: This program is designed to print out a box containing a string provided by the user.
 * The program first beings by initializing any objects or variables needed later in the program.
 * The user is then asked for the string to be put in the box, and the string is stored.
 * A for loop then executes that increments a line variable from 1-5.
 * For each line number, a line of the box is printed.
 * For lines 1 and 5, a solid row of stars that is equal to the length of the string + 6 is printed.
 * For lines 2 and 4, a star is printed at the beginning and end of the box, with spaces in the middle.
 * For line 3, a spacer containing a star and two spaces are printed with the string provided in the middle.
 * Once all lines are printed, the program terminates
 *
 * Difficulties: I originally planned to write 5 if..else statements for the five lines in the box, but I realized that lines 1 and 5 and lines 2 and 4 are identical,...
 * so I added the identical statements to the existing statements with an || operator.
 *
 * What I Learned: I got some more practice with String methods if..else decision trees, and loops in Java.
 */

import java.util.*;
import java.io.*;

public class BoxPrint
{
    public static void main(String args[])
    {
        //Variables and Objects used later in the program are first initialized for clarity purposes
        Scanner kbInput = new Scanner(System.in); //Scanner used to get user input
        String insideBox = ""; //String to be printed inside the box
        int stringLength = 0; //Length of the string (Printed on line 3)
        int spaces = 0; //Length of the spaces needed on a line with only two stars at the beginning and the end (lines 2 and 4)
        int boxLength = 0; //Length of the overall box (Printed on lines 1 and 5)
        int line = 0; //Line number of the box
        //Asks user for a string and assigns it to the inside Box variable
        System.out.println("Enter a string: ");
        insideBox = kbInput.nextLine();
        System.out.println(""); //New line for formatting purposes
        for(line = 1; line <= 5; line++) //for loop iterates the line variable from 1-5
        {
            //For each new line, the length of the spaces, the box, and the string are recalculated as...
            //printing the correct amount of characters often changes the character count
            stringLength = insideBox.length();
            spaces = stringLength + 4;
            boxLength = stringLength + 6;
            if(line == 1 || line == 5) //For lines 1 and 5
            {
                while(boxLength >= 1)
                {
                    //... a while loop prints out the number of stars needed for the bx
                    System.out.print("*");
                    if(boxLength == 1)
                    {
                        //A new line is printed via the if statement at the last star
                        System.out.println("");
                    }
                    boxLength--;
                }
            }
            else if(line == 2 || line == 4) //For lines 2 and 4
            {
                //A beginning and ending star are printed manually, and...
                System.out.print("*");
                while(spaces >= 1)
                {
                    //...a while loop fills the gap in between with spaces
                    System.out.print(" ");
                    spaces--;
                }
                System.out.print("*\n"); //Last star also prints a new line
            }
            else if(line == 3)
            {
                //The third line containing the string is printed manually w/o the use of loops or decision making
                System.out.print("*  " + insideBox + "  *\n");
            }
        }

    }
}
//Output:
//Enter a string:
//Thinking
//
//**************
//*            *
//*  Thinking  *
//*            *
//**************
//
//Enter a string:
//Mr. Langner is my cool teacher!
//
//*************************************
//*                                   *
//*  Mr. Langner is my cool teacher!  *
//*                                   *
//*************************************
//
//Enter a string:
//I
//
//*******
//*     *
//*  I  *
//*     *
//*******
//
//Enter a string:
//Bill Mao made this program!
//
//*********************************
//*                               *
//*  Bill Mao made this program!  *
//*                               *
//*********************************
//
//Enter a string:
//Ms. Harris is an awesome teacher!
//
//***************************************
//*                                     *
//*  Ms. Harris is an awesome teacher!  *
//*                                     *
//***************************************