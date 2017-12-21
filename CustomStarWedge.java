/**
 * Name: Bill Mao
 *
 * Date: 10/20/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Prog 673a Asterisk Revisited
 *
 * Description: This program is designed to print out a left, right, or center aligned triangle of stars according to the user's wishes.
 * The program begins by declaring any variables needed in the main method.
 * The program then prints out a menu with three triangle shapes and asks the user for which one they want.
 * The triangle shapes are are:
 * Left (1)
 * Right (2)
 * Center (3)
 * The triangle that the user  wanted is then stored via a scanner object as an integer from 1-3.
 * The number of rows is then also assigned to the rows variable via a Scanner object.
 * A switch statement then executes a method printing out the desired triangle shape with the desired amount of rows.
 * The amount of rows is passed to each method via a parameter.
 *
 * Difficulties: I had some trouble deciding what type of loop to use in the triangle printing methods, but I settled on for loops with a local variable...
 * ,as they did not change the overall stars and spaced variable and were the most concise.
 *
 * What I Learned: I got some more practice with documenting methods and writing multiple methods in a class in Java. I also learned how to pass a primitive variable to a method.
 */

import java.util.*;
import java.io.*;

public class CustomStarWedge
{
    /**
     * Menu for the user to select their desired triangle shape and rows
     * post: Triangle shape method selected and number of rows passed to the corresponding method
     */
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates scanner object in order to get user input
        int rows, triangleType; //Rows and triangle alignment declared
        //Tells user of to select a triangle printing methods by typing in an integer from 1-3
        System.out.println("Types of Triangles");
        System.out.println("1.  Left");
        System.out.println("2.  Right");
        System.out.println("3.  Center\n");
        System.out.println("Enter a number of Triangle Type (1-3): ");
        ///...and then assigns the number to the triangleType variable.
        triangleType = kbInput.nextInt();
        //Same is done for the rows variable
        System.out.println("How many rows?");
        rows = kbInput.nextInt();
        //Switch statement then executes the corresponding method, and passes along the amount of rows (arguement) as an parameter of the method.
        switch (triangleType)
        {
            case 1: leftTriangle(rows);
                    break;
            case 2: rightTriangle(rows);
                    break;
            case 3: centerTriangle(rows);
                    break;
        }
        System.out.println(""); //Space is printed for formatting reasons.
    }

    /**
     * Prints a left aligned triangle of stars
     * post: Left aligned triangle that has x amount of rows according to the user printed to the console
     */
    public static void leftTriangle(int rows)
    {
        int stars = 1; //Amount of stars in each row
        while(rows >= 1) //Increments from the starting size of rows to the last row
        {
            for(int rowOfStars = stars; rowOfStars >= 1; rowOfStars--)  
            {
                //Prints out stars for however many stars there should be per row
                //The local variable rowOfStars is used to avoid changing the stars variable.
                System.out.print("*");
            }
            System.out.println(""); //A new line is printed once all the stars are printed for one row to separate the rows.
            rows--; //For each new row, the row variable is decreased so that the correct amount of rows is printed
            stars++; //The stars variable is increased as each new row has a new star
        }
    }

    /**
     * Prints a right aligned triangle of stars
     * post: Right aligned triangle that has x amount of rows according to the user printed to the console
     */
    public static void rightTriangle(int rows)
    {
        int stars = 1; //Amount of stars in each row
        int spaces = rows - 1; //Amount of spaces in each row
        while(rows >= 1) //Increments from the starting size of rows to the last row
        {
            for(int rowOfSpaces = spaces; rowOfSpaces >= 1; rowOfSpaces--)
            {
                //Prints out spaces for however many stars there should be per row
                //The local variable rowOfSpaces is used to avoid changing the stars variable.
                System.out.print(" "); //Prints out a space for each iteration
            }
            for(int rowOfStars = stars; rowOfStars >= 1; rowOfStars--)
            {
                //Prints out stars for however many stars there should be per row
                //The local variable rowOfStars is used to avoid changing the stars variable.
                System.out.print("*"); //Prints a star for each iteration
            }
            System.out.println(""); //A new line is printed once all the stars are printed for one row to separate the rows.
            rows--; //For each new row, the row variable is decreased so that the correct amount of rows is printed
            spaces--; //For each new row, the spaces variable is decreased so that the correct amount of spaces is printed
            stars++; //The stars variable is increased as each new row has a new star
        }
    }

    /**
     * Prints a center aligned triangle of stars
     * post: Center aligned triangle that has x amount of rows according to the user printed to the console
     */
    public static void centerTriangle(int rows)
    {
        int stars = 1; //Amount of stars in each row
        int spaces = rows - stars; //Amount of spaces in each row
        while(rows >= 1) //Increments from the starting size of rows to the last row
        {
            for(int rowOfSpaces = spaces; rowOfSpaces >= 1; rowOfSpaces--) //Iterates for however many stars there should be per row
            {
                //Prints out spaces for however many stars there should be per row
                //The local variable rowOfSpaces is used to avoid changing the stars variable.
                System.out.print(" "); //Prints a star for each iteration
            }
            for(int rowOfStars = stars; rowOfStars >= 1; rowOfStars--) //Iterates for however many stars there should be per row
            {
                //Prints out stars for however many stars there should be per row
                //The local variable rowOfStars is used to avoid changing the stars variable.
                System.out.print("*"); //Prints a star for each iteration
            }
            System.out.println(""); //A new line is printed once all the stars are printed for one row to separate the rows.
            rows--; //For each new row, the row variable is decreased so that the correct amount of rows is printed
            stars = stars + 2; //The stars variable is increased by 2 as each new row has two a new stars due to center spacing
            spaces--; //For each new row, the spaces variable is decreased so that the correct amount of spaces is printed
        }
    }
}

//Output:
//Types of Triangles
//1.  Left
//2.  Right
//3.  Center
//
//Enter a number of Triangle Type (1-3):
//1
//How many rows?
//5
//*
//**
//***
//****
//*****
//
//Types of Triangles
//1.  Left
//2.  Right
//3.  Center
//
//Enter a number of Triangle Type (1-3):
//2
//How many rows?
//3
//  *
// **
//***
//
//Types of Triangles
//1.  Left
//2.  Right
//3.  Center
//
//Enter a number of Triangle Type (1-3):
//3
//How many rows?
//4
//   *
//  ***
// *****
//*******

