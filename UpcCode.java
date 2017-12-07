/**
 * Name: Bill Mao
 *
 * Date: 12/4/2017
 *
 * School: East Chapel Hill High School
 *
 * Program: Prog512d UPC Code
 *
 * Description: This program is designed to test the validity of a list of UPC codes from a related .dat file.
 * The program first begins by initializing all objects or variables needed in the program for clarity purposes.
 * The program then prints out the header for a table of UPC codes and their validity.
 * A while loop then executes that keeps executing as long as there are still UPC codes to be read in the file.
 * In the loop, the UPC Code is first assigned to the corresponding variable via the nextLine method, and the length is found using the length() method.
 * A while loop then executes that finds the weighted sum of the UPC digits.
 * In the loop, each digit is read from the Code one by one, and the amount to be added to the sum is found.
 * Once the sum is found, it is divided by ten to see if the remainder is zero.
 * If it is, the UPC code is valid.
 * THis process repeats until there are no more UPC codes left in the file.
 *
 * Difficulties: I originally tried to import the digits in a UPC code one by one, but I found that importing the entire string and reading from the string was easier.
 *
 * What I Learned: I got some more practice with objects and methods, loops, and decision making using if statements in Java.
 */

import java.util.*;
import java.io.*;

public class UpcCode
{
    public static void main(String args[])
    {
        //Any primitive variables or objects needed for later operations are first initialized ared here for clarity purposes
        Scanner readFile = null; //Scanner that will get data in a file
        try
        {
            // Create a scanner to read the file
            readFile = new Scanner (new File("prog512.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println ("File not found!");
            //If the file is not found, error message is printed and program terminates
            System.exit(0);
        }
        int upcIndex = 0; //Position of a digit in a UPC code beginning from 0
        int upcDigit = 0; //Digit in a UPC code
        String upcCode = ""; //UPC code itself
        int upcSum = 0; //Weighted sum of the UPC Code used to calculate its validity
        int upcLength = 0; //Length of the UPC Code
        //Header of the UPC code table
        System.out.println("UPC code\t\t Validity\n");
        while(readFile.hasNextLine() == true) //While loop executes while there are still UPC Codes to be read
        {
            upcCode = readFile.nextLine(); //UPC code is read from the file
            upcLength = upcCode.length(); //The length is found
            while(upcLength >= 1) //While there are still digits to be read in the UPC code..
            {
                //A character (1 digit) is read from the UPC code starting from position 0 and is converted to an integer, which represents the first digit.
                upcDigit = Character.getNumericValue(upcCode.charAt(upcIndex));
                if(upcIndex % 2 == 0)
                {
                    //If the digit is even, it is multiplied by 3 and added to the sum of the UPC digits
                    upcSum = upcSum + 3 * upcDigit;
                }
                else
                {
                    //If it is odd, it is directly added.
                    upcSum = upcSum + upcDigit;
                }
                upcIndex++; //Index is increased by 1 to read the next digit
                upcLength--; //Length is decreased by 1 to eventually terminate the loop
            }
            if((upcSum % 10 == 0))
            {
                //Once all digits have been read, this if statement find if the UPC code is valid by seeing if the remainder of the sum divided by 10 is zero.
                System.out.println(upcCode + "\t\t Valid");
            }
            else
            {
                System.out.println(upcCode + "\t\t Invalid");
            }
            //The Sum and Index (digit position) are reset to zero in order to read a new UPC code.
            upcIndex = 0;
            upcSum = 0;
        }
    }
}
//Output:
//UPC code         Validity
//
//016499215511         Valid
//372415613274         Invalid
//155512994610         Valid
//011165459192         Invalid
//838241762110         Invalid