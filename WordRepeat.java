/**
 * Name: Bill Mao
 *
 * Date: 11/28/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 500c (foolin’ around with strings)
 *
 * Description: This program is designed to print a word specified by the user x times, where is x the number of characters (length) of the word.
 * The program first initializes any variables needed later in the program for clarity purposes, and then asks the user for the word to be printed.
 * The program then finds the length of the word using the .length method.
 * A empty line is then printed for formatting purposes, and the length of the word is assigned to a different variable...
 * so that the original value can be kept.
 * A while loop then prints the word the requisite number of times.
 * The program then finally prints out the number of times the work was printed, and terminates.
 *
 * Difficulties: I originally did not use the timesPrinted variable, as I did not take into account the original amount of characters...
 * in the word needed to be saved in order to print the amount of times the word was printed.
 *
 * What I Learned: I got some more practice with loops and the .length method for the String class.
 */

import java.util.*;
import java.io.*;

public class WordRepeat
{
    public static void main(String args[])
    {
        //Variables used later in the program are first initialized/instantiated for clarity purposes
        String word = ""; //Word to be printed
        int length = 0; //Length of the word/amount of characters in it
        int timesPrinted = 0; //Amount of times the work is to be printed
        Scanner kbInput = new Scanner(System.in); //Scanner for user input
        //Asks user for the word to be repeated, and assigns to the previously initialized variable
        System.out.println("Enter the word to be repeated: ");
        word = kbInput.next();
        //Finds how many characters the word is (length of the word)
        length = word.length();
        //Empty line is printed for formatting purposes
        System.out.println(""); 
        //While loop prints the word x times, where x is the amount of characters in the word
        //timesPrinted variable is used so that the original length can be kept intact
        timesPrinted = length;
        while(timesPrinted >= 1)
        {
            System.out.println(word);
            timesPrinted--;
        }
        //Prints out how many times the word was printed using the length variable and then terminates.
        System.out.println("The word was printed " + length + " times");
    }
}
//Output:
//Enter the word to be repeated: 
//Howdy
//
//Howdy
//Howdy
//Howdy
//Howdy
//Howdy
//The word was printed 5 times
//
//Enter the word to be repeated: 
//Java
//
//Java
//Java
//Java
//Java
//The word was printed 4 times
//
//Enter the word to be repeated: 
//Method
//
//Method
//Method
//Method
//Method
//Method
//Method
//The word was printed 6 times