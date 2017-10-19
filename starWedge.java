
/**
 * Name: Bill Mao
 * 
 * Date: 10/18/2017
 * 
 * School: East Chapel Hill High School
 * 
 * Program: Program165a (“wegie” of stars)
 * 
 * Description: This program is designed to proint out a wedge of stars based on a starting number of rows and stars the user gives.
 * It first asks the user for the starting number of rows and stars and stores it.
 * The variables representing the row number and the number of stars are then initialized.
 * A set of nested for loops then executes.
 * The inner for loop is designed to print out a row of stars depending on the row number, which creates the wedge shape.
 * For example, the topmost row will have the starting number of stars, the row below it one less star, and so on.
 * The outer for loops iterates the rows from the starting number to 0.
 * This results in the wedge having the starting number amount of rows.
 * Once both loops are done printing, a wedge is created.
 * 
 * Difficulties: I originally forgot to print a filler string at the end of each column, so all the stars appeared on one line.
 * I also had to switch some of the variable names around to make their purpose more clear
 * 
 * What I Learned: I got some more practice with nested loops and formatting text.
 */

import java.util.*;
import java.io.*;

public class starWedge
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates scanner object in order to get user input
        //Asks for and stores starting column and row size
        System.out.println("Enter the starting size: ");
        int startingNumber = kbInput.nextInt();
        System.out.println(""); //Space is printed for formatting reasons.
        //Two variables are declares so that they can be used outside of the context of the loops if needed
        int row = 0; //Amount of rows that the stars occupy
        int stars = 0; //Starting number of stars for the first row
        for(row = startingNumber; row >= 1; row--) //Increments from the starting size of rows to the last row
        {
            for(stars = row; stars >= 1; stars--) //Iterates for however many stars there should be per row 
            {
                System.out.print("*"); //Prints a star for each iteration
            }
            System.out.println(""); //A new line is printd once all the stars are printed for one row to seperate the rows.
        }
    }
}

//Output:
//Enter the starting size: 
//8
//
//********
//*******
//******
//*****
//****
//***
//**
//*
//
//Enter the starting size: 
//5
//
//*****
//****
//***
//**
//*
