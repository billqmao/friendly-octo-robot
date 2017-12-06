/**
 * Name: Bill Mao
 *
 * Date: 11/29/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 510a (vowel stars)
 *
 * Description: This program is designed print out a user's name with two alterations:
 * All the vowels in the name are replaced with stars and an extra space is added between the first and last name if the number of characters in their name is even
 * The program first initialized any variables needed later in the program
 * The program then asks for the user's name.
 * The name then has all vowels replaced with stars, and th length of their name is then found not.
 * If the number of characters in the name is even (not counting spaces), an extra space is added between their first and last name.
 * The new name is then printed for the user to see.
 *
 * Difficulties: I originally put length instead of length - 1, but I then realized during debugging that I had to subtract one character to account for the space in between...
 * the first and last name.
 *
 * What I Learned: I got some more practice with getting user input in Java, String methods, and if decision trees.
 */

import java.util.*;
import java.io.*;

public class VowelStars
{
    public static void main(String args[])
    {
        //Variables needed later in the program are first initialized/instantiated for clarity
        Scanner kbInput = new Scanner(System.in); //Scanner object that gets user input
        String name = ""; //Name of the user
        int length = 0; //Number of characters (length) of the user's name
        //Asks for the user's name and assigns it to the previously initialized variable
        System.out.print("What is your first and last name? ");
        name = kbInput.nextLine();
        //Name then has vowels replaced to stars via the String .replace method.
        name = name.replace('a', '*').replace('e', '*').replace('i','*').replace('o', '*').replace('u', '*');
        length = name.length();
        if((length - 1) % 2 == 0) //If the number of characters in user's name is even...
        {
            name = name.replace(" ", "  "); //An extra space is added in between their first and last name via the replace method
        }
        System.out.println("\t\t\t\t\t" + name); //Prints the name with alterations aligned to the center
    }   
}
//Output:
//What is your first and last name? Bill Mao
//                    B*ll M**
//
//What is your first and last name? John Doe
//                    J*hn D**
//
//What is your first and last name? Smith Doe
//                    Sm*th  D**
//
//What is your first and last name? Molly Fisher
//                    M*lly F*sh*r
//What is your first and last name? Alan Alda
//		      Al*n  Ald*
//
//What is your first and last name? Mickey Mouse
//		      M*ck*y M**s*

