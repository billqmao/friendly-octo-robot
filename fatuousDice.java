/**
 * Name: Bill Mao
 *
 * Date: 11/17/17
 *
 * School: East Chapel Hill High School
 *
 * Program: Program 335h-Final 2003 (fatuous dice function)
 *
 * Description: This program is designed to calculate the value of two dice based on whether the two values are even or odd and whether they are equal to each other.
 * The program first begins by initializing any variables needed later in the program for clarity.
 * The program then asks the user for the first dice roll value, labeled P, and the second dice roll value, labeled Q.
 * An if statement decision tree then finds the value of the the two dice rolls based on the conditions mentioned above and prints the value.
 * If the user entered a nonsensical (not in the 1-6 ran of dice) value, an error message is printed.
 *
 * Difficulties: I originally did not intend for the values to be checked first to see if they made sense, but I implemented the error message after I...
 * realized that the user may be misled as the the value of his dice if they typed in the wrong dice values.
 *
 * What I Learned: I got some more practice with if cision trees and user input.
 */

import java.util.*;
import java.io.*;

public class fatuousDice
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Used to get user input
        int letterP = 0; //Number on roll of the first dice
        int letterQ = 0; //Number on roll of the second dice
        int value = 0; //Value of the two rolls
        System.out.println("Enter P: "); //Asks user for the number on the first roll...
        letterP = kbInput.nextInt();//and stores it
        System.out.println("Enter Q: "); //Asks user for the number on the second roll...
        letterQ = kbInput.nextInt();//and stores it
        //Set of if statements finds the value of the two dice based on conditions (even or not even, P=Q or P!=Q)
        //The value is then printed for the user.
        if((letterP > 6 || letterP < 1) || (letterQ > 6 || letterQ < 0))
        {
            //If P or Q is outside of the range of a six sided dice, an error message is printed
            System.out.println("Please enter a number from 0-6 inclusive for P and Q.");
        }
        else if(letterP % 2 == 0 && letterQ % 2 != 0)
        {
            //Value of a dice if P is even and Q is odd
            value = letterP * 2 + letterQ;
            System.out.println("Value = " + value);
        }
        else if(letterP % 2 != 0 && letterQ % 2 == 0)
        {
            //Value of a dice if P is odd and Q is even
            value = letterP + 2 * letterQ;
            System.out.println("Value = " + value);
        }
        else if((letterP % 2 == 0 && letterQ % 2 == 0) && (letterP != letterQ))
        {
            //Value of a dice if P and Q are even and P is not equal to Q
            value = letterP + letterQ;
            System.out.println("Value = " + value);
        }
        else if((letterP % 2 == 0 && letterQ % 2 == 0) && (letterP == letterQ))
        {
            //Value of a dice if P and Q are even and P is equal to Q
            value = letterP * 3;
            System.out.println("Value = " + value);
        }
        else if((letterP % 2 != 0 && letterQ % 2 != 0) && (letterP != letterQ))
        {
            //Value of a dice if P and Q are not even and P is not equal to Q
            value = letterP + letterQ;
            System.out.println("Value = " + value);
        }
        else if((letterP % 2 != 0 && letterQ % 2 != 0) && (letterP == letterQ))
        {
            //Value of a dice if P and Q are not even and P is equal to Q
            value = letterQ * 3;
            System.out.println("Value = " + value);
        }
    }
}
//Output:
//Enter P:
//2
//Enter Q:
//5
//Value = 9
//
//Enter P:
//4
//Enter Q:
//4
//Value = 12
//
//Enter P:
//6
//Enter Q:
//2
//Value = 8
//
//Enter P:
//1
//Enter Q:
//3
//Value = 4
//
//Enter P:
//5
//Enter Q:
//5
//Value = 15
//
//Enter P:
//1
//Enter Q:
//2
//Value = 5
//
//Enter P:
//7
//Enter Q:
//0
//Please enter a number from 0-6 inclusive for P and Q.

