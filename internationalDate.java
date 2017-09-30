import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/29/17
 * School: East Chapel Hill High School
 * Program: Program 65a (International Date)
 * Description: This program takes a date in American format, and converts it to the ISO standard.
 * It then prints the ISO standard out.
 * Difficulties: I got a syntax error at first with the print statement due to leaving out a + sign
 * What I Learned: I got some more practice with using the scanner class to get input.
 */
public class internationalDate
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates a new scanner object in order to use user input
        System.out.println("Enter the Month Day Year (XX XX XXXX):_"); //Prompts the user for the current date in the american format
        int month = kbInput.nextInt(); //Retrives all three components of the date
        int day = kbInput.nextInt();
        int year = kbInput.nextInt();
        System.out.println("The date written in International format is: " + year + "-" + month + "-" + day); //Rearranges the date format to the ISO standard and prints it out
    }
}

//Output:
//Enter the Month Day Year (XX XX XXXX):_
//09 29 2017
//The date written in International format is: 2017-9-29
