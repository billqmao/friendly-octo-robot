/**
 * Name: Bill Mao
 *
 * Date: 11/14/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 213c (if then student classifier)
 *
 * Description: This program is designed to classify a college student based on the amount of credits they have.
 * The program first initializes any variables needed later in the program for clarity purposes.
 * A do..while loop then executes.
 * In the loop, the user is asked for the college student's ID number, and the amount of credits they have.
 * The amount of credits is then converted to a grade code via an if else decision tree.
 * The grade code is then stored and printed.
 * Finally, the program asks if the user if they want to repeat the classification, and repeats the loop if they answer yes.
 *
 * Difficulties: I originally manually printed out the grade code by including it in the string and did not store it as a variable,...
 * but I realised that it would be easier to add other possible grade code options or to store the grade codes permanently if I saved them to a variable.
 *
 * What I Learned: I got some more practice with the Scanner class in Java, if else decision trees, and the do..while loop.
 */

import java.util.*;
import java.io.*;

public class classifyStudent
{
    public static void main(String args[])
    {
        //Variables used later in the program are first declared for clarity purposes
        String repeat = "yes"; //used to see if the user wants to repeat the student classification
        int studentID = 0; //Student ID of the person to be classified
        int gradeCode = 0; //Code corresponding to the grade of the student
        int credits = 0; //Credits the student has earned
        Scanner kbInput = new Scanner(System.in); //Scanner for user input
        do //Entire do..while loop allows for the classification to repeat
        {
            System.out.println("Enter Student Number :"); //Asks for the student number...
            studentID = kbInput.nextInt(); //and stores it
            System.out.println("Enter Credits:"); //Same is done for the amount of credits
            credits = kbInput.nextInt();
            if(credits >= 0 && credits < 30) //The grade code is then determined by how many credits the student has
            {
                gradeCode = 1; //Prints a grade code 1 for a freshman with [0,30) (interval notation) credits
                System.out.println("Grade level code = " + gradeCode);
            }
            else if(credits >= 30 && credits < 70)
            {
                gradeCode = 2; //Prints a grade code 2 for a sophomore with [30,70) (interval notation) credits
                System.out.println("Grade level code = " + gradeCode);
            }
            else if(credits >= 70 && credits < 90)
            {
                gradeCode = 3; //Prints a grade code 3 for a junior with [70,90) (interval notation) credits
                System.out.println("Grade level code = " + gradeCode);
            }
            else if(credits >= 90)
            {
                gradeCode = 4; //Prints a grade code 4 for a senior with [90,infinity) (interval notation) credits
                System.out.println("Grade level code = " + gradeCode);
            }
            else
            {
                //If the user enters a nonsensical amount of credits (negative), an error message is printed
                System.out.println("Please enter a positive integer for the number of credits.");
            }
            System.out.println("Do you wish to find another student? (yes/no)"); //Asks the user if they wish to repeat the classification
            repeat = kbInput.next(); //Stores the user's response
            System.out.println(""); //New line for formatting purposes
        }
        while(repeat.equalsIgnoreCase("yes")); //Loop repeats if the user answers yes
    }
}
//Output:
//Enter Student Number :
//4467
//Enter Credits:
//30
//Grade level code = 2
//Do you wish to find another student? (yes/no)
//yes
//
//Enter Student Number :
//5544
//Enter Credits:
//15
//Grade level code = 1
//Do you wish to find another student? (yes/no)
//yes
//
//Enter Student Number :
//6846
//Enter Credits:
//70
//Grade level code = 3
//Do you wish to find another student? (yes/no)
//yes
//
//Enter Student Number :
//65782
//Enter Credits:
//90
//Grade level code = 4
//Do you wish to find another student? (yes/no)
//no