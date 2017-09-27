import java.util.*;
import java.io.*;
/**
 * Name: Bill Mao
 * Date: 9/26/17
 * School: East Chapel Hill High School
 * Program: Program 72a (identity theft)
 * Description: This program is designed to take an 8 digit credit card number, and find a corresponding security character.
 * The program first asks the user for their credit card number broken up into 4 chunks of 2 digit numbers.
 * It then stores all four of these chunks.
 * These chunks and then added up into one integer, and then is divided by 26 to find the remainder.
 * The remainder then has 65 added to it to shift is UTF-16 decimal value, and then is stored as a char.
 * The security code is then printed along with the credit card number for the user to see.
 * Difficulties: I originally forgot to convert the integer from the security code operation to a char, and got a lossy conversion error.
 * What I Learned: I learned how UTF-16 characters are stored in Java as the primitive data type char, and how to convert from integers to chars.
 * I also got some more practice with using the scanner class for user input.
 */
public class identityTheft
{
    public static void main(String args[])
    {
        Scanner kbInput = new Scanner(System.in); //Creates new scanner object that can receive input
        System.out.println("Enter the credit card number (XX XX XX XX):_"); //Asks the user for their credit card number
        int chunk1 = kbInput.nextInt(); //Stores the credit card number as four two digit integer chunks
        int chunk2 = kbInput.nextInt();
        int chunk3 = kbInput.nextInt();
        int chunk4 = kbInput.nextInt();
        //Calculates the security character by adding all four chunks together, performing a modulus operation by 26...,
        //and adding 65 to the operation to start at the UTF-16 character A
        char securityCode = (char) (((chunk1 + chunk2 + chunk3 + chunk4) % 26) + 65); 
        //Prints the credit card number and the corresponding security character
        System.out.println("The correct number and code is: " + chunk1 + " " + chunk2 + " " + chunk3 + " " + chunk4 + " " + securityCode);
    }
}

/* Output using credit card numbers in the instructions
 * Enter the credit card number (XX XX XX XX):_
 * 16 26 26 26
 * The correct number and code is 16 26 26 26 Q
 * 
 * Enter the credit card number (XX XX XX XX):_
 * 26 54 74 56
 * The correct number and code is: 26 54 74 56 C
 * 
 * Enter the credit card number (XX XX XX XX):_
 * 26 26 26 26
 * The correct number and code is: 26 26 26 26 A
 * 
 * Enter the credit card number (XX XX XX XX):_
 * 26 54 74 55
 * The correct number and code is: 26 54 74 55 B
 * 
 */

