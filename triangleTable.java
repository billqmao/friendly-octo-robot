/**
 * Name: Bill Mao
 *
 * Date: 10/20/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 166g (Bermuda triangle)
 *
 * Description: This program is designed to print a multiplication triangle based on a row/column number that is given by the user.
 * It begins by declaring a row variable as four to first print an example table for a user.
 * An outermost do--while loop then begins to execute which controls the entire program except for the printing of the header.
 * The number of rows in the table first printed, along with a header row of the number of columns.
 * The program then declares some variables that will be used to print out the table while also printing out a new line to separate the number header and the table.
 * Two nested while loops then print out the multiplication table.
 * The program ends by asking if the user wants to print another table by specifying the amount of rows.
 * If the answer is less than or equal to zero, the program terminates.
 *
 * Difficulties: I had to rename some variables to avoid confusion as to their use.
 * I also had some difficulty getting the right number of rows to print.
 *
 * What I Learned: I got some more practice with nested loops, sentinel characters, and mathematical operations in Java.
 */

import java.util.*;
import java.io.*;

public class triangleTable
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to get text input
        int rows = 4; //Rows is declared outside of the loop first as it is needed for the first example, and cannot be repeated
        System.out.println("Multiplication Triangle\n\n"); //Prints out the table header
        do
        {
            int header = 1; //Used for controlling the amount of numbers printed in the header
            System.out.println("\nNumber of rows for this triangle: " + rows );
            while(header <= rows) //Prints the first line of numbers
            {
                //Prints the number 1 to X, where x is the number of rows.
                System.out.print(header + "\t");
                header++;
            }
            System.out.println(""); //New line then printed to separate this line from the other lines
            int column = 1; //Used for controlling the column multiplier, ie: 2x3 for column 3
            int rowEnd = 1; //Used to control when a row of number ends
            int rowNumber = 1; //Used for controlling the row number
            //Two nested while loops print out the triangular loop
            while(rows >= rowNumber) //Outer while loop controls when the table ends and sets up the calculations for the numbers inside the table
            {
                while(rowEnd >= 1)  
                {
                    //Inner while loop prints out a row of numbers based on the column and row location,...
                    //and ends once the there are no more numbers left for the row to print (rowEnd reaches zero)
                    System.out.print(column * rowNumber + "\t"); //Tab printed to separate the numbers
                    rowEnd--; //Every time a number is printed in a row, the rowEnd variables decreases by one
                    column++; //Every time a number is printed, the column number goes up
                }
                System.out.println(""); //Prints a new line for each new row
                rowNumber++; //Row number goes up for the new row
                column = 1; //Column is reset to one
                rowEnd = rowNumber; //Sets row end to the new row number so that one more number is printed out in the new row (IE: 1x1 to 1x2 AND 2x2)
            }
            System.out.println("Please enter the number of rows you would like to print: "); //Once everything is printed out, the user is asked if they want to continue...
            //and how many rows they want
            rows = kbInput.nextInt(); //Rows wanted is stored
        }
        while(rows > 0); //If the row number is nonsensical (0 or negative), the program terminates
        System.out.println("Thank you for using this program! "); //Thank you statement when the program ends.

    }
}
//Output:
//Multiplication Triangle
//
//
//
//Number of rows for this triangle: 4
//1    2    3    4    
//1    
//2    4    
//3    6    9    
//4    8    12    16    
//Please enter the number of rows you would like to print:
//3
//
//Number of rows for this triangle: 3
//1    2    3    
//1    
//2    4    
//3    6    9    
//Please enter the number of rows you would like to print:
//8
//
//Number of rows for this triangle: 8
//1    2    3    4    5    6    7    8    
//1    
//2    4    
//3    6    9    
//4    8    12    16    
//5    10    15    20    25    
//6    12    18    24    30    36    
//7    14    21    28    35    42    49    
//8    16    24    32    40    48    56    64    
//Please enter the number of rows you would like to print:
//0
//Thank you for using this program!


